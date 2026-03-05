package org.leetcode.easy;

/** MaximumScoreAfterSplittingAString solution. */
public class MaximumScoreAfterSplittingAString {
    /**
     * Returns the maximum score when splitting a binary string into two non-empty parts.
     *
     * @param s binary string
     * @return maximum score (zeros in left part + ones in right part)
     *
     * <p><b>Explanation:</b> Precomputes total ones; scans splits from index 0 to n-2, maintaining</p>
     *   zero count in left and computed ones in right, maximising zeros + right-ones. Time O(n).
     */
    public int maxScore(String s) {
        int ones = 0;
        for (char c : s.toCharArray()) if (c == '1') ones++;
        int zeros = 0, max = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == '0') zeros++;
            else ones--;
            max = Math.max(max, zeros + ones);
        }
        return max;
    }

    /**
     * Runs sample test cases.
      *
      * <p><b>Explanation:</b> Processes the string character by character, applying the transformation or predicate.</p>
      */
    public static void main(String[] args) {
        System.out.println("=== MaximumScoreAfterSplittingAString ===");
        MaximumScoreAfterSplittingAString sol = new MaximumScoreAfterSplittingAString();
        System.out.println(sol.maxScore("hello"));
    }
}
