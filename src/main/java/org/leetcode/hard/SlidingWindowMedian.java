package org.leetcode.hard;

import java.util.*;
import java.util.stream.*;

/**
 * LeetCode #480: Sliding Window Median
 * @see <a href="https://leetcode.com/problems/sliding-window-median/">Problem</a>
 */
public class SlidingWindowMedian {

    /**
     * LeetCode #480 – Sliding Window Median
     * Difficulty: HARD
     * Topics: Array, Hash Table, Sliding Window, Heap (Priority Queue)
     *
     * The median is the middle value in an ordered integer list. If the size of
     * the list is even, there is no middle value. So the median is the mean of
     * the two middle values.
     * 
     * 
     * For examples, if arr = [2,3,4], the median is 3.
     * 
     * For examples, if arr = [1,2,3,4], the median is (2 + 3) / 2 = 2.5.
     * 
     * You are given an integer array nums and an integer k. There is a sliding
     * window of size k which is moving from the very left of the array to the
     * very right. You can only see the k numbers in the window. Each time the
     * sliding window moves right by one position.
     * 
     * 
     * Return the median array for each window in the original array. Answers
     * within 10-5 of the actual value will be accepted.
     * 
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: nums = [1,3,-1,-3,5,3,6,7], k = 3
     * Output: [1.00000,-1.00000,-1.00000,3.00000,5.00000,6.00000]
     * Explanation:
     * Window position                Median
     * ---------------                -----
     * [1  3  -1] -3  5  3  6  7        1
     *  1 [3  -1  -3] 5  3  6  7       -1
     *  1  3 [-1  -3  5] 3  6  7       -1
     *  1  3  -1 [-3  5  3] 6  7        3
     *  1  3  -1  -3 [5  3  6] 7        5
     *  1  3  -1  -3  5 [3  6  7]       6
     * 
     * Example 2:
     * 
     * Input: nums = [1,2,3,4,2,3,1,4,2], k = 3
     * Output: [2.00000,3.00000,3.00000,3.00000,2.00000,3.00000,2.00000]
     * 
     * 
     * 
     * Constraints:
     * 
     * 
     * 1 &lt;= k &lt;= nums.length &lt;= 105
     * 
     * -231 &lt;= nums[i] &lt;= 231 - 1

     *
     * Hints:
     *   1. The simplest of solutions comes from the basic idea of finding the median given a set of numbers. We know that by definition, a median is the center element (or an average of the two center elements).
     *   2. Is there a better way to do what we are doing in the above hint? Don't you think there is duplication of calculation being done there? Is there some sort of optimization that we can do to achieve the 
     *   3. The third line of thought is also based on this same idea but achieving the result in a different way. We obviously need the window to be sorted for us to be able to find the median. Is there a data-s
     */
    // TODO: Implement solution for Sliding Window Median
    // Difficulty: HARD | Topics: Array, Hash Table, Sliding Window, Heap (Priority Queue)
    /**
     * Solves the problem and Solve.
     * Uses a sliding window to scan subarrays in linear time.
     *
     * @return the computed Object result
     */
    public Object solve() {
        // Your solution here
        return null;
    }

    public static void main(String[] args) {
        SlidingWindowMedian sol = new SlidingWindowMedian();
        System.out.println(sol.solve());
    }
}
