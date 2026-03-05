package org.leetcode.medium;


/**
 * <b>#3857 - Minimum Cost to Split into Ones</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> General</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer n.
 *
 *
 * In one operation, you may split an integer x into two positive integers a and b such that a + b = x.
 *
 *
 * The cost of this operation is a * b.
 *
 *
 * Return an integer denoting the minimum total cost required to split the integer n into n ones.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: n = 3
 *
 *
 * Output: 3
 *
 *
 * Explanation:
 *
 *
 * One optimal set of operations is:
 *
 *
 *
 *
 *
 * 			x
 * 			a
 * 			b
 * 			a + b
 * 			a * b
 * 			Cost
 *
 *
 *
 *
 * 			3
 * 			1
 * 			2
 * 			3
 * 			2
 * 			2
 *
 *
 *
 *
 * 			2
 * 			1
 * 			1
 * 			2
 * 			1
 * 			1
 *
 *
 *
 *
 * Thus, the minimum total cost is 2 + 1 = 3.
 *
 * Example 2:
 *
 * Input: n = 4
 *
 *
 * Output: 6
 *
 *
 * Explanation:
 *
 * One optimal set of operations is:
 *
 *
 *
 *
 *
 * 			x
 * 			a
 * 			b
 * 			a + b
 * 			a * b
 * 			Cost
 *
 *
 *
 *
 * 			4
 * 			2
 * 			2
 * 			4
 * 			4
 * 			4
 *
 *
 *
 *
 * 			2
 * 			1
 * 			1
 * 			2
 * 			1
 * 			1
 *
 *
 *
 *
 * 			2
 * 			1
 * 			1
 * 			2
 * 			1
 * 			1
 *
 *
 *
 *
 * Thus, the minimum total cost is 4 + 1 + 1 = 6.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n &lt;= 500
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use dynamic programming or math.
 * Hint 2: It is always optimal to split the current integer <code>x</code> into <code>1</code> and <code>x - 1</code>.
 *
 * <h2>Approach</h2>
 * Think about the category (General).
 *
 * @see <a href="https://leetcode.com/problems/minimum-cost-to-split-into-ones/">LeetCode #3857</a>
 */
public class MinimumCostToSplitIntoOnes {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Minimum Cost to Split into Ones");
    }

    public static void main(String[] args) {
        System.out.println("=== MinimumCostToSplitIntoOnes ===");
        MinimumCostToSplitIntoOnes sol = new MinimumCostToSplitIntoOnes();
        System.out.println(sol.solve(null));
    }
}
