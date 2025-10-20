package linkedList;

public class CircularOrNot {
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
	
	static boolean circular(SingleListNode head) {
		SingleListNode temp = head;
		
		while(true) {
			if(temp.getNextNode()==null) {
				break;
			}
			
			if(temp.getNextNode()==head) {
				return true;
			}
			
			temp = temp.getNextNode();
		}
		
		return false;
	}
	
	static int counter(SingleListNode head) {
		int count=1;
		SingleListNode temp = head;
		while(temp.getNextNode()!=head) {
			temp = temp.getNextNode();
			count++;
		}
		
		return count;
	}
	public static void main(String[] args) {
		SingleListNode head = listMaker();
		System.out.println(circular(head));
		System.out.println(counter(head));
	}
}
