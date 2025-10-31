package array;

import java.util.Arrays;

public class ZeroToEnd {
	static int[] mover(int[] arr) {
		int front = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]!=0) {
				int temp = arr[i];
				arr[i] =  arr[front];
				arr[front] =  temp;
				front++;
			}
		}
		
		return arr;
	}
	
	public static void main(String[] args) {
		int[] arr = {1, 2, 0, 4, 3, 0, 5, 0};
		arr = mover(arr);
		String str = "1001001";
		int count=0;
		for(char i : str.toCharArray()) {
			if(i=='1') count++;
		}
		System.out.println(count);
//		System.out.println(Arrays.toString(arr));
	}
}
