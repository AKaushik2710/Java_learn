package slidingWindow;

public class WindowWorking {
	static int maxSubs(int[] arr, int k) {
		int maxSum=0;
		for(int i=0; i<k; i++) {
			maxSum+=arr[i];
		}
		
		int windowSum = maxSum;
		for(int i=k; i<arr.length; i++) {
			windowSum += arr[i] - arr[i-k];
			maxSum = Math.max(windowSum, maxSum);
		};
		return maxSum;
	}
	
	public static void main(String[] args) {
		int[] arr = {2, 1, 5, 1, 3, 2};
		System.out.println(maxSubs(arr, 3));
	}
}
