/*
You are given a decimal number N. You need to find the gray code of the number N and convert it into decimal.
To see how it's done, refer here.

Example 1:
Input: N = 7
Output: 4
Explanation: 7 is represented as 111 in 
binary form. The gray code of 111 is 100, 
in the binary form whose decimal equivalent 
is 4.

Example 2:
Input: N = 10
Output: 15
Explanation: 10 is represented as 1010 in 
binary form. The gray code of 1010 is 1111, 
in the binary form whose decimal equivalent 
is 15.

Example 3:
Input: N = 0
Output: 0
Explanation: Zero is represented as zero 
in binary, gray, and decimal.

Your Task: The task is to complete the function greyConverter() which takes n as a parameter and returns it's equivalent gray code.

Expected Time Complexity: O(1).
Expected Auxiliary Space: O(1).

Constraints:
0 <= N <= 109
*/

// Solution-
class Solution {
    
    // Function to find the Gray code of the given number n
    public static int greyConverter(int n) {
        // Calculate the Gray code using the formula: n XOR (n >> 1)
        // n >> 1: Right shift the number n by 1 bit
        // n ^ (n >> 1): Perform a bitwise XOR between n and the right-shifted version of n
        return n ^ (n >> 1);
    }
}
