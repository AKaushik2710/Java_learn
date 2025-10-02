package logicBuilding;

public class ValidTriangle {
	static boolean vt(int a, int b, int c) {
		if((a+b)>c && (b+c)>a && (a+c)>b) return true;
		return false;
	}
	
	public static void main(String[] args) {
		System.out.println(vt(7,10,1));
	}
}
