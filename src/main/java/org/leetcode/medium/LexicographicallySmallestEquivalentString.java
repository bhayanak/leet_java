package org.leetcode.medium;


/**
 * <b>#1061 - Lexicographically Smallest Equivalent String</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> String, Union-Find</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given two strings of the same length s1 and s2 and a string baseStr.
 *
 *
 * We say s1[i] and s2[i] are equivalent characters.
 *
 *
 * For example, if s1 = "abc" and s2 = "cde", then we have 'a' == 'c', 'b' == 'd', and 'c' == 'e'.
 *
 * Equivalent characters follow the usual rules of any equivalence relation:
 *
 *
 * Reflexivity: 'a' == 'a'.
 *
 * Symmetry: 'a' == 'b' implies 'b' == 'a'.
 *
 * Transitivity: 'a' == 'b' and 'b' == 'c' implies 'a' == 'c'.
 *
 * For example, given the equivalency information from s1 = "abc" and s2 = "cde", "acd" and "aab" are equivalent strings of baseStr = "eed", and "aab" is the lexicographically smallest equivalent string of baseStr.
 *
 *
 * Return the lexicographically smallest equivalent string of baseStr by using the equivalency information from s1 and s2.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s1 = "parker", s2 = "morris", baseStr = "parser"
 * Output: "makkek"
 * Explanation: Based on the equivalency information in s1 and s2, we can group their characters as [m,p], [a,o], [k,r,s], [e,i].
 * The characters in each group are equivalent and sorted in lexicographical order.
 * So the answer is "makkek".
 *
 * Example 2:
 *
 * Input: s1 = "hello", s2 = "world", baseStr = "hold"
 * Output: "hdld"
 * Explanation: Based on the equivalency information in s1 and s2, we can group their characters as [h,w], [d,e,o], [l,r].
 * So only the second letter 'o' in baseStr is changed to 'd', the answer is "hdld".
 *
 * Example 3:
 *
 * Input: s1 = "leetcode", s2 = "programs", baseStr = "sourcecode"
 * Output: "aauaaaaada"
 * Explanation: We group the equivalent characters in s1 and s2 as [a,o,e,r,s,c], [l,p], [g,t] and [d,m], thus all letters in baseStr except 'u' and 'd' are transformed to 'a', the answer is "aauaaaaada".
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= s1.length, s2.length, baseStr &lt;= 1000
 *
 * s1.length == s2.length
 *
 * s1, s2, and baseStr consist of lowercase English letters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Model these equalities as edges of a graph.
 * Hint 2: Group each connected component of the graph and assign each node of this component to the node with the lowest lexicographically character.
 * Hint 3: Finally convert the string with the precalculated information.
 *
 * <h2>Approach</h2>
 * Think about the category (String, Union-Find).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/lexicographically-smallest-equivalent-string/">LeetCode #1061</a>
 */
public class LexicographicallySmallestEquivalentString {

    /**
     * TODO: Implement "Lexicographically Smallest Equivalent String".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Lexicographically Smallest Equivalent String");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac LexicographicallySmallestEquivalentString.java &amp;&amp; java org.leetcode.medium.LexicographicallySmallestEquivalentString</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== LexicographicallySmallestEquivalentString ===");
        LexicographicallySmallestEquivalentString sol = new LexicographicallySmallestEquivalentString();
        System.out.println(sol.solve(null));
    }
}
