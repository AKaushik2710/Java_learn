package logicBuilding;

public class Nth_AP_term {
//	Naive approach
	static int numProvider(int a1, int a2, int n) {
		int[] arr = new int[n+1];
		int temp=0;
		for(int i=0; i<arr.length; i++) {
			if(i==0) arr[i] = a1;
			else if(i==1) arr[i] = a2;
			else {
				arr[i] = (a2-a1)+temp;
			}
			temp = arr[i];
		}
		return arr[n-1];
	}
	
//	Exxpected Apprach
	static int numEasyProvider(int a1, int a2, int n) {
		return a1+(n-1)*(a2-a1);
	}
	public static void main(String[] args) {
		System.out.println(numEasyProvider(1, 3, 10));
	}
}
