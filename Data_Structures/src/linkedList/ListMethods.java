package linkedList;
import java.util.LinkedList;
import java.util.Collections;
public class ListMethods {
	public static void main(String[] args) {
		LinkedNode head = new LinkedNode(1, null, null);
		LinkedNode m = new LinkedNode(2,null, null);
//		head.addFirst(m);
		LinkedList list  = new LinkedList();
		list.add(2);
//		list.add("A");
		list.addFirst(head.value);
		list.addLast(m.value);
		list.addFirst(34);
//		list.removeLast();
		
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list);
		System.out.println(list.size());
	}
}
