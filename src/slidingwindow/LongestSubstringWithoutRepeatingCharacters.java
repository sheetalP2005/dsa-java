package slidingwindow;

import java.util.HashSet;
import java.util.Set;

/*
====================================================
Problem: LeetCode #3 - Longest Substring Without Repeating Characters

Difficulty:
Medium

Pattern:
Variable Sliding Window + HashSet

Time Complexity:
O(n)

Space Complexity:
O(min(n, charset))

Key Idea:
1. Expand the window using the right pointer.
2. If the current character already exists,
   keep shrinking the window from the left.
3. Remove characters until the duplicate disappears.
4. Add the current character.
5. Update the maximum window length.

====================================================
*/

public class LongestSubstringWithoutRepeatingCharacters {

    public int lengthOfLongestSubstring(String s) {

        Set<Character> set = new HashSet<>();

        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {

            char current = s.charAt(right);

            while (set.contains(current)) {

                set.remove(s.charAt(left));

                left++;
            }

            set.add(current);

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {

        LongestSubstringWithoutRepeatingCharacters solution =
                new LongestSubstringWithoutRepeatingCharacters();

        String s = "abcabcbb";

        System.out.println(solution.lengthOfLongestSubstring(s));
    }
}