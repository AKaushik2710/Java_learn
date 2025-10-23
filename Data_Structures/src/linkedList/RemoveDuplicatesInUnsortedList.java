package linkedList;

import java.util.HashSet;

public class RemoveDuplicatesInUnsortedList {
	static SingleListNode dupRemover(SingleListNode head) {
		HashSet<Integer> hash = new HashSet<>();
		while(head!=null) {
			hash.add(head.getData());
			head = head.getNextNode();
		}
		
		head = new SingleListNode(0);
		SingleListNode newHead = head;
		for(Object i : hash) {
			head.setNextNode(new SingleListNode((int)i));
			head = head.getNextNode();
		}
		
		return newHead.getNextNode();
	}
	
	public static void main(String[] args) {
		SingleListNode head = new SingleListNode(1);
		head.setNextNode(new SingleListNode(3));
		head.getNextNode().setNextNode(new SingleListNode(2));
		head.getNextNode().getNextNode().setNextNode(new SingleListNode(3));
		head.getNextNode().getNextNode().getNextNode().setNextNode(new SingleListNode(1));
		head.getNextNode().getNextNode().getNextNode().getNextNode().setNextNode(new SingleListNode(2));
		
		head = dupRemover(head);
		
		while(head!=null) {
			System.out.println(head.getData());
			head = head.getNextNode();
		}
	}
}
