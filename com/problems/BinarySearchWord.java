package com.problems;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchWord {
	
	private static int binarySearch(String[] words, String searchWord) {
        int low = 0;
        int high = words.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int result = searchWord.compareTo(words[mid]);

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
		
		String str = "Tejaswini Shelake";
		String[] words = str.split(" ");
		
		if(words == null || words.length == 0) {
			System.out.println("Empty word list");
			return;
		}
		
		Arrays.sort(words);
				
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter word to search: ");
		String searchStr = sc.nextLine();
		
		int index = BinarySearchWord.binarySearch(words, searchStr);
		
		if(index >= 0) {
			System.out.println("Word \"" + searchStr + "\" found at index: " + index);
		} else {
			System.out.println("Word \"" + searchStr + "\" is not found.");
		}

		sc.close();
	}
}
