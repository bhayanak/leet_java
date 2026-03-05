package org.leetcode.hard;


/**
 * <b>#1298 - Maximum Candies You Can Get from Boxes</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Breadth-First Search, Graph Theory</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You have n boxes labeled from 0 to n - 1. You are given four arrays: status, candies, keys, and containedBoxes where:
 *
 *
 * status[i] is 1 if the ith box is open and 0 if the ith box is closed,
 *
 * candies[i] is the number of candies in the ith box,
 *
 * keys[i] is a list of the labels of the boxes you can open after opening the ith box.
 *
 * containedBoxes[i] is a list of the boxes you found inside the ith box.
 *
 * You are given an integer array initialBoxes that contains the labels of the boxes you initially have. You can take all the candies in any open box and you can use the keys in it to open new boxes and you also can use the boxes you find in it.
 *
 *
 * Return the maximum number of candies you can get following the rules above.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: status = [1,0,1,0], candies = [7,5,4,100], keys = [[],[],[1],[]], containedBoxes = [[1,2],[3],[],[]], initialBoxes = [0]
 * Output: 16
 * Explanation: You will be initially given box 0. You will find 7 candies in it and boxes 1 and 2.
 * Box 1 is closed and you do not have a key for it so you will open box 2. You will find 4 candies and a key to box 1 in box 2.
 * In box 1, you will find 5 candies and box 3 but you will not find a key to box 3 so box 3 will remain closed.
 * Total number of candies collected = 7 + 4 + 5 = 16 candy.
 *
 * Example 2:
 *
 * Input: status = [1,0,0,0,0,0], candies = [1,1,1,1,1,1], keys = [[1,2,3,4,5],[],[],[],[],[]], containedBoxes = [[1,2,3,4,5],[],[],[],[],[]], initialBoxes = [0]
 * Output: 6
 * Explanation: You have initially box 0. Opening it you can find boxes 1,2,3,4 and 5 and their keys.
 * The total number of candies will be 6.
 *
 *
 *
 * Constraints:
 *
 *
 * n == status.length == candies.length == keys.length == containedBoxes.length
 *
 * 1 &lt;= n &lt;= 1000
 *
 * status[i] is either 0 or 1.
 *
 * 1 &lt;= candies[i] &lt;= 1000
 *
 * 0 &lt;= keys[i].length &lt;= n
 *
 * 0 &lt;= keys[i][j] &lt; n
 *
 * All values of keys[i] are unique.
 *
 * 0 &lt;= containedBoxes[i].length &lt;= n
 *
 * 0 &lt;= containedBoxes[i][j] &lt; n
 *
 * All values of containedBoxes[i] are unique.
 *
 * Each box is contained in one box at most.
 *
 * 0 &lt;= initialBoxes.length &lt;= n
 *
 * 0 &lt;= initialBoxes[i] &lt; n
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use Breadth First Search (BFS) to traverse all possible boxes you can open. Only push to the queue the boxes the you have with their keys.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Breadth-First Search, Graph Theory).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/maximum-candies-you-can-get-from-boxes/">LeetCode #1298</a>
 */
public class MaximumCandiesYouCanGetFromBoxes {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Maximum Candies You Can Get from Boxes");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== MaximumCandiesYouCanGetFromBoxes ===");
        MaximumCandiesYouCanGetFromBoxes sol = new MaximumCandiesYouCanGetFromBoxes();
        System.out.println(sol.solve(null));
    }
}
