package practiceExam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class P_1 {
		ArrayList<Integer> creator(Scanner sc) {
		ArrayList<Integer> myArr = new ArrayList<>();
		System.out.println("How many records you want to add:-");
		int itr = sc.nextInt();
		for(int i =0; i<itr; i++) {
			myArr.add(sc.nextInt());
		}
		System.out.println(myArr);
		System.out.println("Do you want to remove any element, if so then enter the value or index:-");
		int beingRemoved = sc.nextInt();
		if(myArr.contains(beingRemoved)) {
			myArr.remove(myArr.indexOf(beingRemoved));
		}
		else if( !(myArr.size()<= beingRemoved) )myArr.remove(beingRemoved);
		else {
			System.out.println("Element & Index does not exist.");
		}
		
		return myArr;
		
	}
		
	int searcher(Scanner sc, ArrayList<String> myArr) {
		System.out.println("Enter the string you want to check:-");
		String checkVal = sc.next();
		for(String str : myArr) {
			if(str.toLowerCase().contains(checkVal.toLowerCase())) {
				return myArr.indexOf(str);
			}
		}
		return -1;
	}
	
	ArrayList<Integer> dupRemover (ArrayList<Integer> myArr){
		int[] arr = {1,2,1,4,1};
		int uniqueElements = 0;
		int count = 0;
		int[] temp = new int[arr.length];
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<temp.length; j++) {
				if(arr[i] == temp[j]) {
					if(count<=0)count ++;
					else break;
				}
			}
			if(count <=0) temp[uniqueElements++] = arr[i];
			count=0;
		}
		
		arr = Arrays.copyOf(temp, uniqueElements);
		
		for(int a : arr) {
			System.out.println(a);
		}
		
		ArrayList<Integer> newArr = new ArrayList<>();
		
		for(int i=0; i< myArr.size(); i++) {
			int val = myArr.get(i);
			if(newArr.contains(val)) {
				myArr.remove(i);
				i--;
			}
			else {
				newArr.add(val);
			}
		}
		
		System.out.println(myArr);
	}
	
	ArrayList<Integer> reversal(){
		ArrayList<Integer> myArr = new ArrayList<Integer>();
		for(int i=0; i< myArr.size()/2; i++) {
			myArr.set(i, myArr.get(myArr.size()-i-1)+myArr.get(i));
			myArr.set(myArr.size()-i-1, myArr.get(i)-myArr.get(myArr.size()-i-1));
			myArr.set(i, myArr.get(i)-myArr.get(myArr.size()-i-1));
		}
		return myArr;
	}
	
	int numCount() {
		ArrayList<Integer> myArr = new ArrayList<Integer>();
		int count=0;
		for(int i=0; i<myArr.size(); i++) {
			for(int j=0; j<myArr.size();j++) {
				if(myArr.get(i)==myArr.get(j)) {
					count++;
				}
			}
			System.out.println(myArr.get(i) + " appeared "+count + " times");
			count=0;
		}
		return count;
	}
	public static void main(String[] args) {
		P_1 p = new P_1();
		Scanner sc =  new Scanner(System.in);
//		ArrayList<Integer> myArr = p.creator(sc);
//		System.out.println(myArr);
		ArrayList<String> myArr2 = new ArrayList<>(Arrays.asList("Aman", "Kaushik","Himanshu", "Jai"));
		System.out.println(p.searcher(sc, myArr2));
	}
}
