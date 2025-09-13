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
import java.util.Scanner;
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
	<T, U>void updateStudent(HashMap<T,U> hm, String dbName, String tableName, Connection con);
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
	
	public <T, U> void updateStudent(HashMap<T,U> hm, String dbName, String tableName, Connection con){
		try {
			Statement state = con.createStatement();
			String query = "USE "+dbName;
			state.execute(query);
			PreparedStatement ps;
			for(Map.Entry<T, U> map : hm.entrySet()) {
				HashMap<String, Integer> m = (HashMap<String, Integer>) map.getValue();
				String columnName = null;
	            Integer columnValue = null;

	            for (Map.Entry<String, Integer> entry : m.entrySet()) {
	                columnName = entry.getKey();
	                columnValue = entry.getValue();
	            }
				query = "UPDATE "+tableName+" SET "+ columnName +"=?"+" WHERE rollNo=?";
				ps = con.prepareStatement(query);
				ps.setObject(1, columnValue);
				ps.setInt(2, (int) map.getKey());
				ps.execute();
			}
			System.out.println("Updation Completed");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	static ArrayList<Student> readData(Connection con, String name) {
		try {
			Statement state = con.createStatement();
			String query = "USE Students";
			state.execute(query);
			Statement s = con.createStatement();
			query = "SELECT * FROM "+name;
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
		ArrayList<Student> students = new ArrayList<>();

			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/", "root", "qwe123");
				
				HashMap<Integer, HashMap<String, Integer>> identifier = new HashMap<>();
				Scanner sc = new Scanner(System.in);
				String dbName = "", tabName="", record="";
				int hashId;
				System.out.println("How many operations do you want to perform:- ");
				int iterations = sc.nextInt();
				for(int i=0; i<iterations; i++) {
					System.out.println("What operation would you like to perform:-\n"
							+ "a.)Create Students Data\t\tb.)Create DB\n"
							+"c.)Create table \t\td.)Insert data \n"
							+"e.)Update data in table \t\tf.)Delete data in table");
					String choice = sc.next();
					switch(choice.charAt(0)) {
					case 'a':
						System.out.println("Enter the number of students data you want to have:-");
						int numStudents = sc.nextInt();
						students = sms.createStudents(numStudents, r, Student.class);
						break;
					case 'b':
						System.out.println("Enter the name of DB");
						dbName = sc.next();
						sms.createDB(dbName, con);
						break;
					case 'c':
						System.out.println("Enter the name of table");
						dbName="Students";
						tabName = sc.next();
						sms.createTable(dbName, tabName, con);
						break;
					case 'd':
						tabName="mark";
						dbName = "Students";
						System.out.println("Insertb the students data");
						System.out.println(students);
						sms.insertStudents(dbName, tabName, con, students);
						break;
					case 'e':
						tabName="mark";
						dbName = "Students";
						System.out.println("Update the students table");
						System.out.println("Enter the number of records you would like to update:-");
						int n = sc.nextInt();
						for(int k = 1; k <= n; k++) {
							HashMap<String, Integer> updateValues = new HashMap<>();
							System.out.println("Enter data into this format i.e. key=value:-");
							record = sc.next();
//							sc.nextLine();
							String[] records = record.split("=");
							updateValues.put(records[0], Integer.parseInt(records[1]));
							System.out.println("Enter the roll no of the student you want to update the data for:-");
							identifier.put(sc.nextInt(), updateValues);
						}
						sms.updateStudent(identifier, dbName, tabName, con);
						break;
						
					case 'f':
						tabName="mark";
						dbName = "Students";
						System.out.println("Delete from students table");
						System.out.println("Enter the roll no of the student ");
						
						sms.deleteStudent(sc.nextInt(), dbName, tabName, con, students);
						break;
					case 'g' : 
						ArrayList<Student> arr =  readData(con, "mark");
						System.out.println(arr);
						break;
					}
				}
				
			}
			catch(Exception e) {
				System.out.println(e);
			}
		
	}



}