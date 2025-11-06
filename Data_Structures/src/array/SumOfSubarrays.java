package array;

public class SumOfSubarrays {
//	SLIDING WINDOW APPROACH
	static int totalSum(int[] num, int k) {
		int maxSum =0;
		for(int i=0; i< k; i++) {
			maxSum += num[i];
		}
		
		int windowSum=maxSum;
		for(int i=k; i < num.length; i++) {
			windowSum += num[i] - num[i-k];
			maxSum += windowSum;
		}
		
		return maxSum;
	}
	
//	OPTIMIZED APPROACH
	static int optTotal(int[] nums) {
		int n= nums.length;
		int res = 0;
		
		for(int i=0; i<n; i++) {
			res += nums[i] * (i+1) * (n-i);
		}
		
		return res;
	}
	public static void main(String[] args) {
		int[] arr = {1,4,5,3,2};
		int i=1;
		int total=0;
		while(i <= arr.length) {
			total += totalSum(arr, i);
			i++;
		}
		System.out.println(optTotal(arr));
		System.out.println(total);
	}
}
