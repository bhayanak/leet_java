package org.leetcode.easy;

/** DesignAnOrderedStream solution. */
public class DesignAnOrderedStream {
    /**
     * Implements an ordered stream: fills positions and flushes consecutive chunks.
     *
     * @param n capacity of the stream
     *
     * <p><b>Explanation:</b> Stores values in an array by 1-indexed id; insert() fills the slot</p>
     *   and flushes as many consecutive non-null values as possible from the current pointer.
     *   Time O(n) amortised over all inserts, Space O(n).
     */
    private String[] data;
    private int ptr = 1;
    public void initStream(int n) { this.data = new String[n + 1]; }
    public java.util.List<String> insertStream(int idKey, String value) {
        data[idKey] = value;
        java.util.List<String> res = new java.util.ArrayList<>();
        while (ptr < data.length && data[ptr] != null) res.add(data[ptr++]);
        return res;
    }

    /**
     * Runs sample test cases.
      *
      * <p><b>Explanation:</b> Uses a hash structure for O(1) lookups to efficiently answer the query.</p>
      */
    public static void main(String[] args) {
        System.out.println("=== DesignAnOrderedStream ===");
        DesignAnOrderedStream sol = new DesignAnOrderedStream();
        sol.initStream(5);
        System.out.println(sol.insertStream(1, "a"));
        System.out.println(sol.insertStream(2, "b"));
    }
}
