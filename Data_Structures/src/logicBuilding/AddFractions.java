package logicBuilding;

import java.util.Arrays;

public class AddFractions {
	static int hcf(int num1, int num2) {
		return (num2==0) ? num1 : hcf(num2, num1%num2);
	}
	static int lcm(int num1, int num2) {
		return (num1*num2)/hcf(num1, num2);
	}
	static int[] af(int[] a, int[] b) {
		int[] res = new int[2];
		int divisor = lcm(a[1], b[1]);
		int num = a[0]*(divisor/a[1]) + b[0]*(divisor/b[1]);
		int lcm = hcf(num, divisor);
		num = num/lcm;
		divisor = divisor/lcm;
		res[0] = num;
		res[1] = divisor;
		
		return res;
	}
	
	public static void main(String[] args) {
		int[] a = {1,2};
		int[] b = {3,2};
		System.out.println(Arrays.toString(af(a,b)));
	}
}
