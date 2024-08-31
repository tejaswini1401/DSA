package com.problems;

import java.util.Arrays;

public class MergeSortStrings {

    // Method to perform merge sort
    public static void mergeSort(String[] array) {
        if (array.length < 2) {
            return; // Base case: single element is already sorted
        }
        
        int mid = array.length / 2;
        String[] left = Arrays.copyOfRange(array, 0, mid);
        String[] right = Arrays.copyOfRange(array, mid, array.length);

        // Recursively sort both halves
        mergeSort(left);
        mergeSort(right);

        // Merge the sorted halves
        merge(array, left, right);
    }

    private static void merge(String[] result, String[] left, String[] right) {
        int leftIndex = 0, rightIndex = 0, resultIndex = 0;

        while (leftIndex < left.length && rightIndex < right.length) {
            if (left[leftIndex].compareTo(right[rightIndex]) <= 0) {
                result[resultIndex++] = left[leftIndex++];
            } else {
                result[resultIndex++] = right[rightIndex++];
            }
        }

        while (leftIndex < left.length) {
            result[resultIndex++] = left[leftIndex++];
        }

        while (rightIndex < right.length) {
            result[resultIndex++] = right[rightIndex++];
        }
    }

    public static void main(String[] args) {
        String[] words = {"banana", "apple", "orange", "mango", "pear"};

        System.out.println("Original array: " + Arrays.toString(words));

        mergeSort(words);

        System.out.println("Sorted array: " + Arrays.toString(words));
    }
}
