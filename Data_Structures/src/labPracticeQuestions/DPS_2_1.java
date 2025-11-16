package labPracticeQuestions;

import java.util.Scanner;

public class DPS_2_1 {
	static int secondLargest(int[] arr) {
		int largest=0;
		int secondLargest=0;
		for(int i : arr) {
			if(i>largest) {
				secondLargest = largest;
				largest = i;
			}
		}
		return secondLargest;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] starr = str.split(" ");
		int[] arr = new int[starr.length];
		for(int i=0; i<starr.length; i++) {
			arr[i] = Integer.parseInt(starr[i]);
		}
		
		System.out.println(secondLargest(arr));
	}
}
