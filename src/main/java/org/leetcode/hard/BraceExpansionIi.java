package org.leetcode.hard;


/**
 * <b>#1096 - Brace Expansion II</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Hash Table, String, Backtracking, Stack, Breadth-First Search, Sorting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Under the grammar given below, strings can represent a set of lowercase words. Let R(expr) denote the set of words the expression represents.
 *
 *
 * The grammar can best be understood through simple examples:
 *
 *
 * Single letters represent a singleton set containing that word.
 *
 *
 *
 * R("a") = {"a"}
 *
 * R("w") = {"w"}
 *
 *
 *
 * When we take a comma-delimited list of two or more expressions, we take the union of possibilities.
 *
 *
 *
 * R("{a,b,c}") = {"a","b","c"}
 *
 * R("{{a,b},{b,c}}") = {"a","b","c"} (notice the final set only contains each word at most once)
 *
 *
 *
 * When we concatenate two expressions, we take the set of possible concatenations between two words where the first word comes from the first expression and the second word comes from the second expression.
 *
 *
 *
 * R("{a,b}{c,d}") = {"ac","ad","bc","bd"}
 *
 * R("a{b,c}{d,e}f{g,h}") = {"abdfg", "abdfh", "abefg", "abefh", "acdfg", "acdfh", "acefg", "acefh"}
 *
 *
 *
 * Formally, the three rules for our grammar:
 *
 *
 * For every lowercase letter x, we have R(x) = {x}.
 *
 * For expressions e1, e2, ... , ek with k &gt;= 2, we have R({e1, e2, ...}) = R(e1) ∪ R(e2) ∪ ...
 *
 * For expressions e1 and e2, we have R(e1 + e2) = {a + b for (a, b) in R(e1) × R(e2)}, where + denotes concatenation, and × denotes the cartesian product.
 *
 * Given an expression representing a set of words under the given grammar, return the sorted list of words that the expression represents.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: expression = "{a,b}{c,{d,e}}"
 * Output: ["ac","ad","ae","bc","bd","be"]
 *
 * Example 2:
 *
 * Input: expression = "{{a,z},a{b,c},{ab,z}}"
 * Output: ["a","ab","ac","z"]
 * Explanation: Each distinct word is written only once in the final answer.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= expression.length &lt;= 60
 *
 * expression[i] consists of '{', '}', ','or lowercase English letters.
 *
 * The given expression represents a set of words based on the grammar given in the description.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: You can write helper methods to parse the next "chunk" of the expression.  If you see eg. "a", the answer is just the set {a}.  If you see "{", you parse until you complete the "}" (the number of { and } seen are equal) and that becomes a chunk that you find where the appropriate commas are, and parse each individual expression between the commas.
 *
 * <h2>Approach</h2>
 * Think about the category (Hash Table, String, Backtracking, Stack, Breadth-First Search, Sorting).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/brace-expansion-ii/">LeetCode #1096</a>
 */
public class BraceExpansionIi {

    /**
     * TODO: Implement "Brace Expansion II".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Brace Expansion II");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac BraceExpansionIi.java &amp;&amp; java org.leetcode.hard.BraceExpansionIi</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== BraceExpansionIi ===");
        BraceExpansionIi sol = new BraceExpansionIi();
        System.out.println(sol.solve(null));
    }
}
