package org.leetcode.easy;

/** FindTheLargestAlmostMissingInteger solution. */
public class FindTheLargestAlmostMissingInteger {
    /**
     * Returns the largest value that appears exactly once in the array, or -1 if none.
     *
     * @param nums input array
     * @return largest unique element or -1
     *
     * <p><b>Explanation:</b> Counts frequencies with a HashMap, collects elements with frequency 1,</p>
     *   returns the maximum. Time O(n), Space O(n).
     */
    public int largestAlmostMissingInteger(int[] nums) {
        java.util.Map<Integer, Integer> freq = new java.util.HashMap<>();
        for (int v : nums) freq.merge(v, 1, Integer::sum);
        int max = -1;
        for (var e : freq.entrySet())
            if (e.getValue() == 1) max = Math.max(max, e.getKey());
        return max;
    }

    public static void main(String[] args) {
        System.out.println("=== FindTheLargestAlmostMissingInteger ===");
        FindTheLargestAlmostMissingInteger sol = new FindTheLargestAlmostMissingInteger();
        System.out.println(sol.largestAlmostMissingInteger(new int[]{1,2,3}));
    }
}
