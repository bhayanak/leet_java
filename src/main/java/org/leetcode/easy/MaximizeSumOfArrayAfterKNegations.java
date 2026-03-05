package org.leetcode.easy;

/** MaximizeSumOfArrayAfterKNegations solution. */
public class MaximizeSumOfArrayAfterKNegations {
    /**
     * Maximizes the array sum after exactly k negations.
     *
     * @param nums input array
     * @param k    number of negations to apply
     * @return maximum sum after k negations
     *
     * <p><b>Explanation:</b> Sort by absolute value descending. Negate the smallest magnitude</p>
     *   negatives first. After k negations, if k is still odd, flip the absolute minimum.
     *   Time O(n log n), Space O(1).
     */
    public int largestSumAfterKNegations(int[] nums, int k) {
        java.util.Arrays.sort(nums);
        for (int i = 0; i < nums.length && k > 0 && nums[i] < 0; i++, k--)
            nums[i] = -nums[i];
        int sum = 0, min = Integer.MAX_VALUE;
        for (int v : nums) { sum += v; min = Math.min(min, v); }
        return sum - (k % 2 == 0 ? 0 : 2 * min);
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac MaximizeSumOfArrayAfterKNegations.java &amp;&amp; java org.leetcode.easy.MaximizeSumOfArrayAfterKNegations</pre>
      *
      * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
      */
    public static void main(String[] args) {
        System.out.println("=== MaximizeSumOfArrayAfterKNegations ===");
        MaximizeSumOfArrayAfterKNegations sol = new MaximizeSumOfArrayAfterKNegations();
        System.out.println(sol.largestSumAfterKNegations(new int[]{1,2,3}, 3));
    }
}
