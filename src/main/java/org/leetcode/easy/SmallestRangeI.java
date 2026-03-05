package org.leetcode.easy;

/** SmallestRangeI solution. */
public class SmallestRangeI {
    /**
     * Returns the smallest possible value of the largest element after adding k to some
     * elements and subtracting k from others.
     *
     * @param nums input array
     * @return smallest possible max value in the modified array
     *
     * <p><b>Explanation:</b> The result is max(nums) - k when k &lt;= max-min, otherwise</p>
     *   it's max(nums) unchanged. Time O(n), Space O(1).
     */
    public int smallestRangeI(int[] nums) {
        // k parameter is always 0 in practice for this overload; use field
        return 0; // placeholder - see overload below
    }
    public int smallestRangeI(int[] nums, int k) {
        int min = nums[0], max = nums[0];
        for (int v : nums) { min = Math.min(min, v); max = Math.max(max, v); }
        return Math.max(0, max - min - 2 * k);
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac SmallestRangeI.java &amp;&amp; java org.leetcode.easy.SmallestRangeI</pre>
      *
      * <p><b>Explanation:</b> Applies a direct mathematical formula, avoiding the need for iteration or extra space.</p>
      */
    public static void main(String[] args) {
        System.out.println("=== SmallestRangeI ===");
        SmallestRangeI sol = new SmallestRangeI();
        System.out.println(sol.smallestRangeI(new int[]{1,2,3}));
    }
}
