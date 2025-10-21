package linkedList;

public class SwappingNodePairs {
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
	
	static SingleListNode reversal(SingleListNode head) {
		if(head==null || head.getNextNode()==null) return head;
		SingleListNode prev = head;
		SingleListNode curr = prev.getNextNode();
		
		head = curr;
		
		while(true) {
			SingleListNode next = curr.getNextNode();
			curr.setNextNode(prev);
			
			if(next==null || next.getNextNode()==null) {
				prev.setNextNode(next);
				break;
			}
			
			prev.setNextNode(next.getNextNode());
			prev = next;
			curr = prev.getNextNode();
		}
		
		return head;
	}
	
	public static void main(String[] args) {
		SingleListNode head = listMaker();
		head = reversal(head);
		System.out.println("Result ----->");
		while(head!=null) {
			System.out.println(head.getData());
			head = head.getNextNode();
		}
	}
}
