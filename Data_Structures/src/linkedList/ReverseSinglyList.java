package linkedList;

public class ReverseSinglyList {
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
	
	static SingleListNode reverseList(SingleListNode head) {
        SingleListNode temp=head, prev=null, curr=null;
        while(temp!=null){
            curr=temp;
            temp=temp.getNextNode();
            curr.setNextNode(prev);
            prev=curr;
        }
        return prev;
    }
	
	public static void main(String[] args) {
		SingleListNode head = listMaker();
		head = reverseList(head);
		while(head!=null) {
			System.out.println(head.getData());
			head=head.getNextNode();
		}
	}
}
