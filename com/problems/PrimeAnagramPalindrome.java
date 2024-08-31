package com.problems;

public class PrimeAnagramPalindrome {

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        if (num == 2) {
            return true;
        }
        if (num % 2 == 0) {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static boolean isAnagram(String str1, String str2) {
        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();
        java.util.Arrays.sort(chars1);
        java.util.Arrays.sort(chars2);
        return java.util.Arrays.equals(chars1, chars2);
    }

    public static void main(String[] args) {
        System.out.println("Prime numbers that are anagrams and palindromes between 0 and 1000:");

        for (int i = 0; i <= 1000; i++) {
            if (isPrime(i)) {
                String str = Integer.toString(i);

                if (isPalindrome(str)) {
                    // Check for anagrams with other prime numbers
                    boolean hasAnagram = false;
                    for (int j = 0; j <= 1000; j++) {
                        if (i != j && isPrime(j) && isAnagram(str, Integer.toString(j))) {
                            hasAnagram = true;
                            break;
                        }
                    }

                    if (hasAnagram) {
                        System.out.println("Prime number: " + i );
                    }
                }
            }
        }
    }
}
