package org.leetcode.hard;


/**
 * <b>#3700 - Number of ZigZag Arrays II</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Math, Dynamic Programming</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given three integers n, l, and r.
 *
 *
 * A ZigZag array of length n is defined as follows:
 *
 *
 * Each element lies in the range [l, r].
 *
 * No two adjacent elements are equal.
 *
 * No three consecutive elements form a strictly increasing or strictly decreasing sequence.
 *
 * Return the total number of valid ZigZag arrays.
 *
 *
 * Since the answer may be large, return it modulo 109 + 7.
 *
 *
 * A sequence is said to be strictly increasing if each element is strictly greater than its previous one (if exists).
 *
 *
 * A sequence is said to be strictly decreasing if each element is strictly smaller than its previous one (if exists).
 *
 *
 *
 *
 * Example 1:
 *
 * Input: n = 3, l = 4, r = 5
 *
 *
 * Output: 2
 *
 *
 * Explanation:
 *
 *
 * There are only 2 valid ZigZag arrays of length n = 3 using values in the range [4, 5]:
 *
 *
 * [4, 5, 4]
 *
 * [5, 4, 5]
 *
 * Example 2:
 *
 * Input: n = 3, l = 1, r = 3
 *
 *
 * Output: 10
 *
 *
 * Explanation:
 *
 *
 * ​​​​​​​There are 10 valid ZigZag arrays of length n = 3 using values in the range [1, 3]:
 *
 *
 * [1, 2, 1], [1, 3, 1], [1, 3, 2]
 *
 * [2, 1, 2], [2, 1, 3], [2, 3, 1], [2, 3, 2]
 *
 * [3, 1, 2], [3, 1, 3], [3, 2, 3]
 *
 * All arrays meet the ZigZag conditions.
 *
 *
 *
 * Constraints:
 *
 *
 * 3 &lt;= n &lt;= 109
 *
 * 1 &lt;= l &lt; r &lt;= 75​​​​​​​
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use matrix exponentiation
 * Hint 2: Encode states in a vector of length <code>2*m</code> where <code>m = r - l + 1</code>: first <code>m</code> entries = "next compare = down" for values, next <code>m</code> = "next compare = up".
 * Hint 3: Build a transition matrix <code>T</code> (size <code>2*m × 2*m</code>): from an <code>up,x</code> state go to <code>down,y</code> for every <code>y &gt; x</code>, and from <code>down,x</code> go to <code>up,y</code> for every <code>y &lt; x</code>.
 * Hint 4: Use fast matrix exponentiation to compute <code>T^(n-1)</code>, apply it to the initial vector (ones in the block for starting <code>up</code> and separately for starting <code>down</code>), sum final entries, and add both results (for <code>n=1</code> return <code>m</code>).
 *
 * <h2>Approach</h2>
 * Think about the category (Math, Dynamic Programming).
 *
 * @see <a href="https://leetcode.com/problems/number-of-zigzag-arrays-ii/">LeetCode #3700</a>
 */
public class NumberOfZigzagArraysIi {

    /**
     * Solves the problem: Minimum swaps.
     *
     * @param nums the nums (int[])
     * @return the computed int result
     */
    public int minimumSwaps(int[] nums) {
        int zeros=0, n=nums.length;
        for (int v:nums) if (v==0) zeros++;
        // Count 1s in first window of size zeros
        int ones=0; for (int i=0;i<zeros;i++) if (nums[i]==1) ones++;
        int minOnes=ones;
        for (int i=zeros;i<n;i++) {
            if (nums[i]==1) ones++;
            if (nums[i-zeros]==1) ones--;
            minOnes=Math.min(minOnes,ones);
        }
        return minOnes;
    }

    public static void main(String[] args) {
        NumberOfZigzagArraysIi sol = new NumberOfZigzagArraysIi();
        System.out.println(sol.minimumSwaps(new int[]{1,2,3}));
    }
}
