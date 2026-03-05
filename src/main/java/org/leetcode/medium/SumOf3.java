package org.leetcode.medium;

/**
 * <b>#15 - SumOf3</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Two Pointers, Sorting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
 *
 *
 * Notice that the solution set must not contain duplicate triplets.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [-1,0,1,2,-1,-4]
 * Output: [[-1,-1,2],[-1,0,1]]
 * Explanation: 
 * nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
 * nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
 * nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
 * The distinct triplets are [-1,0,1] and [-1,-1,2].
 * Notice that the order of the output and the order of the triplets does not matter.
 *
 * Example 2:
 *
 * Input: nums = [0,1,1]
 * Output: []
 * Explanation: The only possible triplet does not sum up to 0.
 *
 * Example 3:
 *
 * Input: nums = [0,0,0]
 * Output: [[0,0,0]]
 * Explanation: The only possible triplet sums up to 0.
 *
 *
 *
 * Constraints:
 *
 *
 * 3 &lt;= nums.length &lt;= 3000
 *
 * -105 &lt;= nums[i] &lt;= 105
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * - So, we essentially need to find three numbers x, y, and z such that they add up to the given value. If we fix one of the numbers say x, we are left with the two-sum problem at hand!
 * - For the two-sum problem, if we fix one of the numbers, say x, we have to scan the entire array to find the next number y, which is value - x where value is the input parameter. Can we change our array somehow so that this search becomes faster?
 * - The second train of thought for two-sum is, without changing the array, can we use additional space somehow? Like maybe a hash map to speed up the search?
 *
 * <h2>Approach</h2>
 * Sort the array. For each element a[i], use two pointers (i+1, n-1) to find
 * pairs summing to -a[i]. Skip duplicates at each pointer position to avoid
 * repeated triplets.
 *
 * <h2>Complexity</h2>
 * Time: O(n²)  |  Space: O(1) excluding output
 *
 * @see <a href="https://leetcode.com/problems/3sum/">LeetCode #15</a>
 */
public class SumOf3 {

    /**
     * Finds all unique triplets [a, b, c] in the array such that a + b + c = 0.
     *
     * @param nums input array of integers
     * @return     list of all unique zero-sum triplets
     */
    public java.util.List<java.util.List<Integer>> threeSum(int[] nums) {
        java.util.Arrays.sort(nums);
        java.util.List<java.util.List<Integer>> result = new java.util.ArrayList<>();

        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1])
                continue; // skip duplicate pivot
            int left = i + 1, right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    result.add(java.util.Arrays.asList(nums[i], nums[left], nums[right]));
                    while (left < right && nums[left] == nums[left + 1])
                        left++;
                    while (left < right && nums[right] == nums[right - 1])
                        right--;
                    left++;
                    right--;
                } else if (sum < 0)
                    left++;
                else
                    right--;
            }
        }
        return result;
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== SumOf3 ===");
        System.out.println("See class methods for usage.");
    }
}
