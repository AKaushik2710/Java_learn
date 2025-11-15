package labPracticeQuestions;

import java.util.Scanner;
import java.util.Stack;

public class Ques6 {
	static int output(String str) {
		Stack<Integer> stack =  new Stack<>();
		String[] starr = str.split(" ");
		for(String i : starr) {
			if(Character.isDigit(i.charAt(0))) {
				stack.push(Integer.parseInt(i));
			}
			else {
				int b = stack.pop();
				int a = stack.pop();
				
				switch(i.charAt(0)) {
				case '+' : 
					stack.push(a+b);
					break;
				case '-' :
					stack.push(a-b);
					break;
				case '*' : 
					stack.push(a*b);
					break;
				case '/' :
					stack.push(a/b);
					break;
				}
			}
		}
		return stack.pop();
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String expr = sc.nextLine();
		System.out.println(output(expr));
	}
}
