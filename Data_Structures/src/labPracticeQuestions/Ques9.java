package labPracticeQuestions;

import java.util.Scanner;

public class Ques9 {
	static int Sum(String str) {
		String[] starr = str.split("");
		int sum =0;
		for(String i : starr) {
			sum+= Integer.parseInt(i);
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(Sum(str));
	}
}
