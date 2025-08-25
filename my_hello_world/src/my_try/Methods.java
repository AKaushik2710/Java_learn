package my_try;

public class Methods {
	static int adder(int a, int b) {
//		System.out.print(a+b);
		return a+b;
	}
	public static double adder(double a, double b) {
		return a+b;
	}
	static float adder(float a, float b) {
		return a-b;
	}
	public static void main(String args[]) {
		System.out.println(adder(23.2, 11.1));
		System.out.println(adder(3,67));
		System.out.println(adder(22.1f, 11.1f));
	}
}
