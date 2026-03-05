package org.leetcode.medium;


/**
 * <b>#3309 - Maximum Possible Number by Binary Concatenation</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Bit Manipulation, Enumeration</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an array of integers nums of size 3.
 *
 *
 * Return the maximum possible number whose binary representation can be formed by concatenating the binary representation of all elements in nums in some order.
 *
 *
 * Note that the binary representation of any number does not contain leading zeros.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,2,3]
 *
 *
 * Output: 30
 *
 *
 * Explanation:
 *
 *
 * Concatenate the numbers in the order [3, 1, 2] to get the result "11110", which is the binary representation of 30.
 *
 * Example 2:
 *
 * Input: nums = [2,8,16]
 *
 *
 * Output: 1296
 *
 *
 * Explanation:
 *
 *
 * Concatenate the numbers in the order [2, 8, 16] to get the result "10100010000", which is the binary representation of 1296.
 *
 *
 *
 * Constraints:
 *
 *
 * nums.length == 3
 *
 * 1 &lt;= nums[i] &lt;= 127
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: How many possible concatenation orders are there?
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Bit Manipulation, Enumeration).
 *
 * @see <a href="https://leetcode.com/problems/maximum-possible-number-by-binary-concatenation/">LeetCode #3309</a>
 */
public class MaximumPossibleNumberByBinaryConcatenation {

    /**
     * Finds the longest Longest subsequence.
     *
     * @param s the s (String)
     * @param k the k (int)
     * @return the computed String result
     */
    public String longestSubsequence(String s, int k) {
        // LCS-like but binary number <= k
        StringBuilder res=new StringBuilder();
        long val=0; int cnt=0;
        for (int i=s.length()-1;i>=0;i--) {
            if (s.charAt(i)=='0') { res.insert(0,'0'); cnt++; }
            else if (cnt<31&&val+(1L<<cnt)<=k) { val+=(1L<<cnt); res.insert(0,'1'); cnt++; }
            else cnt++;
        }
        return res.toString();
    }

    public static void main(String[] args) {
        MaximumPossibleNumberByBinaryConcatenation sol = new MaximumPossibleNumberByBinaryConcatenation();
        System.out.println(sol.longestSubsequence("hello", 0));
    }
}
