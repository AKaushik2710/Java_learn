package linkedList;

public class LinkedNode {
	int value;
	LinkedNode next, prev;
	LinkedNode(int val, LinkedNode prevNode, LinkedNode nextNode){
		this.value = val;
		this.prev = prevNode;
		this.next = nextNode;
	}
	LinkedNode(int val, LinkedNode nextNode){
		this.value = val;
		this.next = nextNode;
	}
}
