package logicBuilding;

import java.util.ArrayList;

public class FibonacciSequence {

	static ArrayList<Integer> fs(int num){
		int n1=0, n2=1, i=0;
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(n1);
		arr.add(n2);
		while(i<num) {
			arr.add(n1+n2);
			n1=n2;
			n2=arr.get(arr.size()-1);
			i++;
		}
		
		return arr;
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(0);
		arr.add(1);
		arr.add(2);
		System.out.println(arr.get(arr.size()-1));
		System.out.println(fs(5).get(6));
	}
}
