package labPracticeQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class DPS_2_7 {
	static void moveZeroes(int[] arr) {
		int s = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]!=0) {
				arr[s] = arr[i];
				arr[i] = 0;
				s++;
			}
		}	
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] starr = str.split(" ");
		int[] arr = new int[starr.length];
		for(int i=0; i<starr.length; i++) {
			arr[i] = Integer.parseInt(starr[i]);
		}
		moveZeroes(arr);
		System.out.println(Arrays.toString(arr));
	}
}
