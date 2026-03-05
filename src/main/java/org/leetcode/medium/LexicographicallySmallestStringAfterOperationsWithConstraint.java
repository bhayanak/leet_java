package org.leetcode.medium;


/**
 * <b>#3106 - Lexicographically Smallest String After Operations With Constraint</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> String, Greedy</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a string s and an integer k.
 *
 *
 * Define a function distance(s1, s2) between two strings s1 and s2 of the same length n as:
 *
 *
 * The sum of the minimum distance between s1[i] and s2[i] when the characters from 'a' to 'z' are placed in a cyclic order, for all i in the range [0, n - 1].
 *
 * For example, distance("ab", "cd") == 4, and distance("a", "z") == 1.
 *
 *
 * You can change any letter of s to any other lowercase English letter, any number of times.
 *
 *
 * Return a string denoting the lexicographically smallest string t you can get after some changes, such that distance(s, t) &lt;= k.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s = "zbbz", k = 3
 *
 *
 * Output: "aaaz"
 *
 *
 * Explanation:
 *
 *
 * Change s to "aaaz". The distance between "zbbz" and "aaaz" is equal to k = 3.
 *
 * Example 2:
 *
 * Input: s = "xaxcd", k = 4
 *
 *
 * Output: "aawcd"
 *
 *
 * Explanation:
 *
 *
 * The distance between "xaxcd" and "aawcd" is equal to k = 4.
 *
 * Example 3:
 *
 * Input: s = "lol", k = 0
 *
 *
 * Output: "lol"
 *
 *
 * Explanation:
 *
 *
 * It's impossible to change any character as k = 0.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= s.length &lt;= 100
 *
 * 0 &lt;= k &lt;= 2000
 *
 * s consists only of lowercase English letters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: The problem can be approached greedily.
 * Hint 2: For each index in order from <code>0</code> to <code>n - 1</code>, we try all letters from <code>'a'</code> to <code>'z'</code>, selecting the first one as long as the current total distance accumulated is not larger than <code>k</code>.
 *
 * <h2>Approach</h2>
 * Think about the category (String, Greedy).
 *
 * @see <a href="https://leetcode.com/problems/lexicographically-smallest-string-after-operations-with-constraint/">LeetCode #3106</a>
 */
public class LexicographicallySmallestStringAfterOperationsWithConstraint {

    /**
     * Computes the maximum Max score.
     * Uses a heap/priority queue for efficient ordering.
     *
     * @param nums the nums (int[])
     * @return the computed long result
     */
    public long maxScore(int[] nums) {
        java.util.PriorityQueue<Long> maxHeap=new java.util.PriorityQueue<>(java.util.Collections.reverseOrder());
        for (int n:nums) maxHeap.add((long)n);
        long score=0;
        // Just sum all
        while (!maxHeap.isEmpty()) score+=maxHeap.poll();
        return score;
    }

    public static void main(String[] args) {
        LexicographicallySmallestStringAfterOperationsWithConstraint sol = new LexicographicallySmallestStringAfterOperationsWithConstraint();
                System.out.println(sol.maxScore(new int[]{3,4,5})); // 12
                System.out.println(sol.maxScore(new int[]{2,3}));   // 5
    }
}
