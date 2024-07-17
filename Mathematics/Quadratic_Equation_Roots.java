/*
Given a quadratic equation ax2 + bx + c = 0, find its roots. If the roots are imaginary, return only one integer -1. Always return the roots as the greatest integers less than or equal to the actual roots, with the maximum root first followed by the minimum root.
Note: If roots are imaginary, the generated output will display "Imaginary".

Example-1:
Input:
a = 1, b = -2, c = 1
Output: 1 1
Explanation:
Roots of equation x2-2x+1 are 1 and 1.

Example-2:
Input:
a = 1, b = -7, c = 12
Output: 4 3
Explanation: Roots of equation x2 - 7x + 12 are 4 and 3.

Expected Time Complexity: O(1)
Expected Auxiliary Space : O(1)

Constraints:
-103 <= a,b,c <= 103
*/

// Solution-
import java.util.ArrayList;
import java.util.Scanner;
class Solution {
    // This method calculates the roots of a quadratic equation ax^2 + bx + c = 0.
    public static ArrayList<Integer> quadraticRoots(int a, int b, int c) {
        // Calculate the discriminant of the quadratic equation.
        int d = b * b - 4 * a * c;
        
        // If the discriminant is negative, the roots are imaginary.
        if (d < 0) {
            ArrayList<Integer> imaginaryRoots = new ArrayList<>();
            imaginaryRoots.add(-1); // Indicates imaginary roots.
            return imaginaryRoots;
        } else {
            // Calculate the square root of the discriminant.
            double sqrt = Math.sqrt(d);
            // Calculate the two roots using the quadratic formula.
            double root1 = (-b + sqrt) / (2 * a);
            double root2 = (-b - sqrt) / (2 * a);
            
            // Convert the roots to their integer floor values.
            int floorRoot1 = (int) Math.floor(root1);
            int floorRoot2 = (int) Math.floor(root2);
            
            ArrayList<Integer> roots = new ArrayList<>();
            // Add the roots to the list in descending order.
            if (floorRoot1 > floorRoot2) {
                roots.add(floorRoot1);
                roots.add(floorRoot2);
            } else {
                roots.add(floorRoot2);
                roots.add(floorRoot1);
            }
            return roots;
        }
    }
    
    // The main method is the entry point of the program.
    public static void main(String[] args) {
        // Create a Scanner object to read input from the standard input (keyboard).
        Scanner sc = new Scanner(System.in);

        // Read three integer inputs (coefficients of the quadratic equation) from the user.
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        // Call the quadraticRoots method with the input coefficients and store the result in the variable result.
        ArrayList<Integer> result = quadraticRoots(a, b, c);
        
        // Print the roots of the quadratic equation to the standard output (console).
        System.out.println(result);

        // Close the Scanner object to prevent resource leaks.
        sc.close();
    }
}

