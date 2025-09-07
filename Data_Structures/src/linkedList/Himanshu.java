package linkedList;
import java.util.Arrays;

import trial.TrialClass;
public class Himanshu extends TrialClass{
	public static void mergeSort(int arr[], int l, int r, int m) {
		int n1 = m-l+1;
		int n2 = r-m;
		
		int[] L = new int[n1];
		int[] R = new int[n2];
		
		for(int i=0; i<n1; i++) {
			L[i] = arr[l+i];
		}
		
		for(int j=0; j<n2; j++) {
			R[j] = arr[m+1+j];
		}
		
		int i=0, j=0, k=l;
		
		while(i<n1 && j<n2) {
			if(L[i]<= R[j]) {
				arr[k] = L[i];
				i++;
			}
			else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}
		
		while(i<n1) {
			arr[k] = L[i];
			i++;
			k++;
		}
		
		while(j<n2) {
			arr[k] = R[j];
			j++;
			k++;
		}
	}
	
	public static void merge(int arr[], int l, int r) {
		if(l<r) {
			int m = l+(r-l)/2;
			merge(arr, l, m);
			merge(arr, m+1, r);
			mergeSort(arr, l, r, m);
		}
	}
	public static void main(String[] args) {
		TrialClass tp = new TrialClass();
		Himanshu h = new Himanshu();
		System.out.println(tp.giveVar()+" "+h.m);
		int[] arr = {35,23,54,11,9,8,22};
		merge(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
}
