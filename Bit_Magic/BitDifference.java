/*
You are given two numbers A and B. The task is to count the number of bits needed to be flipped to convert A to B.

Example 1:

Input: A = 10, B = 20
Output: 4
Explanation:
A  = 01010
B  = 10100
As we can see, the bits of A that need 
to be flipped are 01010. If we flip 
these bits, we get 10100, which is B.
Example 2:

Input: A = 20, B = 25
Output: 3
Explanation:
A  = 10100
B  = 11001
As we can see, the bits of A that need 
to be flipped are 10100. If we flip 
these bits, we get 11001, which is B.

Your Task: The task is to complete the function countBitsFlip() that takes A and B as parameters and returns the count of the number of bits to be flipped to convert A to B.

Expected Time Complexity: O(log N).
Expected Auxiliary Space: O(1).

Constraints:
1 ≤ A, B ≤ 106
*/

// Solution-
class Solution {
    
    // Function to find the number of bits needed to be flipped to convert A to B
    public static int countBitsFlip(int a, int b) {
        // Find the XOR of the two numbers. The XOR operation highlights the bits that differ between A and B.
        int diff = a ^ b;
        
        // Initialize a counter to keep track of the number of differing bits
        int count = 0;
        
        // Count the number of set bits in the XOR result
        // Each set bit (1) represents a bit that needs to be flipped to convert A to B
        while (diff != 0) {
            // Increment count if the least significant bit of diff is 1
            count += diff & 1;
            
            // Right shift diff to process the next bit
            diff = diff >> 1;
        }
        
        // Return the total number of bits that need to be flipped
        return count;
    }
}
