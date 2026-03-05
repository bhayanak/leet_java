package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;

/** SmallestPairWithDifferentFrequencies solution. */
public class SmallestPairWithDifferentFrequencies {

    /**
     * Finds the pair of values with the two smallest different frequencies.
     * @param nums input array
     * @return [val1, val2] pair with smallest distinct frequencies (sorted ascending by value)
     * <p><b>Explanation:</b> Build freq map; find two entries with different frequencies; return the min pair.</p>
     */
    public int[] solve(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int x : nums) freq.merge(x, 1, Integer::sum);
        // find two values with different frequencies; return the pair with smallest sum of freqs
        List<Map.Entry<Integer, Integer>> entries = new ArrayList<>(freq.entrySet());
        entries.sort((a, b) -> a.getValue() != b.getValue()
            ? a.getValue() - b.getValue() : a.getKey() - b.getKey());
        for (int i = 0; i < entries.size(); i++)
            for (int j = i+1; j < entries.size(); j++)
                if (!entries.get(i).getValue().equals(entries.get(j).getValue()))
                    return new int[]{entries.get(i).getKey(), entries.get(j).getKey()};
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        SmallestPairWithDifferentFrequencies sol = new SmallestPairWithDifferentFrequencies();
        System.out.println(Arrays.toString(sol.solve(new int[]{3,3,1,2,2}))); // [1, 3] or similar
    }

}
