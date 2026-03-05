package org.leetcode.easy;


/**
 * <b>#2357 - Make Array Zero by Subtracting Equal Amounts</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Hash Table, Greedy, Sorting, Heap (Priority Queue), Simulation</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a non-negative integer array nums. In one operation, you must:
 *
 *
 * Choose a positive integer x such that x is less than or equal to the smallest non-zero element in nums.
 *
 * Subtract x from every positive element in nums.
 *
 * Return the minimum number of operations to make every element in nums equal to 0.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,5,0,3,5]
 * Output: 3
 * Explanation:
 * In the first operation, choose x = 1. Now, nums = [0,4,0,2,4].
 * In the second operation, choose x = 2. Now, nums = [0,2,0,0,2].
 * In the third operation, choose x = 2. Now, nums = [0,0,0,0,0].
 *
 * Example 2:
 *
 * Input: nums = [0]
 * Output: 0
 * Explanation: Each element in nums is already 0 so no operations are needed.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 100
 *
 * 0 &lt;= nums[i] &lt;= 100
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: It is always best to set x as the smallest non-zero element in nums.
 * Hint 2: Elements with the same value will always take the same number of operations to become 0. Contrarily, elements with different values will always take a different number of operations to become 0.
 * Hint 3: The answer is the number of unique non-zero numbers in nums.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Greedy, Sorting, Heap (Priority Queue), Simulation).
 *
 * @see <a href="https://leetcode.com/problems/make-array-zero-by-subtracting-equal-amounts/">LeetCode #2357</a>
  *
  * <p><b>Explanation:</b> Uses a HashSet to detect duplicates or track seen elements in O(1) per operation.</p>
  */
public class MakeArrayZeroBySubtractingEqualAmounts {

    /**
     * Solves the problem: Minimum operations.
     *
     * @param nums the nums (int[])
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Uses a HashSet to detect duplicates or track seen elements in O(1) per operation.</p>
      */
    public int minimumOperations(int[] nums) {
        java.util.Set<Integer> unique=new java.util.HashSet<>();
        for (int n:nums) if (n!=0) unique.add(n);
        return unique.size();
    }

    public static void main(String[] args) {
        MakeArrayZeroBySubtractingEqualAmounts sol = new MakeArrayZeroBySubtractingEqualAmounts();
                System.out.println(sol.minimumOperations(new int[]{1,5,0,3,5})); // 3
                System.out.println(sol.minimumOperations(new int[]{0})); // 0
    }
}
