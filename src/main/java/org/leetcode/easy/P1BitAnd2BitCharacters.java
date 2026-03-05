package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;

/**
 * LeetCode #717: 1-bit and 2-bit Characters
 * @see <a href="https://leetcode.com/problems/1-bit-and-2-bit-characters/">Problem</a>
 */
public class P1BitAnd2BitCharacters {

    /**
     * LeetCode #717 – 1-bit and 2-bit Characters
     * Difficulty: EASY
     * Topics: Array
     *
     * We have two special characters:
     * 
     * 
     * The first character can be represented by one bit 0.
     * 
     * The second character can be represented by two bits (10 or 11).
     * 
     * Given a binary array bits that ends with 0, return true if the last
     * character must be a one-bit character.
     * 
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: bits = [1,0,0]
     * Output: true
     * Explanation: The only way to decode it is two-bit character and one-bit
     * character.
     * So the last character is one-bit character.
     * 
     * Example 2:
     * 
     * Input: bits = [1,1,1,0]
     * Output: false
     * Explanation: The only way to decode it is two-bit character and two-bit
     * character.
     * So the last character is not one-bit character.
     * 
     * 
     * 
     * Constraints:
     * 
     * 
     * 1 &lt;= bits.length &lt;= 1000
     * 
     * bits[i] is either 0 or 1.
      *
      * <p><b>Explanation:</b> Validates the condition by scanning the input and returning false on the first violation.</p>
      */
    public boolean isOneBitCharacter(int[] bits) {
        int i = 0;
        while (i < bits.length - 1) {
            if (bits[i] == 1) i += 2; else i++;
        }
        return i == bits.length - 1;
    }

    public static void main(String[] args) {
        P1BitAnd2BitCharacters sol = new P1BitAnd2BitCharacters();
        System.out.println(sol.isOneBitCharacter(new int[]{1,2,3}));
    }
}
