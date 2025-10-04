package logicBuilding;

import java.util.ArrayList;

public class PerfectNumber {
	static boolean pc(int num) {
		int res=0;
		for(int i=1; i<num; i++) {
			if(num%i==0) res+=i;
		}
		
		return res==num;
	}
	
	static boolean divisorMethod(int num) {
		int res=1;
		for(int i=2; i*i <= num; i++) {
			if(num%i==0) {
				if(i*i !=num) {
					res += i + num/i;
				}
				else res+=i;
			}
		}
		
		return res==num && num!=1;
	}
	public static void main(String[] args) {
		System.out.println(pc(16));
	}
}
