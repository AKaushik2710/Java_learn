package logicBuilding;

public class SquareChecker {
	static boolean sc(int x, int y) {
		if(y==1) return true;
		while(x<y) {
			x=x*x;
		}
		return x==y;
	}
	
	public static void main(String[] args) {
		System.out.println(sc(10,100));
	}
}
