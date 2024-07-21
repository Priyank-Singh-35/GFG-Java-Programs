/*
Given a non-negative integer n. The task is to check if it is a power of 2. 

Examples

Input: n = 8
Output: true
Explanation: 8 is equal to 2 raised to 3 (23 = 8).
Input: n = 98
Output: false
Explanation: 98 cannot be obtained by any power of 2.
Input: n = 1
Output: true
Explanation: (20 = 1).
Expected Time Complexity: O(log n).
Expected Auxiliary Space: O(1).

Constraints:
0 ≤ n < 1020
*/

// Solution-
class Solution {
    // Function to check if a number is a power of two
    public static boolean isPowerofTwo(long n) {
        // A number is a power of two if it is positive and has exactly one bit set
        // (n & (n - 1)) will be zero if there is only one bit set in n
        return (n > 0) && ((n & (n - 1)) == 0);
    }
}
