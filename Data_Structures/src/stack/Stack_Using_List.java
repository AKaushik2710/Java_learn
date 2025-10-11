package stack;

class Node{
	int val;
	Node next=null;
	Node(int val, Node next){
		this.val=val;
		this.next=next;
	}
}

class List_Stack{
	
	void push(int val, Node head) {
		Node successor = new Node(val, null);
		head.next = successor;
	}
	
	void pop(Node head) {
		if(head==null || head.next==null) head=null;
		System.out.println("Here");
		while(head.next.next!=null) {
			head = head.next;
		}
		
		head.next=null;
	}
}
public class Stack_Using_List {
	static Node head = new Node(9, null);
	public static void main(String[] args) {
		List_Stack s = new List_Stack();
		s.push(10, head);
		Node temp = head;
		while(temp!=null) {
			System.out.println(temp.val);
			temp=temp.next;
		}
		s.pop(head);
		while(head!=null) {
			System.out.println(head.val);
			head=head.next;
		}
	}
}
