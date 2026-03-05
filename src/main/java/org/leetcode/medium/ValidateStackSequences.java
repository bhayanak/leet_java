package org.leetcode.medium;


/**
 * <b>#946 - Validate Stack Sequences</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Stack, Simulation</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given two integer arrays pushed and popped each with distinct values, return true if this could have been the result of a sequence of push and pop operations on an initially empty stack, or false otherwise.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: pushed = [1,2,3,4,5], popped = [4,5,3,2,1]
 * Output: true
 * Explanation: We might do the following sequence:
 * push(1), push(2), push(3), push(4),
 * pop() -&gt; 4,
 * push(5),
 * pop() -&gt; 5, pop() -&gt; 3, pop() -&gt; 2, pop() -&gt; 1
 *
 * Example 2:
 *
 * Input: pushed = [1,2,3,4,5], popped = [4,3,5,1,2]
 * Output: false
 * Explanation: 1 cannot be popped before 2.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= pushed.length &lt;= 1000
 *
 * 0 &lt;= pushed[i] &lt;= 1000
 *
 * All the elements of pushed are unique.
 *
 * popped.length == pushed.length
 *
 * popped is a permutation of pushed.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Stack, Simulation).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/validate-stack-sequences/">LeetCode #946</a>
 */
public class ValidateStackSequences {

    /**
     * Solves the problem: Validate stack sequences.
     * Uses Depth-First Search (DFS) traversal.
     *
     * @param pushed the pushed (int[])
     * @param popped the popped (int[])
     * @return the computed boolean result
     */
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        java.util.Deque<Integer> stack = new java.util.ArrayDeque<>();
        int j = 0;
        for (int val : pushed) {
            stack.push(val);
            while (!stack.isEmpty() && stack.peek() == popped[j]) { stack.pop(); j++; }
        }
        return stack.isEmpty();
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac ValidateStackSequences.java &amp;&amp; java org.leetcode.medium.ValidateStackSequences</pre>
     */
    public static void main(String[] args) {
        ValidateStackSequences sol = new ValidateStackSequences();
                System.out.println(sol.validateStackSequences(new int[]{1,2,3,4,5}, new int[]{4,5,3,2,1})); // true
                System.out.println(sol.validateStackSequences(new int[]{1,2,3,4,5}, new int[]{4,3,5,1,2})); // false
    }
}
