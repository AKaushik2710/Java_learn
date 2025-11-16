package labPracticeQuestions;

import java.util.Scanner;

public class DPS_2_6 {
	static int maxSum(int[] arr, int k) {
		int maxSum = 0;
		int currSum = 0;
		for(int i=0; i<k; i++) {
			currSum+=arr[i];
		}
		maxSum = currSum;
		for(int i=k; i<arr.length; i++) {
			currSum = currSum + arr[i] - arr[i-k];
			if(maxSum<currSum) maxSum = currSum;
		}
		return maxSum;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] starr = str.split(" ");
		int[] arr = new int[starr.length];
		for(int i=0; i<starr.length; i++) {
			arr[i] = Integer.parseInt(starr[i]);
		}
		
		int max =0 ;
		for(int i=1; i<arr.length; i++) {
			if(maxSum(arr, i)> max) max = maxSum(arr, i);
		}
		System.out.println(max);
	}
}
