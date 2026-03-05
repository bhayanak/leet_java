package org.leetcode.medium;


/**
 * <b>#2976 - Minimum Cost to Convert String I</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, String, Graph Theory, Shortest Path</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given two 0-indexed strings source and target, both of length n and consisting of lowercase English letters. You are also given two 0-indexed character arrays original and changed, and an integer array cost, where cost[i] represents the cost of changing the character original[i] to the character changed[i].
 *
 *
 * You start with the string source. In one operation, you can pick a character x from the string and change it to the character y at a cost of z if there exists any index j such that cost[j] == z, original[j] == x, and changed[j] == y.
 *
 *
 * Return the minimum cost to convert the string source to the string target using any number of operations. If it is impossible to convert source to target, return -1.
 *
 *
 * Note that there may exist indices i, j such that original[j] == original[i] and changed[j] == changed[i].
 *
 *
 *
 *
 * Example 1:
 *
 * Input: source = "abcd", target = "acbe", original = ["a","b","c","c","e","d"], changed = ["b","c","b","e","b","e"], cost = [2,5,5,1,2,20]
 * Output: 28
 * Explanation: To convert the string "abcd" to string "acbe":
 * - Change value at index 1 from 'b' to 'c' at a cost of 5.
 * - Change value at index 2 from 'c' to 'e' at a cost of 1.
 * - Change value at index 2 from 'e' to 'b' at a cost of 2.
 * - Change value at index 3 from 'd' to 'e' at a cost of 20.
 * The total cost incurred is 5 + 1 + 2 + 20 = 28.
 * It can be shown that this is the minimum possible cost.
 *
 * Example 2:
 *
 * Input: source = "aaaa", target = "bbbb", original = ["a","c"], changed = ["c","b"], cost = [1,2]
 * Output: 12
 * Explanation: To change the character 'a' to 'b' change the character 'a' to 'c' at a cost of 1, followed by changing the character 'c' to 'b' at a cost of 2, for a total cost of 1 + 2 = 3. To change all occurrences of 'a' to 'b', a total cost of 3 * 4 = 12 is incurred.
 *
 * Example 3:
 *
 * Input: source = "abcd", target = "abce", original = ["a"], changed = ["e"], cost = [10000]
 * Output: -1
 * Explanation: It is impossible to convert source to target because the value at index 3 cannot be changed from 'd' to 'e'.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= source.length == target.length &lt;= 105
 *
 * source, target consist of lowercase English letters.
 *
 * 1 &lt;= cost.length == original.length == changed.length &lt;= 2000
 *
 * original[i], changed[i] are lowercase English letters.
 *
 * 1 &lt;= cost[i] &lt;= 106
 *
 * original[i] != changed[i]
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Construct a graph with each letter as a node, and construct an edge <code>(a, b)</code> with weight <code>c</code> if we can change from character <code>a</code> to letter <code>b</code> with cost <code>c</code>. (Keep the one with the smallest cost in case there are multiple edges between <code>a</code> and <code>b</code>).
 * Hint 2: Calculate the shortest path for each pair of characters <code>(source[i], target[i])</code>. The sum of cost over all <code>i</code> in the range <code>[0, source.length - 1]</code>. If there is no path between <code>source[i]</code> and <code>target[i]</code>, the answer is <code>-1</code>.
 * Hint 3: Any shortest path algorithms will work since we only have <code>26</code> nodes. Since we only have at most <code>26 * 26</code> pairs, we can save the result to avoid re-calculation.
 * Hint 4: We can also use Floyd Warshall's algorithm to precompute all the results.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, String, Graph Theory, Shortest Path).
 *
 * @see <a href="https://leetcode.com/problems/minimum-cost-to-convert-string-i/">LeetCode #2976</a>
 */
public class MinimumCostToConvertStringI {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Minimum Cost to Convert String I");
    }

    public static void main(String[] args) {
        System.out.println("=== MinimumCostToConvertStringI ===");
        MinimumCostToConvertStringI sol = new MinimumCostToConvertStringI();
        System.out.println(sol.solve(null));
    }
}
