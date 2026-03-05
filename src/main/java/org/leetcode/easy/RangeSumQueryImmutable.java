package org.leetcode.easy;

/**
 * <b>#303 - Range Sum Query - Immutable</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Design, Prefix Sum</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an integer array nums, handle multiple queries of the following type:
 * 
 * 	
 * Calculate the sum of the elements of nums between indices left and right inclusive where left &lt;= right.
 * 
 * Implement the NumArray class:
 * 
 * 	
 * NumArray(int[] nums) Initializes the object with the integer array nums.
 * 	
 * int sumRange(int left, int right) Returns the sum of the elements of nums between indices left and right inclusive (i.e. nums[left] + nums[left + 1] + ... + nums[right]).
 * 
 *  
 * 
 * Example 1:
 * 
 * Input
 * ["NumArray", "sumRange", "sumRange", "sumRange"]
 * [[[-2, 0, 3, -5, 2, -1]], [0, 2], [2, 5], [0, 5]]
 * Output
 * [null, 1, -1, -3]
 * 
 * Explanation
 * NumArray numArray = new NumArray([-2, 0, 3, -5, 2, -1]);
 * numArray.sumRange(0, 2); // return (-2) + 0 + 3 = 1
 * numArray.sumRange(2, 5); // return 3 + (-5) + 2 + (-1) = -1
 * numArray.sumRange(0, 5); // return (-2) + 0 + 3 + (-5) + 2 + (-1) = -3
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * 1 &lt;= nums.length &lt;= 104
 * 	
 * -105 &lt;= nums[i] &lt;= 105
 * 	
 * 0 &lt;= left &lt;= right &lt; nums.length
 * 	
 * At most 104 calls will be made to sumRange.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — study the examples carefully.
 *
 * <h2>Approach</h2>
 * Build prefix sums: prefix[i] = sum of nums[0..i-1].
 * Query [l,r] = prefix[r+1] - prefix[l] in O(1).
 *
 * <h2>Complexity</h2>
* Time: O(n) build, O(1) query  |  Space: O(n)
 *
 * @see <a href="https://leetcode.com/problems/range-sum-query-immutable/">LeetCode #303</a>
 */
public class RangeSumQueryImmutable {

    static class NumArray {
        private final int[] prefix;
        public NumArray(int[] nums) {
            prefix=new int[nums.length+1];
            for(int i=0;i<nums.length;i++) prefix[i+1]=prefix[i]+nums[i];
        }
    /**
     * Computes the sum of Sum range.
     *
     * @param left the left (int)
     * @param right the right (int)
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Accumulates the sum in a single O(n) pass through the input.</p>
      */
        public int sumRange(int left, int right) {
            return prefix[right+1]-prefix[left];
        }
    }

    // ─── Demo ────────────────────────────────────────────────────
    public static void main(String[] args) {
        NumArray sol = new NumArray(new int[]{-2,0,3,-5,2,-1});
        System.out.println(sol.sumRange(0, 2)); // 1
    }
}
