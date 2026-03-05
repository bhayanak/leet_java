package org.leetcode.medium;

import java.util.*;
import java.util.stream.*;

/**
 * LeetCode #795: Number of Subarrays with Bounded Maximum
 * @see <a href="https://leetcode.com/problems/number-of-subarrays-with-bounded-maximum/">Problem</a>
 */
public class NumberOfSubarraysWithBoundedMaximum {

    /**
     * LeetCode #795 – Number of Subarrays with Bounded Maximum
     * Difficulty: MEDIUM
     * Topics: Array, Two Pointers
     *
     * Given an integer array nums and two integers left and right, return the
     * number of contiguous non-empty subarrays such that the value of the maximum
     * array element in that subarray is in the range [left, right].
     * 
     * 
     * The test cases are generated so that the answer will fit in a 32-bit
     * integer.
     * 
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: nums = [2,1,4,3], left = 2, right = 3
     * Output: 3
     * Explanation: There are three subarrays that meet the requirements: [2], [2,
     * 1], [3].
     * 
     * Example 2:
     * 
     * Input: nums = [2,9,2,5,6], left = 2, right = 8
     * Output: 7
     * 
     * 
     * 
     * Constraints:
     * 
     * 
     * 1 &lt;= nums.length &lt;= 105
     * 
     * 0 &lt;= nums[i] &lt;= 109
     * 
     * 0 &lt;= left &lt;= right &lt;= 109
     */
    // TODO: Implement solution for Number of Subarrays with Bounded Maximum
    // Difficulty: MEDIUM | Topics: Array, Two Pointers
    /**
     * Solves the problem and Solve.
     *
     * @return the computed Object result
     */
    public Object solve() {
        // Your solution here
        return null;
    }

    public static void main(String[] args) {
        NumberOfSubarraysWithBoundedMaximum sol = new NumberOfSubarraysWithBoundedMaximum();
        System.out.println(sol.solve());
    }
}
