package org.leetcode.medium;


/**
 * <b>#2615 - Sum of Distances</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Hash Table, Prefix Sum</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a 0-indexed integer array nums. There exists an array arr of length nums.length, where arr[i] is the sum of |i - j| over all j such that nums[j] == nums[i] and j != i. If there is no such j, set arr[i] to be 0.
 *
 *
 * Return the array arr.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,3,1,1,2]
 * Output: [5,0,3,4,0]
 * Explanation: 
 * When i = 0, nums[0] == nums[2] and nums[0] == nums[3]. Therefore, arr[0] = |0 - 2| + |0 - 3| = 5. 
 * When i = 1, arr[1] = 0 because there is no other index with value 3.
 * When i = 2, nums[2] == nums[0] and nums[2] == nums[3]. Therefore, arr[2] = |2 - 0| + |2 - 3| = 3. 
 * When i = 3, nums[3] == nums[0] and nums[3] == nums[2]. Therefore, arr[3] = |3 - 0| + |3 - 2| = 4. 
 * When i = 4, arr[4] = 0 because there is no other index with value 2. 
 *
 * Example 2:
 *
 * Input: nums = [0,5,3]
 * Output: [0,0,0]
 * Explanation: Since each element in nums is distinct, arr[i] = 0 for all i.
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
 *
 *
 * Note: This question is the same as  2121: Intervals Between Identical Elements.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Can we use the prefix sum here?
 * Hint 2: For each number x, collect all the indices where x occurs, and calculate the prefix sum of the array.
 * Hint 3: For each occurrence of x, the indices to the right will be regular subtraction while the indices to the left will be reversed subtraction.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Prefix Sum).
 *
 * @see <a href="https://leetcode.com/problems/sum-of-distances/">LeetCode #2615</a>
 */
public class SumOfDistances {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Sum of Distances");
    }

    public static void main(String[] args) {
        System.out.println("=== SumOfDistances ===");
        SumOfDistances sol = new SumOfDistances();
        System.out.println(sol.solve(null));
    }
}
