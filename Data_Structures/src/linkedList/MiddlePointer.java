package linkedList;

public class MiddlePointer {
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
	
	static SingleListNode middlePointer(SingleListNode head) {
		SingleListNode slowPtr = head;
		SingleListNode fastPtr = head;
		
		while(fastPtr!=null && fastPtr.getNextNode()!=null) {
			slowPtr = slowPtr.getNextNode();
			fastPtr = fastPtr.getNextNode().getNextNode();
		}
		
		return slowPtr;
	}
	public static void main(String[] args) {
		SingleListNode head = listMaker();
		
		SingleListNode mid = middlePointer(head);
		
		System.out.println(mid.getData());
	}
}
