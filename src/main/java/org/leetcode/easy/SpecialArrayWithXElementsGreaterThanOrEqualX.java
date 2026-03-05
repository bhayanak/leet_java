package org.leetcode.easy;

/** SpecialArrayWithXElementsGreaterThanOrEqualX solution. */
public class SpecialArrayWithXElementsGreaterThanOrEqualX {
    /**
     * Determines if there exists a special x such that there are exactly x elements &gt;= x.
     *
     * @param nums input array
     * @return x if such a value exists, else -1
     *
     * <p><b>Explanation:</b> Sorts the array; for each candidate x (1..n), binary search or direct</p>
     *   check: nums[n-x] &gt;= x and (x==n || nums[n-x-1] &lt; x). Time O(n log n), Space O(1).
     */
    public int specialArray(int[] nums) {
        java.util.Arrays.sort(nums);
        int n = nums.length;
        for (int x = 0; x <= n; x++) {
            int idx = n - x;
            if (idx <= 0 || nums[idx - 1] < x) {
                if (idx == 0 || nums[idx - 1] < x) {
                    // check all remaining >= x
                    boolean ok = idx == 0 || nums[idx] >= x;
                    if (idx < n && nums[idx] >= x && (idx == 0 || nums[idx-1] < x))
                        return x;
                }
            }
        }
        // simple approach
        for (int x = 1; x <= n; x++) {
            int cnt = 0;
            for (int v : nums) if (v >= x) cnt++;
            if (cnt == x) return x;
        }
        return -1;
    }

    /**
     * Runs sample test cases.
      *
      * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
      */
    public static void main(String[] args) {
        System.out.println("=== SpecialArrayWithXElementsGreaterThanOrEqualX ===");
        SpecialArrayWithXElementsGreaterThanOrEqualX sol = new SpecialArrayWithXElementsGreaterThanOrEqualX();
        System.out.println(sol.specialArray(new int[]{1,2,3}));
    }
}
