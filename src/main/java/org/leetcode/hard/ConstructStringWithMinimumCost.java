package org.leetcode.hard;


/**
 * <b>#3213 - Construct String with Minimum Cost</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, String, Dynamic Programming, Suffix Array</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a string target, an array of strings words, and an integer array costs, both arrays of the same length.
 *
 *
 * Imagine an empty string s.
 *
 *
 * You can perform the following operation any number of times (including zero):
 *
 *
 * Choose an index i in the range [0, words.length - 1].
 *
 * Append words[i] to s.
 *
 * The cost of operation is costs[i].
 *
 * Return the minimum cost to make s equal to target. If it's not possible, return -1.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: target = "abcdef", words = ["abdef","abc","d","def","ef"], costs = [100,1,1,10,5]
 *
 *
 * Output: 7
 *
 *
 * Explanation:
 *
 *
 * The minimum cost can be achieved by performing the following operations:
 *
 *
 * Select index 1 and append "abc" to s at a cost of 1, resulting in s = "abc".
 *
 * Select index 2 and append "d" to s at a cost of 1, resulting in s = "abcd".
 *
 * Select index 4 and append "ef" to s at a cost of 5, resulting in s = "abcdef".
 *
 * Example 2:
 *
 * Input: target = "aaaa", words = ["z","zz","zzz"], costs = [1,10,100]
 *
 *
 * Output: -1
 *
 *
 * Explanation:
 *
 *
 * It is impossible to make s equal to target, so we return -1.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= target.length &lt;= 5 * 104
 *
 * 1 &lt;= words.length == costs.length &lt;= 5 * 104
 *
 * 1 &lt;= words[i].length &lt;= target.length
 *
 * The total sum of words[i].length is less than or equal to 5 * 104.
 *
 * target and words[i] consist only of lowercase English letters.
 *
 * 1 &lt;= costs[i] &lt;= 104
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use Dynamic Programming along with Aho-Corasick or Hashing.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, String, Dynamic Programming, Suffix Array).
 *
 * @see <a href="https://leetcode.com/problems/construct-string-with-minimum-cost/">LeetCode #3213</a>
 */
public class ConstructStringWithMinimumCost {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Construct String with Minimum Cost");
    }

    public static void main(String[] args) {
        System.out.println("=== ConstructStringWithMinimumCost ===");
        ConstructStringWithMinimumCost sol = new ConstructStringWithMinimumCost();
        System.out.println(sol.solve(null));
    }
}
