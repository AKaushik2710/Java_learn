package labPracticeQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class Ques2 {
	static void arrReversal(int[] arr, int length) {
		for(int i=0; i<length/2; i++) {
			int temp = arr[i];
			arr[i] = arr[length-i-1];
			arr[length-i-1] = temp;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		sc.nextLine();
		String str = sc.nextLine();
		String[] starr = str.split(" ");
		int[] arr = new int[length];
		for(int i=0; i<length; i++) {
			arr[i] = Integer.parseInt(starr[i]);
		}
		arrReversal(arr, length);
		System.out.println(Arrays.toString(arr));
	}
}
