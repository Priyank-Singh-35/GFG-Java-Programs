/*
Given a positive integer N. The task is to find factorial of N.

Example 1:
Input:
N = 4
Output: 24
Explanation: 4! = 4 * 3 * 2 * 1 = 24

Example 2:
Input:
N = 13
Output: 6227020800
Explanation: 
13! = 13 * 12 * .. * 1 = 6227020800

Your Task:
You don't need to read input or print anything. Your task is to complete the function factorial() that takes N as parameter and returns factorial of N.

Expected Time Complexity : O(N)
Expected Auxilliary Space : O(1)

Constraints:
0 <= N <= 18
*/

// Solution-
import java.util.Scanner;

class Solution {

    // This method calculates the factorial of a given integer N.
    public static long factorial(int N) {
        // If N is 1, the factorial is 1.
        if (N == 1) {
            return 1;
        }
        
        // Initialize result to 1.
        long result = 1;
        
        // Calculate the factorial by multiplying result by each integer from 1 to N.
        for (int i = 1; i <= N; i++) {
            result = result * i;
        }
        
        // Return the calculated factorial.
        return result;
    }
    
    // The main method is the entry point of the program.
    public static void main(String[] args) {
        // Create a Scanner object to read input from the standard input (keyboard).
        Scanner sc = new Scanner(System.in);
        
        // Read an integer input from the user.
        int N = sc.nextInt();
        
        // Call the factorial method with the input integer N and store the result in the variable fact.
        long fact = factorial(N);
        
        // Print the calculated factorial to the standard output (console).
        System.out.println(fact);
        
        // Close the Scanner object to prevent resource leaks.
        sc.close();
    }
}
