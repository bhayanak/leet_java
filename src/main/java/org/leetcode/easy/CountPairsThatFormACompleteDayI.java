package org.leetcode.easy;

/** CountPairsThatFormACompleteDayI solution. */
public class CountPairsThatFormACompleteDayI {
    /**
     * Counts pairs (i,j) where i&lt;j and (hours[i] + hours[j]) is a multiple of 24.
     *
     * @param hours array of hour values
     * @return count of valid pairs
     *
     * <p><b>Explanation:</b> For each pair to sum to a multiple of 24, their values mod 24 must sum to 0 or 24.</p>
     *   Use a frequency array of size 24 and count complements. Time O(n), Space O(1).
     */
    public int countCompleteDayPairs(int[] hours) {
        int[] freq = new int[24];
        int count = 0;
        for (int h : hours) {
            int r = h % 24;
            count += freq[(24 - r) % 24];
            freq[r]++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println("=== CountPairsThatFormACompleteDayI ===");
        CountPairsThatFormACompleteDayI sol = new CountPairsThatFormACompleteDayI();
        System.out.println(sol.countCompleteDayPairs(new int[]{1,2,3}));
    }
}
