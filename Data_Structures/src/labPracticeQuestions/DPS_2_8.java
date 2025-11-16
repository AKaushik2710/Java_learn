package labPracticeQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class DPS_2_8 {
	static int[] removeDup(int[] arr) {
		int dups=1;
		for(int i=1; i<arr.length; i++) {
			if(arr[i-1] == arr[i]) {
				continue;
			}
			arr[dups++] = arr[i];
		}
		return Arrays.copyOf(arr, dups);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] starr = str.split(" ");
		int[] arr = new int[starr.length];
		for(int i=0; i<starr.length; i++) {
			arr[i] = Integer.parseInt(starr[i]);
		}
		arr = removeDup(arr);
		System.out.println(Arrays.toString(arr));
	}
}
