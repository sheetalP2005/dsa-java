package arrays;

/*
====================================================
Problem: LeetCode #217 - Contains Duplicate

Difficulty:
Easy

Pattern:
HashSet

Time Complexity:
O(n)

Space Complexity:
O(n)

Key Idea:
Traverse the array while storing elements in a HashSet.
If the current element already exists in the set,
a duplicate is found and return true.
Otherwise, add the element and continue.

====================================================
*/

import java.util.HashSet;

public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {

            if (set.contains(num)) {
                return true;
            }

            set.add(num);
        }

        return false;
    }
}