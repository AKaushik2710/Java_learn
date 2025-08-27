package part2;
import java.util.Scanner;
public class Student {
	int rollNo;
	String name;
	String cName;
	String subject;
	int mark;

	public void acceptDetails(Scanner sc) {
		
		System.out.println("Enter Student name:-");
		name = sc.next();
		System.out.println("Enter Student roll no. :- ");
		rollNo = sc.nextInt();
		System.out.println("Enter Student College Name:-");
		cName = sc.next();
		System.out.println("Enter Student Subject:-");
		subject = sc.next();
		System.out.println("Enter Student Marks:-");
		mark = sc.nextInt();
	}
	
	public void displayStudentInfo() {
		System.out.println("Student's name is "+name);
		System.out.println("Student's roll no. is "+rollNo);
		System.out.println("Student's college name is "+cName);
		System.out.println("Student's subject is "+subject);
		System.out.println("Student's marks are "+mark);
	}
	
	public void findResult() {
		if(mark>40) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
	}
}
