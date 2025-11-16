package labPracticeQuestions;

import java.util.Queue;

public class Ques10 {
	static void toh(int n, String a, String c, String b) {
		if(n==0) return;
		
		toh(n-1, a, b, c);
		System.out.println("Disk " + n + " Going from "+ a + " to "+c);
		toh(n-1, b, c, a);
	}
	
	public static void main(String[] args) {
		toh(3, "A", "C", "B");
	}
}
