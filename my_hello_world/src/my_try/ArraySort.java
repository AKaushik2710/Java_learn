package my_try;

import java.util.Arrays;

public class ArraySort {
	static void bubbleSort(int arr[]) {
		int n = arr.length;
		int temp;
		boolean swap = false;
		for(int i=0; i<n-1; i++) {
			for(int j=0; j<n-i-1; j++) {
				if(arr[j]>arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					swap = true;
				}
			}
			if(!swap) break;
		}
	}
	static void selectionSort(int[] arr) {
		
		int temp;
		for(int i=0; i<arr.length-1; i++) {
			int min_idx=i;
			for(int j=i+1; j<arr.length; j++) {
			if(arr[j]<arr[min_idx]) {
				min_idx = j;
			}
			}
			temp = arr[i];
			arr[i] = arr[min_idx];
			arr[min_idx] = temp;
		}
	}
	
	static void insertionSort(int[] arr) {
		int n = arr.length;
		
		for(int i=1; i<n; i++) {
			int key=arr[i];
			int j = i-1;
			while(j >= 0 && key<arr[j]) {
				arr[j+1] = arr[j];
				j=j-1;
			}
			arr[j+1] = key;
		}
	}
	
	static void mergeSort(int[] arr, int l, int r, int m) {
		int n1 = m-l+1;
		int n2 = r-m;
		
		int[] arr1 = new int[n1];
		int[] arr2 = new int[n2];
		
		for(int i=0; i< n1; i++) {
			arr1[i] = arr[l+i];
		}
		for(int i=0;i<n2; i++) {
			arr2[i] = arr[i+m+1];
		}
		
		int i=0, j=0, k=l;
		
		while(i<n1 && j<n2) {
			if(arr1[i] <= arr2[j]) {
				arr[k] = arr1[i];
				i++;
			}
			else {
				arr[k] = arr2[j];
				j++;
			}
			k++;
		}
		
		while(i<n1) {
			arr[k] = arr1[i];
			i++;
			k++;
		}
		
		while(j<n2) {
			arr[k] = arr2[j];
			j++;
			k++;
		}
	}
	
	static void merge(int[] arr, int l, int r) {
		if(l<r) {
			int m = l+(r-l)/2;
			merge(arr, l, m);
			merge(arr, m+1, r);
			mergeSort(arr, l, r, m);
		}
	}
	public static void main(String[] args) {
		int[] arr = {23,12,5,45,34};
//		bubbleSort(arr);
//		selectionSort(arr);
//		insertionSort(arr);
		merge(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
}
