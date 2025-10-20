package linkedList;

public class ReverseDoublyList {
	static DoubleListNode listMaker() {
		DoubleListNode head = null;
		DoubleListNode temp = null;
		for(int i=1; i<20; i++) {
			DoubleListNode sln = new DoubleListNode(i);
			if(head==null) {
				head = sln;
				head.setPrevNode(null);
				head.setNextNode(null);
				temp = head;
			}
			else {
				temp.setNextNode(sln);
				temp.getNextNode().setPrevNode(temp);
				temp = temp.getNextNode();
			}
		}
		return head;
	}
	
	static DoubleListNode reverser(DoubleListNode head) {
		DoubleListNode temp = head, prev=null, curr=null;
		
		while(temp!=null) {
			curr = temp;
			if(prev!=null)prev.setPrevNode(curr);
			temp = temp.getNextNode();
			curr.setNextNode(prev);
			prev = curr;
			prev.setPrevNode(null);
		}
		
		return prev;
	}
	public static void main(String[] args) {
		DoubleListNode head = listMaker();
		
//		while(head.getNextNode()!=null) {
//			System.out.println(head.getData());
//			head=head.getNextNode();
//			System.out.println(head.getPrevNode().getData());
//		}
//		
//		System.out.println(head.getData());
		
		DoubleListNode newHead = reverser(head);
		while(newHead!=null) {
			System.out.println(newHead.getData());
			newHead=newHead.getNextNode();
		}
		System.out.println(newHead.getPrevNode());
	}
}
