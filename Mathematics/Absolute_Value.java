/*
You are given an interger I, find the absolute value of the interger I.

Example 1:
Input:
I = -32
Output: 32
Explanation: 
The absolute value of -32 is 32.

Example 2:
Input:
I = 45
Output: 45
Explanation: 
The absolute value of 45 is 45 itself. 

Your Task:
You don't need to read input or print anything. Your task is to complete the function absolute() which takes an integer I as input parameter and return the absolute value of I.

Expected Time Complexity: O(1)
Expected Auxiliary Space : O(1)

Constraints:
-106 <= I <= 106
*/

// Solution-
import java.util.Scanner;
class Solution {
    // This method takes an integer I as input and returns its absolute value.
    public static int absolute(int I) {
        // Math.abs(I) returns the absolute value of I.
        return Math.abs(I);
    }

    // The main method is the entry point of the program.
    public static void main(String args[]){
        // Create a Scanner object to read input from the standard input (keyboard).
        Scanner sc = new Scanner(System.in);

        // Read an integer input from the user.
        int I = sc.nextInt();

        // Call the absolute method with the input integer I and store the result in the variable res.
        int res = absolute(I);

        // Print the result to the standard output (console).
        System.out.println(res);

        // Close the Scanner object to prevent resource leaks.
        sc.close();
    }
}
