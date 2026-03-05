package org.leetcode.easy;

/** SumOfVariableLengthSubarrays solution. */
public class SumOfVariableLengthSubarrays {
    /**
     * Returns the sum of subarray sums for all variable-length windows starting at each index.
     *
     * @param nums input array
     * @return total sum of all variable-length subarrays
     *
     * <p><b>Explanation:</b> For each starting index i, sums nums[i..i+nums[i]-1] (clamped to array end).</p>
     *   Time O(n * max_val) in the worst case but bounded by array size. Time O(n^2), Space O(1).
     */
    public long subarraySum(int[] nums) {
        long total = 0;
        for (int i = 0; i < nums.length; i++) {
            int end = Math.min(i + nums[i], nums.length);
            for (int j = i; j < end; j++) total += nums[j];
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println("=== SumOfVariableLengthSubarrays ===");
        SumOfVariableLengthSubarrays sol = new SumOfVariableLengthSubarrays();
        System.out.println(sol.subarraySum(new int[]{1,2,3}));
    }
}
