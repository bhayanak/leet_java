package org.leetcode.medium;


/**
 * <b>#3618 - Split Array by Prime Indices</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Math, Number Theory</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array nums.
 *
 *
 * Split nums into two arrays A and B using the following rule:
 *
 *
 * Elements at prime indices in nums must go into array A.
 *
 * All other elements must go into array B.
 *
 * Return the absolute difference between the sums of the two arrays: |sum(A) - sum(B)|.
 *
 *
 * Note: An empty array has a sum of 0.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [2,3,4]
 *
 *
 * Output: 1
 *
 *
 * Explanation:
 *
 *
 * The only prime index in the array is 2, so nums[2] = 4 is placed in array A.
 *
 * The remaining elements, nums[0] = 2 and nums[1] = 3 are placed in array B.
 *
 * sum(A) = 4, sum(B) = 2 + 3 = 5.
 *
 * The absolute difference is |4 - 5| = 1.
 *
 * Example 2:
 *
 * Input: nums = [-1,5,7,0]
 *
 *
 * Output: 3
 *
 *
 * Explanation:
 *
 *
 * The prime indices in the array are 2 and 3, so nums[2] = 7 and nums[3] = 0 are placed in array A.
 *
 * The remaining elements, nums[0] = -1 and nums[1] = 5 are placed in array B.
 *
 * sum(A) = 7 + 0 = 7, sum(B) = -1 + 5 = 4.
 *
 * The absolute difference is |7 - 4| = 3.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 105
 *
 * -109 &lt;= nums[i] &lt;= 109
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Generate all primes up to <code>nums.length</code> (e.g., with the Sieve of Eratosthenes).
 * Hint 2: Iterate through <code>nums</code>, adding <code>nums[i]</code> to <code>sumA</code> if <code>i</code> is prime, otherwise to <code>sumB</code>, then return <code>|sumA - sumB|</code>.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Math, Number Theory).
 *
 * @see <a href="https://leetcode.com/problems/split-array-by-prime-indices/">LeetCode #3618</a>
 */
public class SplitArrayByPrimeIndices {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Split Array by Prime Indices");
    }

    public static void main(String[] args) {
        System.out.println("=== SplitArrayByPrimeIndices ===");
        SplitArrayByPrimeIndices sol = new SplitArrayByPrimeIndices();
        System.out.println(sol.solve(null));
    }
}
