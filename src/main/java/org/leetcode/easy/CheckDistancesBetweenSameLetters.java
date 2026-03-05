package org.leetcode.easy;


/**
 * <b>#2399 - Check Distances Between Same Letters</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Hash Table, String</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a 0-indexed string s consisting of only lowercase English letters, where each letter in s appears exactly twice. You are also given a 0-indexed integer array distance of length 26.
 *
 *
 * Each letter in the alphabet is numbered from 0 to 25 (i.e. 'a' -&gt; 0, 'b' -&gt; 1, 'c' -&gt; 2, ... , 'z' -&gt; 25).
 *
 *
 * In a well-spaced string, the number of letters between the two occurrences of the ith letter is distance[i]. If the ith letter does not appear in s, then distance[i] can be ignored.
 *
 *
 * Return true if s is a well-spaced string, otherwise return false.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s = "abaccb", distance = [1,3,0,5,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]
 * Output: true
 * Explanation:
 * - 'a' appears at indices 0 and 2 so it satisfies distance[0] = 1.
 * - 'b' appears at indices 1 and 5 so it satisfies distance[1] = 3.
 * - 'c' appears at indices 3 and 4 so it satisfies distance[2] = 0.
 * Note that distance[3] = 5, but since 'd' does not appear in s, it can be ignored.
 * Return true because s is a well-spaced string.
 *
 * Example 2:
 *
 * Input: s = "aa", distance = [1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]
 * Output: false
 * Explanation:
 * - 'a' appears at indices 0 and 1 so there are zero letters between them.
 * Because distance[0] = 1, s is not a well-spaced string.
 *
 *
 *
 * Constraints:
 *
 *
 * 2 &lt;= s.length &lt;= 52
 *
 * s consists only of lowercase English letters.
 *
 * Each letter appears in s exactly twice.
 *
 * distance.length == 26
 *
 * 0 &lt;= distance[i] &lt;= 50
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Create an integer array of size 26 to keep track of the first occurrence of each letter.
 * Hint 2: The number of letters between indices i and j is j - i - 1.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, String).
 *
 * @see <a href="https://leetcode.com/problems/check-distances-between-same-letters/">LeetCode #2399</a>
  *
  * <p><b>Explanation:</b> Validates the condition by scanning the input and returning false on the first violation.</p>
  */
public class CheckDistancesBetweenSameLetters {

    /**
     * Checks Check distances.
     *
     * @param s the s (String)
     * @param distance the distance (int[])
     * @return the computed boolean result
      *
      * <p><b>Explanation:</b> Validates the condition by scanning the input and returning false on the first violation.</p>
      */
    public boolean checkDistances(String s, int[] distance) {
        int[] pos=new int[26]; java.util.Arrays.fill(pos,-1);
        for (int i=0;i<s.length();i++) {
            int c=s.charAt(i)-'a';
            if (pos[c]==-1) pos[c]=i;
            else if (i-pos[c]-1!=distance[c]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        CheckDistancesBetweenSameLetters sol = new CheckDistancesBetweenSameLetters();
        System.out.println(sol.checkDistances("hello", new int[]{1,2,3}));
    }
}
