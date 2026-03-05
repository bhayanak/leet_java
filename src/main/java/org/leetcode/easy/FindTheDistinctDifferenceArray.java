package org.leetcode.easy;


/**
 * <b>#2670 - Find the Distinct Difference Array</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Hash Table</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a 0-indexed array nums of length n.
 *
 *
 * The distinct difference array of nums is an array diff of length n such that diff[i] is equal to the number of distinct elements in the suffix nums[i + 1, ..., n - 1] subtracted from the number of distinct elements in the prefix nums[0, ..., i].
 *
 *
 * Return the distinct difference array of nums.
 *
 *
 * Note that nums[i, ..., j] denotes the subarray of nums starting at index i and ending at index j inclusive. Particularly, if i &gt; j then nums[i, ..., j] denotes an empty subarray.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,2,3,4,5]
 * Output: [-3,-1,1,3,5]
 * Explanation: For index i = 0, there is 1 element in the prefix and 4 distinct elements in the suffix. Thus, diff[0] = 1 - 4 = -3.
 * For index i = 1, there are 2 distinct elements in the prefix and 3 distinct elements in the suffix. Thus, diff[1] = 2 - 3 = -1.
 * For index i = 2, there are 3 distinct elements in the prefix and 2 distinct elements in the suffix. Thus, diff[2] = 3 - 2 = 1.
 * For index i = 3, there are 4 distinct elements in the prefix and 1 distinct element in the suffix. Thus, diff[3] = 4 - 1 = 3.
 * For index i = 4, there are 5 distinct elements in the prefix and no elements in the suffix. Thus, diff[4] = 5 - 0 = 5.
 *
 * Example 2:
 *
 * Input: nums = [3,2,3,4,2]
 * Output: [-2,-1,0,2,3]
 * Explanation: For index i = 0, there is 1 element in the prefix and 3 distinct elements in the suffix. Thus, diff[0] = 1 - 3 = -2.
 * For index i = 1, there are 2 distinct elements in the prefix and 3 distinct elements in the suffix. Thus, diff[1] = 2 - 3 = -1.
 * For index i = 2, there are 2 distinct elements in the prefix and 2 distinct elements in the suffix. Thus, diff[2] = 2 - 2 = 0.
 * For index i = 3, there are 3 distinct elements in the prefix and 1 distinct element in the suffix. Thus, diff[3] = 3 - 1 = 2.
 * For index i = 4, there are 3 distinct elements in the prefix and no elements in the suffix. Thus, diff[4] = 3 - 0 = 3.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n == nums.length &lt;= 50
 *
 * 1 &lt;= nums[i] &lt;= 50
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Which data structure will help you maintain distinct elements?
 * Hint 2: Iterate over all possible prefix sizes. Then, use a nested loop to add the elements of the prefix to a set, and another nested loop to add the elements of the suffix to another set.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table).
 *
 * @see <a href="https://leetcode.com/problems/find-the-distinct-difference-array/">LeetCode #2670</a>
 */
public class FindTheDistinctDifferenceArray {


    /**
     * Returns words forming the longest subsequence with alternating groups.
     *
     * @param n      number of words
     * @param words  array of words
     * @param groups group assignments per word
     * @return words in the longest alternating subsequence
     *
     * <p><b>Explanation:</b> Greedily selects words when the group changes from the</p>
     *   previous selection, building the subsequence in a single O(n) pass.
     */
    public java.util.List<Integer> getWordsInLongestSubsequence(int n, String[] words, int[] groups) {
        // Return words at alternating group indices
        java.util.List<Integer> res=new java.util.ArrayList<>();
        res.add(0); int lastGroup=groups[0];
        for (int i=1;i<n;i++) if (groups[i]!=lastGroup) { res.add(i); lastGroup=groups[i]; }
        java.util.List<Integer> ans=new java.util.ArrayList<>();
        for (int idx:res) ans.add(idx);
        return ans;
    }

    public static void main(String[] args) {
        FindTheDistinctDifferenceArray sol = new FindTheDistinctDifferenceArray();
        System.out.println(sol.getWordsInLongestSubsequence(4, new String[]{"a","b","c","d"}, new int[]{1,0,1,1}));
    }
}
