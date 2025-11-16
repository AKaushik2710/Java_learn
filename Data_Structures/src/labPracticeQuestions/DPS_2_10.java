package labPracticeQuestions;

import java.util.HashMap;
import java.util.Scanner;

public class DPS_2_10 {
	static boolean areAnagrams(String s1, String s2) {
		if(s1.length() != s2.length()) return false;
		
		HashMap<Character, Integer> hash = new HashMap<>();
		
		for(char i : s1.toCharArray()) {
			hash.put(i, hash.getOrDefault(i, 0)+1);
		}
		
		for(char c : s2.toCharArray()) {
			if(!hash.containsKey(c)) return false;
			hash.put(c, hash.get(c)-1);
			if(hash.get(c)<0) return false;
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		if(areAnagrams(s1, s2)) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
	}
}
