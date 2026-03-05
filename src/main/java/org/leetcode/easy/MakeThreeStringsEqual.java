package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;

/** MakeThreeStringsEqual solution. */
public class MakeThreeStringsEqual {

    /**
     * Finds the minimum number of characters to delete so that s1, s2, s3
     * all become equal (each must be a common prefix of the three strings).
     * @param s1 first string
     * @param s2 second string
     * @param s3 third string
     * @return minimum deletions, or -1 if impossible
     * <p><b>Explanation:</b> Find length of longest common prefix; deletions = (len(s1)+len(s2)+len(s3)) - 3*prefixLen.</p>
     *              If prefixLen == 0, return -1.
     */
    public int solve(String s1, String s2, String s3) {
        int minLen = Math.min(s1.length(), Math.min(s2.length(), s3.length()));
        int prefix = 0;
        for (int i = 0; i < minLen; i++) {
            if (s1.charAt(i) == s2.charAt(i) && s2.charAt(i) == s3.charAt(i)) prefix++;
            else break;
        }
        if (prefix == 0) return -1;
        return (s1.length() - prefix) + (s2.length() - prefix) + (s3.length() - prefix);
    }

    public static void main(String[] args) {
        MakeThreeStringsEqual sol = new MakeThreeStringsEqual();
        System.out.println(sol.solve("abc","abb","ab")); // 2 (delete c from s1, b from s2)
        System.out.println(sol.solve("a","b","c"));      // -1
    }

}
