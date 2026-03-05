package org.leetcode.easy;

/** MinimumAverageOfSmallestAndLargestElements solution. */
public class MinimumAverageOfSmallestAndLargestElements {
    /**
     * Returns the minimum average of all (smallest + largest) pairs after sorting.
     *
     * @param nums input array (even length)
     * @return minimum average of all pair sums
     *
     * <p><b>Explanation:</b> Sort; the n/2 pairs (nums[0]+nums[n-1])/2, ..., (nums[n/2-1]+nums[n/2])/2</p>
     *   are all distinct pair averages. Return the minimum. Time O(n log n), Space O(1).
     */
    public double minimumAverage(int[] nums) {
        java.util.Arrays.sort(nums);
        double min = Double.MAX_VALUE;
        int n = nums.length;
        for (int i = 0; i < n / 2; i++)
            min = Math.min(min, (nums[i] + nums[n-1-i]) / 2.0);
        return min;
    }

    public static void main(String[] args) {
        System.out.println("=== MinimumAverageOfSmallestAndLargestElements ===");
        MinimumAverageOfSmallestAndLargestElements sol = new MinimumAverageOfSmallestAndLargestElements();
        System.out.println(sol.minimumAverage(new int[]{1,2,3}));
    }
}
