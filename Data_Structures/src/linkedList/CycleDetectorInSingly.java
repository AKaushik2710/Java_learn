package linkedList;

public class CycleDetectorInSingly {
	static boolean cycleChecker(SingleListNode head) {
		SingleListNode slowPtr = head;
		SingleListNode fastPtr = head;
		
		while(head!=null && (fastPtr.getNextNode()!=null && fastPtr.getNextNode().getNextNode() !=null)) {
			slowPtr = slowPtr.getNextNode();
			fastPtr = fastPtr.getNextNode().getNextNode();
			if(slowPtr==fastPtr) return true;
		}
		
		return false;
	}
	public static void main(String[] args) {
		SingleListNode head = new SingleListNode(1);
		head.setNextNode(new SingleListNode(2));
		SingleListNode temp = head.getNextNode();
		head.getNextNode().setNextNode(new SingleListNode(3));
		head.getNextNode().getNextNode().setNextNode(new SingleListNode(4));
//		head.getNextNode().getNextNode().getNextNode().setNextNode(temp);
		System.out.println(cycleChecker(head));
	}
}
