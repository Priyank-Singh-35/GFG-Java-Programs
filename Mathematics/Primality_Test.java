/*
A prime number is a number which is only divisible by 1 and itself.
Given number N check if it is prime or not.

Example 1:
Input:
N = 5
Output: True
Explanation: 5 is only divisible by 1 
and itself. So, 5 is a prime number.

Example 2:
Input:
N = 4
Output: False
Explanation: 4 is divisible by 2. 
So, 4 is not a prime number.

Your Task:
You don't need to read input or print anything. Your task is to complete the function isPrime() that takes N as input parameter and returns True if N is prime else returns False. 

Expected Time Complexity : O(N1/2)
Expected Auxilliary Space :  O(1)

Constraints:
1 <= N <= 109
*/

// Solution-
import java.util.Scanner;
class Solution {
    // This method checks if a given integer N is a prime number.
    public static boolean isPrime(int N) {
        // If N is less than or equal to 1, it is not a prime number.
        if (N <= 1) {
            return false;
        }
        // If N is 2 or 3, it is a prime number.
        if (N <= 3) {
            return true;
        }
        // If N is divisible by 2 or 3, it is not a prime number.
        if (N % 2 == 0 || N % 3 == 0) {
            return false;
        }
        // Check for factors of N from 5 to the square root of N.
        // We check i and i + 2 to skip even numbers and multiples of 3.
        for (int i = 5; i * i <= N; i += 6) {
            if (N % i == 0 || N % (i + 2) == 0) {
                return false;
            }
        }
        // If no factors are found, N is a prime number.
        return true;
    }
    
    // The main method is the entry point of the program.
    public static void main(String[] args) {
        // Create a Scanner object to read input from the standard input (keyboard).
        Scanner sc = new Scanner(System.in);
        
        // Read an integer input from the user.
        int N = sc.nextInt();
        
        // Call the isPrime method with the input integer N and print the result.
        System.out.println(isPrime(N));
        
        // Close the Scanner object to prevent resource leaks.
        sc.close();
    }
}
