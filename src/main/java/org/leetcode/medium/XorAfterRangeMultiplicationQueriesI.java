package org.leetcode.medium;


/**
 * <b>#3653 - XOR After Range Multiplication Queries I</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Divide and Conquer, Simulation</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array nums of length n and a 2D integer array queries of size q, where queries[i] = [li, ri, ki, vi].
 *
 *
 * For each query, you must apply the following operations in order:
 *
 *
 * Set idx = li.
 *
 * While idx &lt;= ri:
 *
 *
 *
 * Update: nums[idx] = (nums[idx] * vi) % (109 + 7)
 *
 * Set idx += ki.
 *
 *
 *
 * Return the bitwise XOR of all elements in nums after processing all queries.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,1,1], queries = [[0,2,1,4]]
 *
 *
 * Output: 4
 *
 *
 * Explanation:
 *
 *
 * A single query [0, 2, 1, 4] multiplies every element from index 0 through index 2 by 4.
 *
 * The array changes from [1, 1, 1] to [4, 4, 4].
 *
 * The XOR of all elements is 4 ^ 4 ^ 4 = 4.
 *
 * Example 2:
 *
 * Input: nums = [2,3,1,5,4], queries = [[1,4,2,3],[0,2,1,2]]
 *
 *
 * Output: 31
 *
 *
 * Explanation:
 *
 *
 * The first query [1, 4, 2, 3] multiplies the elements at indices 1 and 3 by 3, transforming the array to [2, 9, 1, 15, 4].
 *
 * The second query [0, 2, 1, 2] multiplies the elements at indices 0, 1, and 2 by 2, resulting in [4, 18, 2, 15, 4].
 *
 * Finally, the XOR of all elements is 4 ^ 18 ^ 2 ^ 15 ^ 4 = 31.​​​​​​​​​​​​​​
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n == nums.length &lt;= 103
 *
 * 1 &lt;= nums[i] &lt;= 109
 *
 * 1 &lt;= q == queries.length &lt;= 103
 *
 * queries[i] = [li, ri, ki, vi]
 *
 * 0 &lt;= li &lt;= ri &lt; n
 *
 * 1 &lt;= ki &lt;= n
 *
 * 1 &lt;= vi &lt;= 105
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use bruteforce
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Divide and Conquer, Simulation).
 *
 * @see <a href="https://leetcode.com/problems/xor-after-range-multiplication-queries-i/">LeetCode #3653</a>
 */
public class XorAfterRangeMultiplicationQueriesI {

    /**
     * Returns true if Is circular sentence.
     *
     * @param sentence the sentence (String)
     * @return the computed boolean result
     */
    public boolean isCircularSentence(String sentence) {
        String[] words=sentence.split(" ");
        for (int i=0;i<words.length;i++) {
            String cur=words[i], next=words[(i+1)%words.length];
            if (cur.charAt(cur.length()-1)!=next.charAt(0)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        XorAfterRangeMultiplicationQueriesI sol = new XorAfterRangeMultiplicationQueriesI();
        System.out.println(sol.isCircularSentence("hello"));
    }
}
