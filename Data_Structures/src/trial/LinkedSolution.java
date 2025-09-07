package trial;

class ListNode{
	int val;
	ListNode next;
	ListNode(int val, ListNode l){
		this.val = val;
		this.next  = l;
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
 */
class LinkedSolution {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int num1 =0;
        int num2=0;
        // ListNode temp = l1.next;
        while(l1.next!=null){
            num1 = num1*10 + l1.val;
            l1 = l1.next;
        }
        num1=num1*10+l1.val;

        while(l2.next!=null){
            num2 = num2*10 + l2.val;
            System.out.println(num2+ " "+l2.val );
            l2 = l2.next;
        }
        num2 = num2*10 + l2.val;
        int num3 = num2+num1;
        System.out.println(num3+" "+ num1 +" "+num2);
        ListNode l3=new ListNode(num3%10, null);
        ListNode temp = l3;
        do{
        	System.out.println("I ran");
            num3 = num3/10;
            temp.next = new ListNode(num3%10, null);
            temp = temp.next;
        }while(num3!=0);
        
        return l3;
    }
    
    public static void main(String[] args) {
    	ListNode l1 = new ListNode(2,null);
    	l1.next = new ListNode(4, null);
    	l1.next.next = new ListNode(3, null);
    	ListNode l2 = new ListNode(5, null);
    	l2.next = new ListNode(6, null);
    	l2.next.next = new ListNode(4, null);
		System.out.println(addTwoNumbers(l1, l2).val+" "+addTwoNumbers(l1, l2).next.val + " "+ addTwoNumbers(l1, l2).next.next.val);
	}
}
