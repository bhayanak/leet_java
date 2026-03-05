package org.leetcode.medium;


/**
 * <b>#1946 - Largest Number After Mutating Substring</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, String, Greedy</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a string num, which represents a large integer. You are also given a 0-indexed integer array change of length 10 that maps each digit 0-9 to another digit. More formally, digit d maps to digit change[d].
 *
 *
 * You may choose to mutate a single substring of num. To mutate a substring, replace each digit num[i] with the digit it maps to in change (i.e. replace num[i] with change[num[i]]).
 *
 *
 * Return a string representing the largest possible integer after mutating (or choosing not to) a single substring of num.
 *
 *
 * A substring is a contiguous sequence of characters within the string.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: num = "132", change = [9,8,5,0,3,6,4,2,6,8]
 * Output: "832"
 * Explanation: Replace the substring "1":
 * - 1 maps to change[1] = 8.
 * Thus, "132" becomes "832".
 * "832" is the largest number that can be created, so return it.
 *
 * Example 2:
 *
 * Input: num = "021", change = [9,4,3,5,7,2,1,9,0,6]
 * Output: "934"
 * Explanation: Replace the substring "021":
 * - 0 maps to change[0] = 9.
 * - 2 maps to change[2] = 3.
 * - 1 maps to change[1] = 4.
 * Thus, "021" becomes "934".
 * "934" is the largest number that can be created, so return it.
 *
 * Example 3:
 *
 * Input: num = "5", change = [1,4,7,5,3,2,5,6,9,4]
 * Output: "5"
 * Explanation: "5" is already the largest number that can be created, so return it.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= num.length &lt;= 105
 *
 * num consists of only digits 0-9.
 *
 * change.length == 10
 *
 * 0 &lt;= change[d] &lt;= 9
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Should you change a digit if the new digit is smaller than the original?
 * Hint 2: If changing the first digit and the last digit both make the number bigger, but you can only change one of them; which one should you change?
 * Hint 3: Changing numbers closer to the front is always better
 *
 * <h2>Approach</h2>
 * Think about the category (Array, String, Greedy).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/largest-number-after-mutating-substring/">LeetCode #1946</a>
 */
public class LargestNumberAfterMutatingSubstring {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Largest Number After Mutating Substring");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== LargestNumberAfterMutatingSubstring ===");
        LargestNumberAfterMutatingSubstring sol = new LargestNumberAfterMutatingSubstring();
        System.out.println(sol.solve(null));
    }
}
