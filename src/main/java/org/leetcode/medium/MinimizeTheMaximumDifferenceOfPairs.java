package org.leetcode.medium;


/**
 * <b>#2616 - Minimize the Maximum Difference of Pairs</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Binary Search, Dynamic Programming, Greedy, Sorting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a 0-indexed integer array nums and an integer p. Find p pairs of indices of nums such that the maximum difference amongst all the pairs is minimized. Also, ensure no index appears more than once amongst the p pairs.
 *
 *
 * Note that for a pair of elements at the index i and j, the difference of this pair is |nums[i] - nums[j]|, where |x| represents the absolute value of x.
 *
 *
 * Return the minimum maximum difference among all p pairs. We define the maximum of an empty set to be zero.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [10,1,2,7,1,3], p = 2
 * Output: 1
 * Explanation: The first pair is formed from the indices 1 and 4, and the second pair is formed from the indices 2 and 5. 
 * The maximum difference is max(|nums[1] - nums[4]|, |nums[2] - nums[5]|) = max(0, 1) = 1. Therefore, we return 1.
 *
 * Example 2:
 *
 * Input: nums = [4,2,1,2], p = 1
 * Output: 0
 * Explanation: Let the indices 1 and 3 form a pair. The difference of that pair is |2 - 2| = 0, which is the minimum we can attain.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 105
 *
 * 0 &lt;= nums[i] &lt;= 109
 *
 * 0 &lt;= p &lt;= (nums.length)/2
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: To minimize the answer, the array should be sorted first.
 * Hint 2: Can we use binary search here?
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Binary Search, Dynamic Programming, Greedy, Sorting).
 *
 * @see <a href="https://leetcode.com/problems/minimize-the-maximum-difference-of-pairs/">LeetCode #2616</a>
 */
public class MinimizeTheMaximumDifferenceOfPairs {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Minimize the Maximum Difference of Pairs");
    }

    public static void main(String[] args) {
        System.out.println("=== MinimizeTheMaximumDifferenceOfPairs ===");
        MinimizeTheMaximumDifferenceOfPairs sol = new MinimizeTheMaximumDifferenceOfPairs();
        System.out.println(sol.solve(null));
    }
}
