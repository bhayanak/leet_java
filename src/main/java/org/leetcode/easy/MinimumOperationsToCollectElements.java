package org.leetcode.easy;


/**
 * <b>#2869 - Minimum Operations to Collect Elements</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Hash Table, Bit Manipulation</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an array nums of positive integers and an integer k.
 *
 *
 * In one operation, you can remove the last element of the array and add it to your collection.
 *
 *
 * Return the minimum number of operations needed to collect elements 1, 2, ..., k.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [3,1,5,4,2], k = 2
 * Output: 4
 * Explanation: After 4 operations, we collect elements 2, 4, 5, and 1, in this order. Our collection contains elements 1 and 2. Hence, the answer is 4.
 *
 * Example 2:
 *
 * Input: nums = [3,1,5,4,2], k = 5
 * Output: 5
 * Explanation: After 5 operations, we collect elements 2, 4, 5, 1, and 3, in this order. Our collection contains elements 1 through 5. Hence, the answer is 5.
 *
 * Example 3:
 *
 * Input: nums = [3,2,5,3,1], k = 3
 * Output: 4
 * Explanation: After 4 operations, we collect elements 1, 3, 5, and 2, in this order. Our collection contains elements 1 through 3. Hence, the answer is 4.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 50
 *
 * 1 &lt;= nums[i] &lt;= nums.length
 *
 * 1 &lt;= k &lt;= nums.length
 *
 * The input is generated such that you can collect elements 1, 2, ..., k.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use an occurrence array.
 * Hint 2: Iterate over the elements in reverse order.
 * Hint 3: If the current element <code>nums[i]</code> is not marked in the occurrence array and <code>nums[i] &lt;= k</code>, mark <code>nums[i]</code>.
 * Hint 4: Keep track of how many integers you have marked.
 * Hint 5: Return the current index as soon as the number of marked integers becomes equal to <code>k</code>.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Bit Manipulation).
 *
 * @see <a href="https://leetcode.com/problems/minimum-operations-to-collect-elements/">LeetCode #2869</a>
  *
  * <p><b>Explanation:</b> Uses a HashSet to detect duplicates or track seen elements in O(1) per operation.</p>
  */
public class MinimumOperationsToCollectElements {

    /**
     * Solves the problem: Minimum operations.
     *
     * @param nums the nums (java.util.List&lt;Integer&gt;)
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Uses a HashSet to detect duplicates or track seen elements in O(1) per operation.</p>
      */
    public int minimumOperations(java.util.List<Integer> nums) {
        java.util.Set<Integer> unique=new java.util.HashSet<>();
        int ops=0;
        for (int i=nums.size()-1;i>=0;i--) {
            if (!unique.add(nums.get(i))) {
                ops=(i/3)+1; break;
            }
        }
        return ops;
    }

    public static void main(String[] args) {
        MinimumOperationsToCollectElements sol = new MinimumOperationsToCollectElements();
        System.out.println(sol.minimumOperations(null));
    }
}
