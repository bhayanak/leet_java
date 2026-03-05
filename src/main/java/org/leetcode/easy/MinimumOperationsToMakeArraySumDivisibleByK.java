package org.leetcode.easy;

/** MinimumOperationsToMakeArraySumDivisibleByK solution. */
public class MinimumOperationsToMakeArraySumDivisibleByK {
    /**
     * Returns the minimum number of elements to remove so the array sum is divisible by k.
     *
     * @param nums input array
     * @param k    divisor
     * @return minimum removals to make sum divisible by k
     *
     * <p><b>Explanation:</b> Computes total sum mod k. If already 0, answer is 0.</p>
     *   Otherwise remove at most one element with value == (sum % k) if it exists;
     *   if not, try removing two elements. For Easy constraints brute force pairs.
     *   Time O(n^2), Space O(1).
     */
    public int minOperations(int[] nums, int k) {
        int sum = 0;
        for (int v : nums) sum += v;
        int r = sum % k;
        if (r == 0) return 0;
        // try removing one element
        for (int v : nums) if (v % k == r) return 1;
        // try removing two elements
        for (int i = 0; i < nums.length; i++)
            for (int j = i+1; j < nums.length; j++)
                if ((nums[i] + nums[j]) % k == r) return 2;
        return 3;
    }

    public static void main(String[] args) {
        System.out.println("=== MinimumOperationsToMakeArraySumDivisibleByK ===");
        MinimumOperationsToMakeArraySumDivisibleByK sol = new MinimumOperationsToMakeArraySumDivisibleByK();
        System.out.println(sol.minOperations(new int[]{1,2,3}, 3));
    }
}
