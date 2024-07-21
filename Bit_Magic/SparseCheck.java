/*
Given a number N. The task is to check whether it is sparse or not. A number is said to be a sparse number if no two or more consecutive bits are set in the binary representation.

Example 1:
Input: N = 2
Output: 1
Explanation: Binary Representation of 2 is 10, 
which is not having consecutive set bits. 
So, it is sparse number.

Example 2:
Input: N = 3
Output: 0
Explanation: Binary Representation of 3 is 11, 
which is having consecutive set bits in it. 
So, it is not a sparse number.

Your Task: The task is to complete the function checkSparse() that takes n as a parameter and returns 1 if the number is sparse else returns 0.


Expected Time Complexity: O(1).
Expected Auxiliary Space: O(1).

Constraints:
1 <= N <= 106
*/

// Solution-
class Solution
{
    // Function to check if the number is sparse or not
    public static boolean isSparse(int n) {
        // Perform a bitwise AND between the number and its left-shifted version
        // n << 1: Shift all bits of n to the left by 1 position
        // n & (n << 1): AND the original number with the shifted number
        int result = n & (n << 1);
        
        // Check if the result is 0
        // If result is 0, it means there are no consecutive 1s in the binary representation of n
        // Therefore, the number is sparse
        // Otherwise, if result is not 0, there are consecutive 1s in n, making it not sparse
        return result == 0;
    }
}
