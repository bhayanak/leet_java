package org.leetcode.medium;

import java.util.*;
import java.util.stream.*;
import java.util.ArrayList;
import java.util.List;

/**
 * LeetCode #784: Letter Case Permutation
 * @see <a href="https://leetcode.com/problems/letter-case-permutation/">Problem</a>
 */
public class LetterCasePermutation {

    /**
     * LeetCode #784 – Letter Case Permutation
     * Difficulty: MEDIUM
     * Topics: String, Backtracking, Bit Manipulation
     *
     * Given a string s, you can transform every letter individually to be
     * lowercase or uppercase to create another string.
     * 
     * 
     * Return a list of all possible strings we could create. Return the output in
     * any order.
     * 
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: s = "a1b2"
     * Output: ["a1b2","a1B2","A1b2","A1B2"]
     * 
     * Example 2:
     * 
     * Input: s = "3z4"
     * Output: ["3z4","3Z4"]
     * 
     * 
     * 
     * Constraints:
     * 
     * 
     * 1 &lt;= s.length &lt;= 12
     * 
     * s consists of lowercase English letters, uppercase English letters, and
     * digits.
     */
    public List<String> letterCasePermutation(String s) {
        List<String> result = new ArrayList<>();
        backtrack(s.toCharArray(), 0, result);
        return result;
    }
    private void backtrack(char[] arr, int i, List<String> result) {
        if (i == arr.length) { result.add(new String(arr)); return; }
        backtrack(arr, i+1, result);
        if (Character.isLetter(arr[i])) {
            arr[i] ^= 32;  // toggle case
            backtrack(arr, i+1, result);
            arr[i] ^= 32;
        }
    }

    public static void main(String[] args) {
        LetterCasePermutation sol = new LetterCasePermutation();
        System.out.println(sol.letterCasePermutation("hello"));
    }
}
