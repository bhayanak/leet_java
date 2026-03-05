package org.leetcode.easy;


/**
 * <b>#3090 - Maximum Length Substring With Two Occurrences</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Hash Table, String, Sliding Window</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given a string s, return the maximum length of a substring such that it contains at most two occurrences of each character.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "bcbbbcba"
 *
 *
 * Output: 4
 *
 *
 * Explanation:
 * The following substring has a length of 4 and contains at most two occurrences of each character: "bcbbbcba".
 *
 *
 * Example 2:
 *
 * Input: s = "aaaa"
 *
 *
 * Output: 2
 *
 *
 * Explanation:
 * The following substring has a length of 2 and contains at most two occurrences of each character: "aaaa".
 *
 *
 *
 *
 * Constraints:
 *
 *
 * 2 &lt;= s.length &lt;= 100
 *
 * s consists only of lowercase English letters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: We can try all substrings by brute-force since the constraints are very small.
 *
 * <h2>Approach</h2>
 * Think about the category (Hash Table, String, Sliding Window).
 *
 * @see <a href="https://leetcode.com/problems/maximum-length-substring-with-two-occurrences/">LeetCode #3090</a>
  *
  * <p><b>Explanation:</b> Tracks the running maximum in a single O(n) scan without extra space.</p>
  */
public class MaximumLengthSubstringWithTwoOccurrences {

    /**
     * Solves the problem: Maximum length substring.
     * Uses a sliding window to scan subarrays in linear time.
     *
     * @param s the s (String)
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Tracks the running maximum in a single O(n) scan without extra space.</p>
      */
    public int maximumLengthSubstring(String s) {
        int max=0, left=0;
        int[] cnt=new int[26];
        for (int right=0;right<s.length();right++) {
            cnt[s.charAt(right)-'a']++;
            while (cnt[s.charAt(right)-'a']>2) { cnt[s.charAt(left)-'a']--; left++; }
            max=Math.max(max,right-left+1);
        }
        return max;
    }

    public static void main(String[] args) {
        MaximumLengthSubstringWithTwoOccurrences sol = new MaximumLengthSubstringWithTwoOccurrences();
                System.out.println(sol.maximumLengthSubstring("bcbbbcba")); // 4
                System.out.println(sol.maximumLengthSubstring("aaaa"));     // 2
    }
}
