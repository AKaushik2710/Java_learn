package logicBuilding;

import java.util.ArrayList;
import java.util.Collections;

public class HighestCommonFactor {
	
	static int hcf(int num1, int num2) {
		int result = Math.min(num1, num2);
		while(result>0) {
			if(num1%result==0 && num2%result==0) break;
			result --;
		}
		return result;
	}
	
//	Euclid Theorem Approach
	static int euclidHCF(int num1, int num2) {
		return (num2==0) ? num1 : euclidHCF(num2, num1%num2);
	}
	
	public static void main(String[] args) {
		System.out.println(hcf(20,28));
		System.out.println(euclidHCF(20, 28));
	}
}
