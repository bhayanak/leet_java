package org.leetcode.hard;


/**
 * <b>#2818 - Apply Operations to Maximize Score</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Math, Stack, Greedy, Sorting, Monotonic Stack, Number Theory</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an array nums of n positive integers and an integer k.
 *
 *
 * Initially, you start with a score of 1. You have to maximize your score by applying the following operation at most k times:
 *
 *
 * Choose any non-empty subarray nums[l, ..., r] that you haven't chosen previously.
 *
 * Choose an element x of nums[l, ..., r] with the highest prime score. If multiple such elements exist, choose the one with the smallest index.
 *
 * Multiply your score by x.
 *
 * Here, nums[l, ..., r] denotes the subarray of nums starting at index l and ending at the index r, both ends being inclusive.
 *
 *
 * The prime score of an integer x is equal to the number of distinct prime factors of x. For example, the prime score of 300 is 3 since 300 = 2 * 2 * 3 * 5 * 5.
 *
 *
 * Return the maximum possible score after applying at most k operations.
 *
 *
 * Since the answer may be large, return it modulo 109 + 7.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [8,3,9,3,8], k = 2
 * Output: 81
 * Explanation: To get a score of 81, we can apply the following operations:
 * - Choose subarray nums[2, ..., 2]. nums[2] is the only element in this subarray. Hence, we multiply the score by nums[2]. The score becomes 1 * 9 = 9.
 * - Choose subarray nums[2, ..., 3]. Both nums[2] and nums[3] have a prime score of 1, but nums[2] has the smaller index. Hence, we multiply the score by nums[2]. The score becomes 9 * 9 = 81.
 * It can be proven that 81 is the highest score one can obtain.
 *
 * Example 2:
 *
 * Input: nums = [19,12,14,6,10,18], k = 3
 * Output: 4788
 * Explanation: To get a score of 4788, we can apply the following operations: 
 * - Choose subarray nums[0, ..., 0]. nums[0] is the only element in this subarray. Hence, we multiply the score by nums[0]. The score becomes 1 * 19 = 19.
 * - Choose subarray nums[5, ..., 5]. nums[5] is the only element in this subarray. Hence, we multiply the score by nums[5]. The score becomes 19 * 18 = 342.
 * - Choose subarray nums[2, ..., 3]. Both nums[2] and nums[3] have a prime score of 2, but nums[2] has the smaller index. Hence, we multipy the score by nums[2]. The score becomes 342 * 14 = 4788.
 * It can be proven that 4788 is the highest score one can obtain.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length == n &lt;= 105
 *
 * 1 &lt;= nums[i] &lt;= 105
 *
 * 1 &lt;= k &lt;= min(n * (n + 1) / 2, 109)
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: <div class="_1l1MA">Calculate <code>nums[i]</code>'s prime score <code>s[i]</code> by factoring in <code>O(sqrt(nums[i]))</code> time.</div>
 * Hint 2: <div class="_1l1MA">For each <code>nums[i]</code>, find the nearest index <code>left[i]</code> on the left (if any) such that <code>s[left[i]] &gt;= s[i]</code>. if none is found, set <code>left[i]</code> to <code>-1</code>. Similarly, find the nearest index <code>right[i]</code> on the right (if any) such that <code>s[right[i]] &gt; s[i]</code>. If none is found, set <code>right[i]</code> to <code>n</code>.</div>
 * Hint 3: <div class="_1l1MA">Use a monotonic stack to compute <code>right[i]</code> and <code>left[i]</code>.</div>
 * Hint 4: <div class="_1l1MA">For each index <code>i</code>, if <code>left[i] + 1 &lt;= l &lt;= i &lt;= r &lt;= right[i] - 1</code>, then <code>s[i]</code> is the maximum value in the range <code>[l, r]</code>. For this particular <code>i</code>, there are <code>ranges[i] = (i - left[i]) * (right[i] - i)</code> ranges where index <code>i</code> will be chosen.</div>
 * Hint 5: <div class="_1l1MA">Loop over all elements of <code>nums</code> by non-increasing prime score, each element will be chosen <code>min(ranges[i], remainingK)</code> times, where <code>reaminingK</code> denotes the number of remaining operations. Therefore, the score will be multiplied by <code>s[i]^min(ranges[i],remainingK)</code>.</div>
 * Hint 6: <div class="_1l1MA">Use fast exponentiation to quickly calculate <code>A^B mod C</code>.</div>
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Math, Stack, Greedy, Sorting, Monotonic Stack, Number Theory).
 *
 * @see <a href="https://leetcode.com/problems/apply-operations-to-maximize-score/">LeetCode #2818</a>
 */
public class ApplyOperationsToMaximizeScore {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Apply Operations to Maximize Score");
    }

    public static void main(String[] args) {
        System.out.println("=== ApplyOperationsToMaximizeScore ===");
        ApplyOperationsToMaximizeScore sol = new ApplyOperationsToMaximizeScore();
        System.out.println(sol.solve(null));
    }
}
