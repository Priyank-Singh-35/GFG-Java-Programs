/*
Given an integer N. Find the number of digits that appear in its factorial. 
Factorial is defined as, factorial(n) = 1*2*3*4……..*N and factorial(0) = 1.
 

Example 1:
Input: N = 5
Output: 3
Explanation: Factorial of 5 is 120.
Number of digits in 120 is 3 (1, 2, and 0)
 

Example 2:
Input: N = 120
Output: 199
Explanation: The number of digits in
120! is 199

Your Task:
You don't need to read input or print anything. Your task is to complete the function digitsInFactorial() that takes N as input parameter and returns number of digits in factorial of N.

Expected Time Complexity : O(N)
Expected Auxilliary Space : O(1)

Constraints:
1 ≤ N ≤ 105
*/

// Solution-
import java.util.Scanner;
class Solution {
    // This method calculates the number of digits in the factorial of a given integer N.
    public static int digitsInFactorial(int N) {
        // If N is 0 or 1, the factorial is 1, which has 1 digit.
        if (N == 0 || N == 1) {
            return 1;
        }
        
        // Initialize the variable to store the sum of logarithms.
        double digits = 0;
        
        // Iterate from 2 to N, adding the base-10 logarithm of each integer to the sum.
        for (int i = 2; i <= N; i++) {
            digits += Math.log10(i);
        }
        
        // The number of digits in the factorial is the floor of the sum of logarithms plus 1.
        return (int) Math.floor(digits) + 1;
    }
    
    // The main method is the entry point of the program.
    public static void main(String[] args) {
        // Create a Scanner object to read input from the standard input (keyboard).
        Scanner sc = new Scanner(System.in);
        
        // Read an integer input from the user.
        int N = sc.nextInt();
        
        // Call the digitsInFactorial method with the input integer N and store the result in the variable digits.
        int digits = digitsInFactorial(N);
        
        // Print the number of digits in the factorial to the standard output (console).
        System.out.println(digits);
        
        // Close the Scanner object to prevent resource leaks.
        sc.close();
    }
}

