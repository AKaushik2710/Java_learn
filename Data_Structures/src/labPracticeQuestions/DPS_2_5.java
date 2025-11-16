package labPracticeQuestions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class DPS_2_5 {
	static int countVowels(String str) {
		HashSet<Character> hash = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
		String[] starr = str.toLowerCase().split("");
		int count=0;
		for(String i : starr) {
			if(hash.contains(i.charAt(0))) count++;
		}
		return count;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(countVowels(str));
	}
}
