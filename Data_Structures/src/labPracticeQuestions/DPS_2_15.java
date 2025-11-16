package labPracticeQuestions;

import java.util.Scanner;
import java.util.Stack;

public class DPS_2_15 {
	static boolean isBalanced(String str) {
		Stack<Character> s = new Stack<>();
		
		for(char c : str.toCharArray()) {
			if(s.isEmpty() && (c == ')' || c == ']' || c == '}')) {
				return false;
			}
			
			if(c == '(' || c == '[' || c == '{') {
				s.push(c);
			}
			else {
				char ch = s.pop();
				if(!match(ch, c)) {
					return false;
				}
			}
		}
		return s.isEmpty();
	}
	
	static boolean match(char a, char b) {
		return (a == '(' && b == ')') || (a == '[' && b == ']') || (a == '{' && b == '}');
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(isBalanced(str));
	}
	
}
