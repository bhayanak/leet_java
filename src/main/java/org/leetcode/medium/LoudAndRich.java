package org.leetcode.medium;


/**
 * <b>#851 - Loud and Rich</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Depth-First Search, Graph Theory, Topological Sort</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * There is a group of n people labeled from 0 to n - 1 where each person has a different amount of money and a different level of quietness.
 *
 *
 * You are given an array richer where richer[i] = [ai, bi] indicates that ai has more money than bi and an integer array quiet where quiet[i] is the quietness of the ith person. All the given data in richer are logically correct (i.e., the data will not lead you to a situation where x is richer than y and y is richer than x at the same time).
 *
 *
 * Return an integer array answer where answer[x] = y if y is the least quiet person (that is, the person y with the smallest value of quiet[y]) among all people who definitely have equal to or more money than the person x.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: richer = [[1,0],[2,1],[3,1],[3,7],[4,3],[5,3],[6,3]], quiet = [3,2,5,4,6,1,7,0]
 * Output: [5,5,2,5,4,5,6,7]
 * Explanation: 
 * answer[0] = 5.
 * Person 5 has more money than 3, which has more money than 1, which has more money than 0.
 * The only person who is quieter (has lower quiet[x]) is person 7, but it is not clear if they have more money than person 0.
 * answer[7] = 7.
 * Among all people that definitely have equal to or more money than person 7 (which could be persons 3, 4, 5, 6, or 7), the person who is the quietest (has lower quiet[x]) is person 7.
 * The other answers can be filled out with similar reasoning.
 *
 * Example 2:
 *
 * Input: richer = [], quiet = [0]
 * Output: [0]
 *
 *
 *
 * Constraints:
 *
 *
 * n == quiet.length
 *
 * 1 &lt;= n &lt;= 500
 *
 * 0 &lt;= quiet[i] &lt; n
 *
 * All the values of quiet are unique.
 *
 * 0 &lt;= richer.length &lt;= n * (n - 1) / 2
 *
 * 0 &lt;= ai, bi &lt; n
 *
 * ai != bi
 *
 * All the pairs of richer are unique.
 *
 * The observations in richer are all logically consistent.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Depth-First Search, Graph Theory, Topological Sort).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/loud-and-rich/">LeetCode #851</a>
 */
public class LoudAndRich {

    /**
     * TODO: Implement "Loud and Rich".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Loud and Rich");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac LoudAndRich.java &amp;&amp; java org.leetcode.medium.LoudAndRich</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== LoudAndRich ===");
        LoudAndRich sol = new LoudAndRich();
        System.out.println(sol.solve(null));
    }
}
