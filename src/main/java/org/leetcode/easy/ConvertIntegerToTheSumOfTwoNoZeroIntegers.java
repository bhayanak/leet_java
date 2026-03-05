package org.leetcode.easy;

/** ConvertIntegerToTheSumOfTwoNoZeroIntegers solution. */
public class ConvertIntegerToTheSumOfTwoNoZeroIntegers {
    /**
     * Returns two positive no-zero integers (no digit 0) that sum to n.
     *
     * @param n target sum
     * @return int[2] of no-zero integers summing to n
     *
     * <p><b>Explanation:</b> Iterates a from 1; b = n - a. If both a and b contain no '0' digit</p>
     *   (checked via string conversion), they are the answer. Time O(n * log n), Space O(1).
     */
    public int[] getNoZeroIntegers(int n) {
        for (int a = 1; a < n; a++) {
            int b = n - a;
            if (!String.valueOf(a).contains("0") && !String.valueOf(b).contains("0"))
                return new int[]{a, b};
        }
        return new int[]{};
    }

    /**
     * Runs sample test cases.
      *
      * <p><b>Explanation:</b> Applies a direct mathematical formula, avoiding the need for iteration or extra space.</p>
      */
    public static void main(String[] args) {
        System.out.println("=== ConvertIntegerToTheSumOfTwoNoZeroIntegers ===");
        ConvertIntegerToTheSumOfTwoNoZeroIntegers sol = new ConvertIntegerToTheSumOfTwoNoZeroIntegers();
        System.out.println(sol.getNoZeroIntegers(3));
    }
}
