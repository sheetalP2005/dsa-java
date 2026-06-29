package twopointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
====================================================
Problem: LeetCode #15 - 3Sum

Difficulty:
Medium

Pattern:
Sorting + Two Pointers

Time Complexity:
O(n²)

Space Complexity:
O(1) auxiliary space
(O(n) including the output list)

Key Idea:
1. Sort the array.
2. Fix one element.
3. Use two pointers to find the remaining two elements.
4. Skip duplicates to avoid repeated triplets.

====================================================
*/

public class ThreeSum {

    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();

        // Step 1: Sort the array
        Arrays.sort(nums);

        // Step 2: Fix one element
        for (int i = 0; i < nums.length - 2; i++) {

            // Skip duplicate fixed elements
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {

                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {

                    result.add(Arrays.asList(
                            nums[i],
                            nums[left],
                            nums[right]
                    ));

                    // Skip duplicate left values
                    while (left < right &&
                            nums[left] == nums[left + 1]) {
                        left++;
                    }

                    // Skip duplicate right values
                    while (left < right &&
                            nums[right] == nums[right - 1]) {
                        right--;
                    }

                    left++;
                    right--;

                }
                else if (sum < 0) {

                    left++;

                }
                else {

                    right--;

                }
            }
        }

        return result;
    }

    public static void main(String[] args) {

        ThreeSum solution = new ThreeSum();

        int[] nums = {-1, 0, 1, 2, -1, -4};

        System.out.println(solution.threeSum(nums));

    }
}