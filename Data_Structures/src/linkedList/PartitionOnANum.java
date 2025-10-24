package linkedList;

public class PartitionOnANum {
	static SingleListNode partitioned(SingleListNode head, int m) {
		SingleListNode low = new SingleListNode(0);
		SingleListNode l = low;
		SingleListNode high = new SingleListNode(0);
		SingleListNode h = high;
		SingleListNode mid = new SingleListNode(0);
		SingleListNode md = mid;
		while(head!=null) {
			if(head.getData()<m) {
				low.setNextNode(new SingleListNode(head.getData()));
				low = low.getNextNode();
			}
			else if(head.getData()>m){
				high.setNextNode(new SingleListNode(head.getData()));
				high = high.getNextNode();
			}
			else {
				mid.setNextNode(new SingleListNode(head.getData()));
				mid = mid.getNextNode();
			}
			head = head.getNextNode();
		}
		low.setNextNode(md.getNextNode());
		mid.setNextNode(h.getNextNode());
		return l.getNextNode();
	}
	
	public static void main(String[] args) {
		SingleListNode head = new SingleListNode(10);
		head.setNextNode(new SingleListNode(4));
		head.getNextNode().setNextNode(new SingleListNode(20));
		head.getNextNode().getNextNode().setNextNode(new SingleListNode(10));
		head.getNextNode().getNextNode().getNextNode().setNextNode(new SingleListNode(3));
//		head.getNextNode().getNextNode().getNextNode().getNextNode().setNextNode(new SingleListNode(2));
//		head.getNextNode().getNextNode().getNextNode().getNextNode().getNextNode().setNextNode(new SingleListNode(3));
		
		head = partitioned(head, 3);
		
		while(head!=null) {
			System.out.println(head.getData());
			head = head.getNextNode();
		}
	}
}
