package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;

/** OddStringDifference solution. */
public class OddStringDifference {

    /**
     * Given an array of equal-length strings, finds the one with a different
     * character-difference array (difference between consecutive char codes).
     * @param words array of strings of equal length
     * @return the word with the unique difference pattern
     * <p><b>Explanation:</b> Compute diff array for each word; the one that appears once is the answer.</p>
     */
    public String solve(String[] words) {
        Map<String, List<String>> map = new HashMap<>();
        for (String w : words) {
            StringBuilder key = new StringBuilder();
            for (int i = 1; i < w.length(); i++) key.append(w.charAt(i) - w.charAt(i-1)).append(',');
            map.computeIfAbsent(key.toString(), k -> new ArrayList<>()).add(w);
        }
        for (List<String> group : map.values())
            if (group.size() == 1) return group.get(0);
        return "";
    }

    public static void main(String[] args) {
        OddStringDifference sol = new OddStringDifference();
        System.out.println(sol.solve(new String[]{"aab","bob","aac","bob"})); // "bob" - first occurrence, but all bobs differ from aab,aac pattern
        System.out.println(sol.solve(new String[]{"aab","bob","aac","aad"}));  // "bob"
    }

}
