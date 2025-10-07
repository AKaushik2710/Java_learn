package logicBuilding;

public class DivisbleBy4 {
//	Naive Approach
	static boolean db4(long num) {
		return num%4==0;
	}
	
//	If last 2 digits are divisble by 4 it's divisble  by 4
	static boolean DB4(String num) {
		int temp = num.charAt(num.length()-2) - '0';
		int temp2 = num.charAt(num.length()-1) - '0';
		
		return (temp*10+temp2)%4==0;
	}
	public static void main(String[] args) {
		System.out.println(DB4("1234567589333812l"));
	}
}
