package org.leetcode.hard;


/**
 * <b>#1825 - Finding MK Average</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Design, Queue, Heap (Priority Queue), Data Stream, Ordered Set</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given two integers, m and k, and a stream of integers. You are tasked to implement a data structure that calculates the MKAverage for the stream.
 *
 *
 * The MKAverage can be calculated using these steps:
 *
 *
 * If the number of the elements in the stream is less than m you should consider the MKAverage to be -1. Otherwise, copy the last m elements of the stream to a separate container.
 *
 * Remove the smallest k elements and the largest k elements from the container.
 *
 * Calculate the average value for the rest of the elements rounded down to the nearest integer.
 *
 * Implement the MKAverage class:
 *
 *
 * MKAverage(int m, int k) Initializes the MKAverage object with an empty stream and the two integers m and k.
 *
 * void addElement(int num) Inserts a new element num into the stream.
 *
 * int calculateMKAverage() Calculates and returns the MKAverage for the current stream rounded down to the nearest integer.
 *
 *
 *
 * Example 1:
 *
 * Input
 * ["MKAverage", "addElement", "addElement", "calculateMKAverage", "addElement", "calculateMKAverage", "addElement", "addElement", "addElement", "calculateMKAverage"]
 * [[3, 1], [3], [1], [], [10], [], [5], [5], [5], []]
 * Output
 * [null, null, null, -1, null, 3, null, null, null, 5]
 *
 * Explanation
 * MKAverage obj = new MKAverage(3, 1); 
 * obj.addElement(3);        // current elements are [3]
 * obj.addElement(1);        // current elements are [3,1]
 * obj.calculateMKAverage(); // return -1, because m = 3 and only 2 elements exist.
 * obj.addElement(10);       // current elements are [3,1,10]
 * obj.calculateMKAverage(); // The last 3 elements are [3,1,10].
 *                           // After removing smallest and largest 1 element the container will be [3].
 *                           // The average of [3] equals 3/1 = 3, return 3
 * obj.addElement(5);        // current elements are [3,1,10,5]
 * obj.addElement(5);        // current elements are [3,1,10,5,5]
 * obj.addElement(5);        // current elements are [3,1,10,5,5,5]
 * obj.calculateMKAverage(); // The last 3 elements are [5,5,5].
 *                           // After removing smallest and largest 1 element the container will be [5].
 *                           // The average of [5] equals 5/1 = 5, return 5
 *
 *
 *
 * Constraints:
 *
 *
 * 3 &lt;= m &lt;= 105
 *
 * 1 &lt; k*2 &lt; m
 *
 * 1 &lt;= num &lt;= 105
 *
 * At most 105 calls will be made to addElement and calculateMKAverage.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: At each query, try to save and update the sum of the elements needed to calculate MKAverage.
 * Hint 2: You can use BSTs for fast insertion and deletion of the elements.
 *
 * <h2>Approach</h2>
 * Think about the category (Design, Queue, Heap (Priority Queue), Data Stream, Ordered Set).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/finding-mk-average/">LeetCode #1825</a>
 */
public class FindingMkAverage {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Finding MK Average");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== FindingMkAverage ===");
        FindingMkAverage sol = new FindingMkAverage();
        System.out.println(sol.solve(null));
    }
}
