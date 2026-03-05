package org.leetcode.hard;


/**
 * <b>#3003 - Maximize the Number of Partitions After Operations</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> String, Dynamic Programming, Bit Manipulation, Bitmask</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a string s and an integer k.
 *
 *
 * First, you are allowed to change at most one index in s to another lowercase English letter.
 *
 *
 * After that, do the following partitioning operation until s is empty:
 *
 *
 * Choose the longest prefix of s containing at most k distinct characters.
 *
 * Delete the prefix from s and increase the number of partitions by one. The remaining characters (if any) in s maintain their initial order.
 *
 * Return an integer denoting the maximum number of resulting partitions after the operations by optimally choosing at most one index to change.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s = "accca", k = 2
 *
 *
 * Output: 3
 *
 *
 * Explanation:
 *
 *
 * The optimal way is to change s[2] to something other than a and c, for example, b. then it becomes "acbca".
 *
 *
 * Then we perform the operations:
 *
 *
 * The longest prefix containing at most 2 distinct characters is "ac", we remove it and s becomes "bca".
 *
 * Now The longest prefix containing at most 2 distinct characters is "bc", so we remove it and s becomes "a".
 *
 * Finally, we remove "a" and s becomes empty, so the procedure ends.
 *
 * Doing the operations, the string is divided into 3 partitions, so the answer is 3.
 *
 * Example 2:
 *
 * Input: s = "aabaab", k = 3
 *
 *
 * Output: 1
 *
 *
 * Explanation:
 *
 *
 * Initially s contains 2 distinct characters, so whichever character we change, it will contain at most 3 distinct characters, so the longest prefix with at most 3 distinct characters would always be all of it, therefore the answer is 1.
 *
 * Example 3:
 *
 * Input: s = "xxyz", k = 1
 *
 *
 * Output: 4
 *
 *
 * Explanation:
 *
 *
 * The optimal way is to change s[0] or s[1] to something other than characters in s, for example, to change s[0] to w.
 *
 *
 * Then s becomes "wxyz", which consists of 4 distinct characters, so as k is 1, it will divide into 4 partitions.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= s.length &lt;= 104
 *
 * s consists only of lowercase English letters.
 *
 * 1 &lt;= k &lt;= 26
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: For each position, try to brute-force the replacements.
 * Hint 2: To speed up the brute-force solution, we can precompute the following (without changing any index) using prefix sums and binary search:<ul>
<li><code>pref[i]</code>: The number of resulting partitions from the operations by performing the operations on <code>s[0:i]</code>.</li>
<li><code>suff[i]</code>: The number of resulting partitions from the operations by performing the operations on <code>s[i:n - 1]</code>, where <code>n == s.length</code>.</li>
<li><code>partition_start[i]</code>: The start index of the partition containing the <code>i<sup>th</sup></code> index after performing the operations.</li>
</ul>
 * Hint 3: Now, for a position <code>i</code>, we can try all possible <code>25</code> replacements:<br />
For a replacement, using prefix sums and binary search, we need to find the rightmost index, <code>r</code>, such that the number of distinct characters in the range <code>[partition_start[i], r]</code> is at most <code>k</code>.<br />
There are <code>2</code> cases:<ul>
<li><code>r >= i</code>: the number of resulting partitions in this case is <code>1 + pref[partition_start[i] - 1] + suff[r + 1]</code>.</li>
<li>Otherwise, we need to find the rightmost index <code>r<sub>2</sub></code> such that the number of distinct characters in the range <code>[r:r<sub>2</sub>]</code> is at most <code>k</code>. The answer in this case is <code>2 + pref[partition_start[i] - 1] + suff[r<sub>2</sub> + 1]</code></li>
</ul>
 * Hint 4: The answer is the maximum among all replacements.
 *
 * <h2>Approach</h2>
 * Think about the category (String, Dynamic Programming, Bit Manipulation, Bitmask).
 *
 * @see <a href="https://leetcode.com/problems/maximize-the-number-of-partitions-after-operations/">LeetCode #3003</a>
 */
public class MaximizeTheNumberOfPartitionsAfterOperations {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Maximize the Number of Partitions After Operations");
    }

    public static void main(String[] args) {
        System.out.println("=== MaximizeTheNumberOfPartitionsAfterOperations ===");
        MaximizeTheNumberOfPartitionsAfterOperations sol = new MaximizeTheNumberOfPartitionsAfterOperations();
        System.out.println(sol.solve(null));
    }
}
