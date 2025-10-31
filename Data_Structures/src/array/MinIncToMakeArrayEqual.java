package array;

public class MinIncToMakeArrayEqual {
	static int equal(int[] arr, int k) {
		int max=0;
		for(int i : arr) {
			if(i>max) max=i;
		}
		
		boolean eqMaker=false;
		int count=0;
		int allEqual=0;
		while(!eqMaker) {
			for(int i=0; i< arr.length; i++) {
				if((max-arr[i])%k!=0) return -1;
				
				if(max!=arr[i]) {
					arr[i]+=k;
					count++;
				}
				else {
					allEqual++;
				}
				if(allEqual==arr.length) eqMaker=true;
			}
			allEqual=0;
		}
		return count;
	}
	
	public static void main(String[] args) {
//		int[] arr = {4, 7, 19, 16};
//		int[] arr = {4, 4, 4, 4};
		int[] arr = {4, 2, 6, 8};
		System.out.println(equal(arr, 3));
	}
}
