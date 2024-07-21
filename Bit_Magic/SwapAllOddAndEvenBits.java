/*
Given an unsigned integer N. The task is to swap all odd bits with even bits. For example, if the given number is 23 (00010111), it should be converted to 43(00101011). Here, every even position bit is swapped with an adjacent bit on the right side(even position bits are highlighted in the binary representation of 23), and every odd position bit is swapped with an adjacent on the left side.

Example 1:

Input: N = 23
Output: 43
Explanation: 
Binary representation of the given number 
is 00010111 after swapping 
00101011 = 43 in decimal.
Example 2:

Input: N = 2
Output: 1
Explanation: 
Binary representation of the given number 
is 10 after swapping 01 = 1 in decimal.

Your Task: Your task is to complete the function swapBits() which takes an integer and returns an integer with all the odd and even bits swapped.


Expected Time Complexity: O(1).
Expected Auxiliary Space: O(1).

Constraints:
1 ≤ N ≤ 109
*/

// Solution-
class Solution {
    // Function to swap odd and even bits in an integer
    public static int swapBits(int n) {
        // Get all even bits of n. 
        // 0xAAAAAAAA is a hexadecimal mask where all even bits are set to 1.
        int evenBits = n & 0xAAAAAAAA;
        
        // Get all odd bits of n.
        // 0x55555555 is a hexadecimal mask where all odd bits are set to 1.
        int oddBits = n & 0x55555555;
        
        // Right shift the even bits by 1 position to swap them with odd bits.
        // This operation moves the even bits to the odd positions.
        evenBits >>= 1;
        
        // Left shift the odd bits by 1 position to swap them with even bits.
        // This operation moves the odd bits to the even positions.
        oddBits <<= 1;
        
        // Combine the swapped even and odd bits using bitwise OR.
        // The OR operation merges the two bit patterns into one result.
        return evenBits | oddBits;
    }
}
