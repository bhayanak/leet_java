package org.leetcode.easy;

/** PositionsOfLargeGroups solution. */
public class PositionsOfLargeGroups {
    /**
     * Returns start indices of contiguous groups of identical characters with length &gt; 1.
     *
     * @param s input string
     * @return list of [start, end] pairs (inclusive)
     *
     * <p><b>Explanation:</b> Single pass: tracks the start index of the current run. When</p>
     *   the character changes, if the run was longer than 1, records [start, i-1].
     *   Time O(n), Space O(n).
     */
    public java.util.List<java.util.List<Integer>> largeGroupPositions(String s) {
        java.util.List<java.util.List<Integer>> res = new java.util.ArrayList<>();
        int start = 0;
        for (int i = 1; i <= s.length(); i++) {
            if (i == s.length() || s.charAt(i) != s.charAt(start)) {
                if (i - start >= 3)
                    res.add(java.util.Arrays.asList(start, i - 1));
                start = i;
            }
        }
        return res;
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac PositionsOfLargeGroups.java &amp;&amp; java org.leetcode.easy.PositionsOfLargeGroups</pre>
      *
      * <p><b>Explanation:</b> Processes the string character by character, applying the transformation or predicate.</p>
      */
    public static void main(String[] args) {
        System.out.println("=== PositionsOfLargeGroups ===");
        PositionsOfLargeGroups sol = new PositionsOfLargeGroups();
        System.out.println(sol.largeGroupPositions("hello"));
    }
}
