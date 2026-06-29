package twopointers;

/*
====================================================
Problem: LeetCode #125 - Valid Palindrome

Difficulty:
Easy

Pattern:
Opposite Direction Two Pointers

Time Complexity:
O(n)

Space Complexity:
O(1)

Key Idea:
Use two pointers from both ends.
Skip non-alphanumeric characters.
Convert letters to lowercase before comparison.
If any valid characters differ, return false.

====================================================
*/

public class ValidPalindrome {

    public boolean isPalindrome(String s) {

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {

            while (left < right &&
                    !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }

            while (left < right &&
                    !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            if (Character.toLowerCase(s.charAt(left)) !=
                    Character.toLowerCase(s.charAt(right))) {

                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}