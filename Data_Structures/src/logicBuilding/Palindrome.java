package logicBuilding;

public class Palindrome {
	static boolean palin(int num) {
		int temp=0;
		int res = num;
		while(num >0) {
			temp = temp*10 +  num%10;
			num = num/10;
		}
		return temp==res;
	}
	
	public static void main(String[] args) {
		System.out.println(palin(12341));
	}
}
