package array;

import java.util.Arrays;

public class RemoveDuplicates {
	static int[] dupRemove(int[] arr) {
		int count=1;
		int n = arr.length;
		for(int i=1; i<n; i++) {
			if(arr[i-1]==arr[i]) {
				continue;
			}
			arr[count++] = arr[i];
		}
		
		arr = Arrays.copyOf(arr, count);
		return arr;
	}
	
	public static void main(String[] args) {
		int[] arr = {1,1,2,2,3,3,4,4,5,5};
		arr = dupRemove(arr);
		System.out.println(Arrays.toString(arr));
	}
}
