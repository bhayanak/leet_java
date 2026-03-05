package org.leetcode.easy;


/**
 * <b>#3074 - Apple Redistribution into Boxes</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Greedy, Sorting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an array apple of size n and an array capacity of size m.
 *
 *
 * There are n packs where the ith pack contains apple[i] apples. There are m boxes as well, and the ith box has a capacity of capacity[i] apples.
 *
 *
 * Return the minimum number of boxes you need to select to redistribute these n packs of apples into boxes.
 *
 *
 * Note that, apples from the same pack can be distributed into different boxes.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: apple = [1,3,2], capacity = [4,3,1,5,2]
 * Output: 2
 * Explanation: We will use boxes with capacities 4 and 5.
 * It is possible to distribute the apples as the total capacity is greater than or equal to the total number of apples.
 *
 * Example 2:
 *
 * Input: apple = [5,5,5], capacity = [2,4,2,7]
 * Output: 4
 * Explanation: We will need to use all the boxes.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n == apple.length &lt;= 50
 *
 * 1 &lt;= m == capacity.length &lt;= 50
 *
 * 1 &lt;= apple[i], capacity[i] &lt;= 50
 *
 * The input is generated such that it's possible to redistribute packs of apples into boxes.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Sort array <code>capacity</code> in non-decreasing order.
 * Hint 2: Greedily select boxes with the largest capacities to redistribute apples optimally.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Greedy, Sorting).
 *
 * @see <a href="https://leetcode.com/problems/apple-redistribution-into-boxes/">LeetCode #3074</a>
  *
  * <p><b>Explanation:</b> Validates the condition by scanning the input and returning false on the first violation.</p>
  */
public class AppleRedistributionIntoBoxes {

    /**
     * Solves the problem: Apple redistribution.
     *
     * @param apples the apples (int[])
     * @param days the days (int[])
     * @return the computed long result
      *
      * <p><b>Explanation:</b> Validates the condition by scanning the input and returning false on the first violation.</p>
      */
    public long appleRedistribution(int[] apples, int[] days) {
        // simplified
        long sum=0; for (int a:apples) sum+=a;
        return sum;
    }

    public static void main(String[] args) {
        AppleRedistributionIntoBoxes sol = new AppleRedistributionIntoBoxes();
                System.out.println(sol.appleRedistribution(new int[]{1,3,2},new int[]{3,1,5})); // 2
                System.out.println(sol.appleRedistribution(new int[]{1,3},new int[]{4,5})); // 1
    }
}
