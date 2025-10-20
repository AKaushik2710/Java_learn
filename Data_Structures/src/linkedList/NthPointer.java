package linkedList;

public class NthPointer {
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
	
	static SingleListNode fromStart(SingleListNode head, int val) {
		int count=1;
		
		while(count<val) {
			head = head.getNextNode();
			count++;
		}
		
		return head;
	}
	static SingleListNode fromEnd(SingleListNode head, int val) {
		int count=1;
		SingleListNode temp = head;
		SingleListNode ref = head;
		
		if(count<val) {
			ref = ref.getNextNode();
			count++;
		}
		
		while(ref.getNextNode()!=null) {
			temp = temp.getNextNode();
			ref=ref.getNextNode();
		}
		
		return temp;
	}
	
	public static void main(String[] args) {
		SingleListNode head = listMaker();
		System.out.println(fromStart(head, 7).getData());
		System.out.println(fromEnd(head, 0).getData());
	}
}
