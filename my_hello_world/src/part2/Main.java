package part2;

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Student s_1 = new Student();
		Student s_2 = new Student();
		Student s_3 = new Student();
		Student s_4 = new Student();
		Student s_5 = new Student();
		Scanner sc = new Scanner(System.in);
		
		Student[] arr = {s_1, s_2, s_3, s_4, s_5};
		
		for(Student s : arr) {
			s.acceptDetails(sc);
		}
		for(Student s : arr) {
			s.displayStudentInfo();
			s.findResult();
		}
//		s_1.acceptDetails(sc);
//		s_2.acceptDetails(sc);
//		s_3.acceptDetails(sc);
//		s_4.acceptDetails(sc);
//		s_5.acceptDetails(sc);
//		
//		s_1.displayStudentInfo();
//		s_2.displayStudentInfo();
//		s_3.displayStudentInfo();
//		s_4.displayStudentInfo();
//		s_5.displayStudentInfo();
//		
//		s_1.findResult();
//		s_2.findResult();
//		s_3.findResult();
//		s_4.findResult();
//		s_5.findResult();
	}
}
