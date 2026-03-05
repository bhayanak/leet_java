package org.leetcode.easy;


/**
 * <b>#2859 - Sum of Values at Indices With K Set Bits</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Bit Manipulation</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a 0-indexed integer array nums and an integer k.
 *
 *
 * Return an integer that denotes the sum of elements in nums whose corresponding indices have exactly k set bits in their binary representation.
 *
 *
 * The set bits in an integer are the 1's present when it is written in binary.
 *
 *
 * For example, the binary representation of 21 is 10101, which has 3 set bits.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [5,10,1,5,2], k = 1
 * Output: 13
 * Explanation: The binary representation of the indices are: 
 * 0 = 0002
 * 1 = 0012
 * 2 = 0102
 * 3 = 0112
 * 4 = 1002 
 * Indices 1, 2, and 4 have k = 1 set bits in their binary representation.
 * Hence, the answer is nums[1] + nums[2] + nums[4] = 13.
 *
 * Example 2:
 *
 * Input: nums = [4,3,2,1], k = 2
 * Output: 1
 * Explanation: The binary representation of the indices are:
 * 0 = 002
 * 1 = 012
 * 2 = 102
 * 3 = 112
 * Only index 3 has k = 2 set bits in its binary representation.
 * Hence, the answer is nums[3] = 1.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 1000
 *
 * 1 &lt;= nums[i] &lt;= 105
 *
 * 0 &lt;= k &lt;= 10
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Iterate through the indices <code>i</code> in the range <code>[0, n - 1]</code>, for each index <code>i</code> count the number of bits in its binary representation. If it is <code>k</code>, add <code>nums[i]</code> to the result.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Bit Manipulation).
 *
 * @see <a href="https://leetcode.com/problems/sum-of-values-at-indices-with-k-set-bits/">LeetCode #2859</a>
  *
  * <p><b>Explanation:</b> Tracks the running minimum in a single O(n) scan.</p>
  */
public class SumOfValuesAtIndicesWithKSetBits {

    /**
     * Computes the sum of Sum indices with k set bits.
     *
     * @param nums the nums (java.util.List&lt;Integer&gt;)
     * @param k the k (int)
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Tracks the running minimum in a single O(n) scan.</p>
      */
    public int sumIndicesWithKSetBits(java.util.List<Integer> nums, int k) {
        int sum=0;
        for (int i=0;i<nums.size();i++) if (Integer.bitCount(i)==k) sum+=nums.get(i);
        return sum;
    }

    public static void main(String[] args) {
        SumOfValuesAtIndicesWithKSetBits sol = new SumOfValuesAtIndicesWithKSetBits();
                System.out.println(sol.sumIndicesWithKSetBits(java.util.Arrays.asList(5,10,1,5,2),1)); // 13
                System.out.println(sol.sumIndicesWithKSetBits(java.util.Arrays.asList(4,3,2,1),2)); // 1
    }
}
