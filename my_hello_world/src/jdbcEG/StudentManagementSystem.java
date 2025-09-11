package jdbcEG;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

//import assignment2.Student;
class Student {
	public int rollNo;
	public String name;
	public int eng,hindi,math;
	
	public Student(int rollNo,int eng,int hindi,int math, String name){
		this.rollNo = rollNo;
		this.eng = eng;
		this.hindi = hindi;
		this.math = math;
		this.name =   name;
	}
	
	public float averageMarks() {
		return (this.eng+this.hindi+this.math)/3;
	}
	
	public void gradeCalculator() {
		float marks = this.averageMarks();
		if(marks>=90) {
			System.out.println("Student got \"A\" grade");
		}
		else if(marks >=70) {
			System.out.println("Student got \"B\" grade");
		}
		else if(marks > 40) {
			System.out.println("Student got \"C\" grade");
		}
		else {
			System.out.println("Student got \"F\" grade");
		}
	}
}


interface creatorInterface{
	<T> ArrayList<T> createStudents( int param, Random r, Class<T> clazz); 
	 void createDB(String name, Connection con);
	 void createTable(String dbName, String name, Connection con);
}

interface rudInterface{
	void insertStudents(String dbName, String tableName, Connection con, ArrayList<Student> arr);
	<T>void deleteStudent(T identifier, String dbName, String tableName, Connection con, ArrayList<Student> arr);
	<T, U>void updateStudent(HashMap<T,U> hm, int identifier, String dbName, String tableName, Connection con);
}
public class StudentManagementSystem implements creatorInterface, rudInterface{
	public<T> ArrayList<T> createStudents(int param, Random r, Class<T> clazz){
		try {
			ArrayList<T> arr = new ArrayList<>();
			System.out.println("Hello");
			for(int i=1; i<=param; i++) {
				
				int eng = r.nextInt(100);
				int hin = r.nextInt(100);
				int mat = r.nextInt(100);
				T obj = clazz.getConstructor(int.class, int.class, int.class, int.class, String.class).newInstance(1000+i, eng, hin, mat, "Student_"+i);
				arr.add(obj);
			}
			
			return arr;
		}
		catch(Exception e) {
			System.out.println(e);
			return null;
		}
	}
	
	public void createDB(String name, Connection con) {
		try {
			Statement state = con.createStatement();
			String query = "CREATE DATABASE "+name;
			state.executeUpdate(query);
			System.out.println("DB created successfully");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public void createTable(String dbName, String name, Connection con) {
		try {
			Statement state = con.createStatement();
			String query = "USE "+dbName;
			state.execute(query);
			query = "CREATE TABLE "+name+" ( rollNo int, english int, hindi int, math int, name varchar(30))";
			state.execute(query);
			System.out.println("DB created successfully");
			state.close();
			con.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public void insertStudents(String dbName, String tableName, Connection con, ArrayList<Student> arr) {
		try {
			Statement state = con.createStatement();
			String query = "USE "+dbName;
			state.execute(query);
			query = "INSERT INTO "+ tableName +" VALUES (?,?,?,?,?)";
			PreparedStatement ps;
			for(Student obj : arr) {
				ps = con.prepareStatement(query);
				ps.setInt(1, obj.rollNo);
				ps.setInt(2, obj.eng);
				ps.setInt(3, obj.hindi);
				ps.setInt(4, obj.math);
				ps.setString(5, obj.name);
				ps.execute();
			}
			System.out.println("Records got inserted");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public<T> void deleteStudent(T identifier, String dbName, String tableName, Connection con, ArrayList<Student> arr) {
		boolean varType = identifier.getClass().getSimpleName().equals("String") ? true : false;
		if(varType) {
			try {
				String setter = (String)identifier;
				Statement state = con.createStatement();
				String query = "USE "+dbName;
				state.execute(query);
				query = "DELETE FROM "+tableName+" WHERE name=?";
				PreparedStatement ps = con.prepareStatement(query);
				ps.setString(1, setter);
				ps.execute();
				System.out.println("Deletion Completed");
			}
			catch(Exception e) {
				
				System.out.println(e);
			}
		}
		else {
			try {
				int setter = (int)identifier;
				System.out.println(setter);
				Statement state = con.createStatement();
				String query = "USE "+dbName;
				state.execute(query);
				query = "DELETE FROM "+tableName+" WHERE rollNo=?";
				PreparedStatement ps = con.prepareStatement(query);
				ps.setInt(1, setter);
				ps.execute();
				System.out.println("Deletion Completed");
			}
			catch(Exception e) {
				System.out.println("COming");
				System.out.println(e);
			}
		}
	}
	
	public <T, U> void updateStudent(HashMap<T,U> hm, int identifier, String dbName, String tableName, Connection con){
		try {
			Statement state = con.createStatement();
			String query = "USE "+dbName;
			state.execute(query);
			PreparedStatement ps;
			String m;
			for(Map.Entry<T, U> map : hm.entrySet()) {
				m=(String)map.getKey();
				query = "UPDATE "+tableName+" SET "+ m +"=?"+" WHERE rollNo=?";
				ps = con.prepareStatement(query);
				ps.setObject(1, map.getValue());
				ps.setInt(2, identifier);
				ps.execute();
			}
			System.out.println("Updation Completed");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	static ArrayList<Student> readData(Connection con) {
		try {
			Statement state = con.createStatement();
			String query = "USE Students";
			state.execute(query);
			Statement s = con.createStatement();
			query = "SELECT * FROM MYStudents";
			ResultSet res = s.executeQuery(query);
			ArrayList<Student> arr = new ArrayList<>();
			while(res.next()) {
				arr.add(new Student(res.getInt(1), res.getInt(2), res.getInt(3), res.getInt(4), res.getString(5)));
			}
			
			return arr;
		}
		catch(Exception e) {
			System.out.println(e);
			return null;
		}
	}
	public static void main(String[] args) {
		StudentManagementSystem sms = new StudentManagementSystem();
		int num = 3;
		Random r = new Random();
		ArrayList<Student> students = sms.createStudents(num, r, Student.class);;

			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/", "root", "qwe123");
//				sms.createDB("Students", con);
//				sms.createTable("Students", "MYStudents", con);
//				sms.insertStudents("Students", "MYStudents", con, students);
				int id=1002;
				students = readData(con);
//				System.out.println(students);
//				sms.deleteStudent(id, "Students", "MYStudents", con, students);
				HashMap<String, Integer> hm = new HashMap<>();
				hm.put("english", 67);
				hm.put("math", 80);
				sms.updateStudent(hm, id, "Students", "MYStudents", con);
				
			}
			catch(Exception e) {
				System.out.println(e);
			}
		
	}



}
