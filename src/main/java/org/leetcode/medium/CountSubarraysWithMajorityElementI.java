package org.leetcode.medium;


/**
 * <b>#3737 - Count Subarrays With Majority Element I</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Hash Table, Divide and Conquer, Segment Tree, Merge Sort, Counting, Prefix Sum</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array nums and an integer target.
 *
 *
 * Return the number of subarrays of nums in which target is the majority element.
 *
 *
 * The majority element of a subarray is the element that appears strictly more than half of the times in that subarray.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,2,2,3], target = 2
 *
 *
 * Output: 5
 *
 *
 * Explanation:
 *
 *
 * Valid subarrays with target = 2 as the majority element:
 *
 *
 * nums[1..1] = [2]
 *
 * nums[2..2] = [2]
 *
 * nums[1..2] = [2,2]
 *
 * nums[0..2] = [1,2,2]
 *
 * nums[1..3] = [2,2,3]
 *
 * So there are 5 such subarrays.
 *
 * Example 2:
 *
 * Input: nums = [1,1,1,1], target = 1
 *
 *
 * Output: 10
 *
 *
 * Explanation: 
 *
 *
 * ​​​​​​​All 10 subarrays have 1 as the majority element.
 *
 * Example 3:
 *
 * Input: nums = [1,2,3], target = 4
 *
 *
 * Output: 0
 *
 *
 * Explanation:
 *
 *
 * target = 4 does not appear in nums at all. Therefore, there cannot be any subarray where 4 is the majority element. Hence the answer is 0.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 1000
 *
 * 1 &lt;= nums[i] &lt;= 10​​​​​​​9
 *
 * 1 &lt;= target &lt;= 109
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use brute force
 * Hint 2: Count all subarrays where <code>2 * count(target) &gt; length</code>
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Divide and Conquer, Segment Tree, Merge Sort, Counting, Prefix Sum).
 *
 * @see <a href="https://leetcode.com/problems/count-subarrays-with-majority-element-i/">LeetCode #3737</a>
 */
public class CountSubarraysWithMajorityElementI {

    public static class TreeNode {
        int val; TreeNode left, right;
        TreeNode(int v) { val = v; }
    }
    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Count Subarrays With Majority Element I");
    }

    public static void main(String[] args) {
        System.out.println("=== CountSubarraysWithMajorityElementI ===");
        CountSubarraysWithMajorityElementI sol = new CountSubarraysWithMajorityElementI();
        System.out.println(sol.solve(null));
    }
}
