package org.leetcode.easy;


/**
 * <b>#3541 - Find Most Frequent Vowel and Consonant</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Hash Table, String, Counting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a string s consisting of lowercase English letters ('a' to 'z'). 
 *
 *
 * Your task is to:
 *
 *
 * Find the vowel (one of 'a', 'e', 'i', 'o', or 'u') with the maximum frequency.
 *
 * Find the consonant (all other letters excluding vowels) with the maximum frequency.
 *
 * Return the sum of the two frequencies.
 *
 *
 * Note: If multiple vowels or consonants have the same maximum frequency, you may choose any one of them. If there are no vowels or no consonants in the string, consider their frequency as 0.
 * The frequency of a letter x is the number of times it occurs in the string.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "successes"
 *
 *
 * Output: 6
 *
 *
 * Explanation:
 *
 *
 * The vowels are: 'u' (frequency 1), 'e' (frequency 2). The maximum frequency is 2.
 *
 * The consonants are: 's' (frequency 4), 'c' (frequency 2). The maximum frequency is 4.
 *
 * The output is 2 + 4 = 6.
 *
 * Example 2:
 *
 * Input: s = "aeiaeia"
 *
 *
 * Output: 3
 *
 *
 * Explanation:
 *
 *
 * The vowels are: 'a' (frequency 3), 'e' ( frequency 2), 'i' (frequency 2). The maximum frequency is 3.
 *
 * There are no consonants in s. Hence, maximum consonant frequency = 0.
 *
 * The output is 3 + 0 = 3.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= s.length &lt;= 100
 *
 * s consists of lowercase English letters only.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use a hashmap
 * Hint 2: Simulate as described
 *
 * <h2>Approach</h2>
 * Think about the category (Hash Table, String, Counting).
 *
 * @see <a href="https://leetcode.com/problems/find-most-frequent-vowel-and-consonant/">LeetCode #3541</a>
  *
  * <p><b>Explanation:</b> Applies binary search to halve the search space each step, achieving O(log n) time.</p>
  */
public class FindMostFrequentVowelAndConsonant {

    /**
     * Computes the minimum Min zero array.
     * Uses binary search for O(log n) lookup.
     *
     * @param nums the nums (int[])
     * @param queries the queries (int[][])
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Applies binary search to halve the search space each step, achieving O(log n) time.</p>
      */
    public int minZeroArray(int[] nums, int[][] queries) {
        // Binary search on # queries used
        int lo=0, hi=queries.length;
        while (lo<hi) {
            int mid=(lo+hi)/2;
            if (canZero(nums,queries,mid)) hi=mid;
            else lo=mid+1;
        }
        return lo<=queries.length?lo:-1;
    }
    private boolean canZero(int[] nums,int[][] queries,int k) {
        int[] diff=new int[nums.length+1];
        for (int i=0;i<k;i++) { diff[queries[i][0]]+=queries[i][2]; diff[queries[i][1]+1]-=queries[i][2]; }
        int cur=0;
        for (int i=0;i<nums.length;i++) { cur+=diff[i]; if (nums[i]>cur) return false; }
        return true;
    }

    public static void main(String[] args) {
        FindMostFrequentVowelAndConsonant sol = new FindMostFrequentVowelAndConsonant();
        System.out.println(sol.minZeroArray(new int[]{1,2,3}, new int[][]{{0,2,1},{0,2,1}}));
    }
}
