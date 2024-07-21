/*
You are given a number N. Find the total count of set bits for all numbers from 1 to N(both inclusive).

Example 1:

Input: N = 4
Output: 5
Explanation:
For numbers from 1 to 4.
For 1: 0 0 1 = 1 set bits
For 2: 0 1 0 = 1 set bits
For 3: 0 1 1 = 2 set bits
For 4: 1 0 0 = 1 set bits
Therefore, the total set bits is 5.
Example 2:

Input: N = 17
Output: 35
Explanation: From numbers 1 to 17(both inclusive), 
the total number of set bits is 35.

Your Task: The task is to complete the function countSetBits() that takes n as a parameter and returns the count of all bits.

Expected Time Complexity: O(log N).
Expected Auxiliary Space: O(1).

Constraints:
1 ≤ N ≤ 108
*/

// Solution-
class Solution {
    // Function to count the total number of set bits in all numbers from 0 to n
    public static int countSetBits(int n) {
        int count = 0; // Initialize count of set bits
        int x = 1; // Initialize bit position to 1 (2^0)
        
        // Iterate while x is less than or equal to n
        while (x <= n) {
            // Calculate the number of complete blocks of size 2x in n
            int quotient = n / (x * 2);
            
            // Add the number of set bits contributed by the complete blocks
            count += quotient * x;
            
            // Calculate the remainder after accounting for complete blocks
            int remainder = n % (x * 2);
            
            // Add the set bits in the partial block (if any)
            count += Math.max(0, remainder - x + 1);
            
            // Move to the next bit position (i.e., multiply x by 2)
            x = x << 1;
        }
        
        // Return the total count of set bits
        return count;
    }
}
