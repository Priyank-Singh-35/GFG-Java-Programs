/*
Given two numbers M and N. The task is to find the position of the rightmost different bit in the binary representation of numbers. If both M and N are the same then return -1 in this case.

Example 1: 

Input: 
M = 11, N = 9
Output: 
2
Explanation: 
Binary representation of the given numbers are: 1011 and 1001, 2nd bit from right is different.
Example 2:

Input: 
M = 52, N = 4
Output: 
5
Explanation: 
Binary representation of the given numbers are: 110100 and 0100, 5th-bit from right is different.
User Task:
The task is to complete the function posOfRightMostDiffBit() which takes two arguments M and N and returns the position of first different bits in M and N from right. If both m and n are the same then return -1 in this case.

Expected Time Complexity: O(max(log M, log N)).
Expected Auxiliary Space: O(1).

Constraints:
0 <= M, N <= 109
*/

// Solution-
class Solution {
    // Function to find the position of the rightmost bit that is different between two numbers
    public static int posOfRightMostDiffBit(int m, int n) {
        // Find the XOR of the two numbers. The XOR operation highlights the bits that are different.
        int diff = m ^ n;
        
        // If the XOR result is 0, there are no differing bits (i.e., m and n are identical).
        // In this case, return -1 indicating no differing bit position.
        if (diff == 0) {
            return -1;
        }
        
        // Initialize the position counter. This will keep track of the bit position we are checking.
        int position = 1;
        
        // While the least significant bit of diff is 0, shift diff right by 1 and increment position.
        // This loop continues until we find the first differing bit.
        while ((diff & 1) == 0) {
            diff = diff >> 1; // Right shift diff to check the next bit
            position++;       // Increment the position counter
        }
        
        // Return the position of the rightmost differing bit.
        return position;
    }
}
