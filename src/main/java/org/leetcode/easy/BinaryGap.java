package org.leetcode.easy;

/** BinaryGap solution. */
public class BinaryGap {
    /**
     * Returns the number of steps between the highest and lowest set bits.
     *
     * @param n the input integer
     * @return gap between highest and lowest set bits, or 0 if only one bit set
     *
     * <p><b>Explanation:</b> Finds the GapPositions of '1' bits by iterating through all bits.</p>
     *   Returns the difference between the last and first positions. Time O(log n).
     */
    public int binaryGap(int n) {
        int last = -1, maxGap = 0, pos = 0;
        while (n > 0) {
            if ((n & 1) == 1) {
                if (last != -1) maxGap = Math.max(maxGap, pos - last);
                last = pos;
            }
            n >>= 1;
            pos++;
        }
        return maxGap;
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac BinaryGap.java &amp;&amp; java org.leetcode.easy.BinaryGap</pre>
      *
      * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
      */
    public static void main(String[] args) {
        System.out.println("=== BinaryGap ===");
        BinaryGap sol = new BinaryGap();
        System.out.println(sol.binaryGap(3));
    }
}
