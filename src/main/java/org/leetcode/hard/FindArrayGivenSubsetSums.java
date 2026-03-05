package org.leetcode.hard;


/**
 * <b>#1982 - Find Array Given Subset Sums</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Divide and Conquer</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer n representing the length of an unknown array that you are trying to recover. You are also given an array sums containing the values of all 2n subset sums of the unknown array (in no particular order).
 *
 *
 * Return the array ans of length n representing the unknown array. If multiple answers exist, return any of them.
 *
 *
 * An array sub is a subset of an array arr if sub can be obtained from arr by deleting some (possibly zero or all) elements of arr. The sum of the elements in sub is one possible subset sum of arr. The sum of an empty array is considered to be 0.
 *
 *
 * Note: Test cases are generated such that there will always be at least one correct answer.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: n = 3, sums = [-3,-2,-1,0,0,1,2,3]
 * Output: [1,2,-3]
 * Explanation: [1,2,-3] is able to achieve the given subset sums:
 * - []: sum is 0
 * - [1]: sum is 1
 * - [2]: sum is 2
 * - [1,2]: sum is 3
 * - [-3]: sum is -3
 * - [1,-3]: sum is -2
 * - [2,-3]: sum is -1
 * - [1,2,-3]: sum is 0
 * Note that any permutation of [1,2,-3] and also any permutation of [-1,-2,3] will also be accepted.
 *
 * Example 2:
 *
 * Input: n = 2, sums = [0,0,0,0]
 * Output: [0,0]
 * Explanation: The only correct answer is [0,0].
 *
 * Example 3:
 *
 * Input: n = 4, sums = [0,0,5,5,4,-1,4,9,9,-1,4,3,4,8,3,8]
 * Output: [0,-1,4,5]
 * Explanation: [0,-1,4,5] is able to achieve the given subset sums.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n &lt;= 15
 *
 * sums.length == 2n
 *
 * -104 &lt;= sums[i] &lt;= 104
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: What information do the two largest elements tell us?
 * Hint 2: Can we use recursion to check all possible states?
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Divide and Conquer).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/find-array-given-subset-sums/">LeetCode #1982</a>
 */
public class FindArrayGivenSubsetSums {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Find Array Given Subset Sums");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== FindArrayGivenSubsetSums ===");
        FindArrayGivenSubsetSums sol = new FindArrayGivenSubsetSums();
        System.out.println(sol.solve(null));
    }
}
