package labPracticeQuestions;

public class DPS_2_17 {
	static int fibo(int n) {
		if(n==0) {
			return 0;
		}
		else if(n==1) {
			return 1;
		}
		return fibo(n-1)+fibo(n-2);
	}
	
	public static void main(String[] args) {
		for(int i=0; i<5 ; i++) {
			System.out.print(fibo(i) + " ");
		}
//		System.out.println(fibo(5));
	}
}
