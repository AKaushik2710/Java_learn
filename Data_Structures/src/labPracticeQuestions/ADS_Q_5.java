package labPracticeQuestions;

import java.util.Arrays;
import java.util.Stack;

public class ADS_Q_5 {
	static int[] nextGreater(int[] arr) {
		int n = arr.length;
		int[] ans = new int[n];
		
		Stack<Integer> s = new Stack<>();
		
		for(int i=n-1; i>=0; i--) {
			
			while(!s.isEmpty() && s.peek()<=arr[i]) {
				s.pop();
			}
			
			ans[i] = s.isEmpty() ? -1 : s.peek();
			
			s.push(arr[i]);
		}
		
		return ans;
	}
	
	public static void main(String[] args) {
		int[] arr = {1, 3, 2, 4};
		int[] res = nextGreater(arr);
		
		System.out.println(Arrays.toString(res));
	}
}
