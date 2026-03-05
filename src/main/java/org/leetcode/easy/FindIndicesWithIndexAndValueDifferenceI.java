package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;

/** FindIndicesWithIndexAndValueDifferenceI solution. */
public class FindIndicesWithIndexAndValueDifferenceI {

    /**
     * Finds two indices i, j where |i-j| &gt;= indexDiff and |nums[i]-nums[j]| &gt;= valueDiff.
     * @param nums input array
     * @param indexDiff minimum index distance
     * @param valueDiff minimum value distance
     * @return [i, j] pair, or [-1, -1] if none exists
     * <p><b>Explanation:</b> O(n²) brute-force for Easy; for each i check j = i+indexDiff..n-1.</p>
     */
    public int[] solve(int[] nums, int indexDiff, int valueDiff) {
        int n = nums.length;
        for (int i = 0; i < n; i++)
            for (int j = i + indexDiff; j < n; j++)
                if (Math.abs(nums[i] - nums[j]) >= valueDiff) return new int[]{i, j};
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        FindIndicesWithIndexAndValueDifferenceI sol = new FindIndicesWithIndexAndValueDifferenceI();
        System.out.println(Arrays.toString(sol.solve(new int[]{5,1,4,1}, 2, 4))); // [0, 3]
        System.out.println(Arrays.toString(sol.solve(new int[]{2,1}, 0, 0)));     // [0, 0]
    }

}
