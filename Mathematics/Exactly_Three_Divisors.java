/*
Given a positive integer value N. The task is to find how many numbers less than or equal to N have numbers of divisors exactly equal to 3.

Example 1:
Input:
N = 6
Output: 1
Explanation: The only number less than 6 with 
3 divisors is 4 which has 1, 2 and 4 as divisors.

Example 2:
Input:
N = 10
Output: 2
Explanation: 4 and 9 have 3 divisors.

Your Task:
You don't need to read input or print anything. Your task is to complete the function exactly3Divisors() that takes N as input parameter and returns count of numbers less than or equal to N with exactly 3 divisors.

Expected Time Complexity : O(N1/2 * N1/4)
Expected Auxilliary Space :  O(1)

Constraints :
1 <= N <= 109
*/

// Solution-
import java.util.Arrays;
class Solution {

    // This method counts numbers up to N that have exactly 3 divisors.
    public static int exactly3Divisors(int N) {
        
        // Step 1: Find all primes up to sqrt(N) using the Sieve of Eratosthenes
        int limit = (int) Math.sqrt(N); // Calculate the square root of N
        boolean[] isPrime = new boolean[limit + 1]; // Create a boolean array to mark prime numbers
        Arrays.fill(isPrime, true); // Initialize all entries as true (prime)
        isPrime[0] = isPrime[1] = false; // 0 and 1 are not prime numbers

        // Perform the Sieve of Eratosthenes to find all prime numbers up to sqrt(N)
        for (int i = 2; i * i <= limit; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= limit; j += i) {
                    isPrime[j] = false; // Mark multiples of i as non-prime
                }
            }
        }

        // Step 2: Count the numbers that are squares of primes
        int count = 0; // Initialize the count of numbers with exactly 3 divisors
        for (int i = 2; i <= limit; i++) {
            // Check if i is prime and i^2 is <= N
            if (isPrime[i] && i * i <= N) {
                count++; // Increment the count
            }
        }

        return count; // Return the count of numbers with exactly 3 divisors
    }

}
