package org.leetcode.easy;

/** LargestPerimeterTriangle solution. */
public class LargestPerimeterTriangle {
    /**
     * Returns the perimeter of the largest triangle that can be formed from sticks.
     *
     * @param nums lengths of sticks
     * @return largest valid triangle perimeter, or 0 if none exists
     *
     * <p><b>Explanation:</b> Sort descending; the best triple is always three consecutive elements</p>
     *   (largest possible sum). Check triangle inequality: if a + b &gt; c for sorted a &gt;= b &gt;= c.
     *   Time O(n log n), Space O(1).
     */
    public int largestPerimeter(int[] nums) {
        java.util.Arrays.sort(nums);
        for (int i = nums.length - 1; i >= 2; i--)
            if (nums[i-2] + nums[i-1] > nums[i])
                return nums[i-2] + nums[i-1] + nums[i];
        return 0;
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac LargestPerimeterTriangle.java &amp;&amp; java org.leetcode.easy.LargestPerimeterTriangle</pre>
      *
      * <p><b>Explanation:</b> Applies a direct mathematical formula, avoiding the need for iteration or extra space.</p>
      */
    public static void main(String[] args) {
        System.out.println("=== LargestPerimeterTriangle ===");
        LargestPerimeterTriangle sol = new LargestPerimeterTriangle();
        System.out.println(sol.largestPerimeter(new int[]{1,2,3}));
    }
}
