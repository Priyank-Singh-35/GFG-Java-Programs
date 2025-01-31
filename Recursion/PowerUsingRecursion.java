/*
You are given two numbers n and p. You need to find np.

Example 1:
Input:
n = 9 p = 9 
Output: 387420489
Explanation: 387420489 is the value 
obtained when 9 is raised to the 
power of 9.

Example 2:
Input:
n = 2 p = 9
Output: 512
Explanation: 512 is the value 
obtained when 2 is raised to 
the power of 9.  

Your Task:
You don't need to read input or print anything. You only need to complete the function RecursivePower() that takes n and p as parameters and returns np.

Expected Time Complexity: O(p).
Expected Auxiliary Space: O(p).

Constraints:
1 <= n <= 9
0 <=  p <= 9
*/

// Solution-
class Solution {
    // Function to calculate n raised to the power of p using recursion
    static int RecursivePower(int n, int p) {
        // Base case: If power is 0, return 1 (since any number raised to the power of 0 is 1)
        if (p == 0)
            return 1;
        
        // Recursive case: Calculate n raised to the power of p-1 and multiply it with n
        return n * RecursivePower(n, p - 1);
    }
}
