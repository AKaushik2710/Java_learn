package labPracticeQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class DPS_2_13 {
	static void rotater(int[] arr, int k) {
		int n = arr.length;
		k = k%n;
		int[] result = new int[n];
		for(int i=0; i<n; i++) {
			result[(i+k)%n] = arr[i];
		}
		
		for(int i=0; i<n; i++) {
			arr[i] = result[i];
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
		
		rotater(arr, 7);
		System.out.println(Arrays.toString(arr));
	}
}
