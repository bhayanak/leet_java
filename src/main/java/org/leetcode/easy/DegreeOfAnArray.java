package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;

/**
 * LeetCode #697: Degree of an Array
 * * Difficulty: EASY
     * Topics: Array, Hash Table
     *
     * Given a non-empty array of non-negative integers nums, the degree of this
     * array is defined as the maximum frequency of any one of its elements.
     * 
     * 
     * Your task is to find the smallest possible length of a (contiguous)
     * subarray of nums, that has the same degree as nums.
     * 
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: nums = [1,2,2,3,1]
     * Output: 2
     * Explanation:
     * The input array has a degree of 2 because both elements 1 and 2 appear
     * twice.
     * Of the subarrays that have the same degree:
     * [1, 2, 2, 3, 1], [1, 2, 2, 3], [2, 2, 3, 1], [1, 2, 2], [2, 2, 3], [2, 2]
     * The shortest length is 2. So return 2.
     * 
     * Example 2:
     * 
     * Input: nums = [1,2,2,3,1,4,2]
     * Output: 6
     * Explanation:
     * The degree is 3 because the element 2 is repeated 3 times.
     * So [2,2,3,1,4,2] is the shortest subarray, therefore returning 6.
     * 
     * 
     * 
     * Constraints:
     * 
     * 
     * nums.length will be between 1 and 50,000.
     * 
     * nums[i] will be an integer between 0 and 49,999.
     * 
 * @see <a href="https://leetcode.com/problems/degree-of-an-array/">Problem</a>
  *
  * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
  */
public class DegreeOfAnArray {

    /**
     * Finds the length of the shortest subarray with the same degree as the full array.
     * Degree = max frequency of any element.
     * @param nums input array
     * @return length of shortest subarray with same degree
     * <p><b>Explanation:</b> Track first/last occurrence and count for each value; degree-matching</p>
     *              candidates minimise (last - first + 1).
     */
    public int solve(int[] nums) {
        Map<Integer, Integer> count = new HashMap<>(),
                               first = new HashMap<>(),
                               last  = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int x = nums[i];
            count.merge(x, 1, Integer::sum);
            first.putIfAbsent(x, i);
            last.put(x, i);
        }
        int degree = Collections.max(count.values()), ans = nums.length;
        for (int x : count.keySet())
            if (count.get(x) == degree)
                ans = Math.min(ans, last.get(x) - first.get(x) + 1);
        return ans;
    }

    public static void main(String[] args) {
        DegreeOfAnArray sol = new DegreeOfAnArray();
        System.out.println(sol.solve(new int[]{1, 2, 2, 3, 1}));       // 2
        System.out.println(sol.solve(new int[]{1, 2, 2, 3, 1, 4, 2})); // 6
    }

}
