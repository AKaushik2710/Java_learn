package labPracticeQuestions;

import java.util.Scanner;

public class DPS_2_2 {
	static boolean isPalindrome(String str) {
		String[] starr = str.split("");
		String res = "";
		for(int i=starr.length-1; i>=0; i--) {
			res+=starr[i];
		}
		
		return str.equals(res);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		if(isPalindrome(str)) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}
}
