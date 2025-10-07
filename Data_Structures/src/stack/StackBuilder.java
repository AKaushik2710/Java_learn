package stack;

import java.util.Arrays;

class Stack{
	private int[] arr =  new int[1];
	
	public String toString() {
		String vals="";
		for(int a : arr) {
			if(a!=0)vals+=a;
		}
		return vals;
	}
	
	public void push(int num) {
		this.arr[arr.length-1] = num;
		this.arr = Arrays.copyOf(arr, arr.length+1);
	}
	
	public void pop() {
		if(arr.length >0)this.arr = Arrays.copyOf(arr, arr.length-1);
	}
	
	public int peek() {
		if(arr.length>0) {
			return arr[arr.length-1];
		}
		return -1;
	}
}
public class StackBuilder {
	public static void main(String[] args) {
		Stack s = new Stack();
		s.push(23);
//		System.out.println(s);
		s.peek();
		s.peek();
		s.pop();
//		s.peek();
		s.pop();
	}
}
