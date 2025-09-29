package file_handling;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

class Student_Data implements Serializable{
	int id, age, marks;
	String name, address;
	public Student_Data(int id, int marks, int age, String name, String address) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.marks = marks;
		this.age = age;
		this.name = name;
		this.address = address;
	}
	
	@Override
	public String toString() {
		return this.name + " " + this.id + " " + this.age + " " + this.marks + " " + this.address;
	}
}
public class File_Trial {
	
	ArrayList<Student_Data> reader(){
		try(BufferedReader br = new BufferedReader(new FileReader("students_data.csv"))){
			String line;
			int count=0;
			ArrayList<Student_Data> alt = new ArrayList<>();
			while((line = br.readLine()) != null) {
				if(count==0) {
					count++;
					continue;
				}
				String[] chars = line.split(",");
				System.out.println(Arrays.toString(chars));
				alt.add(new Student_Data(Integer.parseInt(chars[0]), Integer.parseInt(chars[3]), Integer.parseInt(chars[2]), chars[1], chars[4]));
			}
			return alt;
		}
		catch(Exception e) {
			System.out.println(e);
			return null;
		}
	}
	
	void csvWriter(ArrayList<Student_Data> s) {
		try(FileWriter fw = new FileWriter("Stden.csv", true)){
			fw.append("ID,Name,Age,Address,Marks\n");
			for(Student_Data sd : s) {
				fw.write(sd.id+",");
				fw.write(sd.name+",");
				fw.write(sd.age+",");
				fw.write(sd.address+",");
				fw.write(sd.marks+"\n");
			}
			fw.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	void fileWriter(ArrayList<Student_Data> s) {
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Stden.csv"))){
			oos.writeObject(s);
			oos.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	
	void fileReader() {
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Std.dat"))){
			ArrayList<Student_Data> s = (ArrayList<Student_Data>) ois.readObject();
			for(Student_Data st : s) {
				System.out.println(st);
			}
			ois.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		File_Trial ft = new File_Trial();
		ArrayList<Student_Data> stud = new ArrayList<>();
//		ft.fileWriter(stud);
//		ft.csvWriter(stud);
//		ft.fileReader();
	}
}
