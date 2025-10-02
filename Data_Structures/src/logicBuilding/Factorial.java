package logicBuilding;

public class Factorial {
//	Normal Approach
	static int fact(int num) {
		int res=1;
		while (num>1) {
			res = res*num;
			num=num-1;
		}
		return res;
	}
	
//	Recursor
	static int refact(int num) {
		if(num > 1) {
			num = num*refact(num-1);
		}
		return num;
	}
	public static void main(String[] args) {
		System.out.println(refact(3));
	}
}
