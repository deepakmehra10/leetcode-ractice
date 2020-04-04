package com.deepak.maxsubarray;

public class LargestSumSubArray {
    public static void main(String[] args) {
        int[] nums = {};
        int result = findLargestSum(nums);
        System.out.println("Output = " + result);
    }
    
    private static int findLargestSum(int[] nums) {
        int currentMax = nums[0];
        int maxSoFar = nums[0];
        for (int i = 1; i < nums.length; i++) {
            currentMax = Math.max(nums[i], currentMax + nums[i]);
            maxSoFar = Math.max(currentMax, maxSoFar);
        }
        
        return maxSoFar;
    }
}
