/*
Given two integers ‘a’ and ‘m’. The task is to find the smallest modular multiplicative inverse of ‘a’ under modulo ‘m’. if it does not exist then return -1.

Example 1:
Input:
a = 3
m = 11
Output: 4
Explanation: Since (4*3) mod 11 = 1, 4 
is modulo inverse of 3. One might think,
15 also as a valid output as "(15*3)
mod 11"  is also 1, but 15 is not in 
ring {0, 1, 2, ... 10}, so not valid.

Example 2:
Input:
a = 10
m = 17
Output: 12
Explanation: Since (12*10) mod 17 = 1,
12 is the modulo inverse of 10.

Your Task:
You don't need to read input or print anything. Your task is to complete the function function modInverse() that takes a and m as input parameters and returns modular multiplicative inverse of ‘a’ under modulo ‘m’. If the modular multiplicative inverse doesn't exist return -1.

Expected Time Complexity : O(m)
Expected Auxilliary Space : O(1)

Constraints:
1 <= a <= 104
1 <= m <= 104
*/

// Solution-
class Solution {
    // This method calculates the modular multiplicative inverse of 'a' under modulo 'm'.
    static int modInverse(int a, int m) {
        // Reduce 'a' modulo 'm' to ensure it is within the valid range
        a = a % m;
        
        // Iterate over all integers from 1 to m-1 to find the inverse
        for (int x = 1; x < m; x++) {
            // Check if (a * x) % m is equal to 1
            if ((a * x) % m == 1) {
                return x; // Return the modular inverse
            }
        }
        
        // Return -1 if the modular inverse is not found
        return -1; // Indicates that the inverse does not exist
    }
}

