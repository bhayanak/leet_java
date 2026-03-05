package org.leetcode.hard;


/**
 * <b>#3739 - Count Subarrays With Majority Element II</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Hash Table, Divide and Conquer, Segment Tree, Merge Sort, Prefix Sum</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array nums and an integer target.
 *
 *
 * Return the number of subarrays of nums in which target is the majority element.
 *
 *
 * The majority element of a subarray is the element that appears strictly more than half of the times in that subarray.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,2,2,3], target = 2
 *
 *
 * Output: 5
 *
 *
 * Explanation:
 *
 *
 * Valid subarrays with target = 2 as the majority element:
 *
 *
 * nums[1..1] = [2]
 *
 * nums[2..2] = [2]
 *
 * nums[1..2] = [2,2]
 *
 * nums[0..2] = [1,2,2]
 *
 * nums[1..3] = [2,2,3]
 *
 * So there are 5 such subarrays.
 *
 * Example 2:
 *
 * Input: nums = [1,1,1,1], target = 1
 *
 *
 * Output: 10
 *
 *
 * Explanation: 
 *
 *
 * ​​​​​​​All 10 subarrays have 1 as the majority element.
 *
 * Example 3:
 *
 * Input: nums = [1,2,3], target = 4
 *
 *
 * Output: 0
 *
 *
 * Explanation:
 *
 *
 * target = 4 does not appear in nums at all. Therefore, there cannot be any subarray where 4 is the majority element. Hence the answer is 0.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 10​​​​​​​5
 *
 * 1 &lt;= nums[i] &lt;= 10​​​​​​​9
 *
 * 1 &lt;= target &lt;= 109
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Convert to +1/-1: let <code>arr[i] = 1</code> if <code>nums[i] == target</code> else <code>-1</code>.
 * Hint 2: Build prefix sums: <code>pref[0]=0</code>, <code>pref[k] = pref[k - 1] + arr[k - 1]</code> for <code>k=1..n</code>.
 * Hint 3: Count pairs <code>(i &lt; j)</code> with <code>pref[j] &gt; pref[i]</code> (these correspond to subarrays where <code>target</code> is majority).
 * Hint 4: Use coordinate compression on all <code>pref</code> values and a Fenwick tree / ordered map: iterate <code>k</code> from <code>0..n</code>, query how many previous <code>pref</code> are &lt; current, add to <code>ans</code>, then update.
 * Hint 5: If <code>target</code> never appears return <code>0</code>.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Divide and Conquer, Segment Tree, Merge Sort, Prefix Sum).
 *
 * @see <a href="https://leetcode.com/problems/count-subarrays-with-majority-element-ii/">LeetCode #3739</a>
 */
public class CountSubarraysWithMajorityElementIi {

    public static class TreeNode {
        int val; TreeNode left, right;
        TreeNode(int v) { val = v; }
    }
    /**
     * Solves the problem: Maximum difference.
     *
     * @param nums the nums (int[])
     * @return the computed int result
     */
    public int maximumDifference(int[] nums) {
        int max=-1; int minSoFar=nums[0];
        for (int i=1;i<nums.length;i++) {
            if (nums[i]>minSoFar) max=Math.max(max,nums[i]-minSoFar);
            else minSoFar=Math.min(minSoFar,nums[i]);
        }
        return max;
    }

    public static void main(String[] args) {
        CountSubarraysWithMajorityElementIi sol = new CountSubarraysWithMajorityElementIi();
        System.out.println(sol.maximumDifference(new int[]{1,2,3}));
    }
}
