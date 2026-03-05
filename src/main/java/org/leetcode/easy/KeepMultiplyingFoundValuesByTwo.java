package org.leetcode.easy;


/**
 * <b>#2154 - Keep Multiplying Found Values by Two</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Hash Table, Sorting, Simulation</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an array of integers nums. You are also given an integer original which is the first number that needs to be searched for in nums.
 *
 *
 * You then do the following steps:
 *
 *
 * If original is found in nums, multiply it by two (i.e., set original = 2 * original).
 *
 * Otherwise, stop the process.
 *
 * Repeat this process with the new number as long as you keep finding the number.
 *
 * Return the final value of original.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [5,3,6,1,12], original = 3
 * Output: 24
 * Explanation: 
 * - 3 is found in nums. 3 is multiplied by 2 to obtain 6.
 * - 6 is found in nums. 6 is multiplied by 2 to obtain 12.
 * - 12 is found in nums. 12 is multiplied by 2 to obtain 24.
 * - 24 is not found in nums. Thus, 24 is returned.
 *
 * Example 2:
 *
 * Input: nums = [2,7,9], original = 4
 * Output: 4
 * Explanation:
 * - 4 is not found in nums. Thus, 4 is returned.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 1000
 *
 * 1 &lt;= nums[i], original &lt;= 1000
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Repeatedly iterate through the array and check if the current value of original is in the array.
 * Hint 2: If original is not found, stop and return its current value.
 * Hint 3: Otherwise, multiply original by 2 and repeat the process.
 * Hint 4: Use set data structure to check the existence faster.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Sorting, Simulation).
 *
 * @see <a href="https://leetcode.com/problems/keep-multiplying-found-values-by-two/">LeetCode #2154</a>
  *
  * <p><b>Explanation:</b> Uses a HashSet to detect duplicates or track seen elements in O(1) per operation.</p>
  */
public class KeepMultiplyingFoundValuesByTwo {

    /**
     * Finds Find difference.
     *
     * @param nums1 the nums1 (int[])
     * @param nums2 the nums2 (int[])
     * @return the computed int[] result
      *
      * <p><b>Explanation:</b> Uses a HashSet to detect duplicates or track seen elements in O(1) per operation.</p>
      */
    public int[] findDifference(int[] nums1, int[] nums2) {
        java.util.Set<Integer> s1=new java.util.HashSet<>(), s2=new java.util.HashSet<>();
        for (int n:nums1) s1.add(n); for (int n:nums2) s2.add(n);
        java.util.Set<Integer> r1=new java.util.HashSet<>(s1), r2=new java.util.HashSet<>(s2);
        r1.removeAll(s2); r2.removeAll(s1);
        // return as two lists
        int[] a=r1.stream().mapToInt(Integer::intValue).toArray();
        int[] b=r2.stream().mapToInt(Integer::intValue).toArray();
        System.out.println("list1:"+java.util.Arrays.toString(a)+" list2:"+java.util.Arrays.toString(b));
        return a; // simplified
    }

    public static void main(String[] args) {
        KeepMultiplyingFoundValuesByTwo sol = new KeepMultiplyingFoundValuesByTwo();
        System.out.println(sol.findDifference(new int[]{1,2,3}, new int[]{1,2,3}));
    }
}
