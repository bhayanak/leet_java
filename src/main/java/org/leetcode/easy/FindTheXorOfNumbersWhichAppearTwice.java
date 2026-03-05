package org.leetcode.easy;

/** FindTheXorOfNumbersWhichAppearTwice solution. */
public class FindTheXorOfNumbersWhichAppearTwice {
    /**
     * Returns the XOR of all numbers that appear exactly twice in the array.
     *
     * @param nums input array
     * @return XOR of all duplicate numbers
     *
     * <p><b>Explanation:</b> Uses a frequency map; any element with frequency == 2 is XOR'd into the result.</p>
     *   Time O(n), Space O(n).
     */
    public int duplicateNumbersXOR(int[] nums) {
        java.util.Map<Integer, Integer> freq = new java.util.HashMap<>();
        for (int v : nums) freq.merge(v, 1, Integer::sum);
        int xorResult = 0;
        for (var e : freq.entrySet())
            if (e.getValue() == 2) xorResult ^= e.getKey();
        return xorResult;
    }

    public static void main(String[] args) {
        System.out.println("=== FindTheXorOfNumbersWhichAppearTwice ===");
        FindTheXorOfNumbersWhichAppearTwice sol = new FindTheXorOfNumbersWhichAppearTwice();
        System.out.println(sol.duplicateNumbersXOR(new int[]{1,2,3}));
    }
}
