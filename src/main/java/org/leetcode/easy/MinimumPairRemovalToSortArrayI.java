package org.leetcode.easy;


/**
 * <b>#3507 - Minimum Pair Removal to Sort Array I</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Hash Table, Linked List, Heap (Priority Queue), Simulation, Doubly-Linked List, Ordered Set</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an array nums, you can perform the following operation any number of times:
 *
 *
 * Select the adjacent pair with the minimum sum in nums. If multiple such pairs exist, choose the leftmost one.
 *
 * Replace the pair with their sum.
 *
 * Return the minimum number of operations needed to make the array non-decreasing.
 *
 *
 * An array is said to be non-decreasing if each element is greater than or equal to its previous element (if it exists).
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [5,2,3,1]
 *
 *
 * Output: 2
 *
 *
 * Explanation:
 *
 *
 * The pair (3,1) has the minimum sum of 4. After replacement, nums = [5,2,4].
 *
 * The pair (2,4) has the minimum sum of 6. After replacement, nums = [5,6].
 *
 * The array nums became non-decreasing in two operations.
 *
 * Example 2:
 *
 * Input: nums = [1,2,2]
 *
 *
 * Output: 0
 *
 *
 * Explanation:
 *
 *
 * The array nums is already sorted.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 50
 *
 * -1000 &lt;= nums[i] &lt;= 1000
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Simulate the operations
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Linked List, Heap (Priority Queue), Simulation, Doubly-Linked List, Ordered Set).
 *
 * @see <a href="https://leetcode.com/problems/minimum-pair-removal-to-sort-array-i/">LeetCode #3507</a>
  *
  * <p><b>Explanation:</b> Iterates once, incrementing a counter each time the target condition is satisfied.</p>
  */
public class MinimumPairRemovalToSortArrayI {

    /**
     * Counts Count hill valley.
     *
     * @param nums the nums (int[])
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Iterates once, incrementing a counter each time the target condition is satisfied.</p>
      */
    public int countHillValley(int[] nums) {
        // Remove consecutive duplicates first
        java.util.List<Integer> arr=new java.util.ArrayList<>();
        for (int n:nums) if (arr.isEmpty()||arr.get(arr.size()-1)!=n) arr.add(n);
        int cnt=0;
        for (int i=1;i<arr.size()-1;i++)
            if ((arr.get(i)>arr.get(i-1)&&arr.get(i)>arr.get(i+1))||(arr.get(i)<arr.get(i-1)&&arr.get(i)<arr.get(i+1))) cnt++;
        return cnt;
    }

    public static void main(String[] args) {
        MinimumPairRemovalToSortArrayI sol = new MinimumPairRemovalToSortArrayI();
        System.out.println(sol.countHillValley(new int[]{1,2,3}));
    }
}
