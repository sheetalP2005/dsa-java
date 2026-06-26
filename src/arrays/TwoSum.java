package arrays;

/*
====================================================
Problem: LeetCode #1 - Two Sum

Difficulty:
Easy

Pattern:
HashMap

Time Complexity:
O(n)

Space Complexity:
O(n)

Key Idea:
Store previously seen numbers and their indices in a HashMap.
For every element, calculate the complement (target - current).
If the complement already exists, return the indices.
Otherwise, store the current number and continue.

====================================================
*/

import java.util.HashMap;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }

            map.put(nums[i], i);
        }

        return new int[]{};
    }
}