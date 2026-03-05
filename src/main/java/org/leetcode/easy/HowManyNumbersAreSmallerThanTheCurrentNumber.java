package org.leetcode.easy;


/**
 * <b>#1365 - How Many Numbers Are Smaller Than the Current Number</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Hash Table, Sorting, Counting Sort</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it. That is, for each nums[i] you have to count the number of valid j's such that j != i and nums[j] &lt; nums[i].
 *
 *
 * Return the answer in an array.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [8,1,2,2,3]
 * Output: [4,0,1,1,3]
 * Explanation: 
 * For nums[0]=8 there exist four smaller numbers than it (1, 2, 2 and 3). 
 * For nums[1]=1 does not exist any smaller number than it.
 * For nums[2]=2 there exist one smaller number than it (1). 
 * For nums[3]=2 there exist one smaller number than it (1). 
 * For nums[4]=3 there exist three smaller numbers than it (1, 2 and 2).
 *
 * Example 2:
 *
 * Input: nums = [6,5,4,8]
 * Output: [2,1,0,3]
 *
 * Example 3:
 *
 * Input: nums = [7,7,7,7]
 * Output: [0,0,0,0]
 *
 *
 *
 * Constraints:
 *
 *
 * 2 &lt;= nums.length &lt;= 500
 *
 * 0 &lt;= nums[i] &lt;= 100
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Brute force for each array element.
 * Hint 2: In order to improve the time complexity, we can sort the array and get the answer for each array element.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Sorting, Counting Sort).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/">LeetCode #1365</a>
  *
  * <p><b>Explanation:</b> Uses a hash structure for O(1) lookups to efficiently answer the query.</p>
  */
public class HowManyNumbersAreSmallerThanTheCurrentNumber {

    /**
     * Solves the problem: Smaller numbers than current.
     *
     * @param nums the nums (int[])
     * @return the computed int[] result
      *
      * <p><b>Explanation:</b> Uses a hash structure for O(1) lookups to efficiently answer the query.</p>
      */
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] cnt = new int[102];
        for (int n : nums) cnt[n+1]++;
        for (int i=1;i<cnt.length;i++) cnt[i]+=cnt[i-1];
        int[] res = new int[nums.length];
        for (int i=0;i<nums.length;i++) res[i]=cnt[nums[i]];
        return res;
    }

    /**
     * Runs sample test cases.
      *
      * <p><b>Explanation:</b> Uses a hash structure for O(1) lookups to efficiently answer the query.</p>
      */
    public static void main(String[] args) {
        HowManyNumbersAreSmallerThanTheCurrentNumber sol = new HowManyNumbersAreSmallerThanTheCurrentNumber();
                System.out.println(java.util.Arrays.toString(sol.smallerNumbersThanCurrent(new int[]{8,1,2,2,3})));
                // [4,0,1,1,3]
                System.out.println(java.util.Arrays.toString(sol.smallerNumbersThanCurrent(new int[]{6,5,4,8})));
                // [2,1,0,3]
    }
}
