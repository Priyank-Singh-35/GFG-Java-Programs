/*
Given a number n and a bit number k, check if kth index bit of n is set or not. A bit is called set if it is 1. Position of set bit '1' should be indexed starting with 0 from LSB side in binary representation of the number.
Note: Index is starting from 0. You just need to return true or false, driver code will take care of printing "Yes" and "No".

Examples : 

Input: n = 4, k = 0
Output: No
Explanation: Binary representation of 4 is 100, in which 0th index bit from LSB is not set. So, return false.
Input: n = 4, k = 2
Output: Yes
Explanation: Binary representation of 4 is 100, in which 2nd index bit from LSB is set. So, return true.
Input: n = 500, k = 3
Output: No
Explanation: Binary representation of 500 is 111110100, in which 3rd index bit from LSB is not set. So, return false.

Expected Time Complexity: O(1).
Expected Auxiliary Space: O(1).

Constraints:
1 ≤ n ≤ 109
0 ≤ k ≤ 31
*/

// Solution-
public class CheckBit {
    static boolean checkKthBit(int n, int k) {
        // Initialize x to 1. This step is actually unnecessary for the final check,
        // but it demonstrates how one might think of the 2^k position.
        int x = 1;
        
        // Loop to multiply x by 2, k times. This is an alternative way of calculating 2^k.
        // However, it is not used in the final bitwise check.
        for (int i = 0; i < k; i++) {
            x = x * 2;
        }
        
        // Check if the k-th bit of n is set (1). This is done using bitwise AND with a mask
        // that has only the k-th bit set. (1 << k) creates a mask with the k-th bit set.
        if ((n & (1 << k)) != 0) {
            return true;  // If the result is not zero, the k-th bit is set.
        } else {
            return false; // If the result is zero, the k-th bit is not set.
        }
    }

    public static void main(String[] args) {
        // Example usage
        int n = 5; // binary: 101
        int k = 2;
        System.out.println(checkKthBit(n, k)); // Output: true (since the 2nd bit is set in binary 101)
    }
}
