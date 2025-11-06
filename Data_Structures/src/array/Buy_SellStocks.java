package array;

public class Buy_SellStocks {
	static int profitAcquired(int[] arr) {
		int buy=0;
		int profit=0;
		boolean hasBought=false;
		for(int i=0; i<arr.length-1; i++) {
			if(arr[i] < arr[i+1]) {
				if(!hasBought) {
					buy=arr[i];
					hasBought = true;
				}
			}
			else {
				if(hasBought)profit+= arr[i] - buy;
				hasBought=false;
			}
			
			if(i==arr.length-2 && arr[arr.length-1]>arr[arr.length-2]) {
				System.out.println("I came here");
				profit+= arr[arr.length-1] - buy;
			}
		}
		return profit;
	}
	
	public static void main(String[] args) {
//		int[] arr = {100, 180, 260, 310, 40, 535, 695};
//		int[] arr = {4,2};
//		int[] arr = {1, 2, 3, 4, 5};
//		int[] arr = {7, 1, 5, 3, 6, 4};
//		int[] arr = {2, 4, 1, 7, 5, 3, 6, 4};
//		int[] arr = {5, 5, 5, 5, 5};
//		int[] arr = {10};
//		int[] arr = {3, 2, 6, 5, 0, 3};
		int[] arr = {1, 5, 3, 8, 4, 9};
		System.out.println(profitAcquired(arr));
	}
}
