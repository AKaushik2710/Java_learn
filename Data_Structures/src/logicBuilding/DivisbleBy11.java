package logicBuilding;

public class DivisbleBy11 {
	static boolean db11(String num) {
		
		int odd=0, even=0, oddBool=0;
		long n = Long.parseLong(num);
		while(n!=0) {
			if(oddBool==0) {
				odd+=n%10;
				oddBool=1;
				n=n/10;
			}
			else {
				even+=n%10;
				oddBool=0;
				n=n/10;
			}
		}
		System.out.println(odd + " "+even);
		if(odd==even || (odd-even)%11==0) return true;
		return false;
	}
	
	public static void main(String[] args) {
		System.out.println(db11("76945"));
	}
}
