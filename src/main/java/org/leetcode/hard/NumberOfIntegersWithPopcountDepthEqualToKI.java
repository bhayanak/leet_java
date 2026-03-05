package org.leetcode.hard;


/**
 * <b>#3621 - Number of Integers With Popcount-Depth Equal to K I</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Math, Dynamic Programming, Bit Manipulation, Combinatorics</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given two integers n and k.
 *
 *
 * For any positive integer x, define the following sequence:
 *
 *
 * p0 = x
 *
 * pi+1 = popcount(pi) for all i &gt;= 0, where popcount(y) is the number of set bits (1's) in the binary representation of y.
 *
 * This sequence will eventually reach the value 1.
 *
 *
 * The popcount-depth of x is defined as the smallest integer d &gt;= 0 such that pd = 1.
 *
 *
 * For example, if x = 7 (binary representation "111"). Then, the sequence is: 7 → 3 → 2 → 1, so the popcount-depth of 7 is 3.
 *
 *
 * Your task is to determine the number of integers in the range [1, n] whose popcount-depth is exactly equal to k.
 *
 *
 * Return the number of such integers.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: n = 4, k = 1
 *
 *
 * Output: 2
 *
 *
 * Explanation:
 *
 *
 * The following integers in the range [1, 4] have popcount-depth exactly equal to 1:
 *
 *
 *
 *
 *
 * 			x
 * 			Binary
 * 			Sequence
 *
 *
 *
 *
 *
 *
 * 			2
 * 			"10"
 * 			2 → 1
 *
 *
 *
 *
 * 			4
 * 			"100"
 * 			4 → 1
 *
 *
 *
 *
 * Thus, the answer is 2.
 *
 * Example 2:
 *
 * Input: n = 7, k = 2
 *
 *
 * Output: 3
 *
 *
 * Explanation:
 *
 *
 * The following integers in the range [1, 7] have popcount-depth exactly equal to 2:
 *
 *
 *
 *
 *
 * 			x
 * 			Binary
 * 			Sequence
 *
 *
 *
 *
 *
 *
 * 			3
 * 			"11"
 * 			3 → 2 → 1
 *
 *
 *
 *
 * 			5
 * 			"101"
 * 			5 → 2 → 1
 *
 *
 *
 *
 * 			6
 * 			"110"
 * 			6 → 2 → 1
 *
 *
 *
 *
 * Thus, the answer is 3.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n &lt;= 1015
 *
 * 0 &lt;= k &lt;= 5
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use digit dynamic programming on the binary representation of <code>n</code>: let <code>dp[pos][ones][tight]</code> = number of ways to choose bits from the most significant down to position <code>pos</code> with exactly <code>ones</code> ones so far, where <code>tight</code> indicates whether you're still matching the prefix of <code>n</code>.
 * Hint 2: Precompute <code>depth[j]</code> for all <code>j</code> from <code>0</code> to <code>64</code> by repeatedly applying <code>popcount(j)</code> until you reach <code>1</code>.
 * Hint 3: After your DP, let <code>dp_final[j]</code> be the count of numbers &lt;= <code>n</code> that have exactly <code>j</code> ones; the answer is the sum of all <code>dp_final[j]</code> for which <code>depth[j] == k</code>.
 *
 * <h2>Approach</h2>
 * Think about the category (Math, Dynamic Programming, Bit Manipulation, Combinatorics).
 *
 * @see <a href="https://leetcode.com/problems/number-of-integers-with-popcount-depth-equal-to-k-i/">LeetCode #3621</a>
 */
public class NumberOfIntegersWithPopcountDepthEqualToKI {

    /**
     * Solves the problem: Minimum index.
     * Uses a hash map to track occurrences or cache results.
     *
     * @param nums the nums (java.util.List&lt;Integer&gt;)
     * @return the computed int result
     */
    public int minimumIndex(java.util.List<Integer> nums) {
        // Find majority element and split
        java.util.Map<Integer,Integer> cnt=new java.util.HashMap<>();
        for (int n:nums) cnt.merge(n,1,Integer::sum);
        int dominant=-1, domCnt=0;
        for (var e:cnt.entrySet()) if (e.getValue()>domCnt){domCnt=e.getValue();dominant=e.getKey();}
        int leftCnt=0;
        for (int i=0;i<nums.size();i++) {
            if (nums.get(i)==dominant) leftCnt++;
            if (leftCnt*2>i+1 && (domCnt-leftCnt)*2>nums.size()-i-1) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        NumberOfIntegersWithPopcountDepthEqualToKI sol = new NumberOfIntegersWithPopcountDepthEqualToKI();
        System.out.println(sol.minimumIndex(null));
    }
}
