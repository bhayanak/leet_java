package org.leetcode.easy;

/** AddToArrayFormOfInteger solution. */
public class AddToArrayFormOfInteger {
    /**
     * Adds a non-negative integer k to a number represented as an array of its digits.
     *
     * @param num array of digits (most significant first)
     * @param k   integer to add
     * @return digit array of the sum
     *
     * <p><b>Explanation:</b> Adds k to the least significant digit (last element), propagates</p>
     *   carry left. If carry remains after the array, prepends it. Time O(n), Space O(n).
     */
    public java.util.List<Integer> addToArrayForm(int[] num, int k) {
        java.util.LinkedList<Integer> res = new java.util.LinkedList<>();
        int carry = k;
        for (int i = num.length - 1; i >= 0 || carry > 0; i--) {
            int sum = carry + (i >= 0 ? num[i] : 0);
            res.addFirst(sum % 10);
            carry = sum / 10;
        }
        return res;
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac AddToArrayFormOfInteger.java &amp;&amp; java org.leetcode.easy.AddToArrayFormOfInteger</pre>
      *
      * <p><b>Explanation:</b> Applies a direct mathematical formula, avoiding the need for iteration or extra space.</p>
      */
    public static void main(String[] args) {
        System.out.println("=== AddToArrayFormOfInteger ===");
        AddToArrayFormOfInteger sol = new AddToArrayFormOfInteger();
        System.out.println(sol.addToArrayForm(new int[]{1,2,3}, 3));
    }
}
