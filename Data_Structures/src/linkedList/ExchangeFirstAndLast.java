package linkedList;

public class ExchangeFirstAndLast {
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
		temp.setNextNode(head);
		return head;
	}
	
	static SingleListNode exchanger(SingleListNode head) {
		SingleListNode curr = head;
		do {
			curr = curr.getNextNode();
		}
		while(curr.getNextNode().getNextNode()!=head);
		
		SingleListNode temp = head.getNextNode();
		curr.getNextNode().setNextNode(null);
		head.setNextNode(curr.getNextNode());
		SingleListNode newHead = head.getNextNode();
		curr.getNextNode().setNextNode(temp);
		curr.setNextNode(head);
		return newHead;
	}
	
	public static void main(String[] args) {
		SingleListNode head = listMaker();
		head = exchanger(head);
		SingleListNode temp = head;
		do {
			System.out.println(head.getData());
			head = head.getNextNode();
		}
		while(head!=temp);
	}
}
