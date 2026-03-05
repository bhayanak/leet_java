package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;
import java.util.HashSet;
import java.util.Set;

/**
 * LeetCode #771: Jewels and Stones
 * @see <a href="https://leetcode.com/problems/jewels-and-stones/">Problem</a>
 */
public class JewelsAndStones {

    /**
     * LeetCode #771 – Jewels and Stones
     * Difficulty: EASY
     * Topics: Hash Table, String
     *
     * You're given strings jewels representing the types of stones that are
     * jewels, and stones representing the stones you have. Each character in
     * stones is a type of stone you have. You want to know how many of the stones
     * you have are also jewels.
     * 
     * 
     * Letters are case sensitive, so "a" is considered a different type of stone
     * from "A".
     * 
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: jewels = "aA", stones = "aAAbbbb"
     * Output: 3
     * 
     * 
     * Example 2:
     * 
     * Input: jewels = "z", stones = "ZZ"
     * Output: 0
     * 
     * 
     * 
     * Constraints:
     * 
     * 
     * 1 &lt;= jewels.length, stones.length &lt;= 50
     * 
     * jewels and stones consist of only English letters.
     * 
     * All the characters of jewels are unique.
      *
      * <p><b>Explanation:</b> Uses a HashSet to detect duplicates or track seen elements in O(1) per operation.</p>
      */
    public int numJewelsInStones(String jewels, String stones) {
        Set<Character> j = new HashSet<>();
        for (char c : jewels.toCharArray()) j.add(c);
        int count = 0;
        for (char c : stones.toCharArray()) if (j.contains(c)) count++;
        return count;
    }

    public static void main(String[] args) {
        JewelsAndStones sol = new JewelsAndStones();
        System.out.println(sol.numJewelsInStones("hello", "hello"));
    }
}
