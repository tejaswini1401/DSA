package com.problems;

import java.util.*;

public class StringPermutations {
	
	public static List<String> getPermutationsRecursive(String str){
		List<String> permutations = new ArrayList<>();
		if(str == null || str.length() == 0) {
			permutations.add("");
			return permutations;
		}
		
		char firstChar = str.charAt(0);
		String remainingStr = str.substring(1);
		List<String> words = getPermutationsRecursive(remainingStr);
		
		for(String word: words) {
			for(int i=0;i<=word.length();i++) {
				String permutation = word.substring(0,i)+firstChar+word.substring(i);
				permutations.add(permutation);
			}
		}
		return permutations;
	}
	
	public static List<String> getPermutationsIterative(String str) {
        List<String> permutations = new ArrayList<>();
        if (str == null || str.length() == 0) {
            permutations.add("");
            return permutations;
        }

        permutations.add(String.valueOf(str.charAt(0)));

        for (int i = 1; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            List<String> newPermutations = new ArrayList<>();

            for (String permutation : permutations) {
                for (int j = 0; j <= permutation.length(); j++) {
                    String newPermutation = permutation.substring(0, j) + currentChar + permutation.substring(j);
                    newPermutations.add(newPermutation);
                }
            }
            permutations = newPermutations;
        }
        return permutations;
    }
	
	public static void main(String[] args) {
		String input = "abc";
		List<String> recursivePermutations = StringPermutations.getPermutationsRecursive(input);
		List<String> iterativePermutations = StringPermutations.getPermutationsIterative(input);
		
		Collections.sort(recursivePermutations);
		Collections.sort(iterativePermutations);
		
		boolean equals = recursivePermutations.equals(iterativePermutations);
		
		System.out.println("Permutations using Recursion: " + recursivePermutations);
        System.out.println("Permutations using Iteration: " + iterativePermutations);
        System.out.println("Equal or not ?" + equals);
	}
}
