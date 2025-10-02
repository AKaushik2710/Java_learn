package logicBuilding;

public class ReverseDigits {
	static int rd(int num) {
		int res=0;
		
		while(num>0) {
			res = res*10 + num%10;
			num /= 10;
		}
		return res;
	}
	
	public static void main(String[] args) {
		System.out.println(rd(002));
	}
}
