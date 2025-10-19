package linkedList;

public class SingleListNode {
	private int data;
	private SingleListNode next;
	SingleListNode(int val){
		this.data = val;
		this.next = null;
	}
	
	int getData() {
		return this.data;
	}
	
	SingleListNode getNextNode() {
		return this.next;
	}
	
	void setNextNode(SingleListNode node) {
		this.next = node;
	}
}
