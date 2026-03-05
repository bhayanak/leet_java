package org.leetcode.medium;


/**
 * <b>#3849 - Maximum Bitwise XOR After Rearrangement</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> String, Greedy, Bit Manipulation</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given two binary strings s and t​​​​​​​, each of length n.
 *
 *
 * You may rearrange the characters of t in any order, but s must remain unchanged.
 *
 *
 * Return a binary string of length n representing the maximum integer value obtainable by taking the bitwise XOR of s and rearranged t.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s = "101", t = "011"
 *
 *
 * Output: "110"
 *
 *
 * Explanation:
 *
 *
 * One optimal rearrangement of t is "011".
 *
 * The bitwise XOR of s and rearranged t is "101" XOR "011" = "110", which is the maximum possible.
 *
 * Example 2:
 *
 * Input: s = "0110", t = "1110"
 *
 *
 * Output: "1101"
 *
 *
 * Explanation:
 *
 *
 * One optimal rearrangement of t is "1011".
 *
 * The bitwise XOR of s and rearranged t is "0110" XOR "1011" = "1101", which is the maximum possible.
 *
 * Example 3:
 *
 * Input: s = "0101", t = "1001"
 *
 *
 * Output: "1111"
 *
 *
 * Explanation:
 *
 *
 * One optimal rearrangement of t is "1010".
 *
 * The bitwise XOR of s and rearranged t is "0101" XOR "1010" = "1111", which is the maximum possible.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n == s.length == t.length &lt;= 2 * 105
 *
 * s[i] and t[i] are either '0' or '1'.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Count how many <code>'0'</code> and <code>'1'</code> characters exist in <code>t</code>.
 * Hint 2: To maximize XOR, try to place opposite bits: match <code>'1'</code> in <code>s</code> with <code>'0'</code> from <code>t</code>, and <code>'0'</code> in <code>s</code> with <code>'1'</code>.
 * Hint 3: Greedily build the result from left to right, using available counts while maximizing each XOR bit.
 *
 * <h2>Approach</h2>
 * Think about the category (String, Greedy, Bit Manipulation).
 *
 * @see <a href="https://leetcode.com/problems/maximum-bitwise-xor-after-rearrangement/">LeetCode #3849</a>
 */
public class MaximumBitwiseXorAfterRearrangement {

    /**
     * Computes the maximum Max freq sum.
     *
     * @param s the s (String)
     * @return the computed int result
     */
    public int maxFreqSum(String s) {
        int[] cnt=new int[26];
        for (char c:s.toCharArray()) cnt[c-'a']++;
        int max1=0, max2=0; boolean seenVowel=false, seenCons=false;
        String vowels="aeiou";
        for (int i=0;i<26;i++) {
            if (vowels.indexOf((char)('a'+i))>=0) { if(cnt[i]>max1) max1=cnt[i]; }
            else { if(cnt[i]>max2) max2=cnt[i]; }
        }
        return max1+max2;
    }

    public static void main(String[] args) {
        MaximumBitwiseXorAfterRearrangement sol = new MaximumBitwiseXorAfterRearrangement();
        System.out.println(sol.maxFreqSum("hello"));
    }
}
