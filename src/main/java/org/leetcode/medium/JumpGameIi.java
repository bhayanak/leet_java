package org.leetcode.medium;

/**
 * <b>#45 - Jump Game II</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Dynamic Programming, Greedy</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a 0-indexed array of integers nums of length n. You are initially positioned at index 0.
 * 
 * 
 * Each element nums[i] represents the maximum length of a forward jump from index i. In other words, if you are at index i, you can jump to any index (i + j) where:
 * 
 * 	
 * 0 &lt;= j &lt;= nums[i] and
 * 	
 * i + j &lt; n
 * 
 * Return the minimum number of jumps to reach index n - 1. The test cases are generated such that you can reach index n - 1.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: nums = [2,3,1,1,4]
 * Output: 2
 * Explanation: The minimum number of jumps to reach the last index is 2. Jump 1 step from index 0 to 1, then 3 steps to the last index.
 * 
 * Example 2:
 * 
 * Input: nums = [2,3,0,1,4]
 * Output: 2
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * 1 &lt;= nums.length &lt;= 104
 * 	
 * 0 &lt;= nums[i] &lt;= 1000
 * 	
 * It's guaranteed that you can reach nums[n - 1].
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints available — try to figure out the category and approach first!
 *
 * <h2>Approach</h2>
 * Break the problem into smaller sub-problems or work through examples manually.
 * Consider: brute-force first, then optimise with sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, dynamic programming, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: TBD  |  Space: TBD
 *
 * @see <a href="https://leetcode.com/problems/jump-game-ii/">LeetCode #45</a>
 */
public class JumpGameIi {

    /**
     * TODO: Implement solution for "Jump Game II".
     *
     * <p>Start with a brute-force and identify the bottleneck.
     * Hint: think about the data structure or algorithm category above.</p>
     *
     * @param args placeholder — replace with the real method signature
     * @return     placeholder — replace with the real return type
     */
    public Object solve(Object args) {
        // TODO: implement
        throw new UnsupportedOperationException("Not yet implemented: Jump Game II");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== JumpGameIi ===");
        System.out.println("See class methods for usage.");
    }
}
