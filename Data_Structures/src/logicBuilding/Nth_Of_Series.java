package logicBuilding;

public class Nth_Of_Series {
	static int nos(int num) {
		int i=2, n1=1;
		while(i<=num) {
			n1 +=i;
			i++;
		}
		return n1;
	}
	
	public static void main(String[] args) {
		System.out.println(nos(4));
	}
}
