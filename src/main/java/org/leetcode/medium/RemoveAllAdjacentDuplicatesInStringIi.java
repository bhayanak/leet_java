package org.leetcode.medium;


/**
 * <b>#1209 - Remove All Adjacent Duplicates in String II</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> String, Stack</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a string s and an integer k, a k duplicate removal consists of choosing k adjacent and equal letters from s and removing them, causing the left and the right side of the deleted substring to concatenate together.
 *
 *
 * We repeatedly make k duplicate removals on s until we no longer can.
 *
 *
 * Return the final string after all such duplicate removals have been made. It is guaranteed that the answer is unique.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s = "abcd", k = 2
 * Output: "abcd"
 * Explanation: There's nothing to delete.
 *
 * Example 2:
 *
 * Input: s = "deeedbbcccbdaa", k = 3
 * Output: "aa"
 * Explanation: 
 * First delete "eee" and "ccc", get "ddbbbdaa"
 * Then delete "bbb", get "dddaa"
 * Finally delete "ddd", get "aa"
 *
 * Example 3:
 *
 * Input: s = "pbbcggttciiippooaais", k = 2
 * Output: "ps"
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= s.length &lt;= 105
 *
 * 2 &lt;= k &lt;= 104
 *
 * s only contains lowercase English letters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use a stack to store the characters, when there are k same characters, delete them.
 * Hint 2: To make it more efficient, use a pair to store the value and the count of each character.
 *
 * <h2>Approach</h2>
 * Think about the category (String, Stack).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string-ii/">LeetCode #1209</a>
 */
public class RemoveAllAdjacentDuplicatesInStringIi {

    /**
     * Removes Remove duplicates.
     *
     * @param s the s (String)
     * @param k the k (int)
     * @return the computed String result
     */
    public String removeDuplicates(String s, int k) {
        java.util.Deque<int[]> stack = new java.util.ArrayDeque<>(); // [char, count]
        for (char c : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek()[0] == c) {
                stack.peek()[1]++;
                if (stack.peek()[1] == k) stack.pop();
            } else {
                stack.push(new int[]{c, 1});
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int[] pair : stack) for (int i=0;i<pair[1];i++) sb.append((char)pair[0]);
        return sb.reverse().toString();
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        RemoveAllAdjacentDuplicatesInStringIi sol = new RemoveAllAdjacentDuplicatesInStringIi();
                System.out.println(sol.removeDuplicates("abcd",2));        // "abcd"
                System.out.println(sol.removeDuplicates("deeedbbcccbdaa",3)); // "aa"
                System.out.println(sol.removeDuplicates("pbbcggttcppbsa",2)); // "ps"
    }
}
