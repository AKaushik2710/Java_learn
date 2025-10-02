package logicBuilding;

public class PrimeChecker {
	static boolean pc(int num) {
		if(num==1) return true;
		if(num%2==0 && num !=2) {
			return false;
		}
		else {
			int temp = 3;
			while(temp<num) {
				if(num%temp==0 && num != temp) {
					return false;
				}
				temp+=2;
			}
		}
		
		return true;
	}
	
	static boolean optimizedPC(int num) {
		if(num==1) return false;
		
		for(int i=2; i*i <= num; i++) {
			if(num%i==0) return false;
		}
		return true;
	}
	public static void main(String[] args) {
		System.out.println(optimizedPC(23));
	}
}
