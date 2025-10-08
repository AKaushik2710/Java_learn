package queue;

import java.util.Arrays;

class Queue{
	private int[] arr = new int[1];
	
	public String toString() {
		String res="";
		for(int a : arr) {
			if(a!=0) res+=a;
		}
		return res;
	}
	
	void enqueue(int num) {
		arr[arr.length-1] = num;
		
		arr = Arrays.copyOf(arr, arr.length+1);
	}
	
	void dequeue() {
		if(arr.length!=0) {
			for(int i=0; i<arr.length-1; i++) {
				arr[i] = arr[i+1];
			}
			arr = Arrays.copyOf(arr, arr.length-1);
		}
	}
	
	int getFront() {
		return arr.length!=0 ? arr[0] : -1;
	}
	
	int getRear() {
		return arr.length!=0 ? arr[arr.length-2] : -1;
	}
}

class PriorityQueue{
	private int[] arr = new int[0];
	
	public String toString() {
		String res="";
		for(int a : arr) {
			if(a!=0) res+=a;
		}
		return res;
	}
	
	void enqueue(int num) {
		if(arr.length==0) addFirst(num);
		else {
			if(num>arr[0]) addFirst(num);
			else addLast(num);
		}
	}
	
	private void addFirst(int num) {
		arr = Arrays.copyOf(arr, arr.length+1);
		for(int i=1; i<arr.length;i++) {
			arr[arr.length-i] = arr[arr.length-i-1];
		}
		arr[0] = num;
	}
	
	private void addLast(int num) {
		arr = Arrays.copyOf(arr, arr.length+1);
		arr[arr.length-1] = num;
	}
	
	void dequeue() {
		if(arr.length!=0) {
			for(int i=0; i<arr.length-1; i++) {
				arr[i] = arr[i+1];
			}
			arr = Arrays.copyOf(arr, arr.length-1);
		}
	}
	
	int getFront() {
		return arr.length!=0 ? arr[0] : -1;
	}
	
	int getRear() {
		return arr.length!=0 ? arr[arr.length-2] : -1;
	}
}

class Dequeue{
private int[] arr = new int[0];
	
	public String toString() {
		String res="";
		for(int a : arr) {
			if(a!=0) res+=a;
		}
		return res;
	}
	
	void addFirst(int num) {
		arr = Arrays.copyOf(arr, arr.length+1);
		for(int i=1; i<arr.length;i++) {
			arr[arr.length-i] = arr[arr.length-i-1];
		}
		arr[0] = num;
	}
	
	void addLast(int num) {
		arr = Arrays.copyOf(arr, arr.length+1);
		arr[arr.length-1] = num;
	}
	
	void removeFirst() {
		if(arr.length!=0) {
			for(int i=0; i<arr.length-1; i++) {
				arr[i] = arr[i+1];
			}
			arr = Arrays.copyOf(arr, arr.length-1);
		}
	}
	
	void removeLast() {
		if(arr.length!=0) {
			arr = Arrays.copyOf(arr, arr.length-1);
		}
	}
	int getFront() {
		return arr.length!=0 ? arr[0] : -1;
	}
	
	int getRear() {
		return arr.length!=0 ? arr[arr.length-2] : -1;
	}
}
public class QueueBuilder {
	public static void main(String[] args) {
		Queue q = new Queue();
//		System.out.println(q.toString());
//		q.enqueue(23);
//		System.out.println(q.toString());
//		q.enqueue(44);
//		q.enqueue(11);
//		System.out.println(q.toString());
//		q.dequeue();
//		System.out.println(q.toString());
//		q.dequeue();
//		System.out.println(q.toString());
//		System.out.println(q.getRear());
		
//		Dequeue dq = new Dequeue();
//		dq.addFirst(1);
//		System.out.println(dq.toString());
//		dq.addFirst(2);
//		System.out.println(dq.toString());
//		dq.addLast(3);
//		System.out.println(dq.toString());
//		dq.removeFirst();
//		System.out.println(dq.toString());
//		dq.removeLast();
//		System.out.println(dq.toString());
//		dq.removeFirst();
//		dq.removeLast();
//		System.out.println(dq.toString());
		PriorityQueue pq = new PriorityQueue();
		pq.enqueue(11);
		System.out.println(pq.toString());
		pq.enqueue(12);
		System.out.println(pq.toString());
		pq.enqueue(1);
		System.out.println(pq.toString());
		pq.enqueue(5);
		System.out.println(pq.toString());
	}
}
