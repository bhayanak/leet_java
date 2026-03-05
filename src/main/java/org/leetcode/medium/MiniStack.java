package org.leetcode.medium;

/**
 * <b>#155 - Min Stack</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Stack, Design</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
 * 
 * 
 * Implement the MinStack class:
 * 
 * 	
 * MinStack() initializes the stack object.
 * 	
 * void push(int val) pushes the element val onto the stack.
 * 	
 * void pop() removes the element on the top of the stack.
 * 	
 * int top() gets the top element of the stack.
 * 	
 * int getMin() retrieves the minimum element in the stack.
 * 
 * You must implement a solution with O(1) time complexity for each function.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input
 * ["MinStack","push","push","push","getMin","pop","top","getMin"]
 * [[],[-2],[0],[-3],[],[],[],[]]
 * 
 * Output
 * [null,null,null,null,-3,null,0,-2]
 * 
 * Explanation
 * MinStack minStack = new MinStack();
 * minStack.push(-2);
 * minStack.push(0);
 * minStack.push(-3);
 * minStack.getMin(); // return -3
 * minStack.pop();
 * minStack.top();    // return 0
 * minStack.getMin(); // return -2
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * -231 &lt;= val &lt;= 231 - 1
 * 	
 * Methods pop, top and getMin operations will always be called on non-empty stacks.
 * 	
 * At most 3 * 104 calls will be made to push, pop, top, and getMin.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Consider each node in the stack having a minimum value. (Credits to @aakarshmadhavan)
 *
 * <h2>Approach</h2>
 * Second stack tracks the current minimum.
 * On push: if val ≤ current min, also push to min-stack.
 * On pop: if popped value == current min, pop from min-stack too.
 *
 * <h2>Complexity</h2>
* Time: O(1) per operation  |  Space: O(n)
 *
 * @see <a href="https://leetcode.com/problems/min-stack/">LeetCode #155</a>
 */
public class MiniStack {

    /** Stack that supports O(1) minimum retrieval. */
    static class MinStack {
        private final java.util.Deque<Integer> stack    = new java.util.ArrayDeque<>();
        private final java.util.Deque<Integer> minStack = new java.util.ArrayDeque<>();

        /** Pushes val onto the stack. */
        public void push(int val) {
            stack.push(val);
            if (minStack.isEmpty() || val <= minStack.peek()) minStack.push(val);
        }

        /** Removes the top element. */
        public void pop() {
            if (stack.pop().equals(minStack.peek())) minStack.pop();
        }

        /** Returns the top element without removing it. */
        public int top() { return stack.peek(); }

        /** Returns the minimum element in constant time. */
        public int getMin() { return minStack.peek(); }
    }

    // ─── Run & Demo ──────────────────────────────────────────────
    /**
     * Runs sample test cases to demonstrate the solution.
     * Execute: javac MinStack.java &amp;&amp; java org.leetcode.medium.MinStack
     *
     * @param args not used
     */
    public static void main(String[] args) {
        MinStack sol = new MinStack();
        sol.push(1);
        sol.push(2);
        System.out.println(sol.top()); // 2
        System.out.println(sol.getMin()); // 1
    }
}
