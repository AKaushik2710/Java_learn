package array;

import java.util.ArrayList;
import java.util.Arrays;

public class LeadersInArray {
	static int[] leaders(int[] arr) {
//		int[] arr = new int[arr.length];
		ArrayList<Integer> newArr = new ArrayList<>();
		newArr.add(arr[arr.length-1]);
		int maxVal=arr[arr.length-1];
		for(int i=arr.length-2; i>0; i--) {
			if(arr[i]>maxVal) {
				newArr.add(arr[i]);
				maxVal = arr[i];
			}
		}
		
		int[] res = new int[newArr.size()];
		int j=0;
		for(Integer i : newArr) {
			res[j] = i;
			j++;
		}
		
		return res;
	}
	
	public static void main(String[] args) {
		int[] arr = {16, 17, 4, 3, 5, 2};
		arr = leaders(arr);
		System.out.println(Arrays.toString(arr));
	}
}
