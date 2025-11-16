package labPracticeQuestions;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ques8 {
	static void binaryNums(int n) {
		Queue<String> q = new LinkedList<>();
		q.add("1");
		
		for(int i=0; i<n; i++) {
			String s = q.poll();
			System.out.print(s + " ");
			q.add(s+"0");
			q.add(s+"1");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		binaryNums(n);
	}
}
