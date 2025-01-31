/*
Given a number and its reverse. Find that number raised to the power of its own reverse.
Note: As answers can be very large, print the result modulo 109 + 7.

Example 1:
Input:
N = 2, R = 2
Output: 4
Explanation: The reverse of 2 is 2 and after raising power of 2 by 2 we get 4 which gives remainder as 4 when divided by 1000000007.

Example 2:
Input:
N = 12, R = 21
Output: 864354781
Explanation: The reverse of 12 is 21and 1221 when divided by 1000000007 gives remainder as 864354781.
  
Your Task:
You don't need to read input or print anything. You just need to complete the function pow() that takes two parameters N and R denoting the input number and its reverse and returns power of (N to R)mod(109 + 7).

Expected Time Complexity: O(LogN).
Expected Auxiliary Space: O(LogN).

Constraints:
1 <= N <= 109
*/

// Solution-
class Solution {
    // Function to calculate (N^R) % M where M = 1000000007
    static long power(int N, int R) {
        // Modulo value
        long M = 1000000007;
        // Initialize result to 1 (since any number to the power of 0 is 1)
        long result = 1;
        // Initialize base to N % M to handle large values of N
        long base = N % M;
        
        // Loop until R becomes 0
        while (R > 0) {
            // If R is odd, multiply the current base with the result
            if (R % 2 == 1) {
                result = (result * base) % M;
            }
            // Square the base and take modulo M
            base = (base * base) % M;
            // Divide R by 2 (integer division)
            R /= 2;
        }
        
        // Return the result of (N^R) % M
        return result;
    }
}
