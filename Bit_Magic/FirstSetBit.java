/*
Given an integer N. The task is to return the position of first set bit found from the right side in the binary representation of the number.
Note: If there is no set bit in the integer N, then return 0 from the function.  

Example 1:

Input: 
N = 18
Output: 
2
Explanation: 
Binary representation of 18 is 010010,the first set bit from the right side is at position 2.
Example 2:

Input: 
N = 12 
Output: 
3 
Explanation: 
Binary representation of  12 is 1100, the first set bit from the right side is at position 3.
Your Task:
The task is to complete the function getFirstSetBit() that takes an integer n as a parameter and returns the position of first set bit.

Expected Time Complexity: O(log N).
Expected Auxiliary Space: O(1).

Constraints:
0 <= N <= 108
*/

// Solution-
class Solution
{
    //Function to find position of first set bit in the given number.
    public static int getFirstSetBit(int n){
    // If the number is 0, return 0
    if(n == 0)
        return 0;
    
    // Calculate the position of the first set bit
    int position = 1;
    int mask = 1;
    
    // Iterate through the bits of the number to find the first set bit
    while((n & mask) == 0){
        position++;
        mask = mask << 1;
    }
    
    return position;
    }
}
