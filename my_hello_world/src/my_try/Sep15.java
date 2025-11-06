package my_try;

import java.util.HashMap;

public class Sep15 {
	public static void main(String[] args) {
		String str = "abaac";
		char[] arr =  str.toCharArray();
		for(int i=0; i<str.toCharArray().length-1; i++) {
			if(arr[i]==arr[i+1]) {
			System.out.println(arr[i]+" "+i);
			}
		}
	}
}
