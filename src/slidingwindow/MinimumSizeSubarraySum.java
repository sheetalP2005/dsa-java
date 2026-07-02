package slidingwindow;

/*
====================================================
Problem: LeetCode #209 - Minimum Size Subarray Sum

Difficulty:
Medium

Pattern:
Variable Sliding Window

Time Complexity:
O(n)

Space Complexity:
O(1)

Key Idea:
The window size is NOT fixed.

1. Expand the window by moving the right pointer.
2. Keep adding elements to the window sum.
3. Once the sum becomes greater than or equal to the target,
   try shrinking the window from the left.
4. Keep updating the minimum length.

Golden Rule:

Condition NOT satisfied
→ Expand (right++)

Condition satisfied
→ Update answer
→ Shrink (left++)

====================================================
*/

public class MinimumSizeSubarraySum {

    public int minSubArrayLen(int target, int[] nums) {

        int left = 0;
        int windowSum = 0;
        int minLength = Integer.MAX_VALUE;

        // Expand the window
        for (int right = 0; right < nums.length; right++) {

            windowSum += nums[right];

            // Shrink the window while condition is satisfied
            while (windowSum >= target) {

                minLength = Math.min(minLength, right - left + 1);

                windowSum -= nums[left];

                left++;
            }
        }

        if (minLength == Integer.MAX_VALUE) {
            return 0;
        }

        return minLength;
    }

    public static void main(String[] args) {

        MinimumSizeSubarraySum solution =
                new MinimumSizeSubarraySum();

        int[] nums = {2,3,1,2,4,3};

        int target = 7;

        System.out.println(solution.minSubArrayLen(target, nums));
    }
}