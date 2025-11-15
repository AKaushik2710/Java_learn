package labPracticeQuestions;

import java.util.Scanner;

public class Ques4 {
	static boolean delete(LinkList head, int val) {
		LinkList prev = head;
		LinkList curr = head;
		boolean present = false;
		if(head.data==val) {
			head.data = head.next.data;
			head.next=head.next.next;
			return true;
		}
		while(curr!=null) {
			if(curr.data==val) {
				prev.next = curr.next;
				curr.next = null;
				present = true;
			}
			prev = curr;
			curr=curr.next;
		
		}
		return present;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		sc.nextLine();
		String str = sc.nextLine();
		String[] starr = str.split(" ");
		int[] arr = new int[length];
		for(int i=0; i<length; i++) {
			arr[i] = Integer.parseInt(starr[i]);
		}
		
		int delVal = sc.nextInt();
		LinkList head = new LinkList(-1);
		LinkList temp = head;
		for(int i : arr) {
			temp.next = new LinkList(i);
			temp = temp.next;
		}
		if(delete(head.next, delVal)) {
			head = head.next;
			while(head!=null) {
				System.out.println(head.data);
				head = head.next;
			}
		}
		else {
			System.out.println("Not Found");
		}
	}
}
