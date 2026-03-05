package org.leetcode.easy;

/**
 * <b>#169 - Majority Element</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Hash Table, Divide and Conquer, Sorting, Counting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an array nums of size n, return the majority element.
 * 
 * 
 * The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: nums = [3,2,3]
 * Output: 3
 * 
 * 
 * Example 2:
 * 
 * Input: nums = [2,2,1,1,1,2,2]
 * Output: 2
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * n == nums.length
 * 	
 * 1 &lt;= n &lt;= 5 * 104
 * 	
 * -109 &lt;= nums[i] &lt;= 109
 * 	
 * The input is generated such that a majority element will exist in the array.
 * 
 *  
 * Follow-up: Could you solve the problem in linear time and in O(1) space?
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — work through examples manually first.
 *
 * <h2>Approach</h2>
 * Boyer-Moore Voting Algorithm: maintain a candidate and count.
 * If count drops to 0, swap to the current element. The majority always survives.
 *
 * <h2>Complexity</h2>
* Time: O(n)  |  Space: O(1)
 *
 * @see <a href="https://leetcode.com/problems/majority-element/">LeetCode #169</a>
  *
  * <p><b>Explanation:</b> Uses a hash structure for O(1) lookups to efficiently answer the query.</p>
  */
public class MajorityElement {

    /**
     * Finds the majority element (appears more than n/2 times).
     * Guaranteed to exist per problem constraints.
     * @param nums integer array
     * @return the majority element
      *
      * <p><b>Explanation:</b> Uses a hash structure for O(1) lookups to efficiently answer the query.</p>
      */
    public int majorityElement(int[] nums) {
        int candidate = nums[0], count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (count == 0) { candidate = nums[i]; count = 1; }
            else if (nums[i] == candidate) count++;
            else count--;
        }
        return candidate;
    }

    // ─── Run & Demo ──────────────────────────────────────────────
    /**
     * Runs sample test cases to demonstrate the solution.
     * Execute: javac MajorityElement.java &amp;&amp; java org.leetcode.easy.MajorityElement
     *
     * @param args not used
      *
      * <p><b>Explanation:</b> Uses a hash structure for O(1) lookups to efficiently answer the query.</p>
      */
    public static void main(String[] args) {
        MajorityElement sol = new MajorityElement();
        System.out.println(sol.majorityElement(new int[]{3,2,3}));         // 3
        System.out.println(sol.majorityElement(new int[]{2,2,1,1,1,2,2}));// 2
    }
}
