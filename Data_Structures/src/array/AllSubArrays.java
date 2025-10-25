package array;

public class AllSubArrays {
	static void subArrs(int[] arr) {
		int n = arr.length;
		
		for(int i=0; i<n ; i++) {
			for(int j=i; j<n; j++) {
				System.out.print("[");
				for(int k=i; k<=j; k++) {
					System.out.print(arr[k]);
				}
				System.out.println("]");
			}
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,3};
		subArrs(arr);
	}
}
