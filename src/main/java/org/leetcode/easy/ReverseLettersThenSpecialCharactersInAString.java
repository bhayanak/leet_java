package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;

/** ReverseLettersThenSpecialCharactersInAString solution. */
public class ReverseLettersThenSpecialCharactersInAString {

    /**
     * Reverses only the letters in-place; special characters stay in their positions.
     * @param s input string
     * @return string with letters reversed but special chars fixed
     * <p><b>Explanation:</b> Two-pointer: skip non-letters, swap letters.</p>
     */
    public String solve(String s) {
        char[] arr = s.toCharArray();
        int l = 0, r = arr.length - 1;
        while (l < r) {
            while (l < r && !Character.isLetter(arr[l])) l++;
            while (l < r && !Character.isLetter(arr[r])) r--;
            if (l < r) { char tmp = arr[l]; arr[l] = arr[r]; arr[r] = tmp; l++; r--; }
        }
        return new String(arr);
    }

    public static void main(String[] args) {
        ReverseLettersThenSpecialCharactersInAString sol = new ReverseLettersThenSpecialCharactersInAString();
        System.out.println(sol.solve("a-bC-dEf-ghIj")); // "j-Ih-gfE-dCba"
        System.out.println(sol.solve("Test1ng-Leet=code-Q!")); // "Qedo1ct-eeLg=ntse-T!"... wait standard reverse letters
    }

}
