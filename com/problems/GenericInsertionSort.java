package com.problems;

public class GenericInsertionSort<T extends Comparable<T>> {

    public void insertionSort(T[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            T key = arr[i];
            int j = i - 1;
            
            while (j >= 0 && arr[j].compareTo(key) > 0) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        GenericInsertionSort<Integer> sorter = new GenericInsertionSort<>();
        
        Integer[] intArray = {64, 34, 25, 12, 22, 11, 90};
        sorter.insertionSort(intArray);
        System.out.println("Sorted integers: ");
        for (Integer num : intArray) {
            System.out.print(num + " ");
        }
        System.out.println();

        GenericInsertionSort<String> stringSorter = new GenericInsertionSort<>();
        String[] strArray = {"banana", "apple", "pear", "kiwi", "orange"};
        stringSorter.insertionSort(strArray);
        System.out.println("Sorted strings: ");
        for (String str : strArray) {
            System.out.print(str + " ");
        }
    }
}
