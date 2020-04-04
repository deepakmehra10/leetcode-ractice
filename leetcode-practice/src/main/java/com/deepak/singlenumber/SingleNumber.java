package com.deepak.singlenumber;

import java.util.Arrays;

/**
 * Given a non-empty array of integers, every element appears twice except for one. Find that single one.
 */
public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = {4, 1, 2, 1, 2};
        // Input
        System.out.println("Input = " + Arrays.toString(nums));
        int result = findElement(nums);
        System.out.println("Output = " + result);
    }
    
    private static int findElement(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result = result ^ nums[i];
        }
        
        return result;
    }
}
