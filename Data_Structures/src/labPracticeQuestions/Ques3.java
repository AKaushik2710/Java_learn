package labPracticeQuestions;

import java.util.Scanner;

class LinkList{
	int data;
	LinkList next;
	LinkList(int data){
		this.data = data;
		this.next = null;
	}
}
public class Ques3 {
	static LinkList insertNew(LinkList head, int pos, int val) {
		LinkList prev = head;
		LinkList curr = head;
		if(pos==1) {
			head = new LinkList(val);
			head.next = curr;
			return head;
		}
		else {
		for(int i=1; i<=pos; i++) {
//			prev = curr;
			if(i==pos) {
				prev.next = new LinkList(val);
				prev.next.next = curr;
			}
			else {
				prev = curr;
				curr = curr.next;
			}
		}}
		return head;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		sc.nextLine();
		String str = sc.nextLine();
		int idx = sc.nextInt();
		int newVal = sc.nextInt();
		String[] starr = str.split(" ");
		int[] arr = new int[length];
		for(int i=0; i<length; i++) {
			arr[i] = Integer.parseInt(starr[i]);
		}
		LinkList head = new LinkList(-1);
		LinkList temp = head;
		for(int i : arr) {
			temp.next = new LinkList(i);
			temp = temp.next;
		}
		
		head=head.next;
		temp = head;
		while(head!=null) {
			System.out.println(head.data);
			head = head.next;
		}
		head = temp;
		head = insertNew(head, idx, newVal);
		while(head!=null) {
			System.out.println(head.data);
			head = head.next;
		}
//		insertNew(head, idx, newVal);
//		while(head!=null) {
//			System.out.println(head.data);
//			head = head.next;
//		}
//		System.out.println(head.data + temp.data);
	}
}
