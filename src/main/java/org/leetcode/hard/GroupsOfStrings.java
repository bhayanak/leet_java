package org.leetcode.hard;


/**
 * <b>#2157 - Groups of Strings</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Hash Table, String, Bit Manipulation, Union-Find</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a 0-indexed array of strings words. Each string consists of lowercase English letters only. No letter occurs more than once in any string of words.
 *
 *
 * Two strings s1 and s2 are said to be connected if the set of letters of s2 can be obtained from the set of letters of s1 by any one of the following operations:
 *
 *
 * Adding exactly one letter to the set of the letters of s1.
 *
 * Deleting exactly one letter from the set of the letters of s1.
 *
 * Replacing exactly one letter from the set of the letters of s1 with any letter, including itself.
 *
 * The array words can be divided into one or more non-intersecting groups. A string belongs to a group if any one of the following is true:
 *
 *
 * It is connected to at least one other string of the group.
 *
 * It is the only string present in the group.
 *
 * Note that the strings in words should be grouped in such a manner that a string belonging to a group cannot be connected to a string present in any other group. It can be proved that such an arrangement is always unique.
 *
 *
 * Return an array ans of size 2 where:
 *
 *
 * ans[0] is the maximum number of groups words can be divided into, and
 *
 * ans[1] is the size of the largest group.
 *
 *
 *
 * Example 1:
 *
 * Input: words = ["a","b","ab","cde"]
 * Output: [2,3]
 * Explanation:
 * - words[0] can be used to obtain words[1] (by replacing 'a' with 'b'), and words[2] (by adding 'b'). So words[0] is connected to words[1] and words[2].
 * - words[1] can be used to obtain words[0] (by replacing 'b' with 'a'), and words[2] (by adding 'a'). So words[1] is connected to words[0] and words[2].
 * - words[2] can be used to obtain words[0] (by deleting 'b'), and words[1] (by deleting 'a'). So words[2] is connected to words[0] and words[1].
 * - words[3] is not connected to any string in words.
 * Thus, words can be divided into 2 groups ["a","b","ab"] and ["cde"]. The size of the largest group is 3.  
 *
 * Example 2:
 *
 * Input: words = ["a","ab","abc"]
 * Output: [1,3]
 * Explanation:
 * - words[0] is connected to words[1].
 * - words[1] is connected to words[0] and words[2].
 * - words[2] is connected to words[1].
 * Since all strings are connected to each other, they should be grouped together.
 * Thus, the size of the largest group is 3.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= words.length &lt;= 2 * 104
 *
 * 1 &lt;= words[i].length &lt;= 26
 *
 * words[i] consists of lowercase English letters only.
 *
 * No letter occurs more than once in words[i].
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Can we build a graph from words, where there exists an edge between nodes i and j if words[i] and words[j] are connected?
 * Hint 2: The problem now boils down to finding the total number of components and the size of the largest component in the graph.
 * Hint 3: How can we use bit masking to reduce the search space while adding edges to node i?
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, String, Bit Manipulation, Union-Find).
 *
 * @see <a href="https://leetcode.com/problems/groups-of-strings/">LeetCode #2157</a>
 */
public class GroupsOfStrings {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Groups of Strings");
    }

    public static void main(String[] args) {
        System.out.println("=== GroupsOfStrings ===");
        GroupsOfStrings sol = new GroupsOfStrings();
        System.out.println(sol.solve(null));
    }
}
