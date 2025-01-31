/*
You are given two numbers a and b. You need to find the multiplication of a and b under modulo M (M as 109+7).

Example 1:
Input:
a = 92233720368547758
b = 92233720368547758
Output: 484266119
Explanation: Multiplication of a and b 
under modulo M will be 484266119.

Example 2:
Input:
a = 1000000007
b = 1000000007
Output: 0
Explanation: Multiplication of a and b
under modulo M is 0.
Your Task:
You don't need to read input or print anything. Your task is to complete the function multiplicationUnderModulo() that takes a and b as parameters and returns multiplication of a and b under modulo M.

Expected Time Complexity : O(1)
Expected Auxilliary Space :  O(1)

Constraints:
1 <= a,b <= 263-1
*/

// Solution-
class Solution {
    // This method performs multiplication of two numbers under a given modulo.
    static long multiplicationUnderModulo(long a, long b) {
        // Define the modulo value (10^9 + 7)
        int M = 1000000007; // Modulo value
        
        // Calculate the result of (a * b) under modulo M
        long result = ((a % M) * (b % M)) % M;
        
        // Return the result
        return result;
    }
}
