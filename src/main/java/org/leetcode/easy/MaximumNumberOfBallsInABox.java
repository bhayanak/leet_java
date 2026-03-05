package org.leetcode.easy;


/**
 * <b>#1742 - Maximum Number of Balls in a Box</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Hash Table, Math, Counting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are working in a ball factory where you have n balls numbered from lowLimit up to highLimit inclusive (i.e., n == highLimit - lowLimit + 1), and an infinite number of boxes numbered from 1 to infinity.
 *
 *
 * Your job at this factory is to put each ball in the box with a number equal to the sum of digits of the ball's number. For example, the ball number 321 will be put in the box number 3 + 2 + 1 = 6 and the ball number 10 will be put in the box number 1 + 0 = 1.
 *
 *
 * Given two integers lowLimit and highLimit, return the number of balls in the box with the most balls.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: lowLimit = 1, highLimit = 10
 * Output: 2
 * Explanation:
 * Box Number:  1 2 3 4 5 6 7 8 9 10 11 ...
 * Ball Count:  2 1 1 1 1 1 1 1 1 0  0  ...
 * Box 1 has the most number of balls with 2 balls.
 *
 * Example 2:
 *
 * Input: lowLimit = 5, highLimit = 15
 * Output: 2
 * Explanation:
 * Box Number:  1 2 3 4 5 6 7 8 9 10 11 ...
 * Ball Count:  1 1 1 1 2 2 1 1 1 0  0  ...
 * Boxes 5 and 6 have the most number of balls with 2 balls in each.
 *
 * Example 3:
 *
 * Input: lowLimit = 19, highLimit = 28
 * Output: 2
 * Explanation:
 * Box Number:  1 2 3 4 5 6 7 8 9 10 11 12 ...
 * Ball Count:  0 1 1 1 1 1 1 1 1 2  0  0  ...
 * Box 10 has the most number of balls with 2 balls.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= lowLimit &lt;= highLimit &lt;= 105
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Note that both lowLimit and highLimit are of small constraints so you can iterate on all number between them
 * Hint 2: You can simulate the boxes by counting for each box the number of balls with digit sum equal to that box number
 *
 * <h2>Approach</h2>
 * Think about the category (Hash Table, Math, Counting).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/maximum-number-of-balls-in-a-box/">LeetCode #1742</a>
  *
  * <p><b>Explanation:</b> Uses a HashMap for O(1) average-time lookups, mapping values to indices/counts.</p>
  */
public class MaximumNumberOfBallsInABox {

    /**
     * Counts Count balls.
     * Uses a hash map to track occurrences or cache results.
     *
     * @param lowLimit the lowLimit (int)
     * @param highLimit the highLimit (int)
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Uses a HashMap for O(1) average-time lookups, mapping values to indices/counts.</p>
      */
    public int countBalls(int lowLimit, int highLimit) {
        java.util.Map<Integer,Integer> boxes = new java.util.HashMap<>();
        int max=0;
        for (int i=lowLimit;i<=highLimit;i++) {
            int key=0, n=i;
            while (n>0) { key+=n%10; n/=10; }
            int cnt = boxes.merge(key,1,Integer::sum);
            max=Math.max(max,cnt);
        }
        return max;
    }

    /**
     * Runs sample test cases.
      *
      * <p><b>Explanation:</b> Applies a direct mathematical formula, avoiding the need for iteration or extra space.</p>
      */
    public static void main(String[] args) {
        MaximumNumberOfBallsInABox sol = new MaximumNumberOfBallsInABox();
                System.out.println(sol.countBalls(1,10));    // 2
                System.out.println(sol.countBalls(5,15));    // 2
                System.out.println(sol.countBalls(19,28));   // 2
    }
}
