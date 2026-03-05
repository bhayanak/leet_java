package org.leetcode.medium;


/**
 * <b>#2226 - Maximum Candies Allocated to K Children</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Binary Search</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a 0-indexed integer array candies. Each element in the array denotes a pile of candies of size candies[i]. You can divide each pile into any number of sub piles, but you cannot merge two piles together.
 *
 *
 * You are also given an integer k. You should allocate piles of candies to k children such that each child gets the same number of candies. Each child can be allocated candies from only one pile of candies and some piles of candies may go unused.
 *
 *
 * Return the maximum number of candies each child can get.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: candies = [5,8,6], k = 3
 * Output: 5
 * Explanation: We can divide candies[1] into 2 piles of size 5 and 3, and candies[2] into 2 piles of size 5 and 1. We now have five piles of candies of sizes 5, 5, 3, 5, and 1. We can allocate the 3 piles of size 5 to 3 children. It can be proven that each child cannot receive more than 5 candies.
 *
 * Example 2:
 *
 * Input: candies = [2,5], k = 11
 * Output: 0
 * Explanation: There are 11 children but only 7 candies in total, so it is impossible to ensure each child receives at least one candy. Thus, each child gets no candy and the answer is 0.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= candies.length &lt;= 105
 *
 * 1 &lt;= candies[i] &lt;= 107
 *
 * 1 &lt;= k &lt;= 1012
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: For a fixed number of candies c, how can you check if each child can get c candies?
 * Hint 2: Use binary search to find the maximum c as the answer.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Binary Search).
 *
 * @see <a href="https://leetcode.com/problems/maximum-candies-allocated-to-k-children/">LeetCode #2226</a>
 */
public class MaximumCandiesAllocatedToKChildren {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Maximum Candies Allocated to K Children");
    }

    public static void main(String[] args) {
        System.out.println("=== MaximumCandiesAllocatedToKChildren ===");
        MaximumCandiesAllocatedToKChildren sol = new MaximumCandiesAllocatedToKChildren();
        System.out.println(sol.solve(null));
    }
}
