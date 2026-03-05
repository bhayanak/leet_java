package org.leetcode.medium;


/**
 * <b>#1670 - Design Front Middle Back Queue</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Linked List, Design, Queue, Doubly-Linked List, Data Stream</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Design a queue that supports push and pop operations in the front, middle, and back.
 *
 *
 * Implement the FrontMiddleBack class:
 *
 *
 * FrontMiddleBack() Initializes the queue.
 *
 * void pushFront(int val) Adds val to the front of the queue.
 *
 * void pushMiddle(int val) Adds val to the middle of the queue.
 *
 * void pushBack(int val) Adds val to the back of the queue.
 *
 * int popFront() Removes the front element of the queue and returns it. If the queue is empty, return -1.
 *
 * int popMiddle() Removes the middle element of the queue and returns it. If the queue is empty, return -1.
 *
 * int popBack() Removes the back element of the queue and returns it. If the queue is empty, return -1.
 *
 * Notice that when there are two middle position choices, the operation is performed on the frontmost middle position choice. For example:
 *
 *
 * Pushing 6 into the middle of [1, 2, 3, 4, 5] results in [1, 2, 6, 3, 4, 5].
 *
 * Popping the middle from [1, 2, 3, 4, 5, 6] returns 3 and results in [1, 2, 4, 5, 6].
 *
 *
 *
 * Example 1:
 *
 * Input:
 * ["FrontMiddleBackQueue", "pushFront", "pushBack", "pushMiddle", "pushMiddle", "popFront", "popMiddle", "popMiddle", "popBack", "popFront"]
 * [[], [1], [2], [3], [4], [], [], [], [], []]
 * Output:
 * [null, null, null, null, null, 1, 3, 4, 2, -1]
 *
 * Explanation:
 * FrontMiddleBackQueue q = new FrontMiddleBackQueue();
 * q.pushFront(1);   // [1]
 * q.pushBack(2);    // [1, 2]
 * q.pushMiddle(3);  // [1, 3, 2]
 * q.pushMiddle(4);  // [1, 4, 3, 2]
 * q.popFront();     // return 1 -&gt; [4, 3, 2]
 * q.popMiddle();    // return 3 -&gt; [4, 2]
 * q.popMiddle();    // return 4 -&gt; [2]
 * q.popBack();      // return 2 -&gt; []
 * q.popFront();     // return -1 -&gt; [] (The queue is empty)
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= val &lt;= 109
 *
 * At most 1000 calls will be made to pushFront, pushMiddle, pushBack, popFront, popMiddle, and popBack.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: The constraints are low enough for a brute force, single array approach.
 * Hint 2: For an O(1) per method approach, use 2 double-ended queues: one for the first half and one for the second half.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Linked List, Design, Queue, Doubly-Linked List, Data Stream).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/design-front-middle-back-queue/">LeetCode #1670</a>
 */
public class DesignFrontMiddleBackQueue {

    /**
     * Solves the problem and Solve.
     * Uses Breadth-First Search (BFS) traversal.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Design Front Middle Back Queue");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== DesignFrontMiddleBackQueue ===");
        DesignFrontMiddleBackQueue sol = new DesignFrontMiddleBackQueue();
        System.out.println(sol.solve(null));
    }
}
