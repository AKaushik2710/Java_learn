package labPracticeQuestions;

import java.util.Scanner;

class LinkList{
	int data;
	LinkList next;
	LinkList(int data){
		this.data = data;
		this.next = null;
	}
}
public class Ques3 {
	static void insertNew(LinkList head, int pos, int val) {
		LinkList temp = head;
		while(temp!=null) {
			pos--;
			if(pos==0) {
				LinkList nextTemp = temp.next;
				temp.next = new LinkList(val);
				temp.next.next = nextTemp;
				break;
			}
			temp = temp.next;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		sc.nextLine();
		String str = sc.nextLine();
		int idx = sc.nextInt();
		int newVal = sc.nextInt();
		String[] starr = str.split(" ");
		int[] arr = new int[length];
		for(int i=0; i<length; i++) {
			arr[i] = Integer.parseInt(starr[i]);
		}
		LinkList head = new LinkList(arr[0]);
		LinkList temp = head;
		for(int i=1; i<length; i++) {
			temp =  temp.next;
			temp = new LinkList(arr[i]);
		}
		
		insertNew(head, idx, newVal);
		while(head!=null) {
			System.out.println(head.data);
			head = head.next;
		}
//		System.out.println(head.data + temp.data);
	}
}
