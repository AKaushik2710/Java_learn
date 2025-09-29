package logicBuilding;

public class ClosestDivision {
	static int closestDiv(int m, int n) {
		int q = m/n;
		int num1 = n*q;
		int num2 = n*m > 0 ? n*(q+1) : n*(q-1);
		
		if(Math.abs(m-num2)<Math.abs(m-num1)) return num2;
		return num1;
	}
	
	public static void main(String[] args) {
		System.out.println(closestDiv(15,4));
	}
}
