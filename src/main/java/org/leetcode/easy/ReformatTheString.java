package org.leetcode.easy;

/** ReformatTheString solution. */
public class ReformatTheString {
    /**
     * Rearranges a string so all letters come first (in original order) then all digits.
     *
     * @param s input alphanumeric string
     * @return rearranged string with letters before digits
     *
     * <p><b>Explanation:</b> Two-pass collect: gather letters in a StringBuilder, then digits,</p>
     *   and concatenate them. Time O(n), Space O(n).
     */
    public String reformatString(String s) {
        StringBuilder letters = new StringBuilder(), digits = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) digits.append(c);
            else letters.append(c);
        }
        // interleave starting with the larger group
        StringBuilder res = new StringBuilder();
        StringBuilder a = letters.length() >= digits.length() ? letters : digits;
        StringBuilder b = a == letters ? digits : letters;
        int i = 0, j = 0;
        while (i < a.length() || j < b.length()) {
            if (i < a.length()) res.append(a.charAt(i++));
            if (j < b.length()) res.append(b.charAt(j++));
        }
        // If sizes differ by > 1, result is invalid; return "" for that case
        if (Math.abs(letters.length() - digits.length()) > 1) return "";
        return res.toString();
    }

    /**
     * Runs sample test cases.
      *
      * <p><b>Explanation:</b> Processes the string character by character, applying the transformation or predicate.</p>
      */
    public static void main(String[] args) {
        System.out.println("=== ReformatTheString ===");
        ReformatTheString sol = new ReformatTheString();
        System.out.println(sol.reformatString("hello"));
    }
}
