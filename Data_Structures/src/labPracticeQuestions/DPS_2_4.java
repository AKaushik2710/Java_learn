package labPracticeQuestions;

import java.util.Scanner;

public class DPS_2_4 {
	static String reversal(String str) {
		String[] starr = str.split("");
		String res="";
		for(int i=starr.length-1; i>=0; i--) {
			res+=starr[i];
		}
		return res;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		System.out.println(reversal(str));
	}
}
