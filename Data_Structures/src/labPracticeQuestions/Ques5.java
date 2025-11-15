package labPracticeQuestions;

import java.util.Scanner;
import java.util.Stack;

public class Ques5 {
	static boolean isBalanced(String str) {
		Stack<Character> stack = new Stack<>();
		for(Character c : str.toCharArray()) {
			if(c == '(' || c == '[' || c == '{') {
				stack.push(c);
			}
			else if(c == ')' || c == ']' || c == '}'){
				if(stack.isEmpty()) return false;
				char ch = stack.pop();
				if(!match(ch, c)) return false;
			}
		}
		return stack.isEmpty();
	}
	
	static boolean match(char ch, char c) {
		if((ch == '(' && c == ')') || (ch == '[' && c == ']') || (ch == '{' && c == '}')) return true;
		return false;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		if(isBalanced(str)) System.out.println("Balanced");
		else System.out.println("Not Balanced");
	}
}
