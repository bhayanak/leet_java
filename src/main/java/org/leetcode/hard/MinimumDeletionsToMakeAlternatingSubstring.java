package org.leetcode.hard;


/**
 * <b>#3777 - Minimum Deletions to Make Alternating Substring</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> String, Segment Tree</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a string s of length n consisting only of the characters 'A' and 'B'.
 *
 *
 * You are also given a 2D integer array queries of length q, where each queries[i] is one of the following:
 *
 *
 * [1, j]: Flip the character at index j of s i.e. 'A' changes to 'B' (and vice versa). This operation mutates s and affects subsequent queries.
 *
 * [2, l, r]: Compute the minimum number of character deletions required to make the substring s[l..r] alternating. This operation does not modify s; the length of s remains n.
 *
 * A substring is alternating if no two adjacent characters are equal. A substring of length 1 is always alternating.
 *
 *
 * Return an integer array answer, where answer[i] is the result of the ith query of type [2, l, r].
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s = "ABA", queries = [[2,1,2],[1,1],[2,0,2]]
 *
 *
 * Output: [0,2]
 *
 *
 * Explanation:
 *
 *
 *
 *
 *
 * 			i
 * 			queries[i]
 * 			j
 * 			l
 * 			r
 * 			s before query
 * 			s[l..r]
 * 			Result
 * 			Answer
 *
 *
 *
 *
 *
 *
 * 			0
 * 			[2, 1, 2]
 * 			-
 * 			1
 * 			2
 * 			"ABA"
 * 			"BA"
 * 			Already alternating
 * 			0
 *
 *
 *
 *
 * 			1
 * 			[1, 1]
 * 			1
 * 			-
 * 			-
 * 			"ABA"
 * 			-
 * 			Flip s[1] from 'B' to 'A'
 * 			-
 *
 *
 *
 *
 * 			2
 * 			[2, 0, 2]
 * 			-
 * 			0
 * 			2
 * 			"AAA"
 * 			"AAA"
 * 			Delete any two 'A's to get "A"
 * 			2
 *
 *
 *
 *
 * Thus, the answer is [0, 2].
 *
 * Example 2:
 *
 * Input: s = "ABB", queries = [[2,0,2],[1,2],[2,0,2]]
 *
 *
 * Output: [1,0]
 *
 *
 * Explanation:
 *
 *
 *
 *
 *
 * 			i
 * 			queries[i]
 * 			j
 * 			l
 * 			r
 * 			s before query
 * 			s[l..r]
 * 			Result
 * 			Answer
 *
 *
 *
 *
 *
 *
 * 			0
 * 			[2, 0, 2]
 * 			-
 * 			0
 * 			2
 * 			"ABB"
 * 			"ABB"
 * 			Delete one 'B' to get "AB"
 * 			1
 *
 *
 *
 *
 * 			1
 * 			[1, 2]
 * 			2
 * 			-
 * 			-
 * 			"ABB"
 * 			-
 * 			Flip s[2] from 'B' to 'A'
 * 			-
 *
 *
 *
 *
 * 			2
 * 			[2, 0, 2]
 * 			-
 * 			0
 * 			2
 * 			"ABA"
 * 			"ABA"
 * 			Already alternating
 * 			0
 *
 *
 *
 *
 * Thus, the answer is [1, 0].
 *
 * Example 3:
 *
 * Input: s = "BABA", queries = [[2,0,3],[1,1],[2,1,3]]
 *
 *
 * Output: [0,1]
 *
 *
 * Explanation:
 *
 *
 *
 *
 *
 * 			i
 * 			queries[i]
 * 			j
 * 			l
 * 			r
 * 			s before query
 * 			s[l..r]
 * 			Result
 * 			Answer
 *
 *
 *
 *
 *
 *
 * 			0
 * 			[2, 0, 3]
 * 			-
 * 			0
 * 			3
 * 			"BABA"
 * 			"BABA"
 * 			Already alternating
 * 			0
 *
 *
 *
 *
 * 			1
 * 			[1, 1]
 * 			1
 * 			-
 * 			-
 * 			"BABA"
 * 			-
 * 			Flip s[1] from 'A' to 'B'
 * 			-
 *
 *
 *
 *
 * 			2
 * 			[2, 1, 3]
 * 			-
 * 			1
 * 			3
 * 			"BBBA"
 * 			"BBA"
 * 			Delete one 'B' to get "BA"
 * 			1
 *
 *
 *
 *
 * Thus, the answer is [0, 1].
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n == s.length &lt;= 105
 *
 * s[i] is either 'A' or 'B'.
 *
 * 1 &lt;= q == queries.length &lt;= 105
 *
 * queries[i].length == 2 or 3
 *
 *
 *
 * queries[i] == [1, j] or,
 *
 * queries[i] == [2, l, r]
 *
 * 0 &lt;= j &lt;= n - 1
 *
 * 0 &lt;= l &lt;= r &lt;= n - 1
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use a Fenwick tree (BIT) over an auxiliary array <code>eq</code>.
 * Hint 2: Define <code>eq[i] = 1</code> if <code>i &gt;= 1</code> and <code>s[i] == s[i - 1]</code>, otherwise <code>eq[i] = 0</code>.
 * Hint 3: For a type-2 query <code>[2, l, r]</code> the answer is <code>sum(eq[l+1..r])</code> (count of equal adjacent pairs in the substring).
 * Hint 4: For a flip <code>[1, j]</code>, recompute and update <code>eq[j]</code> and <code>eq[j + 1]</code>; each flip changes at most two <code>eq</code> values.
 *
 * <h2>Approach</h2>
 * Think about the category (String, Segment Tree).
 *
 * @see <a href="https://leetcode.com/problems/minimum-deletions-to-make-alternating-substring/">LeetCode #3777</a>
 */
public class MinimumDeletionsToMakeAlternatingSubstring {

    public static class TreeNode {
        int val; TreeNode left, right;
        TreeNode(int v) { val = v; }
    }
    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Minimum Deletions to Make Alternating Substring");
    }

    public static void main(String[] args) {
        System.out.println("=== MinimumDeletionsToMakeAlternatingSubstring ===");
        MinimumDeletionsToMakeAlternatingSubstring sol = new MinimumDeletionsToMakeAlternatingSubstring();
        System.out.println(sol.solve(null));
    }
}
