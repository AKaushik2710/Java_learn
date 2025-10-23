package linkedList;

import java.util.HashSet;

public class RemoveDuplicatesInSortedList {
	
	static SingleListNode dupRemover(SingleListNode head) {
		SingleListNode temp = head;
		
		while(temp!=null) {
			if(temp.getNextNode()==null) break;
			if(temp.getData() == temp.getNextNode().getData()) {
				SingleListNode t = temp.getNextNode().getNextNode();
				temp.getNextNode().setNextNode(null);
				temp.setNextNode(t);
			}
			else {
				temp = temp.getNextNode();
			}
		}
		
		return head;
	}
	public static void main(String[] args) {
		SingleListNode head = new SingleListNode(1);
		head.setNextNode(new SingleListNode(1));
//		head.getNextNode().setNextNode(new SingleListNode(2));
//		head.getNextNode().getNextNode().setNextNode(new SingleListNode(3));
//		head.getNextNode().getNextNode().getNextNode().setNextNode(new SingleListNode(3));
//		head.getNextNode().getNextNode().getNextNode().getNextNode().setNextNode(new SingleListNode(3));
		head = dupRemover(head);
		HashSet<Integer> hash = new HashSet<>();
		while(head!=null) {
			System.out.println(head.getData());
			head = head.getNextNode();
		}
	}
}
