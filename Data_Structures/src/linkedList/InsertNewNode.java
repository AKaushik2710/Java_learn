package linkedList;

public class InsertNewNode {
	static SingleListNode listMaker() {
		SingleListNode head = null;
		SingleListNode temp = null;
		for(int i=1; i<20; i++) {
			SingleListNode sln = new SingleListNode(i);
			if(head==null) {
				head = sln;
				temp = head;
			}
			else {
				temp.setNextNode(sln);
				temp = temp.getNextNode();
			}
		}
		
		return head;
	}
	
	static SingleListNode insertionAtHead(SingleListNode head, int val) {
		SingleListNode newHead = new SingleListNode(val);
		newHead.setNextNode(head);
		return newHead;
	}
	
	static SingleListNode insertionBeforeANode(SingleListNode head, int val, SingleListNode node) {
		SingleListNode temp = head;
		while(temp!=null) {
			if(temp.getNextNode().getData() == val) {
				SingleListNode tempNode = temp.getNextNode();
				temp.setNextNode(node);
				temp.getNextNode().setNextNode(tempNode);
				break;
			}
			temp = temp.getNextNode();
		}
		return head;
	}
	public static void main(String[] args) {
		SingleListNode head = listMaker();
//		SingleListNode newHead = insertionAtHead(head, 23);
		System.out.println("Before new Node insertion------>");
//		while(head!=null) {
//			System.out.println(head.getData());
//			head = head.getNextNode();
//		}
//		
//		head = newHead;
//		System.out.println("After new Node insertion------>");
//		while(head!=null) {
//			System.out.println(head.getData());
//			head = head.getNextNode();
//		}
		
		SingleListNode newHead = insertionBeforeANode(head, 2, new SingleListNode(100));
		while(head!=null) {
			System.out.println(head.getData());
			head = head.getNextNode();
		}
	}
}
