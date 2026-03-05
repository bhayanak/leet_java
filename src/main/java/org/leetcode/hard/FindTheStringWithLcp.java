package org.leetcode.hard;


/**
 * <b>#2573 - Find the String with LCP</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, String, Dynamic Programming, Greedy, Union-Find, Matrix</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * We define the lcp matrix of any 0-indexed string word of n lowercase English letters as an n x n grid such that:
 *
 *
 * lcp[i][j] is equal to the length of the longest common prefix between the substrings word[i,n-1] and word[j,n-1].
 *
 * Given an n x n matrix lcp, return the alphabetically smallest string word that corresponds to lcp. If there is no such string, return an empty string.
 *
 *
 * A string a is lexicographically smaller than a string b (of the same length) if in the first position where a and b differ, string a has a letter that appears earlier in the alphabet than the corresponding letter in b. For example, "aabd" is lexicographically smaller than "aaca" because the first position they differ is at the third letter, and 'b' comes before 'c'.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: lcp = [[4,0,2,0],[0,3,0,1],[2,0,2,0],[0,1,0,1]]
 * Output: "abab"
 * Explanation: lcp corresponds to any 4 letter string with two alternating letters. The lexicographically smallest of them is "abab".
 *
 * Example 2:
 *
 * Input: lcp = [[4,3,2,1],[3,3,2,1],[2,2,2,1],[1,1,1,1]]
 * Output: "aaaa"
 * Explanation: lcp corresponds to any 4 letter string with a single distinct letter. The lexicographically smallest of them is "aaaa". 
 *
 * Example 3:
 *
 * Input: lcp = [[4,3,2,1],[3,3,2,1],[2,2,2,1],[1,1,1,3]]
 * Output: ""
 * Explanation: lcp[3][3] cannot be equal to 3 since word[3,...,3] consists of only a single letter; Thus, no answer exists.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n == lcp.length == lcp[i].length &lt;= 1000
 *
 * 0 &lt;= lcp[i][j] &lt;= n
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use the LCP array to determine which groups of elements must be equal.
 * Hint 2: Match the smallest letter to the group that contains the smallest unassigned index.
 * Hint 3: Build the LCP matrix of the resulting string then check if it is equal to the target LCP.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, String, Dynamic Programming, Greedy, Union-Find, Matrix).
 *
 * @see <a href="https://leetcode.com/problems/find-the-string-with-lcp/">LeetCode #2573</a>
 */
public class FindTheStringWithLcp {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Find the String with LCP");
    }

    public static void main(String[] args) {
        System.out.println("=== FindTheStringWithLcp ===");
        FindTheStringWithLcp sol = new FindTheStringWithLcp();
        System.out.println(sol.solve(null));
    }
}
