package org.leetcode.easy;


/**
 * <b>#1725 - Number Of Rectangles That Can Form The Largest Square</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an array rectangles where rectangles[i] = [li, wi] represents the ith rectangle of length li and width wi.
 *
 *
 * You can cut the ith rectangle to form a square with a side length of k if both k &lt;= li and k &lt;= wi. For example, if you have a rectangle [4,6], you can cut it to get a square with a side length of at most 4.
 *
 *
 * Let maxLen be the side length of the largest square you can obtain from any of the given rectangles.
 *
 *
 * Return the number of rectangles that can make a square with a side length of maxLen.
 *
 *
 *
 *
 * Example 1:
 *
 *
 *
 * Input: rectangles = [[5,8],[3,9],[5,12],[16,5]]
 * Output: 3
 * Explanation: The largest squares you can get from each rectangle are of lengths [5,3,5,5].
 * The largest possible square is of length 5, and you can get it out of 3 rectangles.
 *
 *
 *
 *
 * Example 2:
 *
 *
 *
 * Input: rectangles = [[2,3],[3,7],[4,3],[3,7]]
 * Output: 3
 *
 *
 *
 *
 *
 *
 * Constraints:
 *
 *
 *
 *
 * 1 &lt;= rectangles.length &lt;= 1000
 *
 * rectangles[i].length == 2
 *
 * 1 &lt;= li, wi &lt;= 109
 *
 * li != wi
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: What is the length of the largest square the can be cut out of some rectangle? It'll be equal to min(rectangle.length, rectangle.width). Replace each rectangle with this value.
 * Hint 2: Calculate maxSize by iterating over the given rectangles and maximizing the answer with their values denoted in the first hint.
 * Hint 3: Then iterate again on the rectangles and calculate the number whose values = maxSize.
 *
 * <h2>Approach</h2>
 * Think about the category (Array).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/number-of-rectangles-that-can-form-the-largest-square/">LeetCode #1725</a>
  *
  * <p><b>Explanation:</b> Iterates once, incrementing a counter each time the target condition is satisfied.</p>
  */
public class NumberOfRectanglesThatCanFormTheLargestSquare {

    /**
     * Counts Count good rectangles.
     *
     * @param rectangles the rectangles (int[][])
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Iterates once, incrementing a counter each time the target condition is satisfied.</p>
      */
    public int countGoodRectangles(int[][] rectangles) {
        int maxLen=0, count=0;
        for (int[] r:rectangles) {
            int sq=Math.min(r[0],r[1]);
            if (sq>maxLen) { maxLen=sq; count=1; }
            else if (sq==maxLen) count++;
        }
        return count;
    }

    /**
     * Runs sample test cases.
      *
      * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
      */
    public static void main(String[] args) {
        NumberOfRectanglesThatCanFormTheLargestSquare sol = new NumberOfRectanglesThatCanFormTheLargestSquare();
                System.out.println(sol.countGoodRectangles(new int[][]{{5,8},{3,9},{5,12},{16,5}})); // 3
                System.out.println(sol.countGoodRectangles(new int[][]{{2,3},{3,7},{4,3},{3,7}})); // 3
    }
}
