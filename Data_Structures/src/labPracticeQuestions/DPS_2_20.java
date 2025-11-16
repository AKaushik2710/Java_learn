package labPracticeQuestions;

public class DPS_2_20 {
	static boolean isPrime(int num) {
		if(num==1 || num==2) return true;
		if(num!=2 && num%2==0) return false;
		else {
			int temp =3;
			while(temp<num) {
				if(num%temp==0 && num!=temp) return false;
				temp+=2;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println(isPrime(15));
	}
}
