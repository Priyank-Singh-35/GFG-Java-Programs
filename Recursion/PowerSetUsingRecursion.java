/*
You are given a string. You need to return the power-set (in any order) of the string.
Note: The string s contains lowercase letter of alphabet.

Example 1:
Input:
s = a
Output: a
Explanation: empty string and a 
are only sets.

Example 2:
Input:
s = abc
Output: a ab abc ac b bc c
Explanation: empty string, 
a, ab, abc, ac, b, bc, c 
are the sets.

Your Task:
You don't need to read input or print anything. You only need to complete the function powerSet that takes string s as parameter and returns a list of subsets. The lexicographic-sorting and printing is done automatically by the driver code.

Expected Time Complexity: O(2|s|).
Expected Auxiliary Space: O(|s|). 

Constraints:
1 <= |s| <= 10
*/

// Solution-
class LexSort {
    // Function to generate the power set of a given string s
    static ArrayList<String> powerSet(String s) {
        ArrayList<String> result = new ArrayList<>();
        // Start generating the power set from index 0 with an empty current subset
        generatePowerSet(s, 0, "", result);
        return result;
    }
    
    // Recursive helper function to generate the power set
    static void generatePowerSet(String s, int index, String current, ArrayList<String> result) {
        // Base case: If index has reached the length of the string, add the current subset to the result
        if (index == s.length()) {
            result.add(current);
            return;
        }
        // Recursive case 1: Include the current character and proceed
        generatePowerSet(s, index + 1, current + s.charAt(index), result);
        // Recursive case 2: Exclude the current character and proceed
        generatePowerSet(s, index + 1, current, result);
    }
}

