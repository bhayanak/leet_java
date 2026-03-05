package org.leetcode.hard;


/**
 * <b>#3420 - Count Non-Decreasing Subarrays After K Operations</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Stack, Segment Tree, Queue, Sliding Window, Monotonic Stack, Monotonic Queue</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an array nums of n integers and an integer k.
 *
 *
 * For each subarray of nums, you can apply up to k operations on it. In each operation, you increment any element of the subarray by 1.
 *
 *
 * Note that each subarray is considered independently, meaning changes made to one subarray do not persist to another.
 *
 *
 * Return the number of subarrays that you can make non-decreasing ​​​​​after performing at most k operations.
 *
 *
 * An array is said to be non-decreasing if each element is greater than or equal to its previous element, if it exists.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [6,3,1,2,4,4], k = 7
 *
 *
 * Output: 17
 *
 *
 * Explanation:
 *
 *
 * Out of all 21 possible subarrays of nums, only the subarrays [6, 3, 1], [6, 3, 1, 2], [6, 3, 1, 2, 4] and [6, 3, 1, 2, 4, 4] cannot be made non-decreasing after applying up to k = 7 operations. Thus, the number of non-decreasing subarrays is 21 - 4 = 17.
 *
 * Example 2:
 *
 * Input: nums = [6,3,1,3,6], k = 4
 *
 *
 * Output: 12
 *
 *
 * Explanation:
 *
 *
 * The subarray [3, 1, 3, 6] along with all subarrays of nums with three or fewer elements, except [6, 3, 1], can be made non-decreasing after k operations. There are 5 subarrays of a single element, 4 subarrays of two elements, and 2 subarrays of three elements except [6, 3, 1], so there are 1 + 5 + 4 + 2 = 12 subarrays that can be made non-decreasing.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 105
 *
 * 1 &lt;= nums[i] &lt;= 109
 *
 * 1 &lt;= k &lt;= 109
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use a sparse table.
 * Hint 2: Compute <code>sp[e][i] = [lastElement, operations]</code> where <code>operations</code> is the number of <code>operations</code> required to make the subarray <code>nums[i...i + 2^e - 1]</code> non-decreasing, and <code>lastElement</code> be the value of the last element after the operations were applied on it.
 * Hint 3: How can we combine <code>sp[a][i]</code> with <code>sp[b][i + 2^a]</code> to find the answer for the subarray <code>nums[i...i + 2^a + 2^b - 1]</code>?
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Stack, Segment Tree, Queue, Sliding Window, Monotonic Stack, Monotonic Queue).
 *
 * @see <a href="https://leetcode.com/problems/count-non-decreasing-subarrays-after-k-operations/">LeetCode #3420</a>
 */
public class CountNonDecreasingSubarraysAfterKOperations {

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
        throw new UnsupportedOperationException("Not yet implemented: Count Non-Decreasing Subarrays After K Operations");
    }

    public static void main(String[] args) {
        System.out.println("=== CountNonDecreasingSubarraysAfterKOperations ===");
        CountNonDecreasingSubarraysAfterKOperations sol = new CountNonDecreasingSubarraysAfterKOperations();
        System.out.println(sol.solve(null));
    }
}
