package org.leetcode.medium;


/**
 * <b>#1419 - Minimum Number of Frogs Croaking</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> String, Counting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given the string croakOfFrogs, which represents a combination of the string "croak" from different frogs, that is, multiple frogs can croak at the same time, so multiple "croak" are mixed.
 *
 *
 * Return the minimum number of different frogs to finish all the croaks in the given string.
 *
 *
 * A valid "croak" means a frog is printing five letters 'c', 'r', 'o', 'a', and 'k' sequentially. The frogs have to print all five letters to finish a croak. If the given string is not a combination of a valid "croak" return -1.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: croakOfFrogs = "croakcroak"
 * Output: 1 
 * Explanation: One frog yelling "croak" twice.
 *
 * Example 2:
 *
 * Input: croakOfFrogs = "crcoakroak"
 * Output: 2 
 * Explanation: The minimum number of frogs is two. 
 * The first frog could yell "crcoakroak".
 * The second frog could yell later "crcoakroak".
 *
 * Example 3:
 *
 * Input: croakOfFrogs = "croakcrook"
 * Output: -1
 * Explanation: The given string is an invalid combination of "croak" from different frogs.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= croakOfFrogs.length &lt;= 105
 *
 * croakOfFrogs is either 'c', 'r', 'o', 'a', or 'k'.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: keep the frequency of all characters from "croak" using a hashmap.
 * Hint 2: For each character in the given string, greedily match it to a possible "croak".
 *
 * <h2>Approach</h2>
 * Think about the category (String, Counting).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/minimum-number-of-frogs-croaking/">LeetCode #1419</a>
 */
public class MinimumNumberOfFrogsCroaking {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Minimum Number of Frogs Croaking");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== MinimumNumberOfFrogsCroaking ===");
        MinimumNumberOfFrogsCroaking sol = new MinimumNumberOfFrogsCroaking();
        System.out.println(sol.solve(null));
    }
}
