/*
Lucky numbers are subset of integers. Rather than going into much theory, let us see the process of arriving at lucky numbers,
Take the set of integers
1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19,……
First, delete every second number, we get following reduced set.
1, 3, 5, 7, 9, 11, 13, 15, 17, 19,…………
Now, delete every third number, we get
1, 3, 7, 9, 13, 15, 19,….….
Continue this process indefinitely……
Any number that does NOT get deleted due to above process is called “lucky”.

You are given a number N, you need to tell whether the number is lucky or not. If the number is lucky return 1 otherwise 0.

Example 1:
Input:
N = 5
Output: 0
Explanation: 5 is not a lucky number 
as it gets deleted in the second 
iteration.

Example 2:
Input:
N = 19
Output: 1
Explanation: 19 is a lucky number because 
it does not get deleted throughout the process.

Your Task:
You don't need to read input or print anything. You only need to complete the function isLucky() that takes N as parameter and returns either False if the N is not lucky else True.

Expected Time Complexity: O(sqrt(N)).
Expected Auxiliary Space: O(1).

Constraints:
1 <= N <= 105
*/

// Solution-
class Solution
{
    // Function to determine if a given number is a lucky number
    public static boolean isLucky(int n)
    {
        int nextPosition = n; // Initialize the position with the given number
        
        // Iterate from 2 up to the current position
        for (int i = 2; i <= nextPosition; i++) {
            // Check if the current position is divisible by i
            if (nextPosition % i == 0) {
                // If it is divisible, the number is not lucky
                return false;
            }
            // Remove elements at positions that are multiples of i
            nextPosition -= nextPosition / i;
        }
        // If no divisors were found, the number is lucky
        return true;
    }
}
