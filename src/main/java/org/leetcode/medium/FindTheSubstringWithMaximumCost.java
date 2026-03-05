package org.leetcode.medium;


/**
 * <b>#2606 - Find the Substring With Maximum Cost</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Hash Table, String, Dynamic Programming</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a string s, a string chars of distinct characters and an integer array vals of the same length as chars.
 *
 *
 * The cost of the substring is the sum of the values of each character in the substring. The cost of an empty string is considered 0.
 *
 *
 * The value of the character is defined in the following way:
 *
 *
 * If the character is not in the string chars, then its value is its corresponding position (1-indexed) in the alphabet.
 *
 *
 *
 *
 * For example, the value of 'a' is 1, the value of 'b' is 2, and so on. The value of 'z' is 26.
 *
 *
 *
 * Otherwise, assuming i is the index where the character occurs in the string chars, then its value is vals[i].
 *
 * Return the maximum cost among all substrings of the string s.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s = "adaa", chars = "d", vals = [-1000]
 * Output: 2
 * Explanation: The value of the characters "a" and "d" is 1 and -1000 respectively.
 * The substring with the maximum cost is "aa" and its cost is 1 + 1 = 2.
 * It can be proven that 2 is the maximum cost.
 *
 * Example 2:
 *
 * Input: s = "abc", chars = "abc", vals = [-1,-1,-1]
 * Output: 0
 * Explanation: The value of the characters "a", "b" and "c" is -1, -1, and -1 respectively.
 * The substring with the maximum cost is the empty substring "" and its cost is 0.
 * It can be proven that 0 is the maximum cost.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= s.length &lt;= 105
 *
 * s consist of lowercase English letters.
 *
 * 1 &lt;= chars.length &lt;= 26
 *
 * chars consist of distinct lowercase English letters.
 *
 * vals.length == chars.length
 *
 * -1000 &lt;= vals[i] &lt;= 1000
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Create a new integer array where arr[i] denotes the value of character s[i].
 * Hint 2: We can use Kadane’s maximum subarray sum algorithm to find the maximum cost.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, String, Dynamic Programming).
 *
 * @see <a href="https://leetcode.com/problems/find-the-substring-with-maximum-cost/">LeetCode #2606</a>
 */
public class FindTheSubstringWithMaximumCost {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Find the Substring With Maximum Cost");
    }

    public static void main(String[] args) {
        System.out.println("=== FindTheSubstringWithMaximumCost ===");
        FindTheSubstringWithMaximumCost sol = new FindTheSubstringWithMaximumCost();
        System.out.println(sol.solve(null));
    }
}
