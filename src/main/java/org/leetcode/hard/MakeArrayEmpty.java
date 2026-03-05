package org.leetcode.hard;


/**
 * <b>#2659 - Make Array Empty</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Binary Search, Greedy, Binary Indexed Tree, Segment Tree, Sorting, Ordered Set</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array nums containing distinct numbers, and you can perform the following operations until the array is empty:
 *
 *
 * If the first element has the smallest value, remove it
 *
 * Otherwise, put the first element at the end of the array.
 *
 * Return an integer denoting the number of operations it takes to make nums empty.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [3,4,-1]
 * Output: 5
 *
 *
 *
 *
 * 			Operation
 * 			Array
 *
 *
 *
 *
 *
 *
 * 			1
 * 			[4, -1, 3]
 *
 *
 *
 *
 * 			2
 * 			[-1, 3, 4]
 *
 *
 *
 *
 * 			3
 * 			[3, 4]
 *
 *
 *
 *
 * 			4
 * 			[4]
 *
 *
 *
 *
 * 			5
 * 			[]
 *
 *
 *
 *
 * Example 2:
 *
 * Input: nums = [1,2,4,3]
 * Output: 5
 *
 *
 *
 *
 * 			Operation
 * 			Array
 *
 *
 *
 *
 *
 *
 * 			1
 * 			[2, 4, 3]
 *
 *
 *
 *
 * 			2
 * 			[4, 3]
 *
 *
 *
 *
 * 			3
 * 			[3, 4]
 *
 *
 *
 *
 * 			4
 * 			[4]
 *
 *
 *
 *
 * 			5
 * 			[]
 *
 *
 *
 *
 * Example 3:
 *
 * Input: nums = [1,2,3]
 * Output: 3
 *
 *
 *
 *
 * 			Operation
 * 			Array
 *
 *
 *
 *
 *
 *
 * 			1
 * 			[2, 3]
 *
 *
 *
 *
 * 			2
 * 			[3]
 *
 *
 *
 *
 * 			3
 * 			[]
 *
 *
 *
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 105
 *
 * -109 &lt;= nums[i] &lt;= 109
 *
 * All values in nums are distinct.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Understand the order in which the indices are removed from the array.
 * Hint 2: We don’t really need to delete or move the elements, only the array length matters.
 * Hint 3: Upon removing an index, decide how many steps it takes to move to the next one.
 * Hint 4: Use a data structure to speed up the calculation.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Binary Search, Greedy, Binary Indexed Tree, Segment Tree, Sorting, Ordered Set).
 *
 * @see <a href="https://leetcode.com/problems/make-array-empty/">LeetCode #2659</a>
 */
public class MakeArrayEmpty {

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
        throw new UnsupportedOperationException("Not yet implemented: Make Array Empty");
    }

    public static void main(String[] args) {
        System.out.println("=== MakeArrayEmpty ===");
        MakeArrayEmpty sol = new MakeArrayEmpty();
        System.out.println(sol.solve(null));
    }
}
