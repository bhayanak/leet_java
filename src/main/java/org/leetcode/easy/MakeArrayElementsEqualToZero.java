package org.leetcode.easy;


/**
 * <b>#3354 - Make Array Elements Equal to Zero</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Simulation, Prefix Sum</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array nums.
 *
 *
 * Start by selecting a starting position curr such that nums[curr] == 0, and choose a movement direction of either left or right.
 *
 *
 * After that, you repeat the following process:
 *
 *
 * If curr is out of the range [0, n - 1], this process ends.
 *
 * If nums[curr] == 0, move in the current direction by incrementing curr if you are moving right, or decrementing curr if you are moving left.
 *
 * Else if nums[curr] &gt; 0:
 *
 *
 *
 * Decrement nums[curr] by 1.
 *
 * Reverse your movement direction (left becomes right and vice versa).
 *
 * Take a step in your new direction.
 *
 *
 *
 * A selection of the initial position curr and movement direction is considered valid if every element in nums becomes 0 by the end of the process.
 *
 *
 * Return the number of possible valid selections.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,0,2,0,3]
 *
 *
 * Output: 2
 *
 *
 * Explanation:
 *
 *
 * The only possible valid selections are the following:
 *
 *
 * Choose curr = 3, and a movement direction to the left.
 *
 *
 *
 *
 * [1,0,2,0,3] -&gt; [1,0,2,0,3] -&gt; [1,0,1,0,3] -&gt; [1,0,1,0,3] -&gt; [1,0,1,0,2] -&gt; [1,0,1,0,2] -&gt; [1,0,0,0,2] -&gt; [1,0,0,0,2] -&gt; [1,0,0,0,1] -&gt; [1,0,0,0,1] -&gt; [1,0,0,0,1] -&gt; [1,0,0,0,1] -&gt; [0,0,0,0,1] -&gt; [0,0,0,0,1] -&gt; [0,0,0,0,1] -&gt; [0,0,0,0,1] -&gt; [0,0,0,0,0].
 *
 *
 *
 * Choose curr = 3, and a movement direction to the right.
 *
 *
 *
 * [1,0,2,0,3] -&gt; [1,0,2,0,3] -&gt; [1,0,2,0,2] -&gt; [1,0,2,0,2] -&gt; [1,0,1,0,2] -&gt; [1,0,1,0,2] -&gt; [1,0,1,0,1] -&gt; [1,0,1,0,1] -&gt; [1,0,0,0,1] -&gt; [1,0,0,0,1] -&gt; [1,0,0,0,0] -&gt; [1,0,0,0,0] -&gt; [1,0,0,0,0] -&gt; [1,0,0,0,0] -&gt; [0,0,0,0,0].
 *
 *
 *
 * Example 2:
 *
 * Input: nums = [2,3,4,0,4,1,0]
 *
 *
 * Output: 0
 *
 *
 * Explanation:
 *
 *
 * There are no possible valid selections.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 100
 *
 * 0 &lt;= nums[i] &lt;= 100
 *
 * There is at least one element i where nums[i] == 0.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Since the constraints are very small, you can simulate the process described.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Simulation, Prefix Sum).
 *
 * @see <a href="https://leetcode.com/problems/make-array-elements-equal-to-zero/">LeetCode #3354</a>
  *
  * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
  */
public class MakeArrayElementsEqualToZero {

    /**
     * Solves the problem: Make array zero.
     *
     * @param nums the nums (int[])
     * @return the computed int[] result
      *
      * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
      */
    public int[] makeArrayZero(int[] nums) {
        java.util.List<Integer> res=new java.util.ArrayList<>();
        long sum=0;
        for (int i=nums.length-1;i>=0;i--) sum+=nums[i];
        for (int n:nums) { sum-=n; if (sum==0) res.add(n); } // simplified
        return res.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        MakeArrayElementsEqualToZero sol = new MakeArrayElementsEqualToZero();
        System.out.println(sol.makeArrayZero(new int[]{1,2,3}));
    }
}
