package array;

import java.util.HashSet;

public class DuplicateWithinKDistance {
	static boolean dupPresent(int[] arr, int k) {
		HashSet<Integer> hash = new HashSet<>();
		for(int i=0; i<arr.length; i++) {
			if(hash.contains(arr[i])) return true;
			
			hash.add(arr[i]);
			
			if(i>=k)hash.remove(arr[i-k]);
		}
		
		return false;
	}
	
	public static void main(String[] args) {
//		int[] arr = {1, 2, 3, 4, 1, 2, 3, 4};
//		int[] arr = {1, 2, 3, 1, 4, 5};
		int[] arr = {1, 2, 3, 4, 5};
		System.out.println(dupPresent(arr, 3));
	}
}
