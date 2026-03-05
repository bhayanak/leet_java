package org.leetcode.hard;


/**
 * <b>#3666 - Minimum Operations to Equalize Binary String</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Math, String, Breadth-First Search, Union-Find, Ordered Set</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a binary string s, and an integer k.
 *
 *
 * In one operation, you must choose exactly k different indices and flip each '0' to '1' and each '1' to '0'.
 *
 *
 * Return the minimum number of operations required to make all characters in the string equal to '1'. If it is not possible, return -1.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s = "110", k = 1
 *
 *
 * Output: 1
 *
 *
 * Explanation:
 *
 *
 * There is one '0' in s.
 *
 * Since k = 1, we can flip it directly in one operation.
 *
 * Example 2:
 *
 * Input: s = "0101", k = 3
 *
 *
 * Output: 2
 *
 *
 * Explanation:
 *
 *
 * One optimal set of operations choosing k = 3 indices in each operation is:
 *
 *
 * Operation 1: Flip indices [0, 1, 3]. s changes from "0101" to "1000".
 *
 * Operation 2: Flip indices [1, 2, 3]. s changes from "1000" to "1111".
 *
 * Thus, the minimum number of operations is 2.
 *
 * Example 3:
 *
 * Input: s = "101", k = 2
 *
 *
 * Output: -1
 *
 *
 * Explanation:
 *
 *
 * Since k = 2 and s has only one '0', it is impossible to flip exactly k indices to make all '1'. Hence, the answer is -1.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= s.length &lt;= 10​​​​​​​5
 *
 * s[i] is either '0' or '1'.
 *
 * 1 &lt;= k &lt;= s.length
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Model state as <code>z</code> = number of zeros; flipping <code>k</code> picks <code>i</code> zeros (<code>i</code> between <code>max(0, k - (n - z))</code> and <code>min(k, z)</code>) and transforms <code>z</code> to <code>z'</code> = <code>z + k - 2 * i</code>, so <code>z'</code> lies in a contiguous range and has parity <code>(z + k) % 2</code>.
 * Hint 2: Build a graph on states <code>0..n</code> and run <code>BFS</code> from initial <code>z</code> to reach <code>0</code>; each edge from <code>z</code> goes to all <code>z'</code> in that computed interval.
 * Hint 3: For speed, keep two ordered sets of unvisited states by parity and erase ranges with <code>lower_bound</code> while <code>BFSing</code> to achieve near <code>O(n log n)</code> time.
 *
 * <h2>Approach</h2>
 * Think about the category (Math, String, Breadth-First Search, Union-Find, Ordered Set).
 *
 * @see <a href="https://leetcode.com/problems/minimum-operations-to-equalize-binary-string/">LeetCode #3666</a>
 */
public class MinimumOperationsToEqualizeBinaryString {

    /**
     * Solves the problem: Minimum operations distinct.
     *
     * @param nums the nums (int[])
     * @return the computed int result
     */
    public int minimumOperationsDistinct(int[] nums) {
        int ops=0;
        while (hasDup(nums)) { nums=java.util.Arrays.copyOfRange(nums,3,nums.length); ops++; }
        return ops;
    }
    private boolean hasDup(int[] nums){java.util.Set<Integer> s=new java.util.HashSet<>();for(int n:nums)if(!s.add(n))return true;return false;}

    public static void main(String[] args) {
        MinimumOperationsToEqualizeBinaryString sol = new MinimumOperationsToEqualizeBinaryString();
        System.out.println(sol.minimumOperationsDistinct(new int[]{1,2,3}));
    }
}
