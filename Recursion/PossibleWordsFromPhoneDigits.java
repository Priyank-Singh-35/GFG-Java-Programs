/*
Given a keypad as shown in the diagram, and an N digit number which is represented by array a[ ], the task is to list all words which are possible by pressing these numbers.

Example 1:
Input: N = 3, a[] = {2, 3, 4}
Output:
adg adh adi aeg aeh aei afg afh afi 
bdg bdh bdi beg beh bei bfg bfh bfi 
cdg cdh cdi ceg ceh cei cfg cfh cfi 
Explanation: When we press 2,3,4 then 
adg, adh, adi, ... cfi are the list of 
possible words.

Example 2:
Input: N = 3, a[] = {3, 4, 5}
Output:
dgj dgk dgl dhj dhk dhl dij dik dil 
egj egk egl ehj ehk ehl eij eik eil 
fgj fgk fgl fhj fhk fhl fij fik fil
Explanation: When we press 3,4,5 then 
dgj, dgk, dgl, ... fil are the list of 
possible words.

Your Task:
You don't need to read input or print anything. You just need to complete the function possibleWords() that takes an array a[ ] and N as input parameters and returns an array of all the possible words in lexicographical increasing order. 

Expected Time Complexity: O(4N * N).
Expected Auxiliary Space: O(N).

Constraints:
1 ≤ N ≤ 10
2 ≤ a[i] ≤ 9
*/

// Solution-
class Solution
{
    // Array to map digits to their corresponding letters on a phone keypad
    static String[] keypad = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    // Recursive function to generate all possible words
    static void generateWords(int a[], int N, int currentDigitIndex, String word, ArrayList<String> result) {
        // Base case: if the currentDigitIndex is equal to N, we have processed all digits
        if (currentDigitIndex == N) {
            result.add(word); // Add the formed word to the result list
            return;
        }

        // Get the possible characters for the current digit
        String currentKeys = keypad[a[currentDigitIndex]];
        // Loop through each character and recursively generate words
        for (int i = 0; i < currentKeys.length(); i++) {
            generateWords(a, N, currentDigitIndex + 1, word + currentKeys.charAt(i), result);
        }
    }

    // Main function to find the list of all possible words by pressing the given numbers
    static ArrayList<String> possibleWords(int a[], int N)
    {
        ArrayList<String> result = new ArrayList<>(); // Initialize the result list
        generateWords(a, N, 0, "", result); // Start the recursive generation of words
        return result; // Return the list of possible words
    }
}
