package org.leetcode.easy;

/** FindIndicesOfStableMountains solution. */
public class FindIndicesOfStableMountains {
    /**
     * Returns all indices i where mountain[i] &gt; mountain[i+1].
     *
     * @param mountain array of mountain heights
     * @return list of stable mountain indices
     *
     * <p><b>Explanation:</b> A single O(n) scan: emit index i whenever mountain[i] &gt; mountain[i+1].</p>
     */
    public java.util.List<Integer> stableMountains(int[] mountain) {
        java.util.List<Integer> res = new java.util.ArrayList<>();
        for (int i = 0; i + 1 < mountain.length; i++)
            if (mountain[i] > mountain[i+1]) res.add(i);
        return res;
    }

    public static void main(String[] args) {
        System.out.println("=== FindIndicesOfStableMountains ===");
        FindIndicesOfStableMountains sol = new FindIndicesOfStableMountains();
        System.out.println(sol.stableMountains(new int[]{1,2,3}));
    }
}
