package labPracticeQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class DPS_2_14 {
	static void selectionSort(int[] arr) {
		int n = arr.length;
		
		for(int i=1; i<n; i++) {
			int key = arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>key) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = key;
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
		
		selectionSort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
