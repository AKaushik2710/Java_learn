package lab_exam;

import java.util.ArrayList;
import java.util.List;

public class FifteenOct {

	    static Node del(Node head) {
	    	Node temp = head;
	    	Node res = head;
	    	Node prev=head;
	    	if(head==null || head.next==null) return head;
	    	
	    	while(temp.next!=null) {
	    		if(temp.val<temp.next.val) {
	    			res=temp.next;
	    			prev.next=null;
	    			temp = temp.next;
	    			prev=res;
//	    			temp=prev;
	    		}
	    		prev=temp;
	    		res=res.next;
	    		temp=temp.next;
	    	}
	    	
	    }
}
