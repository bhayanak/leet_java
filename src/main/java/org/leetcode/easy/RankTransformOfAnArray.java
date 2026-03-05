package org.leetcode.easy;

/** RankTransformOfAnArray solution. */
public class RankTransformOfAnArray {
    /**
     * Replaces each element with its rank in the sorted order (1-indexed, no gaps).
     *
     * @param arr input integer array
     * @return array of ranks (1-indexed)
     *
     * <p><b>Explanation:</b> Sorts a copy of the array, assigns rank 1,2,3,... to distinct</p>
     *   values in a HashMap, then maps each original element to its rank. Time O(n log n).
     */
    public int[] arrayRankTransform(int[] arr) {
        int[] sorted = arr.clone();
        java.util.Arrays.sort(sorted);
        java.util.Map<Integer, Integer> rank = new java.util.HashMap<>();
        for (int v : sorted) rank.putIfAbsent(v, rank.size() + 1);
        int[] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++) res[i] = rank.get(arr[i]);
        return res;
    }

    /**
     * Runs sample test cases.
      *
      * <p><b>Explanation:</b> Uses a hash structure for O(1) lookups to efficiently answer the query.</p>
      */
    public static void main(String[] args) {
        System.out.println("=== RankTransformOfAnArray ===");
        RankTransformOfAnArray sol = new RankTransformOfAnArray();
        System.out.println(sol.arrayRankTransform(new int[]{1,2,3}));
    }
}
