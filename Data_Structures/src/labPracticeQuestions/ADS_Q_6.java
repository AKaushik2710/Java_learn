package labPracticeQuestions;

import java.util.Stack;

public class ADS_Q_6 {
	static int precedence(char c) {
        switch (c) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }
	
	static String inTopo(String str) {
		Stack<Character> stack = new Stack<>();
		StringBuilder res = new StringBuilder();
		for(char c : str.toCharArray()) {
			if(Character.isLetterOrDigit(c)) {
				res.append(c);
			}
			
			else if(c == '(') stack.push(c);
			else if(c == ')') {
				while(!stack.isEmpty() && stack.peek() != '(') {
					res.append(stack.pop());
				}
				stack.pop();
			}
			else {
				while(!stack.isEmpty() && precedence(stack.peek()) >= precedence(c)) {
					if (c == '^' && stack.peek() == '^') break;

                    res.append(stack.pop());
				}
				stack.push(c);
			}
		}
		
		while(!stack.isEmpty()) {
			res.append(stack.pop());
		}
		
		return res.toString();
	}
	
	public static void main(String[] args) {
		System.out.println(inTopo("(A+B)*C"));
	}
}
