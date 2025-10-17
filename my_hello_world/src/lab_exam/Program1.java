package lab_exam;

import java.util.HashMap;

class Node {
	int val;
	Node next;
	Node(int val){
		this.val = val;
		this.next = null;
	}
}
public class Program1 {
	static Node deleter(Node head) {
		Node res=head;
		Node temp=head;
		Node prev = head;
		boolean great=false;
		if(temp==null || temp.next==null) return head;
		while(temp!=null && temp.next!=null) {
			if(temp.val<temp.next.val) {
				res = temp.next;
				temp.next = null;
				prev.next=null;
				great=true;
				break;
			}
			prev=temp;
			temp=temp.next;
		}
		if(head.val>res.val) res = head;
		if(great)res = deleter(res);
		return res;
	}
	
	static Node del(Node head) {
		Node res = head;
		Node prev = head;
		Node temp = head;
		boolean great = false;
		while(temp!=null && temp.next!=null) {
			if(temp.val<temp.next.val) {
				res = temp.next;
				temp.next=null;
				prev.next = null;
				great=true;
				break;
			}
			prev = temp;
			res=res.next;
			temp = temp.next;
		}
		if(head.val>res.val) res = head;
		else 
		if(great) res = del(res);
		return res;
	}
	public static void main(String[] args) {
		Node head = new Node(12);
		head.next = new Node(15);
		head.next.next = new Node(10);
		head.next.next.next = new Node(11);
		head.next.next.next.next = new Node(5);
		head.next.next.next.next.next = new Node(6);
		head.next.next.next.next.next.next = new Node(2);
		head.next.next.next.next.next.next.next = new Node(3);
		
//		Node head = new Node(10);
//		head.next = new Node(20);
//		head.next.next = new Node(30);
//		head.next.next.next = new Node(40);
//		head.next.next.next.next = new Node(50);
		
		Node hg = deleter(head);
		System.out.println(hg.next.val);
		while(hg!=null && hg.next!=null) {
			System.out.println(hg.val);
			hg=hg.next;
		}
	}
}
