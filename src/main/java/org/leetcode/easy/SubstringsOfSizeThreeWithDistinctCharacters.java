package org.leetcode.easy;


/**
 * <b>#1876 - Substrings of Size Three with Distinct Characters</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Hash Table, String, Sliding Window, Counting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * A string is good if there are no repeated characters.
 *
 *
 * Given a string s​​​​​, return the number of good substrings of length three in s​​​​​​.
 *
 *
 * Note that if there are multiple occurrences of the same substring, every occurrence should be counted.
 *
 *
 * A substring is a contiguous sequence of characters in a string.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s = "xyzzaz"
 * Output: 1
 * Explanation: There are 4 substrings of size 3: "xyz", "yzz", "zza", and "zaz". 
 * The only good substring of length 3 is "xyz".
 *
 * Example 2:
 *
 * Input: s = "aababcabc"
 * Output: 4
 * Explanation: There are 7 substrings of size 3: "aab", "aba", "bab", "abc", "bca", "cab", and "abc".
 * The good substrings are "abc", "bca", "cab", and "abc".
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= s.length &lt;= 100
 *
 * s​​​​​​ consists of lowercase English letters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Try using a set to find out the number of distinct characters in a substring.
 *
 * <h2>Approach</h2>
 * Think about the category (Hash Table, String, Sliding Window, Counting).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/substrings-of-size-three-with-distinct-characters/">LeetCode #1876</a>
  *
  * <p><b>Explanation:</b> Iterates once, incrementing a counter each time the target condition is satisfied.</p>
  */
public class SubstringsOfSizeThreeWithDistinctCharacters {

    /**
     * Counts Count good substrings.
     *
     * @param s the s (String)
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Iterates once, incrementing a counter each time the target condition is satisfied.</p>
      */
    public int countGoodSubstrings(String s) {
        int count=0;
        for (int i=0;i+2<s.length();i++) {
            char a=s.charAt(i), b=s.charAt(i+1), c=s.charAt(i+2);
            if (a!=b && b!=c && a!=c) count++;
        }
        return count;
    }

    /**
     * Runs sample test cases.
      *
      * <p><b>Explanation:</b> Processes the string character by character, applying the transformation or predicate.</p>
      */
    public static void main(String[] args) {
        SubstringsOfSizeThreeWithDistinctCharacters sol = new SubstringsOfSizeThreeWithDistinctCharacters();
                System.out.println(sol.countGoodSubstrings("xyzzaz")); // 1
                System.out.println(sol.countGoodSubstrings("aababcabc")); // 4
    }
}
