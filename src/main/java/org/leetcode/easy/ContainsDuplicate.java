package org.leetcode.easy;

/**
 * <b>#217 - Contains Duplicate</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Hash Table, Sorting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: nums = [1,2,3,1]
 * 
 * 
 * Output: true
 * 
 * 
 * Explanation:
 * 
 * 
 * The element 1 occurs at the indices 0 and 3.
 * 
 * Example 2:
 * 
 * Input: nums = [1,2,3,4]
 * 
 * 
 * Output: false
 * 
 * 
 * Explanation:
 * 
 * 
 * All elements are distinct.
 * 
 * Example 3:
 * 
 * Input: nums = [1,1,1,3,3,4,3,2,4,2]
 * 
 * 
 * Output: true
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * 1 &lt;= nums.length &lt;= 105
 * 	
 * -109 &lt;= nums[i] &lt;= 109
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — study the examples carefully.
 *
 * <h2>Approach</h2>
 * Add elements to a HashSet. Return true as soon as a duplicate is found.
 *
 * <h2>Complexity</h2>
* Time: O(n)  |  Space: O(n)
 *
 * @see <a href="https://leetcode.com/problems/contains-duplicate/">LeetCode #217</a>
  *
  * <p><b>Explanation:</b> Uses a HashSet to detect duplicates or track seen elements in O(1) per operation.</p>
  */
public class ContainsDuplicate {

    /**
     * Solves the problem: Contains duplicate.
     *
     * @param nums the nums (int[])
     * @return the computed boolean result
      *
      * <p><b>Explanation:</b> Uses a HashSet to detect duplicates or track seen elements in O(1) per operation.</p>
      */
    public boolean containsDuplicate(int[] nums) {
        java.util.Set<Integer> seen = new java.util.HashSet<>();
        for (int n : nums) if (!seen.add(n)) return true;
        return false;
    }

    // ─── Demo ────────────────────────────────────────────────────
    public static void main(String[] args) {
        ContainsDuplicate sol = new ContainsDuplicate();
        System.out.println(sol.containsDuplicate(new int[]{1,2,3,1}));    // true
        System.out.println(sol.containsDuplicate(new int[]{1,2,3,4}));    // false
        System.out.println(sol.containsDuplicate(new int[]{1,1,1,3,3,4,3,2,4,2})); // true
    }
}
