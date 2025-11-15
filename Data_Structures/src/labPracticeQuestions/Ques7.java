package labPracticeQuestions;

import java.util.Scanner;

class CircularQueue{
	int[] arr;
	static int front= -1;
	static int rear = -1;
	int size;
	CircularQueue(int len){
		this.arr = new int[len];
		this.size = len;
	}
	
	public boolean enqueue(int num) {
		if((rear+1)%size == front) {
			System.out.println("Size is full");
			return false;
		}
		
		if(front==-1) {
			front =0;
		}
		
		rear = (rear+1)%size;
		arr[rear] = num;
		return true;
	}
	
	public boolean dequeue() {
		if(front==-1) {
			System.out.println("Queue is Empty");
			return false;
		}
		
		if(front==rear) {
			return true;
		}
		
		front = (front+1)%size;
		return true;
	}
	
	public void display() {
		System.out.println(arr[front]);
	}
}
public class Ques7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		sc.nextLine();
		CircularQueue q = new CircularQueue(size);
		
		while(true) {
			String str = sc.nextLine();
			
			String[] starr = str.split(" ");
			
			if(starr[0].equals("STOP")) break;
			
			if(starr[0].equals("ENQUEUE")) {
				q.enqueue(Integer.parseInt(starr[1]));
			}
			else if(starr[0].equals("DEQUEUE")) {
				q.dequeue();
			}
			else if(starr[0].equals("DISPLAY")) {
				q.display();
			}
		}
		
	}
}
