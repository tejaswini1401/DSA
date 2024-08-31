package com.problems;

public class BuubleSort {
	
	public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

	public static void main(String[] args) {
		
		int[] arr = new int[] {13,21,3,23,12};
		
		bubbleSort(arr);
        
        System.out.println("Sorted list of integers:");
        for (int i : arr) {
            System.out.print(i + " ");
        }

	}

}
