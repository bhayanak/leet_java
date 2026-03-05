package org.leetcode.easy;

/** FairCandySwap solution. */
public class FairCandySwap {
    /**
     * Finds one element from each sorted array to swap so both arrays have equal sums.
     *
     * @param aliceValues Alice's sorted array
     * @param bobValues   Bob's sorted array
     * @return int[2] with one element from each array to swap
     *
     * <p><b>Explanation:</b> Let diff = (sumA - sumB) / 2. We need aliceValues[i] - bobValues[j] == diff.</p>
     *   Store Bob's values in a HashSet for O(1) lookup. Time O(n), Space O(n).
     */
    public int[] fairCandySwap(int[] aliceValues, int[] bobValues) {
        int sumA = 0, sumB = 0;
        java.util.Set<Integer> setB = new java.util.HashSet<>();
        for (int v : aliceValues) sumA += v;
        for (int v : bobValues)  { sumB += v; setB.add(v); }
        int diff = (sumA - sumB) / 2;
        for (int a : aliceValues) {
            int b = a - diff;
            if (setB.contains(b)) return new int[]{a, b};
        }
        return new int[]{};
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac FairCandySwap.java &amp;&amp; java org.leetcode.easy.FairCandySwap</pre>
      *
      * <p><b>Explanation:</b> Uses a hash structure for O(1) lookups to efficiently answer the query.</p>
      */
    public static void main(String[] args) {
        System.out.println("=== FairCandySwap ===");
        FairCandySwap sol = new FairCandySwap();
        System.out.println(sol.fairCandySwap(new int[]{1,2,3}, new int[]{1,2,3}));
    }
}
