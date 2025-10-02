package logicBuilding;

public class SumofDigits {
	static int sod(int num) {
		int sum = 0;
		while(num>0) {
			sum += num%10;
			num /= 10;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		System.out.println(sod(12));
	}
}
