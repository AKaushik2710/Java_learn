package labPracticeQuestions;
import java.util.*;

class Node {
    int data;
    Node next;
    Node(int data) { this.data = data; }
}
public class ADS_Q_4 {


	    static boolean hasLoop(Node head) {
	        Node slow = head;
	        Node fast = head;

	        while (fast != null && fast.next != null) {
	            slow = slow.next;          // move 1 step
	            fast = fast.next.next;     // move 2 steps

	            if (slow == fast)          // cycle found
	                return true;
	        }
	        return false;                  // no cycle
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        int n = sc.nextInt();
	        int[] arr = new int[n];

	        for (int i = 0; i < n; i++)
	            arr[i] = sc.nextInt();

	        int pos = sc.nextInt();

	        // Create linked list
	        Node head = new Node(arr[0]);
	        Node temp = head;
	        Node loopNode = null;

	        for (int i = 1; i < n; i++) {
	            temp.next = new Node(arr[i]);
	            temp = temp.next;

	            if (i == pos) {
	                loopNode = temp;         // the position where tail should connect
	            }
	        }

	        if (pos != -1)
	            temp.next = loopNode;        // create loop

	        // Check loop
	        if (hasLoop(head))
	            System.out.println("Loop Found");
	        else
	            System.out.println("No Loop");
	    }

}
