/*
Given a temperature in celsius C. You need to convert the given temperature to Fahrenheit.

Example 1:
Input:
C = 32
Output: 89.6
Explanation: Using the conversion 
formula of celsius to farhenheit , it
can be calculated that, for 32 degree
C, the temperature in Fahrenheit = 89.6
  
Example 2:
Input:
50
Output: 122
Explanation: Using the conversion 
formulaof celsius to farhenheit, it
can be calculated that, for 50 degree
C, the temperature in Fahrenheit = 122.

Your Task:
You don't need to read input or print anything. Your task is to complete the function CtoF() that takes C as parameter and returns temperature in fahrenheit( in double). The flooring and printing is automatically done by the driver code.

Expected Time Complexity: O(1)
Expected Auxiliary Space : O(1)

Constraints:
1 <= C <= 104
*/

// Solution-
import java.util.Scanner;
class Solution
{
    // This method converts a temperature from Celsius to Fahrenheit.
    public static double cToF(double C)
    {
        // Convert Celsius to Fahrenheit using the formula F = (C * 9/5) + 32.
        double f = ((C * 9) / 5) + 32;
        // Return the calculated Fahrenheit value.
        return f;
    }

    // The main method is the entry point of the program.
    public static void main(String[] args){
        // Create a Scanner object to read input from the standard input (keyboard).
        Scanner sc = new Scanner(System.in);

        // Read a double input (temperature in Celsius) from the user.
        double C = sc.nextDouble();

        // Call the cToF method with the input temperature in Celsius and store the result in the variable fah.
        double fah = cToF(C);

        // Print the converted temperature in Fahrenheit to the standard output (console).
        System.out.println(fah);

        // Close the Scanner object to prevent resource leaks.
        sc.close();
    }
}
