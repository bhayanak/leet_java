package org.leetcode.easy;


/**
 * <b>#2855 - Minimum Right Shifts to Sort the Array</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a 0-indexed array nums of length n containing distinct positive integers. Return the minimum number of right shifts required to sort nums and -1 if this is not possible.
 *
 *
 * A right shift is defined as shifting the element at index i to index (i + 1) % n, for all indices.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [3,4,5,1,2]
 * Output: 2
 * Explanation: 
 * After the first right shift, nums = [2,3,4,5,1].
 * After the second right shift, nums = [1,2,3,4,5].
 * Now nums is sorted; therefore the answer is 2.
 *
 * Example 2:
 *
 * Input: nums = [1,3,5]
 * Output: 0
 * Explanation: nums is already sorted therefore, the answer is 0.
 *
 * Example 3:
 *
 * Input: nums = [2,1,4]
 * Output: -1
 * Explanation: It's impossible to sort the array using right shifts.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 100
 *
 * 1 &lt;= nums[i] &lt;= 100
 *
 * nums contains distinct integers.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Find the pivot point around which the array is rotated.
 * Hint 2: Will the answer exist if there is more than one point where <code>nums[i] &lt; nums[i-1]</code>?
 *
 * <h2>Approach</h2>
 * Think about the category (Array).
 *
 * @see <a href="https://leetcode.com/problems/minimum-right-shifts-to-sort-the-array/">LeetCode #2855</a>
  *
  * <p><b>Explanation:</b> Tracks the running minimum in a single O(n) scan.</p>
  */
public class MinimumRightShiftsToSortTheArray {

    /**
     * Solves the problem: Minimum right shifts.
     * Sorts the input first to enable efficient processing.
     *
     * @param nums the nums (java.util.List&lt;Integer&gt;)
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Tracks the running minimum in a single O(n) scan.</p>
      */
    public int minimumRightShifts(java.util.List<Integer> nums) {
        int n=nums.size();
        for (int k=0;k<=n;k++) {
            boolean sorted=true;
            for (int i=0;i<n-1;i++) if (nums.get((i+k)%n)>nums.get((i+k+1)%n)) { sorted=false; break; }
            if (sorted) return k;
        }
        return -1;
    }

    public static void main(String[] args) {
        MinimumRightShiftsToSortTheArray sol = new MinimumRightShiftsToSortTheArray();
                System.out.println(sol.minimumRightShifts(java.util.Arrays.asList(3,4,5,1,2))); // 2
                System.out.println(sol.minimumRightShifts(java.util.Arrays.asList(1,3,5))); // 0
                System.out.println(sol.minimumRightShifts(java.util.Arrays.asList(2,1,4))); // -1
    }
}
