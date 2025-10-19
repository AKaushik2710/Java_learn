package linkedList;

public class LengthOfLL {
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
	
	public static void main(String[] args) {
		SingleListNode head = listMaker();
		int count=0;
		while(head!=null) {
			head = head.getNextNode();
			count++;
		}
		System.out.println(count);
	}
}
