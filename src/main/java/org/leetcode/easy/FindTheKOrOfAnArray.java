package org.leetcode.easy;


/**
 * <b>#2917 - Find the K-or of an Array</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Bit Manipulation</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array nums, and an integer k. Let's introduce K-or operation by extending the standard bitwise OR. In K-or, a bit position in the result is set to 1 if at least k numbers in nums have a 1 in that position.
 *
 *
 * Return the K-or of nums.
 *
 *
 *
 *
 * Example 1: 
 *
 * Input: nums = [7,12,9,8,9,15], k = 4 
 *
 *
 * Output: 9 
 *
 *
 * Explanation: 
 *
 *
 * Represent numbers in binary:
 *
 *
 *
 *
 *
 * 			Number
 * 			Bit 3
 * 			Bit 2
 * 			Bit 1
 * 			Bit 0
 *
 *
 *
 *
 * 			7
 * 			0
 * 			1
 * 			1
 * 			1
 *
 *
 *
 *
 * 			12
 * 			1
 * 			1
 * 			0
 * 			0
 *
 *
 *
 *
 * 			9
 * 			1
 * 			0
 * 			0
 * 			1
 *
 *
 *
 *
 * 			8
 * 			1
 * 			0
 * 			0
 * 			0
 *
 *
 *
 *
 * 			9
 * 			1
 * 			0
 * 			0
 * 			1
 *
 *
 *
 *
 * 			15
 * 			1
 * 			1
 * 			1
 * 			1
 *
 *
 *
 *
 * 			Result = 9
 * 			1
 * 			0
 * 			0
 * 			1
 *
 *
 *
 *
 * Bit 0 is set in 7, 9, 9, and 15. Bit 3 is set in 12, 9, 8, 9, and 15.
 *
 * Only bits 0 and 3 qualify. The result is (1001)2 = 9.
 *
 * Example 2: 
 *
 * Input: nums = [2,12,1,11,4,5], k = 6 
 *
 *
 * Output: 0 
 *
 *
 * Explanation: No bit appears as 1 in all six array numbers, as required for K-or with k = 6. Thus, the result is 0.
 *
 * Example 3: 
 *
 * Input: nums = [10,8,5,9,11,6,8], k = 1 
 *
 *
 * Output: 15 
 *
 *
 * Explanation:  Since k == 1, the 1-or of the array is equal to the bitwise OR of all its elements. Hence, the answer is 10 OR 8 OR 5 OR 9 OR 11 OR 6 OR 8 = 15.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 50
 *
 * 0 &lt;= nums[i] &lt; 231
 *
 * 1 &lt;= k &lt;= nums.length
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Fix a <code>bit</code> from the range <code>[0, 31]</code>, then count the number of elements of <code>nums</code> that have <code>bit</code> set in them.
 * Hint 2: <code>bit</code> is set in integer <code>x</code> if and only if <code>2<sup>bit</sup> AND x == 2<sup>bit</sup></code>, where <code>AND</code> is the bitwise <code>AND</code> operation.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Bit Manipulation).
 *
 * @see <a href="https://leetcode.com/problems/find-the-k-or-of-an-array/">LeetCode #2917</a>
  *
  * <p><b>Explanation:</b> Searches through the input, returning the first element or index satisfying the target condition.</p>
  */
public class FindTheKOrOfAnArray {

    /**
     * Finds Find k or.
     *
     * @param nums the nums (int[])
     * @param k the k (int)
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Searches through the input, returning the first element or index satisfying the target condition.</p>
      */
    public int findKOr(int[] nums, int k) {
        int res=0;
        for (int bit=0;bit<32;bit++) {
            int cnt=0;
            for (int n:nums) if ((n>>bit&1)==1) cnt++;
            if (cnt>=k) res|=(1<<bit);
        }
        return res;
    }

    public static void main(String[] args) {
        FindTheKOrOfAnArray sol = new FindTheKOrOfAnArray();
                System.out.println(sol.findKOr(new int[]{7,12,9,8,9,15},4)); // 9
                System.out.println(sol.findKOr(new int[]{2,12,1,11,4,5},6)); // 0
    }
}
