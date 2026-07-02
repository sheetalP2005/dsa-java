package slidingwindow;

/*
====================================================
Problem: LeetCode #424 - Longest Repeating Character Replacement

Difficulty:
Medium

Pattern:
Variable Sliding Window + Frequency Count

Time Complexity:
O(n)

Space Complexity:
O(1)

Key Idea:
Maintain the frequency of every character inside
the current window.

Window is VALID when

(window size - max frequency) <= k

Otherwise,
shrink the window.

Formula:

Replacements Needed =
Window Size - Maximum Frequency

====================================================
*/

public class LongestRepeatingCharacterReplacement {

    public int characterReplacement(String s, int k) {

        int[] frequency = new int[26];

        int left = 0;
        int maxFrequency = 0;
        int longest = 0;

        for (int right = 0; right < s.length(); right++) {

            char current = s.charAt(right);

            frequency[current - 'A']++;

            maxFrequency = Math.max(
                    maxFrequency,
                    frequency[current - 'A']
            );

            while ((right - left + 1) - maxFrequency > k) {

                frequency[s.charAt(left) - 'A']--;

                left++;
            }

            longest = Math.max(
                    longest,
                    right - left + 1
            );
        }

        return longest;
    }

    public static void main(String[] args) {

        LongestRepeatingCharacterReplacement solution =
                new LongestRepeatingCharacterReplacement();

        String s = "AABABBA";

        int k = 1;

        System.out.println(
                solution.characterReplacement(s, k)
        );
    }
}