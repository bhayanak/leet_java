package org.leetcode.medium;

/**
 * <b>#179 - Largest Number</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, String, Greedy, Sorting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given a list of non-negative integers nums, arrange them such that they form the largest number and return it.
 * 
 * 
 * Since the result may be very large, so you need to return a string instead of an integer.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: nums = [10,2]
 * Output: "210"
 * 
 * Example 2:
 * 
 * Input: nums = [3,30,34,5,9]
 * Output: "9534330"
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * 1 &lt;= nums.length &lt;= 100
 * 	
 * 0 &lt;= nums[i] &lt;= 109
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — work through examples manually first.
 *
 * <h2>Approach</h2>
 * Custom sort: compare "ab" vs "ba" by checking which concatenation is larger.
 * Join sorted array; return "0" if result starts with '0' (all zeros input).
 *
 * <h2>Complexity</h2>
* Time: O(n log n)  |  Space: O(n)
 *
 * @see <a href="https://leetcode.com/problems/largest-number/">LeetCode #179</a>
 */
public class LargestNumber {

    /**
     * Arranges numbers to form the largest possible concatenated number.
     * @param nums non-negative integer array
     * @return string of the largest number formed
     */
    public String largestNumber(int[] nums) {
        String[] strs = new String[nums.length];
        for (int i = 0; i < nums.length; i++) strs[i] = String.valueOf(nums[i]);
        // Sort: prefer "a+b" over "b+a"
        java.util.Arrays.sort(strs, (a, b) -> (b + a).compareTo(a + b));
        if (strs[0].equals("0")) return "0"; // all zeros
        return String.join("", strs);
    }

    // ─── Run & Demo ──────────────────────────────────────────────
    /**
     * Runs sample test cases to demonstrate the solution.
     * Execute: javac LargestNumber.java &amp;&amp; java org.leetcode.medium.LargestNumber
     *
     * @param args not used
     */
    public static void main(String[] args) {
        LargestNumber sol = new LargestNumber();
        System.out.println(sol.largestNumber(new int[]{10,2}));        // "210"
        System.out.println(sol.largestNumber(new int[]{3,30,34,5,9})); // "9534330"
        System.out.println(sol.largestNumber(new int[]{0,0}));         // "0" 
    }
}
