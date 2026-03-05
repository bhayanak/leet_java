package org.leetcode.easy;

/** RelativeSortArray solution. */
public class RelativeSortArray {
    /**
     * Sorts arr1 according to the order defined by arr2; elements not in arr2 go at the end sorted.
     *
     * @param arr1 array to sort
     * @param arr2 defines the relative order of elements
     * @return arr1 sorted by arr2's ordering
     *
     * <p><b>Explanation:</b> Builds a rank map from arr2's indices, then sorts arr1 using</p>
     *   those ranks (unranked elements use rank arr2.length + their value). Time O(n log n).
     */
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        java.util.Map<Integer, Integer> rank = new java.util.HashMap<>();
        for (int i = 0; i < arr2.length; i++) rank.put(arr2[i], i);
        Integer[] boxed = new Integer[arr1.length];
        for (int i = 0; i < arr1.length; i++) boxed[i] = arr1[i];
        java.util.Arrays.sort(boxed, (a, b) -> {
            int ra = rank.getOrDefault(a, arr2.length + a);
            int rb = rank.getOrDefault(b, arr2.length + b);
            return ra - rb;
        });
        for (int i = 0; i < arr1.length; i++) arr1[i] = boxed[i];
        return arr1;
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac RelativeSortArray.java &amp;&amp; java org.leetcode.easy.RelativeSortArray</pre>
      *
      * <p><b>Explanation:</b> Uses a hash structure for O(1) lookups to efficiently answer the query.</p>
      */
    public static void main(String[] args) {
        System.out.println("=== RelativeSortArray ===");
        RelativeSortArray sol = new RelativeSortArray();
        System.out.println(sol.relativeSortArray(new int[]{1,2,3}, new int[]{1,2,3}));
    }
}
