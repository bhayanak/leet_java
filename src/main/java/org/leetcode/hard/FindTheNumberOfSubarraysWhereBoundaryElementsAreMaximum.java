package org.leetcode.hard;


/**
 * <b>#3113 - Find the Number of Subarrays Where Boundary Elements Are Maximum</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Binary Search, Stack, Monotonic Stack</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an array of positive integers nums.
 *
 *
 * Return the number of subarrays of nums, where the first and the last elements of the subarray are equal to the largest element in the subarray.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,4,3,3,2]
 *
 *
 * Output: 6
 *
 *
 * Explanation:
 *
 *
 * There are 6 subarrays which have the first and the last elements equal to the largest element of the subarray:
 *
 *
 * subarray [1,4,3,3,2], with its largest element 1. The first element is 1 and the last element is also 1.
 *
 * subarray [1,4,3,3,2], with its largest element 4. The first element is 4 and the last element is also 4.
 *
 * subarray [1,4,3,3,2], with its largest element 3. The first element is 3 and the last element is also 3.
 *
 * subarray [1,4,3,3,2], with its largest element 3. The first element is 3 and the last element is also 3.
 *
 * subarray [1,4,3,3,2], with its largest element 2. The first element is 2 and the last element is also 2.
 *
 * subarray [1,4,3,3,2], with its largest element 3. The first element is 3 and the last element is also 3.
 *
 * Hence, we return 6.
 *
 * Example 2:
 *
 * Input: nums = [3,3,3]
 *
 *
 * Output: 6
 *
 *
 * Explanation:
 *
 *
 * There are 6 subarrays which have the first and the last elements equal to the largest element of the subarray:
 *
 *
 * subarray [3,3,3], with its largest element 3. The first element is 3 and the last element is also 3.
 *
 * subarray [3,3,3], with its largest element 3. The first element is 3 and the last element is also 3.
 *
 * subarray [3,3,3], with its largest element 3. The first element is 3 and the last element is also 3.
 *
 * subarray [3,3,3], with its largest element 3. The first element is 3 and the last element is also 3.
 *
 * subarray [3,3,3], with its largest element 3. The first element is 3 and the last element is also 3.
 *
 * subarray [3,3,3], with its largest element 3. The first element is 3 and the last element is also 3.
 *
 * Hence, we return 6.
 *
 * Example 3:
 *
 * Input: nums = [1]
 *
 *
 * Output: 1
 *
 *
 * Explanation:
 *
 *
 * There is a single subarray of nums which is [1], with its largest element 1. The first element is 1 and the last element is also 1.
 *
 *
 * Hence, we return 1.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 105
 *
 * 1 &lt;= nums[i] &lt;= 109
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: For each element <code>nums[i]</code>, we can count the number of valid subarrays ending with it.
 * Hint 2: For each index <code>i</code>, find the nearest index <code>j</code> on its left <code>(j &lt; i)</code> such that <code>nums[j] &lt; nums[i]</code>. This can be done via a monotonic stack.
 * Hint 3: For each index <code>i</code>, find the number of indices <code>k</code> in the window <code>[j + 1, i]</code> such that <code>nums[k] == nums[i]</code>, this is the number of the valid subarrays ending with <code>nums[i]</code>. This can be done by sliding window.
 * Hint 4: Sum the answer of all the indices <code>i</code> to get the final result.
 * Hint 5: Is it possible to use DSU as an alternate solution?
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Binary Search, Stack, Monotonic Stack).
 *
 * @see <a href="https://leetcode.com/problems/find-the-number-of-subarrays-where-boundary-elements-are-maximum/">LeetCode #3113</a>
 */
public class FindTheNumberOfSubarraysWhereBoundaryElementsAreMaximum {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Find the Number of Subarrays Where Boundary Elements Are Maximum");
    }

    public static void main(String[] args) {
        System.out.println("=== FindTheNumberOfSubarraysWhereBoundaryElementsAreMaximum ===");
        FindTheNumberOfSubarraysWhereBoundaryElementsAreMaximum sol = new FindTheNumberOfSubarraysWhereBoundaryElementsAreMaximum();
        System.out.println(sol.solve(null));
    }
}
