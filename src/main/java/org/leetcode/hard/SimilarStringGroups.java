package org.leetcode.hard;


/**
 * <b>#839 - Similar String Groups</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Hash Table, String, Depth-First Search, Breadth-First Search, Union-Find</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Two strings, X and Y, are considered similar if either they are identical or we can make them equivalent by swapping at most two letters (in distinct positions) within the string X.
 *
 *
 * For example, "tars" and "rats" are similar (swapping at positions 0 and 2), and "rats" and "arts" are similar, but "star" is not similar to "tars", "rats", or "arts".
 *
 *
 * Together, these form two connected groups by similarity: {"tars", "rats", "arts"} and {"star"}.  Notice that "tars" and "arts" are in the same group even though they are not similar.  Formally, each group is such that a word is in the group if and only if it is similar to at least one other word in the group.
 *
 *
 * We are given a list strs of strings where every string in strs is an anagram of every other string in strs. How many groups are there?
 *
 *
 *
 *
 * Example 1:
 *
 * Input: strs = ["tars","rats","arts","star"]
 * Output: 2
 *
 * Example 2:
 *
 * Input: strs = ["omv","ovm"]
 * Output: 1
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= strs.length &lt;= 300
 *
 * 1 &lt;= strs[i].length &lt;= 300
 *
 * strs[i] consists of lowercase letters only.
 *
 * All words in strs have the same length and are anagrams of each other.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, String, Depth-First Search, Breadth-First Search, Union-Find).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/similar-string-groups/">LeetCode #839</a>
 */
public class SimilarStringGroups {

    /**
     * TODO: Implement "Similar String Groups".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Similar String Groups");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac SimilarStringGroups.java &amp;&amp; java org.leetcode.hard.SimilarStringGroups</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== SimilarStringGroups ===");
        SimilarStringGroups sol = new SimilarStringGroups();
        System.out.println(sol.solve(null));
    }
}
