package linkedList;

public class TwoSortedListsIntersection {
	static SingleListNode intersector(SingleListNode head1, SingleListNode head2) {
		SingleListNode head = new SingleListNode(0);
		SingleListNode res = head;
		while(head1!=null && head2!=null) {
			if(head1.getData() == head2.getData()) {
				head.setNextNode(new SingleListNode(head1.getData()));
				head  = head.getNextNode();
				head1 = head1.getNextNode();
				head2 = head2.getNextNode();
			}
			else if(head1.getData()<head2.getData()) {
				head1 = head1.getNextNode();
			}
			else {
				head2 = head2.getNextNode();
			}
		}
		
		return res.getNextNode();
	}
	public static void main(String[] args) {
		SingleListNode head1 = new SingleListNode(1);
		head1.setNextNode(new SingleListNode(2));
		head1.getNextNode().setNextNode(new SingleListNode(3));
		head1.getNextNode().getNextNode().setNextNode(new SingleListNode(4));
		head1.getNextNode().getNextNode().getNextNode().setNextNode(new SingleListNode(5));
		
		SingleListNode head2 = new SingleListNode(2);
		head2.setNextNode(new SingleListNode(4));
		head2.getNextNode().setNextNode(new SingleListNode(5));
		head2.getNextNode().getNextNode().setNextNode(new SingleListNode(6));
		
		SingleListNode output = intersector(head1, head2);
		
		while(output!=null) {
			System.out.println(output.getData());
			output = output.getNextNode();
		}
	}
}
