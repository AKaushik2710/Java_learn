package linkedList;

public class RemoveListNodesMentionedInArray {
	static SingleListNode nodeRemover(SingleListNode head, int n) {
		SingleListNode temp = head;
		SingleListNode assign;
		while(temp!=null) {
			if(temp.getNextNode()!=null && temp.getNextNode().getData()==n) {
				assign = temp.getNextNode();
				temp.getNextNode().setNextNode(temp.getNextNode().getNextNode());
				assign.setNextNode(null);
				continue;
			}
			temp = temp.getNextNode();
		}
		
		if(head.getData()==n) return head.getNextNode();
		return head;
	}
	
	public static void main(String[] args) {
		SingleListNode head = new SingleListNode(2);
		head.setNextNode(new SingleListNode(10));
		head.getNextNode().setNextNode(new SingleListNode(9));
		
		int[] arr = {9, 2, 5};
		
		for(int i : arr){
            head = nodeRemover(head, i);
        }
		
		while(head !=null) {
			System.out.println(head.getData());
			head = head.getNextNode();
		}
	}
}

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 
class Solution {
    public ListNode nodeRemover(ListNode head, int n){
        ListNode temp = head;
        ListNode assign;
        while(temp !=null){
            if(temp.next!=null && temp.next.val==n){
                    assign = temp.next;
                    temp.next = temp.next.next;
                    assign.next=null;
                continue;
            }
            temp = temp.next;
        }
        if(head.val==n) return head.next;
        return head;
    }
    public ListNode modifiedList(int[] nums, ListNode head) {
        for(int i : nums){
            head = nodeRemover(head, i);
        }
        return head;
    }
}
*/
