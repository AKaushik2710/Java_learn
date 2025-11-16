package labPracticeQuestions;

import java.util.ArrayList;

public class DPS_2_19 {
	static LinkList insert(LinkList head, int val) {
		if(head == null) return new LinkList(val);
		LinkList temp = head;
		while(temp.next!=null) {
			temp = temp.next;
		}
		temp.next = new LinkList(val);
		return head;
	}
	
	static LinkList reversal(LinkList head) {
		ArrayList<Integer> arr = new  ArrayList<>();
		while(head!=null) {
			arr.add(head.data);
			head = head.next;
		}
		
		head = new LinkList(-1);
		LinkList temp = head;
		for(int i=arr.size()-1; i>=0; i--) {
			head.next = new LinkList(arr.get(i));
			head = head.next;
		}
		
		return temp.next;
	}
	public static void main(String[] args) {
		LinkList head = null;
		for(int i=1; i<6; i++) {
			head = insert(head, i);
		}
		head = reversal(head);
		while(head!=null) {
			System.out.println(head.data);
			head = head.next;
		}
	}
}
