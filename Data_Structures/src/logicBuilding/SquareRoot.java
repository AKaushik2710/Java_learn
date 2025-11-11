package logicBuilding;

public class SquareRoot {
	static int sr(int num) {
		int res=0;
		for(int i=1; i<num/2; i++) {
			if(i*i<=num) res=i;
		}
		return res;
	}
	
	static int binarySR(int num) {
		int res=0;
		int low=1;
		int high=num;
		int mid;
		while(low<=high) {
			mid = low+(high-low)/2;
			if(mid*mid<=num) {
				res=mid;
				low=mid+1;
			}
			else {
				high = mid-1;
			}
		}
		return res;
	}
	
	public static void main(String[] args) {
		System.out.println(binarySR(1));
	}
}
