package org.leetcode.hard;


/**
 * <b>#3671 - Sum of Beautiful Subsequences</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Math, Binary Indexed Tree, Number Theory</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array nums of length n.
 *
 *
 * For every positive integer g, we define the beauty of g as the product of g and the number of strictly increasing subsequences of nums whose greatest common divisor (GCD) is exactly g.
 *
 *
 * Return the sum of beauty values for all positive integers g.
 *
 *
 * Since the answer could be very large, return it modulo 109 + 7.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,2,3]
 *
 *
 * Output: 10
 *
 *
 * Explanation:
 *
 *
 * All strictly increasing subsequences and their GCDs are:
 *
 *
 *
 *
 *
 * 			Subsequence
 * 			GCD
 *
 *
 *
 *
 *
 *
 * 			[1]
 * 			1
 *
 *
 *
 *
 * 			[2]
 * 			2
 *
 *
 *
 *
 * 			[3]
 * 			3
 *
 *
 *
 *
 * 			[1,2]
 * 			1
 *
 *
 *
 *
 * 			[1,3]
 * 			1
 *
 *
 *
 *
 * 			[2,3]
 * 			1
 *
 *
 *
 *
 * 			[1,2,3]
 * 			1
 *
 *
 *
 *
 * Calculating beauty for each GCD:
 *
 *
 *
 *
 *
 * 			GCD
 * 			Count of subsequences
 * 			Beauty (GCD × Count)
 *
 *
 *
 *
 *
 *
 * 			1
 * 			5
 * 			1 × 5 = 5
 *
 *
 *
 *
 * 			2
 * 			1
 * 			2 × 1 = 2
 *
 *
 *
 *
 * 			3
 * 			1
 * 			3 × 1 = 3
 *
 *
 *
 *
 * Total beauty is 5 + 2 + 3 = 10.
 *
 * Example 2:
 *
 * Input: nums = [4,6]
 *
 *
 * Output: 12
 *
 *
 * Explanation:
 *
 *
 * All strictly increasing subsequences and their GCDs are:
 *
 *
 *
 *
 *
 * 			Subsequence
 * 			GCD
 *
 *
 *
 *
 *
 *
 * 			[4]
 * 			4
 *
 *
 *
 *
 * 			[6]
 * 			6
 *
 *
 *
 *
 * 			[4,6]
 * 			2
 *
 *
 *
 *
 * Calculating beauty for each GCD:
 *
 *
 *
 *
 *
 * 			GCD
 * 			Count of subsequences
 * 			Beauty (GCD × Count)
 *
 *
 *
 *
 *
 *
 * 			2
 * 			1
 * 			2 × 1 = 2
 *
 *
 *
 *
 * 			4
 * 			1
 * 			4 × 1 = 4
 *
 *
 *
 *
 * 			6
 * 			1
 * 			6 × 1 = 6
 *
 *
 *
 *
 * Total beauty is 2 + 4 + 6 = 12.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n == nums.length &lt;= 104
 *
 * 1 &lt;= nums[i] &lt;= 7 * 104
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Fix a candidate GCD <code>g</code> and keep, in the original order, only those array elements divisible by <code>g</code>; scale them down to <code>x / g</code> so any increasing subsequence here corresponds to a subsequence whose elements are all multiples of <code>g</code>.
 * Hint 2: Count strictly increasing subsequences of that scaled list by assigning ranks (coordinate compression) and maintaining prefix sums of ways for smaller ranks (you may use a Fenwick tree).
 * Hint 3: The count you get, call it <code>cnt_g</code>, includes subsequences whose GCD is <code>g</code> or any multiple of <code>g</code>; it is therefore an overcount for "exactly g".
 * Hint 4: To get the number with GCD exactly <code>g</code>, process <code>g</code> from <code>max(nums)</code> down to <code>1</code> and subtract counts already assigned to multiples: <code>F[g] = cnt_g - sum{k=2g,3g,...}*F[k]</code> (do arithmetic mod <code>MOD</code>); descending order ensures multiples are known.
 * Hint 5: The final answer is the sum of contributions <code>g * F[g]</code> for all <code>g</code>.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Math, Binary Indexed Tree, Number Theory).
 *
 * @see <a href="https://leetcode.com/problems/sum-of-beautiful-subsequences/">LeetCode #3671</a>
 */
public class SumOfBeautifulSubsequences {

    public static class TreeNode {
        int val; TreeNode left, right;
        TreeNode(int v) { val = v; }
    }
    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Sum of Beautiful Subsequences");
    }

    public static void main(String[] args) {
        System.out.println("=== SumOfBeautifulSubsequences ===");
        SumOfBeautifulSubsequences sol = new SumOfBeautifulSubsequences();
        System.out.println(sol.solve(null));
    }
}
