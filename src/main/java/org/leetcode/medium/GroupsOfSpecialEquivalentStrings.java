package org.leetcode.medium;


/**
 * <b>#893 - Groups of Special-Equivalent Strings</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Hash Table, String, Sorting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an array of strings of the same length words.
 *
 *
 * In one move, you can swap any two even indexed characters or any two odd indexed characters of a string words[i].
 *
 *
 * Two strings words[i] and words[j] are special-equivalent if after any number of moves, words[i] == words[j].
 *
 *
 * For example, words[i] = "zzxy" and words[j] = "xyzz" are special-equivalent because we may make the moves "zzxy" -&gt; "xzzy" -&gt; "xyzz".
 *
 * A group of special-equivalent strings from words is a non-empty subset of words such that:
 *
 *
 * Every pair of strings in the group are special equivalent, and
 *
 * The group is the largest size possible (i.e., there is not a string words[i] not in the group such that words[i] is special-equivalent to every string in the group).
 *
 * Return the number of groups of special-equivalent strings from words.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: words = ["abcd","cdab","cbad","xyzz","zzxy","zzyx"]
 * Output: 3
 * Explanation: 
 * One group is ["abcd", "cdab", "cbad"], since they are all pairwise special equivalent, and none of the other strings is all pairwise special equivalent to these.
 * The other two groups are ["xyzz", "zzxy"] and ["zzyx"].
 * Note that in particular, "zzxy" is not special equivalent to "zzyx".
 *
 * Example 2:
 *
 * Input: words = ["abc","acb","bac","bca","cab","cba"]
 * Output: 3
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= words.length &lt;= 1000
 *
 * 1 &lt;= words[i].length &lt;= 20
 *
 * words[i] consist of lowercase English letters.
 *
 * All the strings are of the same length.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, String, Sorting).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/groups-of-special-equivalent-strings/">LeetCode #893</a>
 */
public class GroupsOfSpecialEquivalentStrings {

    /**
     * TODO: Implement "Groups of Special-Equivalent Strings".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Groups of Special-Equivalent Strings");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac GroupsOfSpecialEquivalentStrings.java &amp;&amp; java org.leetcode.medium.GroupsOfSpecialEquivalentStrings</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== GroupsOfSpecialEquivalentStrings ===");
        GroupsOfSpecialEquivalentStrings sol = new GroupsOfSpecialEquivalentStrings();
        System.out.println(sol.solve(null));
    }
}
