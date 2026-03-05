package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;

/** FindMaximumNumberOfStringPairs solution. */
public class FindMaximumNumberOfStringPairs {

    /**
     * Counts the maximum number of string pairs where one is the reverse of the other.
     * @param words array of strings
     * @return maximum number of pairs
     * <p><b>Explanation:</b> Use a HashSet; for each word check if its reverse was seen before.</p>
     */
    public int solve(String[] words) {
        int count = 0;
        Set<String> seen = new HashSet<>();
        for (String w : words) {
            String rev = new StringBuilder(w).reverse().toString();
            if (seen.contains(rev)) { count++; seen.remove(rev); }
            else seen.add(w);
        }
        return count;
    }

    public static void main(String[] args) {
        FindMaximumNumberOfStringPairs sol = new FindMaximumNumberOfStringPairs();
        System.out.println(sol.solve(new String[]{"cd","ac","dc","ca","zz"})); // 2
        System.out.println(sol.solve(new String[]{"ab","ba","cc"}));            // 1
    }

}
