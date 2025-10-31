package array;

public class MinCostToMakeArrSize1 {
	static int minCost(int[] arr) {
		int len = arr.length;
		int min=arr[0];
		for(int i=1; i<arr.length; i++) {
			if(min>arr[i]) min=arr[i];
		}
		
		return (len-1)*min;
	}
	
	public static void main(String[] args) {
		int[] arr = {4,3};
		System.out.println(minCost(arr));
	}
}
