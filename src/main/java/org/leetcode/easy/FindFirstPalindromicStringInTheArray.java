package org.leetcode.easy;


/**
 * <b>#2108 - Find First Palindromic String in the Array</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Two Pointers, String</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an array of strings words, return the first palindromic string in the array. If there is no such string, return an empty string "".
 *
 *
 * A string is palindromic if it reads the same forward and backward.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: words = ["abc","car","ada","racecar","cool"]
 * Output: "ada"
 * Explanation: The first string that is palindromic is "ada".
 * Note that "racecar" is also palindromic, but it is not the first.
 *
 * Example 2:
 *
 * Input: words = ["notapalindrome","racecar"]
 * Output: "racecar"
 * Explanation: The first and only string that is palindromic is "racecar".
 *
 * Example 3:
 *
 * Input: words = ["def","ghi"]
 * Output: ""
 * Explanation: There are no palindromic strings, so the empty string is returned.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= words.length &lt;= 100
 *
 * 1 &lt;= words[i].length &lt;= 100
 *
 * words[i] consists only of lowercase English letters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Iterate through the elements in order. As soon as the current element is a palindrome, return it.
 * Hint 2: To check if an element is a palindrome, can you reverse the string?
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Two Pointers, String).
 *
 * @see <a href="https://leetcode.com/problems/find-first-palindromic-string-in-the-array/">LeetCode #2108</a>
  *
  * <p><b>Explanation:</b> Sorts the input first to simplify subsequent search or comparison steps.</p>
  */
public class FindFirstPalindromicStringInTheArray {

    /**
     * Returns true if Is good.
     * Sorts the input first to enable efficient processing.
     *
     * @param nums the nums (int[])
     * @return the computed boolean result
      *
      * <p><b>Explanation:</b> Sorts the input first to simplify subsequent search or comparison steps.</p>
      */
    public boolean isGood(int[] nums) {
        java.util.Arrays.sort(nums);
        int n=nums.length;
        // should be [1,2,...,n-1,n-1]
        if (nums[n-1]!=nums[n-2]) return false;
        for (int i=0;i<n-1;i++) if (nums[i]!=i+1) return false;
        return true;
    }

    public static void main(String[] args) {
        FindFirstPalindromicStringInTheArray sol = new FindFirstPalindromicStringInTheArray();
                System.out.println(sol.isGood(new int[]{2,1,3}));     // false
                System.out.println(sol.isGood(new int[]{1,1,2}));     // false
                System.out.println(sol.isGood(new int[]{2,4,3,1}));   // false
    }
}
