package org.leetcode.medium;


/**
 * <b>#1441 - Build an Array With Stack Operations</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Stack, Simulation</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array target and an integer n.
 *
 *
 * You have an empty stack with the two following operations:
 *
 *
 * "Push": pushes an integer to the top of the stack.
 *
 * "Pop": removes the integer on the top of the stack.
 *
 * You also have a stream of the integers in the range [1, n].
 *
 *
 * Use the two stack operations to make the numbers in the stack (from the bottom to the top) equal to target. You should follow the following rules:
 *
 *
 * If the stream of the integers is not empty, pick the next integer from the stream and push it to the top of the stack.
 *
 * If the stack is not empty, pop the integer at the top of the stack.
 *
 * If, at any moment, the elements in the stack (from the bottom to the top) are equal to target, do not read new integers from the stream and do not do more operations on the stack.
 *
 * Return the stack operations needed to build target following the mentioned rules. If there are multiple valid answers, return any of them.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: target = [1,3], n = 3
 * Output: ["Push","Push","Pop","Push"]
 * Explanation: Initially the stack s is empty. The last element is the top of the stack.
 * Read 1 from the stream and push it to the stack. s = [1].
 * Read 2 from the stream and push it to the stack. s = [1,2].
 * Pop the integer on the top of the stack. s = [1].
 * Read 3 from the stream and push it to the stack. s = [1,3].
 *
 * Example 2:
 *
 * Input: target = [1,2,3], n = 3
 * Output: ["Push","Push","Push"]
 * Explanation: Initially the stack s is empty. The last element is the top of the stack.
 * Read 1 from the stream and push it to the stack. s = [1].
 * Read 2 from the stream and push it to the stack. s = [1,2].
 * Read 3 from the stream and push it to the stack. s = [1,2,3].
 *
 * Example 3:
 *
 * Input: target = [1,2], n = 4
 * Output: ["Push","Push"]
 * Explanation: Initially the stack s is empty. The last element is the top of the stack.
 * Read 1 from the stream and push it to the stack. s = [1].
 * Read 2 from the stream and push it to the stack. s = [1,2].
 * Since the stack (from the bottom to the top) is equal to target, we stop the stack operations.
 * The answers that read integer 3 from the stream are not accepted.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= target.length &lt;= 100
 *
 * 1 &lt;= n &lt;= 100
 *
 * 1 &lt;= target[i] &lt;= n
 *
 * target is strictly increasing.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use “Push” for numbers to be kept in target array and [“Push”, “Pop”] for numbers to be discarded.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Stack, Simulation).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/build-an-array-with-stack-operations/">LeetCode #1441</a>
 */
public class BuildAnArrayWithStackOperations {

    public java.util.List<String> buildArray(int[] target, int n) {
        java.util.List<String> ops = new java.util.ArrayList<>();
        int ti=0;
        for (int i=1;i<=n && ti<target.length;i++) {
            ops.add("Push");
            if (target[ti]==i) ti++;
            else ops.add("Pop");
        }
        return ops;
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        BuildAnArrayWithStackOperations sol = new BuildAnArrayWithStackOperations();
        System.out.println("No method available");
    }
}
