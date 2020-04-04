package com.deepak.happynumbers;

/**
 * Write an algorithm to determine if a number is "happy".
 * Input: 19
 * Output: true
 * Explanation:
 * 12 + 92 = 82
 * 82 + 22 = 68
 * 62 + 82 = 100
 * 12 + 02 + 02 = 1
 */
public class FindHappyNumber {
    public static void main(String[] args) {
        boolean result = findHappyNumber(29);
        System.out.println(result);
    }
    
    private static boolean findHappyNumber(int number) {
        int slow = number;
        int fast = number;
        do {
            slow = findSumOfSquare(slow);
            fast = findSumOfSquare(findSumOfSquare(fast));
        } while (slow != fast);
        if (slow == 1) {
            return true;
        }
        return false;
    }
    
    private static int findSumOfSquare(int number) {
        int sum = 0;
        while (number != 0) {
            sum = sum + (number % 10) * (number % 10);
            number = number / 10;
        }
        return sum;
    }
}
