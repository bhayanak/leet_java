package org.leetcode.hard;


/**
 * <b>#2276 - Count Integers in Intervals</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Design, Segment Tree, Ordered Set</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an empty set of intervals, implement a data structure that can:
 *
 *
 * Add an interval to the set of intervals.
 *
 * Count the number of integers that are present in at least one interval.
 *
 * Implement the CountIntervals class:
 *
 *
 * CountIntervals() Initializes the object with an empty set of intervals.
 *
 * void add(int left, int right) Adds the interval [left, right] to the set of intervals.
 *
 * int count() Returns the number of integers that are present in at least one interval.
 *
 * Note that an interval [left, right] denotes all the integers x where left &lt;= x &lt;= right.
 *
 *
 *
 *
 * Example 1:
 *
 * Input
 * ["CountIntervals", "add", "add", "count", "add", "count"]
 * [[], [2, 3], [7, 10], [], [5, 8], []]
 * Output
 * [null, null, null, 6, null, 8]
 *
 * Explanation
 * CountIntervals countIntervals = new CountIntervals(); // initialize the object with an empty set of intervals. 
 * countIntervals.add(2, 3);  // add [2, 3] to the set of intervals.
 * countIntervals.add(7, 10); // add [7, 10] to the set of intervals.
 * countIntervals.count();    // return 6
 *                            // the integers 2 and 3 are present in the interval [2, 3].
 *                            // the integers 7, 8, 9, and 10 are present in the interval [7, 10].
 * countIntervals.add(5, 8);  // add [5, 8] to the set of intervals.
 * countIntervals.count();    // return 8
 *                            // the integers 2 and 3 are present in the interval [2, 3].
 *                            // the integers 5 and 6 are present in the interval [5, 8].
 *                            // the integers 7 and 8 are present in the intervals [5, 8] and [7, 10].
 *                            // the integers 9 and 10 are present in the interval [7, 10].
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= left &lt;= right &lt;= 109
 *
 * At most 105 calls in total will be made to add and count.
 *
 * At least one call will be made to count.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: How can you efficiently add intervals to the set of intervals? Can a data structure like a Binary Search Tree help?
 * Hint 2: How can you ensure that the intervals present in the set are non-overlapping? Try merging the overlapping intervals whenever a new interval is added.
 * Hint 3: How can you update the count of integers present in at least one interval when a new interval is added to the set?
 *
 * <h2>Approach</h2>
 * Think about the category (Design, Segment Tree, Ordered Set).
 *
 * @see <a href="https://leetcode.com/problems/count-integers-in-intervals/">LeetCode #2276</a>
 */
public class CountIntegersInIntervals {

    public static class TreeNode {
        int val; TreeNode left, right;
        TreeNode(int v) { val = v; }
    }
    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Count Integers in Intervals");
    }

    public static void main(String[] args) {
        System.out.println("=== CountIntegersInIntervals ===");
        CountIntegersInIntervals sol = new CountIntegersInIntervals();
        System.out.println(sol.solve(null));
    }
}
