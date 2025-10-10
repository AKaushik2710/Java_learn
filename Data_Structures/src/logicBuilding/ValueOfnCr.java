package logicBuilding;

public class ValueOfnCr {
	static int nCr(int n, int r) {
		if(r>n) return 0;
		else if(r==0) return 1;
		else {
			int numerator=1;
			for(int i=n; i>0; i--) {
				numerator = numerator*i;
			}
			
			int denominator=1;
			for(int i=n-r; i>0; i--) {
				denominator = denominator*i;
			}
			for(int i =r; i>0; i--) {
				denominator *=i;
			}
			return numerator/denominator;
		}
	}
	
	public static void main(String[] args) {
		System.out.println(nCr(5,2));
	}
}
