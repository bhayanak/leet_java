package org.leetcode.easy;


/**
 * <b>#1175 - Prime Arrangements</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Math</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Return the number of permutations of 1 to n so that prime numbers are at prime indices (1-indexed.)
 *
 *
 * (Recall that an integer is prime if and only if it is greater than 1, and cannot be written as a product of two positive integers both smaller than it.)
 *
 *
 * Since the answer may be large, return the answer modulo 10^9 + 7.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: n = 5
 * Output: 12
 * Explanation: For example [1,2,5,4,3] is a valid permutation, but [5,2,3,4,1] is not because the prime number 5 is at index 1.
 *
 * Example 2:
 *
 * Input: n = 100
 * Output: 682289015
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n &lt;= 100
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Solve the problem for prime numbers and composite numbers separately.
 * Hint 2: Multiply the number of permutations of prime numbers over prime indices with the number of permutations of composite numbers over composite indices.
 * Hint 3: The number of permutations equals the factorial.
 *
 * <h2>Approach</h2>
 * Think about the category (Math).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/prime-arrangements/">LeetCode #1175</a>
  *
  * <p><b>Explanation:</b> Applies a direct mathematical formula, avoiding the need for iteration or extra space.</p>
  */
public class PrimeArrangements {

    /**
     * Solves the problem: Num prime arrangements.
     *
     * @param n the n (int)
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Applies a direct mathematical formula, avoiding the need for iteration or extra space.</p>
      */
    public int numPrimeArrangements(int n) {
        int primes = countPrimes(n);
        long ans = factorial(primes) * factorial(n - primes) % 1_000_000_007L;
        return (int) ans;
    }
    private int countPrimes(int n) {
        boolean[] sieve = new boolean[n+1];
        java.util.Arrays.fill(sieve, true);
        sieve[0] = sieve[1] = false;
        for (int i = 2; i*i <= n; i++) if (sieve[i]) for (int j=i*i;j<=n;j+=i) sieve[j]=false;
        int cnt = 0; for (boolean b : sieve) if (b) cnt++;
        return cnt;
    }
    private long factorial(int n) { long r=1; for (int i=2;i<=n;i++) r=r*i%1_000_000_007L; return r; }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac PrimeArrangements.java &amp;&amp; java org.leetcode.easy.PrimeArrangements</pre>
      *
      * <p><b>Explanation:</b> Applies a direct mathematical formula, avoiding the need for iteration or extra space.</p>
      */
    public static void main(String[] args) {
        PrimeArrangements sol = new PrimeArrangements();
                System.out.println(sol.numPrimeArrangements(5));  // 12
                System.out.println(sol.numPrimeArrangements(100)); // 682289015
    }
}
