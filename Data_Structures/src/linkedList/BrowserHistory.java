package linkedList;

public class BrowserHistory {
	DoubleListNode head;
	
	void inserter(DoubleListNode nextNode) {
		head.setNextNode(nextNode);
		DoubleListNode prev = head;
		head = head.getNextNode();
		head.setPrevNode(prev);
	}
	
	void recurser(int val) {
		while(val>0 && head.getPrevNode()!=null) {
			head = head.getPrevNode();
			val--;
		}
	}
	
	void forwarder(int val) {
//		System.out.println(head.getData());
		while(val>0 && head.getNextNode()!=null) {
			head = head.getNextNode();
			val--;
		}
	}
	
	public static void main(String[] args) {
		BrowserHistory bh = new BrowserHistory();
		bh.head = new DoubleListNode(1);
		DoubleListNode t = bh.head;
		
		bh.inserter(new DoubleListNode(2));
		bh.inserter(new DoubleListNode(3));
		
//		System.out.println(bh.head.getData());
		
		bh.recurser(1);
//		System.out.println(bh.head.getData());
		
		bh.inserter(new DoubleListNode(56));
//		System.out.println(bh.head.getData());
//		
		bh.forwarder(3);
//		while(t.getNextNode()!=null) {
//			System.out.println(t.getData());
//			t = t.getNextNode();
//		}
//		System.out.println(t.getData());
		System.out.println(bh.head.getData());
	}
}
