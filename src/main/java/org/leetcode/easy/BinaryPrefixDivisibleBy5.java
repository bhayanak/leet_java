package org.leetcode.easy;

/** BinaryPrefixDivisibleBy5 solution. */
public class BinaryPrefixDivisibleBy5 {
    /**
     * Returns a boolean array where answer[i] is true if the binary prefix number ending at i
     * is divisible by 5.
     *
     * @param nums binary array (0s and 1s)
     * @return boolean array of divisibility results
     *
     * <p><b>Explanation:</b> Maintains the running binary value mod 5 (to avoid overflow) by</p>
     *   shifting left and adding the new bit, then taking mod 5. Time O(n), Space O(n).
     */
    public java.util.List<Boolean> prefixesDivBy5(int[] nums) {
        java.util.List<Boolean> res = new java.util.ArrayList<>();
        int cur = 0;
        for (int bit : nums) {
            cur = (cur * 2 + bit) % 5;
            res.add(cur == 0);
        }
        return res;
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac BinaryPrefixDivisibleBy5.java &amp;&amp; java org.leetcode.easy.BinaryPrefixDivisibleBy5</pre>
      *
      * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
      */
    public static void main(String[] args) {
        System.out.println("=== BinaryPrefixDivisibleBy5 ===");
        BinaryPrefixDivisibleBy5 sol = new BinaryPrefixDivisibleBy5();
        System.out.println(sol.prefixesDivBy5(new int[]{1,2,3}));
    }
}
