package org.leetcode.medium;


/**
 * <b>#3843 - First Element with Unique Frequency</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Hash Table, Counting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array nums.
 *
 *
 * Return an integer denoting the first element (scanning from left to right) in nums whose frequency is unique. That is, no other integer appears the same number of times in nums. If there is no such element, return -1.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [20,10,30,30]
 *
 *
 * Output: 30
 *
 *
 * Explanation:
 *
 *
 * 20 appears once.
 *
 * 10 appears once.
 *
 * 30 appears twice.
 *
 * The frequency of 30 is unique because no other integer appears exactly twice.
 *
 * Example 2:
 *
 * Input: nums = [20,20,10,30,30,30]
 *
 *
 * Output: 20
 *
 *
 * Explanation:
 *
 *
 * 20 appears twice.
 *
 * 10 appears once.
 *
 * 30 appears 3 times.
 *
 * The frequency of 20, 10, and 30 are unique. The first element that has unique frequency is 20.
 *
 * Example 3:
 *
 * Input: nums = [10,10,20,20]
 *
 *
 * Output: -1
 *
 *
 * Explanation:
 *
 *
 * 10 appears twice.
 *
 * 20 appears twice.
 *
 * No element has a unique frequency.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 105
 *
 * 1 &lt;= nums[i] &lt;= 105
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use two hash maps: one <code>freq</code> and one <code>freqCount</code>
 * Hint 2: First pass: for each <code>x</code> in <code>nums</code> do <code>freq[x] += 1</code>
 * Hint 3: Build counts of frequencies: for each <code>f</code> in values of <code>freq</code> do <code>freqCount[f] += 1</code>
 * Hint 4: Scan <code>nums</code> from left to right and return the first <code>x</code> with <code>freqCount[freq[x]] == 1</code>; return <code>-1</code> if none
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Counting).
 *
 * @see <a href="https://leetcode.com/problems/first-element-with-unique-frequency/">LeetCode #3843</a>
 */
public class FirstElementWithUniqueFrequency {

    /**
     * Solves the problem: Smallest trimmed numbers.
     *
     * @param nums the nums (String[])
     * @param queries the queries (int[][])
     * @return the computed int[] result
     */
    public int[] smallestTrimmedNumbers(String[] nums, int[][] queries) {
        int[] res=new int[queries.length];
        for (int i=0;i<queries.length;i++) {
            int k=queries[i][0], trim=queries[i][1];
            String[] trimmed=new String[nums.length];
            for (int j=0;j<nums.length;j++) trimmed[j]=nums[j].substring(nums[j].length()-trim);
            java.util.List<String[]> list=new java.util.ArrayList<>();
            for (int j=0;j<nums.length;j++) list.add(new String[]{trimmed[j],String.valueOf(j)});
            list.sort((a,b)->a[0].equals(b[0])?Integer.parseInt(a[1])-Integer.parseInt(b[1]):a[0].compareTo(b[0]));
            res[i]=Integer.parseInt(list.get(k-1)[1]);
        }
        return res;
    }

    public static void main(String[] args) {
        FirstElementWithUniqueFrequency sol = new FirstElementWithUniqueFrequency();
        System.out.println(sol.smallestTrimmedNumbers(new String[]{"a","b"}, new int[][]{{1,2},{3,4}}));
    }
}
