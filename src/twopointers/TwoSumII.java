package arrays.twopointers;
/*
====================================================
Problem: LeetCode #167 - Two Sum II

Difficulty:
Easy

Pattern:
Opposite Direction Two Pointers

Time Complexity:
O(n)

Space Complexity:
O(1)

Key Idea:
The array is sorted.
If the current sum is smaller than the target,
move the left pointer to increase the sum.
If the current sum is larger than the target,
move the right pointer to decrease the sum.

====================================================
*/


public class TwoSumII {
    public int[]  twoSum(int[] numbers,int target){
        int left=0;
        int right=numbers.length-1;

        while(left<right){
            int sum=numbers[left]+numbers[right];

            if(sum==target){
                return new int[]{left+1,right+1};

                if(sum<target){
                    left++;
                }else{
                    right--;
                }
            }
            return new int[];
        }
    
    }
}
