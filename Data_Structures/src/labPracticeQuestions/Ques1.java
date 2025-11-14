package labPracticeQuestions;

import java.util.Scanner;

public class Ques1 {
	static int secondBiggest(int[] arr) {
		int largest = Integer.MIN_VALUE;
		int secondLargest=Integer.MIN_VALUE;
		
		for(int i:arr) {
			if(i>largest) {
				secondLargest = largest;
				largest = i;
			}
		}
		return secondLargest;
	}
	
	public static void main(String[] args) {
		int[] arr = {10, 20, 4, 45, 99};
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		sc.nextLine();
		int[] arr1 = new int[length];
		String str = sc.nextLine();
		String[] starr = str.split(" ");
		for(int i=0; i<length; i++) {
			arr1[i] = Integer.parseInt(starr[i]);
		}
		sc.close();
		System.out.println(secondBiggest(arr1));
	}
}
