package org.leetcode.medium;


/**
 * <b>#3599 - Partition Array to Minimize XOR</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Dynamic Programming, Bit Manipulation, Prefix Sum</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array nums and an integer k.
 *
 *
 * Your task is to partition nums into k non-empty subarrays. For each subarray, compute the bitwise XOR of all its elements.
 *
 *
 * Return the minimum possible value of the maximum XOR among these k subarrays.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,2,3], k = 2
 *
 *
 * Output: 1
 *
 *
 * Explanation:
 *
 *
 * The optimal partition is [1] and [2, 3].
 *
 *
 * XOR of the first subarray is 1.
 *
 * XOR of the second subarray is 2 XOR 3 = 1.
 *
 * The maximum XOR among the subarrays is 1, which is the minimum possible.
 *
 * Example 2:
 *
 * Input: nums = [2,3,3,2], k = 3
 *
 *
 * Output: 2
 *
 *
 * Explanation:
 *
 *
 * The optimal partition is [2], [3, 3], and [2].
 *
 *
 * XOR of the first subarray is 2.
 *
 * XOR of the second subarray is 3 XOR 3 = 0.
 *
 * XOR of the third subarray is 2.
 *
 * The maximum XOR among the subarrays is 2, which is the minimum possible.
 *
 * Example 3:
 *
 * Input: nums = [1,1,2,3,1], k = 2
 *
 *
 * Output: 0
 *
 *
 * Explanation:
 *
 *
 * The optimal partition is [1, 1] and [2, 3, 1].
 *
 *
 * XOR of the first subarray is 1 XOR 1 = 0.
 *
 * XOR of the second subarray is 2 XOR 3 XOR 1 = 0.
 *
 * The maximum XOR among the subarrays is 0, which is the minimum possible.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 250
 *
 * 1 &lt;= nums[i] &lt;= 109
 *
 * 1 &lt;= k &lt;= n
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use dynamic programming.
 * Hint 2: Precompute <code>pre[i] = nums[0] ^ … ^ nums[i-1]</code> so any subarray XOR is <code>pre[r] ^ pre[l]</code>.
 * Hint 3: Define <code>dp[i][j]</code> = minimum possible “max‑XOR” when splitting the first <code>i</code> elements into <code>j</code> parts.
 * Hint 4: For each <code>dp[i][j]</code>, try all splits <code>t &lt; i</code> and take the minimum over <code>max(dp[t][j-1], pre[i] ^ pre[t])</code>.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Dynamic Programming, Bit Manipulation, Prefix Sum).
 *
 * @see <a href="https://leetcode.com/problems/partition-array-to-minimize-xor/">LeetCode #3599</a>
 */
public class PartitionArrayToMinimizeXor {

    /**
     * Solves the problem: Partition string.
     *
     * @param s the s (String)
     * @return the computed int result
     */
    public int partitionString(String s) {
        int cnt=1; java.util.Set<Character> cur=new java.util.HashSet<>();
        for (char c:s.toCharArray()) {
            if (!cur.add(c)) { cnt++; cur.clear(); cur.add(c); }
        }
        return cnt;
    }

    public static void main(String[] args) {
        PartitionArrayToMinimizeXor sol = new PartitionArrayToMinimizeXor();
        System.out.println(sol.partitionString("hello"));
    }
}
