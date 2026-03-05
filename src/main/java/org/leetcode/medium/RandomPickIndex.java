package org.leetcode.medium;

/**
 * <b>#398 - Random Pick Index</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Hash Table, Math, Reservoir Sampling, Randomized</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an integer array nums with possible duplicates, randomly output the index of a given target number. You can assume that the given target number must exist in the array.
 * 
 * 
 * Implement the Solution class:
 * 
 * 	
 * Solution(int[] nums) Initializes the object with the array nums.
 * 	
 * int pick(int target) Picks a random index i from nums where nums[i] == target. If there are multiple valid i's, then each index should have an equal probability of returning.
 * 
 *  
 * 
 * Example 1:
 * 
 * Input
 * ["Solution", "pick", "pick", "pick"]
 * [[[1, 2, 3, 3, 3]], [3], [1], [3]]
 * Output
 * [null, 4, 0, 2]
 * 
 * Explanation
 * Solution solution = new Solution([1, 2, 3, 3, 3]);
 * solution.pick(3); // It should return either index 2, 3, or 4 randomly. Each index should have equal probability of returning.
 * solution.pick(1); // It should return 0. Since in the array only nums[0] is equal to 1.
 * solution.pick(3); // It should return either index 2, 3, or 4 randomly. Each index should have equal probability of returning.
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * 1 &lt;= nums.length &lt;= 2 * 104
 * 	
 * -231 &lt;= nums[i] &lt;= 231 - 1
 * 	
 * target is an integer from nums.
 * 	
 * At most 104 calls will be made to pick.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — study the examples carefully.
 *
 * <h2>Approach</h2>
 * Break the problem into smaller sub-problems:
 * 1. Try brute force first to understand the constraints.
 * 2. Look for repeated sub-problems (DP), sorted structure (binary search),
 *    adjacency (graph/BFS), or monotonic properties (stack/queue).
 * 3. Refine with the right data structure.
 *
 * <h2>Complexity</h2>
 * Time: TBD  |  Space: TBD
 *
 * @see <a href="https://leetcode.com/problems/random-pick-index/">LeetCode #398</a>
 */
public class RandomPickIndex {

    /** TODO: implement solution for "Random Pick Index". */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Random Pick Index");
    }

    // ─── Demo ────────────────────────────────────────────────────
    public static void main(String[] args) {
        System.out.println("=== RandomPickIndex ===");
        RandomPickIndex sol = new RandomPickIndex();
        System.out.println(sol.solve(null));
    }
}
