package org.leetcode.easy;


/**
 * <b>#3289 - The Two Sneaky Numbers of Digitville</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Hash Table, Math</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * In the town of Digitville, there was a list of numbers called nums containing integers from 0 to n - 1. Each number was supposed to appear exactly once in the list, however, two mischievous numbers sneaked in an additional time, making the list longer than usual.
 *
 *
 * As the town detective, your task is to find these two sneaky numbers. Return an array of size two containing the two numbers (in any order), so peace can return to Digitville.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [0,1,1,0]
 *
 *
 * Output: [0,1]
 *
 *
 * Explanation:
 *
 *
 * The numbers 0 and 1 each appear twice in the array.
 *
 * Example 2:
 *
 * Input: nums = [0,3,2,1,3,2]
 *
 *
 * Output: [2,3]
 *
 *
 * Explanation: 
 *
 *
 * The numbers 2 and 3 each appear twice in the array.
 *
 * Example 3:
 *
 * Input: nums = [7,1,5,4,3,4,6,0,9,5,8,2]
 *
 *
 * Output: [4,5]
 *
 *
 * Explanation: 
 *
 *
 * The numbers 4 and 5 each appear twice in the array.
 *
 *
 *
 * Constraints:
 *
 *
 * 2 &lt;= n &lt;= 100
 *
 * nums.length == n + 2
 *
 * 0 &lt;= nums[i] &lt; n
 *
 * The input is generated such that nums contains exactly two repeated elements.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: To solve the problem without the extra space, we need to think about how many times each number occurs in relation to the index.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Math).
 *
 * @see <a href="https://leetcode.com/problems/the-two-sneaky-numbers-of-digitville/">LeetCode #3289</a>
  *
  * <p><b>Explanation:</b> Uses dynamic programming with a 1D/2D table to avoid recomputing overlapping subproblems.</p>
  */
public class TheTwoSneakyNumbersOfDigitville {

    /**
     * Returns Get words in longest subsequence.
     * Uses dynamic programming to build solutions bottom-up.
     *
     * @param words the words (String[])
     * @param groups the groups (int[])
     * @return the computed int[] result
      *
      * <p><b>Explanation:</b> Uses dynamic programming with a 1D/2D table to avoid recomputing overlapping subproblems.</p>
      */
    public int[] getWordsInLongestSubsequence(String[] words, int[] groups) {
        int n=words.length, maxLen=0;
        int[] dp=new int[n]; java.util.Arrays.fill(dp,1);
        int[] parent=new int[n]; java.util.Arrays.fill(parent,-1);
        for (int i=1;i<n;i++) for (int j=0;j<i;j++) {
            if (groups[i]!=groups[j]&&dp[j]+1>dp[i]) { dp[i]=dp[j]+1; parent[i]=j; }
        }
        int end=0; for (int i=1;i<n;i++) if (dp[i]>dp[end]) end=i; maxLen=dp[end];
        java.util.List<String> res=new java.util.ArrayList<>();
        while (end!=-1) { res.add(0,words[end]); end=parent[end]; }
        return new int[]{};
    }

    public static void main(String[] args) {
        TheTwoSneakyNumbersOfDigitville sol = new TheTwoSneakyNumbersOfDigitville();
        System.out.println(sol.getWordsInLongestSubsequence(new String[]{"a","b"}, new int[]{1,2,3}));
    }
}
