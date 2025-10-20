package linkedList;

public class RemoveEveryKthElement {
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
	
	static SingleListNode remover(SingleListNode head, int val) {
		int count = 1;
		SingleListNode temp = head;
		SingleListNode curr = head;
		if(head.getNextNode() == null && val==1) return null;
		if(head==null || head.getNextNode()==null) return head;
		
		while(temp.getNextNode()!=null) {
			count++;
			if(count%val==0) {
				curr = temp.getNextNode().getNextNode();
				temp.getNextNode().setNextNode(null);
				temp.setNextNode(curr);
				count=1;
			}
			temp = temp.getNextNode();
		}
		
		return head;
	}
	
	public static void main(String[] args) {
		SingleListNode head = listMaker();
		head = remover(head, 2);
		while(head!=null) {
			System.out.println(head.getData());
			head = head.getNextNode();
		}
	}
}
