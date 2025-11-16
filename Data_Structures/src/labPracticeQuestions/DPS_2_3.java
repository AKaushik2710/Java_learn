package labPracticeQuestions;

import java.util.Scanner;

public class DPS_2_3 {
	static int missingNum(int[] arr) {
		for(int i=1; i<arr.length; i++) {
			if(arr[i]-arr[i-1] != 1) return arr[i-1] + 1;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] starr = str.split(" ");
		int[] arr = new int[starr.length];
		for(int i=0; i<starr.length; i++) {
			arr[i] = Integer.parseInt(starr[i]);
		}
		
		System.out.println(missingNum(arr));
	}
}
