package org.leetcode.easy;

/** CheckIfAll1SAreAtLeastLengthKPlacesAway solution. */
public class CheckIfAll1SAreAtLeastLengthKPlacesAway {
    /**
     * Checks if every pair of consecutive 1s in the array is at least k positions apart.
     *
     * @param nums binary array
     * @param k    minimum required distance between 1s
     * @return true if all consecutive 1s are at least k apart
     *
     * <p><b>Explanation:</b> Records the index of the last seen '1'. If the gap to the current '1'</p>
     *   is less than k, returns false. Time O(n), Space O(1).
     */
    public boolean kLengthApart(int[] nums, int k) {
        int last = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                if (last != -1 && i - last - 1 < k) return false;
                last = i;
            }
        }
        return true;
    }

    /**
     * Runs sample test cases.
      *
      * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
      */
    public static void main(String[] args) {
        System.out.println("=== CheckIfAll1SAreAtLeastLengthKPlacesAway ===");
        CheckIfAll1SAreAtLeastLengthKPlacesAway sol = new CheckIfAll1SAreAtLeastLengthKPlacesAway();
        System.out.println(sol.kLengthApart(new int[]{1,2,3}, 3));
    }
}
