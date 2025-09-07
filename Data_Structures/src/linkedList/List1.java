package linkedList;

public class List1 {
	public static LinkedNode CyclicLinkedList(int[] arr) {
		if(arr.length ==0 || arr == null) return null;
		LinkedNode l = new LinkedNode(arr[0], null, null);
		LinkedNode temp = l;
		for(int i=1; i<arr.length; i++) {
			l.next = new LinkedNode(arr[i],null, null);
			l = l.next;
			l.prev = temp;
		}
		if(l.next == null && temp.prev == null) {
			l.next = temp;
			temp.prev = l;
		}
		return temp;
	}
	public static void main(String[] args) {
		int[] arr = {1,2,3};
		LinkedNode mu = CyclicLinkedList(arr);
		if(mu == null) System.out.println("Array provided is not valid.");
		else {
			for(int i=0; i<9;i++) {
				System.out.println(mu.value);
				mu = mu.next;
			}
		}
	}
}
