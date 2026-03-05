package org.leetcode.hard;


/**
 * <b>#3624 - Number of Integers With Popcount-Depth Equal to K II</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Divide and Conquer, Binary Indexed Tree, Segment Tree</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array nums.
 *
 *
 * For any positive integer x, define the following sequence:
 *
 *
 * p0 = x
 *
 * pi+1 = popcount(pi) for all i &gt;= 0, where popcount(y) is the number of set bits (1's) in the binary representation of y.
 *
 * This sequence will eventually reach the value 1.
 *
 *
 * The popcount-depth of x is defined as the smallest integer d &gt;= 0 such that pd = 1.
 *
 *
 * For example, if x = 7 (binary representation "111"). Then, the sequence is: 7 → 3 → 2 → 1, so the popcount-depth of 7 is 3.
 *
 *
 * You are also given a 2D integer array queries, where each queries[i] is either:
 *
 *
 * [1, l, r, k] - Determine the number of indices j such that l &lt;= j &lt;= r and the popcount-depth of nums[j] is equal to k.
 *
 * [2, idx, val] - Update nums[idx] to val.
 *
 * Return an integer array answer, where answer[i] is the number of indices for the ith query of type [1, l, r, k].
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [2,4], queries = [[1,0,1,1],[2,1,1],[1,0,1,0]]
 *
 *
 * Output: [2,1]
 *
 *
 * Explanation:
 *
 *
 *
 *
 *
 * 			i
 * 			queries[i]
 * 			nums
 * 			binary(nums)
 * 			popcount-
 *
 * 			depth
 * 			[l, r]
 * 			k
 * 			Valid
 *
 * 			nums[j]
 * 			updated
 *
 * 			nums
 * 			Answer
 *
 *
 *
 *
 *
 *
 * 			0
 * 			[1,0,1,1]
 * 			[2,4]
 * 			[10, 100]
 * 			[1, 1]
 * 			[0, 1]
 * 			1
 * 			[0, 1]
 * 			—
 * 			2
 *
 *
 *
 *
 * 			1
 * 			[2,1,1]
 * 			[2,4]
 * 			[10, 100]
 * 			[1, 1]
 * 			—
 * 			—
 * 			—
 * 			[2,1]
 * 			—
 *
 *
 *
 *
 * 			2
 * 			[1,0,1,0]
 * 			[2,1]
 * 			[10, 1]
 * 			[1, 0]
 * 			[0, 1]
 * 			0
 * 			[1]
 * 			—
 * 			1
 *
 *
 *
 *
 * Thus, the final answer is [2, 1].
 *
 * Example 2:
 *
 * Input: nums = [3,5,6], queries = [[1,0,2,2],[2,1,4],[1,1,2,1],[1,0,1,0]]
 *
 *
 * Output: [3,1,0]
 *
 *
 * Explanation:
 *
 *
 *
 *
 *
 * 			i
 * 			queries[i]
 * 			nums
 * 			binary(nums)
 * 			popcount-
 *
 * 			depth
 * 			[l, r]
 * 			k
 * 			Valid
 *
 * 			nums[j]
 * 			updated
 *
 * 			nums
 * 			Answer
 *
 *
 *
 *
 *
 *
 * 			0
 * 			[1,0,2,2]
 * 			[3, 5, 6]
 * 			[11, 101, 110]
 * 			[2, 2, 2]
 * 			[0, 2]
 * 			2
 * 			[0, 1, 2]
 * 			—
 * 			3
 *
 *
 *
 *
 * 			1
 * 			[2,1,4]
 * 			[3, 5, 6]
 * 			[11, 101, 110]
 * 			[2, 2, 2]
 * 			—
 * 			—
 * 			—
 * 			[3, 4, 6]
 * 			—
 *
 *
 *
 *
 * 			2
 * 			[1,1,2,1]
 * 			[3, 4, 6]
 * 			[11, 100, 110]
 * 			[2, 1, 2]
 * 			[1, 2]
 * 			1
 * 			[1]
 * 			—
 * 			1
 *
 *
 *
 *
 * 			3
 * 			[1,0,1,0]
 * 			[3, 4, 6]
 * 			[11, 100, 110]
 * 			[2, 1, 2]
 * 			[0, 1]
 * 			0
 * 			[]
 * 			—
 * 			0
 *
 *
 *
 *
 * Thus, the final answer is [3, 1, 0].
 *
 * Example 3:
 *
 * Input: nums = [1,2], queries = [[1,0,1,1],[2,0,3],[1,0,0,1],[1,0,0,2]]
 *
 *
 * Output: [1,0,1]
 *
 *
 * Explanation:
 *
 *
 *
 *
 *
 * 			i
 * 			queries[i]
 * 			nums
 * 			binary(nums)
 * 			popcount-
 *
 * 			depth
 * 			[l, r]
 * 			k
 * 			Valid
 *
 * 			nums[j]
 * 			updated
 *
 * 			nums
 * 			Answer
 *
 *
 *
 *
 *
 *
 * 			0
 * 			[1,0,1,1]
 * 			[1, 2]
 * 			[1, 10]
 * 			[0, 1]
 * 			[0, 1]
 * 			1
 * 			[1]
 * 			—
 * 			1
 *
 *
 *
 *
 * 			1
 * 			[2,0,3]
 * 			[1, 2]
 * 			[1, 10]
 * 			[0, 1]
 * 			—
 * 			—
 * 			—
 * 			[3, 2]
 *
 *
 *
 *
 *
 * 			2
 * 			[1,0,0,1]
 * 			[3, 2]
 * 			[11, 10]
 * 			[2, 1]
 * 			[0, 0]
 * 			1
 * 			[]
 * 			—
 * 			0
 *
 *
 *
 *
 * 			3
 * 			[1,0,0,2]
 * 			[3, 2]
 * 			[11, 10]
 * 			[2, 1]
 * 			[0, 0]
 * 			2
 * 			[0]
 * 			—
 * 			1
 *
 *
 *
 *
 * Thus, the final answer is [1, 0, 1].
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n == nums.length &lt;= 105
 *
 * 1 &lt;= nums[i] &lt;= 1015
 *
 * 1 &lt;= queries.length &lt;= 105
 *
 * queries[i].length == 3 or 4
 *
 *
 *
 * queries[i] == [1, l, r, k] or,
 *
 * queries[i] == [2, idx, val]
 *
 * 0 &lt;= l &lt;= r &lt;= n - 1
 *
 * 0 &lt;= k &lt;= 5
 *
 * 0 &lt;= idx &lt;= n - 1
 *
 * 1 &lt;= val &lt;= 1015
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Precompute <code>depth[i]</code> for each <code>nums[i]</code> by applying popcount until you reach 1.
 * Hint 2: Maintain six Fenwick trees <code>fenw[0]</code> through <code>fenw[5]</code>, where <code>fenw[d]</code> stores a 1 at index <code>i</code> iff <code>depth[i] == d</code>.
 * Hint 3: For an update <code>[2, idx, val]</code>, remove index idx from its old <code>fenw[old_depth]</code> and insert into <code>fenw[new_depth]</code>; for a query <code>[1, l, r, k]</code>, return <code>fenw[k].query(r) - fenw[k].query(l-1)</code>.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Divide and Conquer, Binary Indexed Tree, Segment Tree).
 *
 * @see <a href="https://leetcode.com/problems/number-of-integers-with-popcount-depth-equal-to-k-ii/">LeetCode #3624</a>
 */
public class NumberOfIntegersWithPopcountDepthEqualToKIi {

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
        throw new UnsupportedOperationException("Not yet implemented: Number of Integers With Popcount-Depth Equal to K II");
    }

    public static void main(String[] args) {
        System.out.println("=== NumberOfIntegersWithPopcountDepthEqualToKIi ===");
        NumberOfIntegersWithPopcountDepthEqualToKIi sol = new NumberOfIntegersWithPopcountDepthEqualToKIi();
        System.out.println(sol.solve(null));
    }
}
