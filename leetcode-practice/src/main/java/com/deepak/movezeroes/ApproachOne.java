package com.deepak.movezeroes;

import java.util.Arrays;

/**
 * Move all the zeroes in the array to the end.
 * Also, maintain the order of non-zero elements
 */
public class ApproachOne {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        // Input
        System.out.println("Input = " + Arrays.toString(nums));
        moveZeroes(nums);
        System.out.println("Output = " + Arrays.toString(nums));
    }
    
    private static void moveZeroes(int[] nums) {
        int count = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[count++] = nums[i];
            }
        }
        
        while (count < nums.length) {
            nums[count++] = 0;
        }
    }
}
