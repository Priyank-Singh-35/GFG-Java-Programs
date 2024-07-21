/*
You are given a number n. You need to find nth Fibonacci number.
F(n)=F(n-1)+F(n-2); where F(1)=1 and F(2)=1

Example 1:
Input:
n = 1
Output: 1
Explanation: The first fibonacci
 number is 1

Example 2:
Input:
n = 20
Output:6765
Explanation: The 20th fibonacci 
number is 6765

Your Task:
You don't need to read input or print anything. You only need to complete the function fibonacci that takes n as parameters and returns the n-th fibonacci number.

Expected Time Complexity: O(2n).
Expected Auxiliary Space: O(N).

Constraints:
1 <= n <= 20
*/

// Solution-
class Solution {
    // Function to calculate the nth Fibonacci number using recursion
    static int fibonacci(int n) {
        // Base cases: If n is 0 or 1, return n (since the first two Fibonacci numbers are 0 and 1)
        if (n <= 1)
            return n;
        // Recursive case: Calculate the nth Fibonacci number by summing the (n-1)th and (n-2)th Fibonacci numbers
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}

