package linkedList;

public class QuickSortList {
	static SingleListNode getTail(SingleListNode head) {
		while(head.getNextNode()!=null) {
			head = head.getNextNode();
		}
		return head;
	}
	
	static void partition(SingleListNode head, SingleListNode tail) {
		Node pivot = head
	}
	static void quickSortHelper(SingleListNode head, SingleListNode tail) {
		if(head == null || head == tail) return;
		
		SingleListNode pivot = partition(head, tail);
		
		quickSortHelper(head, pivot);
		quickSortHelper(pivot.getNextNode(), tail);
	}
	static SingleListNode quickSort(SingleListNode head) {
		SingleListNode tail = getTail(head);
		
		quickSortHelper(head, tail);
		
		return head;
	}
}
