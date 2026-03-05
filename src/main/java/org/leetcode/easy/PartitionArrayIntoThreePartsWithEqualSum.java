package org.leetcode.easy;

/** PartitionArrayIntoThreePartsWithEqualSum solution. */
public class PartitionArrayIntoThreePartsWithEqualSum {
    /**
     * Determines if the array can be partitioned into three contiguous parts with equal sums.
     *
     * @param arr integer array
     * @return true if three equal-sum parts exist
     *
     * <p><b>Explanation:</b> Computes total sum; if not divisible by 3, return false.</p>
     *   Scans left-to-right counting how many prefix sums equal target and target*2.
     *   Time O(n), Space O(1).
     */
    public boolean canThreePartsEqualSum(int[] arr) {
        int total = 0;
        for (int v : arr) total += v;
        if (total % 3 != 0) return false;
        int target = total / 3, sum = 0, parts = 0;
        for (int v : arr) {
            sum += v;
            if (sum == target * (parts + 1)) parts++;
        }
        return parts >= 3;
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac PartitionArrayIntoThreePartsWithEqualSum.java &amp;&amp; java org.leetcode.easy.PartitionArrayIntoThreePartsWithEqualSum</pre>
      *
      * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
      */
    public static void main(String[] args) {
        System.out.println("=== PartitionArrayIntoThreePartsWithEqualSum ===");
        PartitionArrayIntoThreePartsWithEqualSum sol = new PartitionArrayIntoThreePartsWithEqualSum();
        System.out.println(sol.canThreePartsEqualSum(new int[]{1,2,3}));
    }
}
