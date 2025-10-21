package linkedList;

import java.util.HashSet;

public class LengthOfCycle {
	static int lengthOfCycle(SingleListNode head) {
		SingleListNode slowPtr = head;
		SingleListNode fastPtr = head;
		int count=0;
		int length=0;
		while(count<2) {
			slowPtr = slowPtr.getNextNode();
			fastPtr = fastPtr.getNextNode().getNextNode();
			if(slowPtr==fastPtr) count++;
			if(count==1) {
				length++;
			}
		}
		
		return length;
	}
	public static void main(String[] args) {
		SingleListNode head = new SingleListNode(25);
		head.setNextNode(new SingleListNode(14));
		head.getNextNode().setNextNode(new SingleListNode(19));
		head.getNextNode().getNextNode().setNextNode(new SingleListNode(33));
		head.getNextNode().getNextNode().getNextNode().setNextNode(new SingleListNode(10));
		head.getNextNode().getNextNode().getNextNode().getNextNode().setNextNode(head.getNextNode().getNextNode());
		System.out.println(lengthOfCycle(head));
	}
}
