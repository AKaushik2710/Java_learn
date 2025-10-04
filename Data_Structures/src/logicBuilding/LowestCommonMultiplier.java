package logicBuilding;

public class LowestCommonMultiplier {
	static int hcf(int num1, int num2) {
		return (num2==0) ? num1 : hcf(num2, num1%num2);
	}
	static int lcm(int num1, int num2) {
		return (num1*num2)/hcf(num1, num2);
	}
	
	public static void main(String[] args) {
		System.out.println(lcm(2, 2));
	}
}
