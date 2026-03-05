package org.leetcode.hard;


/**
 * <b>#1172 - Dinner Plate Stacks</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Hash Table, Stack, Design, Heap (Priority Queue)</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You have an infinite number of stacks arranged in a row and numbered (left to right) from 0, each of the stacks has the same maximum capacity.
 *
 *
 * Implement the DinnerPlates class:
 *
 *
 * DinnerPlates(int capacity) Initializes the object with the maximum capacity of the stacks capacity.
 *
 * void push(int val) Pushes the given integer val into the leftmost stack with a size less than capacity.
 *
 * int pop() Returns the value at the top of the rightmost non-empty stack and removes it from that stack, and returns -1 if all the stacks are empty.
 *
 * int popAtStack(int index) Returns the value at the top of the stack with the given index index and removes it from that stack or returns -1 if the stack with that given index is empty.
 *
 *
 *
 * Example 1:
 *
 * Input
 * ["DinnerPlates", "push", "push", "push", "push", "push", "popAtStack", "push", "push", "popAtStack", "popAtStack", "pop", "pop", "pop", "pop", "pop"]
 * [[2], [1], [2], [3], [4], [5], [0], [20], [21], [0], [2], [], [], [], [], []]
 * Output
 * [null, null, null, null, null, null, 2, null, null, 20, 21, 5, 4, 3, 1, -1]
 *
 * Explanation: 
 * DinnerPlates D = DinnerPlates(2);  // Initialize with capacity = 2
 * D.push(1);
 * D.push(2);
 * D.push(3);
 * D.push(4);
 * D.push(5);         // The stacks are now:  2  4
 *                                            1  3  5
 *                                            ﹈ ﹈ ﹈
 * D.popAtStack(0);   // Returns 2.  The stacks are now:     4
 *                                                        1  3  5
 *                                                        ﹈ ﹈ ﹈
 * D.push(20);        // The stacks are now: 20  4
 *                                            1  3  5
 *                                            ﹈ ﹈ ﹈
 * D.push(21);        // The stacks are now: 20  4 21
 *                                            1  3  5
 *                                            ﹈ ﹈ ﹈
 * D.popAtStack(0);   // Returns 20.  The stacks are now:     4 21
 *                                                         1  3  5
 *                                                         ﹈ ﹈ ﹈
 * D.popAtStack(2);   // Returns 21.  The stacks are now:     4
 *                                                         1  3  5
 *                                                         ﹈ ﹈ ﹈ 
 * D.pop()            // Returns 5.  The stacks are now:      4
 *                                                         1  3 
 *                                                         ﹈ ﹈  
 * D.pop()            // Returns 4.  The stacks are now:   1  3 
 *                                                         ﹈ ﹈   
 * D.pop()            // Returns 3.  The stacks are now:   1 
 *                                                         ﹈   
 * D.pop()            // Returns 1.  There are no stacks.
 * D.pop()            // Returns -1.  There are still no stacks.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= capacity &lt;= 2 * 104
 *
 * 1 &lt;= val &lt;= 2 * 104
 *
 * 0 &lt;= index &lt;= 105
 *
 * At most 2 * 105 calls will be made to push, pop, and popAtStack.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use a data structure to save the plate status. You may need to operate the exact index. Maintain the leftmost vacant stack and the rightmost non-empty stack.
 * Hint 2: Use a list of stack to store the plate status. Use heap to maintain the leftmost and rightmost valid stack.
 *
 * <h2>Approach</h2>
 * Think about the category (Hash Table, Stack, Design, Heap (Priority Queue)).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/dinner-plate-stacks/">LeetCode #1172</a>
 */
public class DinnerPlateStacks {

    /**
     * TODO: Implement "Dinner Plate Stacks".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Dinner Plate Stacks");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac DinnerPlateStacks.java &amp;&amp; java org.leetcode.hard.DinnerPlateStacks</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== DinnerPlateStacks ===");
        DinnerPlateStacks sol = new DinnerPlateStacks();
        System.out.println(sol.solve(null));
    }
}
