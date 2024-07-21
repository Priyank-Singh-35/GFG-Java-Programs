/*
You are given a number n. You need to find the count of digits in n.

Example 1:
Input:
n = 1
Output: 1
Explanation: Number of digit in 1 is 1.

Example 2:
Input:
n  = 99999
Output: 5
Explanation:Number of digit in 99999 is 5
Your Task:
You don't need to read input or print anything. Your task is to complete the function countDigits() that takes n as parameter and returns the count of digits in n.

Expected Time Complexity: O(Logn).
Expected Auxiliary Space: O(Logn).

Constraints:
1 <= n <= 107
*/

// Solution-
class Solution {
    // Function to count the number of digits in a given number n
    public static int countDigits(int n) {
        // Special case: If n is 0, return 1 (as 0 has exactly 1 digit)
        if (n == 0) {
            return 1;
        }
        // Calculate the number of digits using logarithm base 10
        // Math.log10(n) gives the logarithm of n to the base 10
        // Adding 1 to this value gives the count of digits in n
        return (int) Math.log10(n) + 1;
    }
}
