package com.problems;

public class GenericBinarySearch<T extends Comparable<T>> {

    public int binarySearch(T[] arr, T key) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int result = key.compareTo(arr[mid]);

            if (result == 0) {
                return mid; 
            }

            if (result > 0) {
                low = mid + 1; 
            } else {
                high = mid - 1; 
            }
        }

        return -1; 
    }

    public static void main(String[] args) {
        GenericBinarySearch<String> searcher = new GenericBinarySearch<>();
    	
        String[] words = {"apple", "banana", "kiwi", "orange", "pear"};
        
        String searchWord = "orange";
        int result = searcher.binarySearch(words, searchWord);

        if (result != -1) {
            System.out.println("Word '" + searchWord + "' found at index " + result);
        } else {
            System.out.println("Word '" + searchWord + "' not found");
        }
    }
}
