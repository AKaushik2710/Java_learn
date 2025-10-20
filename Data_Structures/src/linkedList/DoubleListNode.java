package linkedList;

public class DoubleListNode {
	private int data;
	private DoubleListNode next, prev;
	DoubleListNode(int val){
		this.data = val;
		this.next = this.prev = null;
	}
	
	int getData() {
		return this.data;
	}
	
	DoubleListNode getNextNode() {
		return this.next;
	}
	
	void setNextNode(DoubleListNode node) {
		this.next = node;
	}
	
	DoubleListNode getPrevNode() {
		return this.prev;
	}
	
	void setPrevNode(DoubleListNode node) {
		this.prev = node;
	}
}
