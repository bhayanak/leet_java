package org.leetcode.easy;


/**
 * <b>#3442 - Maximum Difference Between Even and Odd Frequency I</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Hash Table, String, Counting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a string s consisting of lowercase English letters.
 *
 *
 * Your task is to find the maximum difference diff = freq(a1) - freq(a2) between the frequency of characters a1 and a2 in the string such that:
 *
 *
 * a1 has an odd frequency in the string.
 *
 * a2 has an even frequency in the string.
 *
 * Return this maximum difference.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s = "aaaaabbc"
 *
 *
 * Output: 3
 *
 *
 * Explanation:
 *
 *
 * The character 'a' has an odd frequency of 5, and 'b' has an even frequency of 2.
 *
 * The maximum difference is 5 - 2 = 3.
 *
 * Example 2:
 *
 * Input: s = "abcabcab"
 *
 *
 * Output: 1
 *
 *
 * Explanation:
 *
 *
 * The character 'a' has an odd frequency of 3, and 'c' has an even frequency of 2.
 *
 * The maximum difference is 3 - 2 = 1.
 *
 *
 *
 * Constraints:
 *
 *
 * 3 &lt;= s.length &lt;= 100
 *
 * s consists only of lowercase English letters.
 *
 * s contains at least one character with an odd frequency and one with an even frequency.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use a frequency map to identify the maximum odd and minimum even frequencies. Then, calculate their difference.
 *
 * <h2>Approach</h2>
 * Think about the category (Hash Table, String, Counting).
 *
 * @see <a href="https://leetcode.com/problems/maximum-difference-between-even-and-odd-frequency-i/">LeetCode #3442</a>
  *
  * <p><b>Explanation:</b> Tracks the running maximum in a single O(n) scan without extra space.</p>
  */
public class MaximumDifferenceBetweenEvenAndOddFrequencyI {

    /**
     * Computes the maximum Max diff.
     *
     * @param num the num (int)
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Tracks the running maximum in a single O(n) scan without extra space.</p>
      */
    public int maxDiff(int num) {
        String s=Integer.toString(num);
        // maximize: replace first non-9 digit with 9
        String maxS=s; for (char c:s.toCharArray()) if (c!='9'){maxS=s.replace(c,'9');break;}
        // minimize: replace appropriately
        String minS=s;
        if (s.charAt(0)!='1') { minS=s.replace(s.charAt(0),'1'); }
        else { for (int i=1;i<s.length();i++) if (s.charAt(i)!='0'&&s.charAt(i)!='1'){minS=s.replace(s.charAt(i),'0');break;} }
        return Integer.parseInt(maxS)-Integer.parseInt(minS);
    }

    public static void main(String[] args) {
        MaximumDifferenceBetweenEvenAndOddFrequencyI sol = new MaximumDifferenceBetweenEvenAndOddFrequencyI();
        System.out.println(sol.maxDiff(0));
    }
}
