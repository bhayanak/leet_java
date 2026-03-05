package org.leetcode.easy;


/**
 * <b>#2200 - Find All K-Distant Indices in an Array</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Two Pointers</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a 0-indexed integer array nums and two integers key and k. A k-distant index is an index i of nums for which there exists at least one index j such that |i - j| &lt;= k and nums[j] == key.
 *
 *
 * Return a list of all k-distant indices sorted in increasing order.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [3,4,9,1,3,9,5], key = 9, k = 1
 * Output: [1,2,3,4,5,6]
 * Explanation: Here, nums[2] == key and nums[5] == key.
 * - For index 0, |0 - 2| &gt; k and |0 - 5| &gt; k, so there is no j where |0 - j| &lt;= k and nums[j] == key. Thus, 0 is not a k-distant index.
 * - For index 1, |1 - 2| &lt;= k and nums[2] == key, so 1 is a k-distant index.
 * - For index 2, |2 - 2| &lt;= k and nums[2] == key, so 2 is a k-distant index.
 * - For index 3, |3 - 2| &lt;= k and nums[2] == key, so 3 is a k-distant index.
 * - For index 4, |4 - 5| &lt;= k and nums[5] == key, so 4 is a k-distant index.
 * - For index 5, |5 - 5| &lt;= k and nums[5] == key, so 5 is a k-distant index.
 * - For index 6, |6 - 5| &lt;= k and nums[5] == key, so 6 is a k-distant index.
 * Thus, we return [1,2,3,4,5,6] which is sorted in increasing order. 
 *
 * Example 2:
 *
 * Input: nums = [2,2,2,2,2], key = 2, k = 2
 * Output: [0,1,2,3,4]
 * Explanation: For all indices i in nums, there exists some index j such that |i - j| &lt;= k and nums[j] == key, so every index is a k-distant index. 
 * Hence, we return [0,1,2,3,4].
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 1000
 *
 * 1 &lt;= nums[i] &lt;= 1000
 *
 * key is an integer from the array nums.
 *
 * 1 &lt;= k &lt;= nums.length
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: For every occurrence of key in nums, find all indices within distance k from it.
 * Hint 2: Use a hash table to remove duplicate indices.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Two Pointers).
 *
 * @see <a href="https://leetcode.com/problems/find-all-k-distant-indices-in-an-array/">LeetCode #2200</a>
 */
public class FindAllKDistantIndicesInAnArray {


    /**
     * Returns all indices i where there exists j such that |i-j|&lt;=k and nums[j]==key.
     *
     * @param nums array of integers
     * @param key  target value in the array
     * @param k    maximum allowed distance
     * @return sorted list of k-distant indices
     *
     * <p><b>Explanation:</b> Collects all j where nums[j]==key, then for each i checks</p>
     *   whether any such j satisfies |i-j|&lt;=k. Uses a two-pointer to avoid O(n^2).
     *   Time O(n), Space O(n).
     */
    public java.util.List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        java.util.List<Integer> keys=new java.util.ArrayList<>(), res=new java.util.ArrayList<>();
        for (int i=0;i<nums.length;i++) if (nums[i]==key) keys.add(i);
        for (int i=0;i<nums.length;i++)
            for (int j:keys) if (Math.abs(i-j)<=k) { res.add(i); break; }
        return res;
    }

    public static void main(String[] args) {
        FindAllKDistantIndicesInAnArray sol = new FindAllKDistantIndicesInAnArray();
        System.out.println(sol.findKDistantIndices(new int[]{3,4,9,1,3,9,5}, 9, 1));
    }
}
