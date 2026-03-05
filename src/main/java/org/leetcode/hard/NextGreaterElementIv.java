package org.leetcode.hard;


/**
 * <b>#2454 - Next Greater Element IV</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Binary Search, Stack, Sorting, Heap (Priority Queue), Monotonic Stack</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a 0-indexed array of non-negative integers nums. For each integer in nums, you must find its respective second greater integer.
 *
 *
 * The second greater integer of nums[i] is nums[j] such that:
 *
 *
 * j &gt; i
 *
 * nums[j] &gt; nums[i]
 *
 * There exists exactly one index k such that nums[k] &gt; nums[i] and i &lt; k &lt; j.
 *
 * If there is no such nums[j], the second greater integer is considered to be -1.
 *
 *
 * For example, in the array [1, 2, 4, 3], the second greater integer of 1 is 4, 2 is 3, and that of 3 and 4 is -1.
 *
 * Return an integer array answer, where answer[i] is the second greater integer of nums[i].
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [2,4,0,9,6]
 * Output: [9,6,6,-1,-1]
 * Explanation:
 * 0th index: 4 is the first integer greater than 2, and 9 is the second integer greater than 2, to the right of 2.
 * 1st index: 9 is the first, and 6 is the second integer greater than 4, to the right of 4.
 * 2nd index: 9 is the first, and 6 is the second integer greater than 0, to the right of 0.
 * 3rd index: There is no integer greater than 9 to its right, so the second greater integer is considered to be -1.
 * 4th index: There is no integer greater than 6 to its right, so the second greater integer is considered to be -1.
 * Thus, we return [9,6,6,-1,-1].
 *
 * Example 2:
 *
 * Input: nums = [3,3]
 * Output: [-1,-1]
 * Explanation:
 * We return [-1,-1] since neither integer has any integer greater than it.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 105
 *
 * 0 &lt;= nums[i] &lt;= 109
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Move forward in nums and store the value in a non-increasing stack for the first greater value.
 * Hint 2: Move the value in the stack to an ordered data structure for the second greater value.
 * Hint 3: Move value from the ordered data structure for the answer.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Binary Search, Stack, Sorting, Heap (Priority Queue), Monotonic Stack).
 *
 * @see <a href="https://leetcode.com/problems/next-greater-element-iv/">LeetCode #2454</a>
 */
public class NextGreaterElementIv {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Next Greater Element IV");
    }

    public static void main(String[] args) {
        System.out.println("=== NextGreaterElementIv ===");
        NextGreaterElementIv sol = new NextGreaterElementIv();
        System.out.println(sol.solve(null));
    }
}
