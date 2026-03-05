package org.leetcode.medium;

import java.util.*;
import java.util.stream.*;

/**
 * LeetCode #443: String Compression
 * @see <a href="https://leetcode.com/problems/string-compression/">Problem</a>
 */
public class StringCompression {

    /**
     * LeetCode #443 – String Compression
     * Difficulty: MEDIUM
     * Topics: Two Pointers, String
     *
     * Given an array of characters chars, compress it using the following
     * algorithm:
     * 
     * 
     * Begin with an empty string s. For each group of consecutive repeating
     * characters in chars:
     * 
     * 
     * If the group's length is 1, append the character to s.
     * 
     * Otherwise, append the character followed by the group's length.
     * 
     * The compressed string s should not be returned separately, but instead, be
     * stored in the input character array chars. Note that group lengths that are
     * 10 or longer will be split into multiple characters in chars.
     * 
     * 
     * After you are done modifying the input array, return the new length of the
     * array.
     * 
     * 
     * You must write an algorithm that uses only constant extra space.
     * 
     * 
     * Note: The characters in the array beyond the returned length do not matter
     * and should be ignored.
     * 
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: chars = ["a","a","b","b","c","c","c"]
     * Output: Return 6, and the first 6 characters of the input array should be:
     * ["a","2","b","2","c","3"]
     * Explanation: The groups are "aa", "bb", and "ccc". This compresses to
     * "a2b2c3".
     * 
     * Example 2:
     * 
     * Input: chars = ["a"]
     * Output: Return 1, and the first character of the input array should be:
     * ["a"]
     * Explanation: The only group is "a", which remains uncompressed since it's a
     * single character.
     * 
     * Example 3:
     * 
     * Input: chars = ["a","b","b","b","b","b","b","b","b","b","b","b","b"]
     * Output: Return 4, and the first 4 characters of the input array should be:
     * ["a","b","1","2"].
     * Explanation: The groups are "a" and "bbbbbbbbbbbb". This compresses to
     * "ab12".
     * 
     * 
     * 
     * Constraints:
     * 
     * 
     * 1 &lt;= chars.leng

     *
     * Hints:
     *   1. How do you know if you are at the end of a consecutive group of characters?
     */
    // Two pointers: compress in place
    /**
     * Solves the problem: Compress.
     *
     * @param chars the chars (char[])
     * @return the computed int result
     */
    public int compress(char[] chars) {
        int write = 0, i = 0;
        while (i < chars.length) {
            char cur = chars[i]; int count = 0;
            while (i < chars.length && chars[i] == cur) { i++; count++; }
            chars[write++] = cur;
            if (count > 1) {
                for (char c : String.valueOf(count).toCharArray())
                    chars[write++] = c;
            }
        }
        return write;
    }

    public static void main(String[] args) {
        StringCompression sol = new StringCompression();
        System.out.println(sol.compress(new char[]{'a','b'}));
    }
}
