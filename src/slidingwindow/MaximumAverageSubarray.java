package slidingwindow;

/*
====================================================
Problem: LeetCode #643 - Maximum Average Subarray I

Difficulty:
Easy

Pattern:
Fixed Sliding Window

Time Complexity:
O(n)

Space Complexity:
O(1)

Key Idea:
The window size is fixed (k).

1. Calculate the sum of the first window.
2. Slide the window one position at a time.
3. Remove the outgoing element.
4. Add the incoming element.
5. Update the maximum sum.

Formula:

New Window Sum =
Previous Window Sum
- Outgoing Element
+ Incoming Element

====================================================
*/

public class MaximumAverageSubarray {

    public double findMaxAverage(int[] nums, int k) {

        int windowSum = 0;

        // Calculate first window
        for (int i = 0; i < k; i++) {
            windowSum += nums[i];
        }

        int maxSum = windowSum;

        // Slide the window
        for (int i = k; i < nums.length; i++) {

            // Remove outgoing element
            windowSum -= nums[i - k];

            // Add incoming element
            windowSum += nums[i];

            // Update maximum sum
            maxSum = Math.max(maxSum, windowSum);
        }

        return (double) maxSum / k;
    }

    public static void main(String[] args) {

        MaximumAverageSubarray solution =
                new MaximumAverageSubarray();

        int[] nums = {1,12,-5,-6,50,3};

        int k = 4;

        System.out.println(solution.findMaxAverage(nums, k));
    }
}