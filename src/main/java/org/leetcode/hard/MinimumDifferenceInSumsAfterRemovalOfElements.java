package org.leetcode.hard;


/**
 * <b>#2163 - Minimum Difference in Sums After Removal of Elements</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Dynamic Programming, Heap (Priority Queue)</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a 0-indexed integer array nums consisting of 3 * n elements.
 *
 *
 * You are allowed to remove any subsequence of elements of size exactly n from nums. The remaining 2 * n elements will be divided into two equal parts:
 *
 *
 * The first n elements belonging to the first part and their sum is sumfirst.
 *
 * The next n elements belonging to the second part and their sum is sumsecond.
 *
 * The difference in sums of the two parts is denoted as sumfirst - sumsecond.
 *
 *
 * For example, if sumfirst = 3 and sumsecond = 2, their difference is 1.
 *
 * Similarly, if sumfirst = 2 and sumsecond = 3, their difference is -1.
 *
 * Return the minimum difference possible between the sums of the two parts after the removal of n elements.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [3,1,2]
 * Output: -1
 * Explanation: Here, nums has 3 elements, so n = 1. 
 * Thus we have to remove 1 element from nums and divide the array into two equal parts.
 * - If we remove nums[0] = 3, the array will be [1,2]. The difference in sums of the two parts will be 1 - 2 = -1.
 * - If we remove nums[1] = 1, the array will be [3,2]. The difference in sums of the two parts will be 3 - 2 = 1.
 * - If we remove nums[2] = 2, the array will be [3,1]. The difference in sums of the two parts will be 3 - 1 = 2.
 * The minimum difference between sums of the two parts is min(-1,1,2) = -1. 
 *
 * Example 2:
 *
 * Input: nums = [7,9,5,8,1,3]
 * Output: 1
 * Explanation: Here n = 2. So we must remove 2 elements and divide the remaining array into two parts containing two elements each.
 * If we remove nums[2] = 5 and nums[3] = 8, the resultant array will be [7,9,1,3]. The difference in sums will be (7+9) - (1+3) = 12.
 * To obtain the minimum difference, we should remove nums[1] = 9 and nums[4] = 1. The resultant array becomes [7,5,8,3]. The difference in sums of the two parts is (7+5) - (8+3) = 1.
 * It can be shown that it is not possible to obtain a difference smaller than 1.
 *
 *
 *
 * Constraints:
 *
 *
 * nums.length == 3 * n
 *
 * 1 &lt;= n &lt;= 105
 *
 * 1 &lt;= nums[i] &lt;= 105
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: The lowest possible difference can be obtained when the sum of the first n elements in the resultant array is minimum, and the sum of the next n elements is maximum.
 * Hint 2: For every index i, think about how you can find the minimum possible sum of n elements with indices lesser or equal to i, if possible.
 * Hint 3: Similarly, for every index i, try to find the maximum possible sum of n elements with indices greater or equal to i, if possible.
 * Hint 4: Now for all indices, check if we can consider it as the partitioning index and hence find the answer.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Dynamic Programming, Heap (Priority Queue)).
 *
 * @see <a href="https://leetcode.com/problems/minimum-difference-in-sums-after-removal-of-elements/">LeetCode #2163</a>
 */
public class MinimumDifferenceInSumsAfterRemovalOfElements {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Minimum Difference in Sums After Removal of Elements");
    }

    public static void main(String[] args) {
        System.out.println("=== MinimumDifferenceInSumsAfterRemovalOfElements ===");
        MinimumDifferenceInSumsAfterRemovalOfElements sol = new MinimumDifferenceInSumsAfterRemovalOfElements();
        System.out.println(sol.solve(null));
    }
}
