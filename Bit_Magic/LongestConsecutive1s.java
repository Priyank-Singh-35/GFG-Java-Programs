/*
Given a number N. Find the length of the longest consecutive 1s in its binary representation.

Example 1:
Input: N = 14
Output: 3
Explanation: 
Binary representation of 14 is 
1110, in which 111 is the longest 
consecutive set bits of length is 3.

Example 2:
Input: N = 222
Output: 4
Explanation: 
Binary representation of 222 is 
11011110, in which 1111 is the 
longest consecutive set bits of length 4. 

Your Task: 
You don't need to read input or print anything. Your task is to complete the function maxConsecutiveOnes() which returns the length of the longest consecutive 1s in the binary representation of given N.

Expected Time Complexity: O(log N).
Expected Auxiliary Space: O(1).

Constraints:
1 <= N <= 106
*/

// Solution-
class Solution {
    /* Function to calculate the longest consecutive ones in the binary representation of N
       N: given input to calculate the longest consecutive ones
    */
    public static int maxConsecutiveOnes(int N) {
        int count = 0;      // To keep track of the current sequence length of consecutive ones
        int maxCount = 0;   // To store the maximum length of consecutive ones found so far
        
        // Process each bit of N until all bits are checked
        while (N > 0) {
            // Check if the least significant bit of N is 1
            if ((N & 1) == 1) {
                // Increment count since we have a consecutive 1
                count++;
                
                // Update maxCount if the current count is greater
                maxCount = Math.max(maxCount, count);
            } else {
                // Reset count to 0 since the sequence of 1s has been interrupted
                count = 0;
            }
            
            // Right shift N to process the next bit
            N = N >> 1;
        }
        
        // Return the maximum length of consecutive 1s found
        return maxCount;
    }
}
