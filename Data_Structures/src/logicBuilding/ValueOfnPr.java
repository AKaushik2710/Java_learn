package logicBuilding;

public class ValueOfnPr {
	static int nPr(int n, int r) {
		int numerator=1;
		for(int i=n; i>0;i--) {
			numerator*=i;;
		}
		int denominator=1;
		for(int i=n-r; i>0; i--) {
			denominator *= i;
		}
		return numerator/denominator;
	}
	
	public static void main(String[] args) {
		System.out.println(nPr(6,3));
	}
}
