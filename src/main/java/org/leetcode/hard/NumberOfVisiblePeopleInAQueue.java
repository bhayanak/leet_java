package org.leetcode.hard;


/**
 * <b>#1944 - Number of Visible People in a Queue</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Stack, Monotonic Stack</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * There are n people standing in a queue, and they numbered from 0 to n - 1 in left to right order. You are given an array heights of distinct integers where heights[i] represents the height of the ith person.
 *
 *
 * A person can see another person to their right in the queue if everybody in between is shorter than both of them. More formally, the ith person can see the jth person if i &lt; j and min(heights[i], heights[j]) &gt; max(heights[i+1], heights[i+2], ..., heights[j-1]).
 *
 *
 * Return an array answer of length n where answer[i] is the number of people the ith person can see to their right in the queue.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: heights = [10,6,8,5,11,9]
 * Output: [3,1,2,1,1,0]
 * Explanation:
 * Person 0 can see person 1, 2, and 4.
 * Person 1 can see person 2.
 * Person 2 can see person 3 and 4.
 * Person 3 can see person 4.
 * Person 4 can see person 5.
 * Person 5 can see no one since nobody is to the right of them.
 *
 * Example 2:
 *
 * Input: heights = [5,1,2,3,10]
 * Output: [4,1,1,1,0]
 *
 *
 *
 * Constraints:
 *
 *
 * n == heights.length
 *
 * 1 &lt;= n &lt;= 105
 *
 * 1 &lt;= heights[i] &lt;= 105
 *
 * All the values of heights are unique.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: How to solve this problem in quadratic complexity ?
 * Hint 2: For every subarray start at index i, keep finding new maximum values until a value larger than arr[i] is found.
 * Hint 3: Since the limits are high, you need a linear solution.
 * Hint 4: Use a stack to keep the values of the array sorted as you iterate the array from the end to the start.
 * Hint 5: Keep popping from the stack the elements in sorted order until a value larger than arr[i] is found, these are the ones that person i can see.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Stack, Monotonic Stack).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/number-of-visible-people-in-a-queue/">LeetCode #1944</a>
 */
public class NumberOfVisiblePeopleInAQueue {

    /**
     * Solves the problem and Solve.
     * Uses Breadth-First Search (BFS) traversal.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Number of Visible People in a Queue");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== NumberOfVisiblePeopleInAQueue ===");
        NumberOfVisiblePeopleInAQueue sol = new NumberOfVisiblePeopleInAQueue();
        System.out.println(sol.solve(null));
    }
}
