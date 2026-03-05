package org.leetcode.medium;


/**
 * <b>#1177 - Can Make Palindrome from Substring</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Hash Table, String, Bit Manipulation, Prefix Sum</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a string s and array queries where queries[i] = [lefti, righti, ki]. We may rearrange the substring s[lefti...righti] for each query and then choose up to ki of them to replace with any lowercase English letter.
 *
 *
 * If the substring is possible to be a palindrome string after the operations above, the result of the query is true. Otherwise, the result is false.
 *
 *
 * Return a boolean array answer where answer[i] is the result of the ith query queries[i].
 *
 *
 * Note that each letter is counted individually for replacement, so if, for example s[lefti...righti] = "aaa", and ki = 2, we can only replace two of the letters. Also, note that no query modifies the initial string s.
 *
 *
 *
 *
 * Example :
 *
 * Input: s = "abcda", queries = [[3,3,0],[1,2,0],[0,3,1],[0,3,2],[0,4,1]]
 * Output: [true,false,false,true,true]
 * Explanation:
 * queries[0]: substring = "d", is palidrome.
 * queries[1]: substring = "bc", is not palidrome.
 * queries[2]: substring = "abcd", is not palidrome after replacing only 1 character.
 * queries[3]: substring = "abcd", could be changed to "abba" which is palidrome. Also this can be changed to "baab" first rearrange it "bacd" then replace "cd" with "ab".
 * queries[4]: substring = "abcda", could be changed to "abcba" which is palidrome.
 *
 * Example 2:
 *
 * Input: s = "lyb", queries = [[0,1,0],[2,2,1]]
 * Output: [false,true]
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= s.length, queries.length &lt;= 105
 *
 * 0 &lt;= lefti &lt;= righti &lt; s.length
 *
 * 0 &lt;= ki &lt;= s.length
 *
 * s consists of lowercase English letters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Since we can rearrange the substring, all we care about is the frequency of each character in that substring.
 * Hint 2: How to find the character frequencies efficiently ?
 * Hint 3: As a preprocess, calculate the accumulate frequency of all characters for all prefixes of the string.
 * Hint 4: How to check if a substring can be changed to a palindrome given its characters frequency ?
 * Hint 5: Count the number of odd frequencies, there can be at most one odd frequency in a palindrome.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, String, Bit Manipulation, Prefix Sum).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/can-make-palindrome-from-substring/">LeetCode #1177</a>
 */
public class CanMakePalindromeFromSubstring {

    /**
     * TODO: Implement "Can Make Palindrome from Substring".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Can Make Palindrome from Substring");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac CanMakePalindromeFromSubstring.java &amp;&amp; java org.leetcode.medium.CanMakePalindromeFromSubstring</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== CanMakePalindromeFromSubstring ===");
        CanMakePalindromeFromSubstring sol = new CanMakePalindromeFromSubstring();
        System.out.println(sol.solve(null));
    }
}
