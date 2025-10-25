package array;

import java.util.Arrays;

public class ReverseAnArray {
	static void reverse(int[] arr) {
		int mid = arr.length/2;
		
		for(int i=0; i<mid; i++) {
			arr[i] += arr[arr.length-i-1];
			arr[arr.length-i-1] = arr[i] - arr[arr.length-i-1];
			arr[i] = arr[i] - arr[arr.length-i-1];
		}
		
		System.out.println(Arrays.toString(arr));
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6};
		reverse(arr);
	}
}
