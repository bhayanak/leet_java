package org.leetcode.medium;


/**
 * <b>#2261 - K Divisible Elements Subarrays</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Hash Table, Trie, Rolling Hash, Hash Function, Enumeration</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an integer array nums and two integers k and p, return the number of distinct subarrays, which have at most k elements that are divisible by p.
 *
 *
 * Two arrays nums1 and nums2 are said to be distinct if:
 *
 *
 * They are of different lengths, or
 *
 * There exists at least one index i where nums1[i] != nums2[i].
 *
 * A subarray is defined as a non-empty contiguous sequence of elements in an array.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [2,3,3,2,2], k = 2, p = 2
 * Output: 11
 * Explanation:
 * The elements at indices 0, 3, and 4 are divisible by p = 2.
 * The 11 distinct subarrays which have at most k = 2 elements divisible by 2 are:
 * [2], [2,3], [2,3,3], [2,3,3,2], [3], [3,3], [3,3,2], [3,3,2,2], [3,2], [3,2,2], and [2,2].
 * Note that the subarrays [2] and [3] occur more than once in nums, but they should each be counted only once.
 * The subarray [2,3,3,2,2] should not be counted because it has 3 elements that are divisible by 2.
 *
 * Example 2:
 *
 * Input: nums = [1,2,3,4], k = 4, p = 1
 * Output: 10
 * Explanation:
 * All element of nums are divisible by p = 1.
 * Also, every subarray of nums will have at most 4 elements that are divisible by 1.
 * Since all subarrays are distinct, the total number of subarrays satisfying all the constraints is 10.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 200
 *
 * 1 &lt;= nums[i], p &lt;= 200
 *
 * 1 &lt;= k &lt;= nums.length
 *
 *
 *
 * Follow up:
 *
 *
 * Can you solve this problem in O(n2) time complexity?
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Enumerate all subarrays and find the ones that satisfy all the conditions.
 * Hint 2: Use any suitable method to hash the subarrays to avoid duplicates.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Trie, Rolling Hash, Hash Function, Enumeration).
 *
 * @see <a href="https://leetcode.com/problems/k-divisible-elements-subarrays/">LeetCode #2261</a>
 */
public class KDivisibleElementsSubarrays {

    /**
     * Returns the number of distinct subarrays with at most k elements divisible by p.
     *
     * @param nums input array
     * @param k max number of elements divisible by p
     * @param p divisor
     * @return number of distinct subarrays
     *
     * <p><b>Explanation:</b> Enumerates all subarrays, hashes them to avoid duplicates, and counts those with at most k elements divisible by p. Time O(n^2), Space O(n^2).</p>
     */
    public int countDistinct(int[] nums, int k, int p) {
        throw new UnsupportedOperationException("Not yet implemented: K Divisible Elements Subarrays");
    }

    public static void main(String[] args) {
        System.out.println("=== KDivisibleElementsSubarrays ===");
        KDivisibleElementsSubarrays sol = new KDivisibleElementsSubarrays();
        System.out.println(sol.countDistinct(new int[]{2,3,3,2,2}, 2, 2)); // 11
        System.out.println(sol.countDistinct(new int[]{1,2,3,4}, 4, 1)); // 10
    }
}
