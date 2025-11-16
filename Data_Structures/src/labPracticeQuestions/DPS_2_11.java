package labPracticeQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class DPS_2_11 {
	static int[] intersection(int[] arr1, int[] arr2) {
		int[] res = new int[arr1.length>arr2.length ? arr1.length : arr2.length];
		int count=0;
		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr2.length; j++) {
				if(arr1[i]==arr2[j]) res[count++] = arr2[j];
			}
		}
		return Arrays.copyOf(res, count);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] starr = str.split(" ");
		int[] arr = new int[starr.length];
		for(int i=0; i<starr.length; i++) {
			arr[i] = Integer.parseInt(starr[i]);
		}
		
		String str2 = sc.nextLine();
		String[] starr2 = str2.split(" ");
		int[] arr2 = new int[starr2.length];
		for(int i=0; i<starr2.length; i++) {
			arr2[i] = Integer.parseInt(starr2[i]);
		}
		
		System.out.println(Arrays.toString(intersection(arr, arr2)));
	}
}
