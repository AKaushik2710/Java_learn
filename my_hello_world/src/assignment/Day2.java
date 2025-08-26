package assignment;
import java.util.Scanner;
import java.util.Arrays;
public class Day2 {
	public static int[] sort(int[] arr) {
		int temp;
		boolean swap = false;
		for(int i=0; i<arr.length-1; i++) {
			for(int j=0; j<arr.length-i-1; j++) {
				if(arr[j] > arr[j+1]) {
					temp =arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					swap=true;
				}
			}
			if(swap == false) {
				break;
			}
		}
		return arr;
	}
	public static void duplicateRemover(int arr[]) {
		int[] temp = new int[arr.length];
		int uniqueElements=0;
		for(int i=0; i<arr.length; i++) {
			boolean isDuplicate = false;
			for(int j=0; j<uniqueElements; j++) {
				if(arr[i] == temp[j]) {
					isDuplicate = true;
					break;
				}
			}
			if(!isDuplicate) {
				temp[uniqueElements]=arr[i];
				uniqueElements++;
			}
		}
		int[] res = Arrays.copyOf(temp, uniqueElements);
		System.out.print("The final Array value is"+ Arrays.toString(sort(res)));
	}
	public static int[] arrayMethod(int[] arr) {
		int arr1[] = new int[10];
		int max = arr[0];
		int min = arr[0];
		for(int digit : arr) {
			System.out.println(digit);
		}
		for(int i=0; i<arr.length; i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
			
			if(min > arr[i]) {
				min = arr[i];
			}
		}
		
		int res[] = {max, min}; 
		duplicateRemover(arr);
		return res;
	}
	
	public static void main(String args[]) {
		int arr[] = {1,2,3,4,5,6,7,8,9,10}; 
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the length for your Array:- ");
		int length = sc.nextInt();
		
		System.out.print("Enter " +length+ " array elements in this manner i.e. 1 2 3 4 5");
		int[] input = new int[length];
		
		for(int i=0; i<length; i++) {
			input[i] = sc.nextInt();
		}
		System.out.print(Arrays.toString(arrayMethod(input)));
	}
}
