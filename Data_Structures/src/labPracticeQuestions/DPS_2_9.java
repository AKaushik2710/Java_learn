package labPracticeQuestions;

import java.util.Scanner;

public class DPS_2_9 {
	static int binarySearch(int[] arr, int val) {
		int l=0, h=arr.length;
		int res=0;
		while(l<h) {
			int m = l+(h-l)/2;
			if(arr[m]==val) {
				res = m;
				break;
			}
			else if(arr[m] > val) {
				l = m+1;
			}
			else {
				h = m-1;
			}
		}
		return res;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] starr = str.split(" ");
		int[] arr = new int[starr.length];
		for(int i=0; i<starr.length; i++) {
			arr[i] = Integer.parseInt(starr[i]);
		}
		
		System.out.println(binarySearch(arr, 5));
	}
}
