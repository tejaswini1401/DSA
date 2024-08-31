package com.problems;

public class InsertionSortString {
    
    public static void insertionSort(String[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            String key = arr[i];
            int j = i - 1;
            
            while (j >= 0 && arr[j].compareTo(key) > 0) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
       
        String[] words = new String[] {"Teja", "Shreya", "Momoo", "Samii"};
        
        insertionSort(words);
        
        System.out.println("Sorted list of words:");
        for (String word : words) {
            System.out.println(word);
        }
    }
}
