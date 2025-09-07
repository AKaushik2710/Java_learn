package linkedList;

public class List2 {
	public static LinkedNode DoubleLinkedList(int arr[]) {
		LinkedNode head = new LinkedNode(arr[0], null, null);
		LinkedNode temp = head;
		for(int i=1; i<arr.length; i++) {
			head.next = new LinkedNode(arr[i], null, null);
			head = head.next;
		}
		return temp;
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
		LinkedNode mu = DoubleLinkedList(arr);
		if(mu == null) System.out.println("Array provided is not valid.");
		else {
			for(int i=0; i<5;i++) {
				System.out.println(mu.value);
				mu = mu.next;
				if(mu == null) {
					System.out.println("These were the elements of linked list.");
					break;
				}
			}
		}
	}
}
