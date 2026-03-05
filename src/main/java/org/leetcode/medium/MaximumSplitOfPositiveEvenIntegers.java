package org.leetcode.medium;


/**
 * <b>#2178 - Maximum Split of Positive Even Integers</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Math, Backtracking, Greedy</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer finalSum. Split it into a sum of a maximum number of unique positive even integers.
 *
 *
 * For example, given finalSum = 12, the following splits are valid (unique positive even integers summing up to finalSum): (12), (2 + 10), (2 + 4 + 6), and (4 + 8). Among them, (2 + 4 + 6) contains the maximum number of integers. Note that finalSum cannot be split into (2 + 2 + 4 + 4) as all the numbers should be unique.
 *
 * Return a list of integers that represent a valid split containing a maximum number of integers. If no valid split exists for finalSum, return an empty list. You may return the integers in any order.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: finalSum = 12
 * Output: [2,4,6]
 * Explanation: The following are valid splits: (12), (2 + 10), (2 + 4 + 6), and (4 + 8).
 * (2 + 4 + 6) has the maximum number of integers, which is 3. Thus, we return [2,4,6].
 * Note that [2,6,4], [6,2,4], etc. are also accepted.
 *
 * Example 2:
 *
 * Input: finalSum = 7
 * Output: []
 * Explanation: There are no valid splits for the given finalSum.
 * Thus, we return an empty array.
 *
 * Example 3:
 *
 * Input: finalSum = 28
 * Output: [6,8,2,12]
 * Explanation: The following are valid splits: (2 + 26), (6 + 8 + 2 + 12), and (4 + 24). 
 * (6 + 8 + 2 + 12) has the maximum number of integers, which is 4. Thus, we return [6,8,2,12].
 * Note that [10,2,4,12], [6,2,4,16], etc. are also accepted.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= finalSum &lt;= 1010
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: First, check if finalSum is divisible by 2. If it isn’t, then we cannot split it into even integers.
 * Hint 2: Let k be the number of elements in our split. As we want the maximum number of elements, we should try to use the first k - 1 even elements to grow our sum as slowly as possible.
 * Hint 3: Thus, we find the maximum sum of the first k - 1 even elements which is less than finalSum.
 * Hint 4: We then add the difference over to the kth element.
 *
 * <h2>Approach</h2>
 * Think about the category (Math, Backtracking, Greedy).
 *
 * @see <a href="https://leetcode.com/problems/maximum-split-of-positive-even-integers/">LeetCode #2178</a>
 */
public class MaximumSplitOfPositiveEvenIntegers {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Maximum Split of Positive Even Integers");
    }

    public static void main(String[] args) {
        System.out.println("=== MaximumSplitOfPositiveEvenIntegers ===");
        MaximumSplitOfPositiveEvenIntegers sol = new MaximumSplitOfPositiveEvenIntegers();
        System.out.println(sol.solve(null));
    }
}
