package linkedList;

public class DeletionInCircular {
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
	
	static SingleListNode fromHead(SingleListNode head) {
		SingleListNode temp = head;
		
		while(temp.getNextNode()!=head) {
			temp = temp.getNextNode();
		}
		
		temp.setNextNode(head.getNextNode());
		head.setNextNode(null);
		
		return temp.getNextNode();
	}
	
	static SingleListNode fromRear(SingleListNode rear) {
		SingleListNode temp = rear;
		
		while(temp.getNextNode().getNextNode()!=rear) {
			temp = temp.getNextNode();
		}
		
		temp.getNextNode().setNextNode(null);
		temp.setNextNode(rear);
		return rear;
	}
	
	static SingleListNode fromSpecific(SingleListNode head, int pos) {
		int count =1;
		SingleListNode temp = head;
		while(count+1!=pos) {
			if(temp.getNextNode()==head) {
				count=0;
				break;
			}
			temp = temp.getNextNode();
			count++;
		}
		
		SingleListNode curr = temp.getNextNode().getNextNode();
		temp.getNextNode().setNextNode(null);
		temp.setNextNode(curr);
		if(pos==1) head = curr;
		return head;
	}
	
	public static void main(String[] args) {
		SingleListNode head = listMaker();
//		SingleListNode newHead = fromHead(head);
//		head = newHead;
//		SingleListNode newHead = fromRear(head);
//		head = newHead;
		SingleListNode newHead = fromSpecific(head, 1);
		head = newHead;
		do {
			System.out.println(newHead.getData());
			newHead = newHead.getNextNode();
		}
		while(newHead != head);
	}
}
