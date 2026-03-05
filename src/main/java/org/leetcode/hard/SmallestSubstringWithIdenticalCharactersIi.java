package org.leetcode.hard;


/**
 * <b>#3399 - Smallest Substring With Identical Characters II</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> String, Binary Search</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a binary string s of length n and an integer numOps.
 *
 *
 * You are allowed to perform the following operation on s at most numOps times:
 *
 *
 * Select any index i (where 0 &lt;= i &lt; n) and flip s[i]. If s[i] == '1', change s[i] to '0' and vice versa.
 *
 * You need to minimize the length of the longest substring of s such that all the characters in the substring are identical.
 *
 *
 * Return the minimum length after the operations.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s = "000001", numOps = 1
 *
 *
 * Output: 2
 *
 *
 * Explanation: 
 *
 *
 * By changing s[2] to '1', s becomes "001001". The longest substrings with identical characters are s[0..1] and s[3..4].
 *
 * Example 2:
 *
 * Input: s = "0000", numOps = 2
 *
 *
 * Output: 1
 *
 *
 * Explanation: 
 *
 *
 * By changing s[0] and s[2] to '1', s becomes "1010".
 *
 * Example 3:
 *
 * Input: s = "0101", numOps = 0
 *
 *
 * Output: 1
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n == s.length &lt;= 105
 *
 * s consists only of '0' and '1'.
 *
 * 0 &lt;= numOps &lt;= n
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Binary search for the answer.
 * Hint 2: Group the same digits by size of <code>(mid + 1)</code> and ignore any remainder. Flip one in each group (the last one).
 * Hint 3: For the last group, we can flip the 2nd last one.
 * Hint 4: What if the answer was 1?
 *
 * <h2>Approach</h2>
 * Think about the category (String, Binary Search).
 *
 * @see <a href="https://leetcode.com/problems/smallest-substring-with-identical-characters-ii/">LeetCode #3399</a>
 */
public class SmallestSubstringWithIdenticalCharactersIi {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Smallest Substring With Identical Characters II");
    }

    public static void main(String[] args) {
        System.out.println("=== SmallestSubstringWithIdenticalCharactersIi ===");
        SmallestSubstringWithIdenticalCharactersIi sol = new SmallestSubstringWithIdenticalCharactersIi();
        System.out.println(sol.solve(null));
    }
}
