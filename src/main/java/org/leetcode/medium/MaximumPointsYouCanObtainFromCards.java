package org.leetcode.medium;


/**
 * <b>#1423 - Maximum Points You Can Obtain from Cards</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Sliding Window, Prefix Sum</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * There are several cards arranged in a row, and each card has an associated number of points. The points are given in the integer array cardPoints.
 *
 *
 * In one step, you can take one card from the beginning or from the end of the row. You have to take exactly k cards.
 *
 *
 * Your score is the sum of the points of the cards you have taken.
 *
 *
 * Given the integer array cardPoints and the integer k, return the maximum score you can obtain.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: cardPoints = [1,2,3,4,5,6,1], k = 3
 * Output: 12
 * Explanation: After the first step, your score will always be 1. However, choosing the rightmost card first will maximize your total score. The optimal strategy is to take the three cards on the right, giving a final score of 1 + 6 + 5 = 12.
 *
 * Example 2:
 *
 * Input: cardPoints = [2,2,2], k = 2
 * Output: 4
 * Explanation: Regardless of which two cards you take, your score will always be 4.
 *
 * Example 3:
 *
 * Input: cardPoints = [9,7,7,9,7,7,9], k = 7
 * Output: 55
 * Explanation: You have to take all the cards. Your score is the sum of points of all cards.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= cardPoints.length &lt;= 105
 *
 * 1 &lt;= cardPoints[i] &lt;= 104
 *
 * 1 &lt;= k &lt;= cardPoints.length
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Let the sum of all points be total_pts. You need to remove a sub-array from cardPoints with length n - k.
 * Hint 2: Keep a window of size n - k over the array. The answer is max(answer, total_pts - sumOfCurrentWindow)
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Sliding Window, Prefix Sum).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/maximum-points-you-can-obtain-from-cards/">LeetCode #1423</a>
 */
public class MaximumPointsYouCanObtainFromCards {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Maximum Points You Can Obtain from Cards");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== MaximumPointsYouCanObtainFromCards ===");
        MaximumPointsYouCanObtainFromCards sol = new MaximumPointsYouCanObtainFromCards();
        System.out.println(sol.solve(null));
    }
}
