package labPracticeQuestions;

import java.util.Scanner;

public class DPS_2_18 {
	static String longestCommonPrefix(String[] arr) {
		String temp = arr[0];
		
		for(String i : arr) {
			if(temp.length()>i.length()) temp = i;
		}
		
		String res="";
		boolean equiv = true;
		for(int i=0; i<temp.length(); i++) {
			for(String s : arr) {
				if(s.charAt(i) != temp.charAt(i)) equiv=false;
			}
			
			if(equiv) res+= temp.charAt(i);
			else break;
		}
		return res;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		sc.nextLine();
		String str = sc.nextLine();
		String[] starr = str.split(" ");
		System.out.println(longestCommonPrefix(starr));
	}
}
