package org.leetcode.hard;


/**
 * <b>#3049 - Earliest Second to Mark Indices II</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Binary Search, Greedy, Heap (Priority Queue)</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given two 1-indexed integer arrays, nums and, changeIndices, having lengths n and m, respectively.
 *
 *
 * Initially, all indices in nums are unmarked. Your task is to mark all indices in nums.
 *
 *
 * In each second, s, in order from 1 to m (inclusive), you can perform one of the following operations:
 *
 *
 * Choose an index i in the range [1, n] and decrement nums[i] by 1.
 *
 * Set nums[changeIndices[s]] to any non-negative value.
 *
 * Choose an index i in the range [1, n], where nums[i] is equal to 0, and mark index i.
 *
 * Do nothing.
 *
 * Return an integer denoting the earliest second in the range [1, m] when all indices in nums can be marked by choosing operations optimally, or -1 if it is impossible.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [3,2,3], changeIndices = [1,3,2,2,2,2,3]
 * Output: 6
 * Explanation: In this example, we have 7 seconds. The following operations can be performed to mark all indices:
 * Second 1: Set nums[changeIndices[1]] to 0. nums becomes [0,2,3].
 * Second 2: Set nums[changeIndices[2]] to 0. nums becomes [0,2,0].
 * Second 3: Set nums[changeIndices[3]] to 0. nums becomes [0,0,0].
 * Second 4: Mark index 1, since nums[1] is equal to 0.
 * Second 5: Mark index 2, since nums[2] is equal to 0.
 * Second 6: Mark index 3, since nums[3] is equal to 0.
 * Now all indices have been marked.
 * It can be shown that it is not possible to mark all indices earlier than the 6th second.
 * Hence, the answer is 6.
 *
 * Example 2:
 *
 * Input: nums = [0,0,1,2], changeIndices = [1,2,1,2,1,2,1,2]
 * Output: 7
 * Explanation: In this example, we have 8 seconds. The following operations can be performed to mark all indices:
 * Second 1: Mark index 1, since nums[1] is equal to 0.
 * Second 2: Mark index 2, since nums[2] is equal to 0.
 * Second 3: Decrement index 4 by one. nums becomes [0,0,1,1].
 * Second 4: Decrement index 4 by one. nums becomes [0,0,1,0].
 * Second 5: Decrement index 3 by one. nums becomes [0,0,0,0].
 * Second 6: Mark index 3, since nums[3] is equal to 0.
 * Second 7: Mark index 4, since nums[4] is equal to 0.
 * Now all indices have been marked.
 * It can be shown that it is not possible to mark all indices earlier than the 7th second.
 * Hence, the answer is 7.
 *
 * Example 3:
 *
 * Input: nums = [1,2,3], changeIndices = [1,2,3]
 * Output: -1
 * Explanation: In this example, it can be shown that it is impossible to mark all indices, as we don't have enough seconds. 
 * Hence, the answer is -1.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n == nums.length &lt;= 5000
 *
 * 0 &lt;= nums[i] &lt;= 109
 *
 * 1 &lt;= m == changeIndices.length &lt;= 5000
 *
 * 1 &lt;= changeIndices[i] &lt;= n
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: We need at least <code>n</code> seconds, and at most <code>sum(nums[i]) + n</code> seconds.
 * Hint 2: We can binary search the earliest second where all indices can be marked.
 * Hint 3: If there is an operation where we change <code>nums[changeIndices[i]]</code> to a non-negative value, it is best for it to satisfy the following constraints:<ul>
<li><code>nums[changeIndices[i]]</code> should not be equal to <code>0</code>.</li>
<li><code>nums[changeIndices[i]]</code> should be changed to <code>0</code>.</li>
<li>It should be the first position where <code>changeIndices[i]</code> occurs in <code>changeIndices</code>.</li>
<li>There should be another second, <code>j</code>, where <code>changeIndices[i]</code> will be marked. <code>j</code> is in the range <code>[i + 1, m]</code>.</li>
</ul>
 * Hint 4: Let <code>time_needed = sum(nums[i]) + n</code>. To check if we can mark all indices at some second <code>x</code>, we need to make <code>time_needed &lt;= x</code>, using non-negative change operations as described previously.
 * Hint 5: Using a non-negative change operation on some <code>nums[changeIndices[i]]</code> that satisfies the constraints described previously reduces <code>time_needed</code> by <code>nums[changeIndices[i]] - 1</code>. So, we need to maximize the sum of <code>(nums[changeIndices[i]] - 1)</code> while ensuring that the non-negative change operations still satisfy the constraints.
 * Hint 6: Maximizing the sum of <code>(nums[changeIndices[i]] - 1)</code> can be done greedily using a min-priority queue and going in reverse starting from second <code>x</code> to second <code>1</code>, maximizing the sum of the values in the priority queue and ensuring that for every non-negative change operation on <code>nums[changeIndices[i]]</code> chosen, there is another second <code>j</code> in the range <code>[i + 1, x]</code> where <code>changeIndices[i]</code> can be marked.
 * Hint 7: The answer is the first value of <code>x</code> in the range <code>[1, m]</code> where it is possible to make <code>time_needed &lt;= x</code>, or <code>-1</code> if there is no such second.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Binary Search, Greedy, Heap (Priority Queue)).
 *
 * @see <a href="https://leetcode.com/problems/earliest-second-to-mark-indices-ii/">LeetCode #3049</a>
 */
public class EarliestSecondToMarkIndicesIi {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Earliest Second to Mark Indices II");
    }

    public static void main(String[] args) {
        System.out.println("=== EarliestSecondToMarkIndicesIi ===");
        EarliestSecondToMarkIndicesIi sol = new EarliestSecondToMarkIndicesIi();
        System.out.println(sol.solve(null));
    }
}
