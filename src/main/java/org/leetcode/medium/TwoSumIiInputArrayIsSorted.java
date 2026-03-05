package org.leetcode.medium;

/**
 * <b>#167 - Two Sum II - Input Array Is Sorted</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Two Pointers, Binary Search</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, find two numbers such that they add up to a specific target number. Let these two numbers be numbers[index1] and numbers[index2] where 1 &lt;= index1 &lt; index2 &lt;= numbers.length.
 * 
 * 
 * Return the indices of the two numbers index1 and index2, each incremented by one, as an integer array [index1, index2] of length 2.
 * 
 * 
 * The tests are generated such that there is exactly one solution. You may not use the same element twice.
 * 
 * 
 * Your solution must use only constant extra space.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: numbers = [2,7,11,15], target = 9
 * Output: [1,2]
 * Explanation: The sum of 2 and 7 is 9. Therefore, index1 = 1, index2 = 2. We return [1, 2].
 * 
 * Example 2:
 * 
 * Input: numbers = [2,3,4], target = 6
 * Output: [1,3]
 * Explanation: The sum of 2 and 4 is 6. Therefore index1 = 1, index2 = 3. We return [1, 3].
 * 
 * Example 3:
 * 
 * Input: numbers = [-1,0], target = -1
 * Output: [1,2]
 * Explanation: The sum of -1 and 0 is -1. Therefore index1 = 1, index2 = 2. We return [1, 2].
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * 2 &lt;= numbers.length &lt;= 3 * 104
 * 	
 * -1000 &lt;= numbers[i] &lt;= 1000
 * 	
 * numbers is sorted in non-decreasing order.
 * 	
 * -1000 &lt;= target &lt;= 1000
 * 	
 * The tests are generated such that there is exactly one solution.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — work through examples manually first.
 *
 * <h2>Approach</h2>
 * Two pointers from both ends. If sum too large, move right pointer left.
 * If too small, move left pointer right. Array is 1-indexed.
 *
 * <h2>Complexity</h2>
* Time: O(n)  |  Space: O(1)
 *
 * @see <a href="https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/">LeetCode #167</a>
 */
public class TwoSumIiInputArrayIsSorted {

    /**
     * Finds two numbers in a sorted array that add up to target. Returns 1-indexed positions.
     * @param numbers sorted integer array
     * @param target  required sum
     * @return [i, j] (1-indexed) such that numbers[i-1] + numbers[j-1] == target
     */
    public int[] twoSum(int[] numbers, int target) {
        int l = 0, r = numbers.length - 1;
        while (l < r) {
            int sum = numbers[l] + numbers[r];
            if      (sum == target) return new int[]{l+1, r+1};
            else if (sum <  target) l++;
            else                    r--;
        }
        return new int[]{};
    }

    // ─── Run & Demo ──────────────────────────────────────────────
    /**
     * Runs sample test cases to demonstrate the solution.
     * Execute: javac TwoSumIiInputArrayIsSorted.java &amp;&amp; java org.leetcode.medium.TwoSumIiInputArrayIsSorted
     *
     * @param args not used
     */
    public static void main(String[] args) {
        TwoSumIiInputArrayIsSorted sol = new TwoSumIiInputArrayIsSorted();
        System.out.println(java.util.Arrays.toString(sol.twoSum(new int[]{2,7,11,15}, 9)));   // [1,2]
        System.out.println(java.util.Arrays.toString(sol.twoSum(new int[]{2,3,4},     6)));   // [1,3]
        System.out.println(java.util.Arrays.toString(sol.twoSum(new int[]{-1,0},      -1)));  // [1,2]
    }
}
