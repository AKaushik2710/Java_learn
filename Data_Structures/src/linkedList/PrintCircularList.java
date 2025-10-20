package linkedList;

public class PrintCircularList {
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
	
	static void printer(SingleListNode head) {
		SingleListNode temp = head;
		do {
			System.out.println(temp.getData());
			temp = temp.getNextNode();
		}
		while(temp!=head);
	}
	
	public static void main(String[] args) {
		SingleListNode head = listMaker();
		
		printer(head);
	}
}
