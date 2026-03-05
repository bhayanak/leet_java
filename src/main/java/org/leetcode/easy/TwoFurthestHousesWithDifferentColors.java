package org.leetcode.easy;


/**
 * <b>#2078 - Two Furthest Houses With Different Colors</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Greedy</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * There are n houses evenly lined up on the street, and each house is beautifully painted. You are given a 0-indexed integer array colors of length n, where colors[i] represents the color of the ith house.
 *
 *
 * Return the maximum distance between two houses with different colors.
 *
 *
 * The distance between the ith and jth houses is abs(i - j), where abs(x) is the absolute value of x.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: colors = [1,1,1,6,1,1,1]
 * Output: 3
 * Explanation: In the above image, color 1 is blue, and color 6 is red.
 * The furthest two houses with different colors are house 0 and house 3.
 * House 0 has color 1, and house 3 has color 6. The distance between them is abs(0 - 3) = 3.
 * Note that houses 3 and 6 can also produce the optimal answer.
 *
 * Example 2:
 *
 * Input: colors = [1,8,3,8,3]
 * Output: 4
 * Explanation: In the above image, color 1 is blue, color 8 is yellow, and color 3 is green.
 * The furthest two houses with different colors are house 0 and house 4.
 * House 0 has color 1, and house 4 has color 3. The distance between them is abs(0 - 4) = 4.
 *
 * Example 3:
 *
 * Input: colors = [0,1]
 * Output: 1
 * Explanation: The furthest two houses with different colors are house 0 and house 1.
 * House 0 has color 0, and house 1 has color 1. The distance between them is abs(0 - 1) = 1.
 *
 *
 *
 * Constraints:
 *
 *
 * n == colors.length
 *
 * 2 &lt;= n &lt;= 100
 *
 * 0 &lt;= colors[i] &lt;= 100
 *
 * Test data are generated such that at least two houses have different colors.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: The constraints are small. Can you try the combination of every two houses?
 * Hint 2: Greedily, the maximum distance will come from either the pair of the leftmost house and possibly some house on the right with a different color, or the pair of the rightmost house and possibly some house on the left with a different color.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Greedy).
 *
 * @see <a href="https://leetcode.com/problems/two-furthest-houses-with-different-colors/">LeetCode #2078</a>
  *
  * <p><b>Explanation:</b> Tracks the running maximum in a single O(n) scan without extra space.</p>
  */
public class TwoFurthestHousesWithDifferentColors {

    /**
     * Computes the maximum Max distance.
     *
     * @param colors the colors (String)
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Tracks the running maximum in a single O(n) scan without extra space.</p>
      */
    public int maxDistance(String colors) {
        int n=colors.length(), max=0;
        for (int i=0;i<n;i++)
            for (int j=n-1;j>i;j--)
                if (colors.charAt(i)!=colors.charAt(j)) { max=Math.max(max,j-i); break; }
        return max;
    }

    public static void main(String[] args) {
        TwoFurthestHousesWithDifferentColors sol = new TwoFurthestHousesWithDifferentColors();
        System.out.println(sol.maxDistance("hello"));
    }
}
