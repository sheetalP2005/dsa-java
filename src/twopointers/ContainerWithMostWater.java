package twopointers;

/*
====================================================
Problem: LeetCode #11 - Container With Most Water

Difficulty:
Medium

Pattern:
Opposite Direction Two Pointers (Greedy)

Time Complexity:
O(n)

Space Complexity:
O(1)

Key Idea:
The area is determined by:
Area = min(leftHeight, rightHeight) × width

The width always decreases as pointers move.
Therefore, the only way to potentially increase the area
is to move the pointer pointing to the shorter line,
hoping to find a taller line.

Why not move the taller line?
Moving the taller line decreases the width while the
shorter line still limits the height, so the area
cannot increase.

====================================================
*/

public class ContainerWithMostWater {

    public int maxArea(int[] height) {

        int left = 0;
        int right = height.length - 1;

        int maxArea = 0;

        while (left < right) {

            // Calculate width
            int width = right - left;

            // Calculate height
            int currentHeight = Math.min(height[left], height[right]);

            // Calculate current area
            int area = width * currentHeight;

            // Update maximum area
            maxArea = Math.max(maxArea, area);

            // Move the shorter line
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }

    // Driver Code
    public static void main(String[] args) {

        ContainerWithMostWater solution = new ContainerWithMostWater();

        int[] height = {1,8,6,2,5,4,8,3,7};

        System.out.println("Maximum Area = " + solution.maxArea(height));
    }
}