package org.leetcode.hard;


/**
 * <b>#3538 - Merge Operations for Minimum Travel Time</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Dynamic Programming, Prefix Sum</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a straight road of length l km, an integer n, an integer k, and two integer arrays, position and time, each of length n.
 *
 *
 * The array position lists the positions (in km) of signs in strictly increasing order (with position[0] = 0 and position[n - 1] = l).
 *
 *
 * Each time[i] represents the time (in minutes) required to travel 1 km between position[i] and position[i + 1].
 *
 *
 * You must perform exactly k merge operations. In one merge, you can choose any two adjacent signs at indices i and i + 1 (with i &gt; 0 and i + 1 &lt; n) and:
 *
 *
 * Update the sign at index i + 1 so that its time becomes time[i] + time[i + 1].
 *
 * Remove the sign at index i.
 *
 * Return the minimum total travel time (in minutes) to travel from 0 to l after exactly k merges.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: l = 10, n = 4, k = 1, position = [0,3,8,10], time = [5,8,3,6]
 *
 *
 * Output: 62
 *
 *
 * Explanation:
 *
 *
 *
 *
 * Merge the signs at indices 1 and 2. Remove the sign at index 1, and change the time at index 2 to 8 + 3 = 11.
 *
 *
 * After the merge:
 *
 *
 *
 * position array: [0, 8, 10]
 *
 * time array: [5, 11, 6]
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 * 				Segment
 * 				Distance (km)
 * 				Time per km (min)
 * 				Segment Travel Time (min)
 *
 *
 *
 *
 *
 *
 * 				0 → 8
 * 				8
 * 				5
 * 				8 × 5 = 40
 *
 *
 *
 *
 * 				8 → 10
 * 				2
 * 				11
 * 				2 × 11 = 22
 *
 *
 *
 *
 *
 *
 * Total Travel Time: 40 + 22 = 62, which is the minimum possible time after exactly 1 merge.
 *
 * Example 2:
 *
 * Input: l = 5, n = 5, k = 1, position = [0,1,2,3,5], time = [8,3,9,3,3]
 *
 *
 * Output: 34
 *
 *
 * Explanation:
 *
 *
 * Merge the signs at indices 1 and 2. Remove the sign at index 1, and change the time at index 2 to 3 + 9 = 12.
 *
 * After the merge:
 *
 *
 *
 * position array: [0, 2, 3, 5]
 *
 * time array: [8, 12, 3, 3]
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 * 				Segment
 * 				Distance (km)
 * 				Time per km (min)
 * 				Segment Travel Time (min)
 *
 *
 *
 *
 *
 *
 * 				0 → 2
 * 				2
 * 				8
 * 				2 × 8 = 16
 *
 *
 *
 *
 * 				2 → 3
 * 				1
 * 				12
 * 				1 × 12 = 12
 *
 *
 *
 *
 * 				3 → 5
 * 				2
 * 				3
 * 				2 × 3 = 6
 *
 *
 *
 *
 *
 *
 * Total Travel Time: 16 + 12 + 6 = 34, which is the minimum possible time after exactly 1 merge.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= l &lt;= 105
 *
 * 2 &lt;= n &lt;= min(l + 1, 50)
 *
 * 0 &lt;= k &lt;= min(n - 2, 10)
 *
 * position.length == n
 *
 * position[0] = 0 and position[n - 1] = l
 *
 * position is sorted in strictly increasing order.
 *
 * time.length == n
 *
 * 1 &lt;= time[i] &lt;= 100​
 *
 * 1 &lt;= sum(time) &lt;= 100​​​​​​
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use dynamic programming.
 * Hint 2: After <code>k</code> merges, you’ll have <code>n-k</code> signs left.
 * Hint 3: Define <code>DP[i][j][s]</code> as the minimum travel time for positions <code>0..i</code> when <code>i</code> is kept, <code>j</code> deletions are done overall, and <code>s</code> consecutive deletions occurred immediately before <code>i</code>.
 * Hint 4: Update the DP by either merging (increment <code>s</code> and <code>j</code>) or not merging (reset <code>s</code>) and adding the appropriate travel time.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Dynamic Programming, Prefix Sum).
 *
 * @see <a href="https://leetcode.com/problems/merge-operations-for-minimum-travel-time/">LeetCode #3538</a>
 */
public class MergeOperationsForMinimumTravelTime {

    /**
     * Computes the maximum Max removal.
     * Sorts the input first to enable efficient processing.
     *
     * @param nums the nums (int[])
     * @param k the k (int)
     * @return the computed double result
     */
    public double maxRemoval(int[] nums, int k) {
        java.util.Arrays.sort(nums);
        int n=nums.length;
        // remove k elements to maximize average
        double sum=0;
        for (int i=k;i<n;i++) sum+=nums[i];
        return n>k?sum/(n-k):0;
    }

    public static void main(String[] args) {
        MergeOperationsForMinimumTravelTime sol = new MergeOperationsForMinimumTravelTime();
        System.out.println(sol.maxRemoval(new int[]{1,2,3}, 0));
    }
}
