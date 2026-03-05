package org.leetcode.medium;

/**
 * <b>#384 - Shuffle an Array</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Math, Design, Randomized</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an integer array nums, design an algorithm to randomly shuffle the array. All permutations of the array should be equally likely as a result of the shuffling.
 * 
 * 
 * Implement the Solution class:
 * 
 * 	
 * Solution(int[] nums) Initializes the object with the integer array nums.
 * 	
 * int[] reset() Resets the array to its original configuration and returns it.
 * 	
 * int[] shuffle() Returns a random shuffling of the array.
 * 
 *  
 * 
 * Example 1:
 * 
 * Input
 * ["Solution", "shuffle", "reset", "shuffle"]
 * [[[1, 2, 3]], [], [], []]
 * Output
 * [null, [3, 1, 2], [1, 2, 3], [1, 3, 2]]
 * 
 * Explanation
 * Solution solution = new Solution([1, 2, 3]);
 * solution.shuffle();    // Shuffle the array [1,2,3] and return its result.
 *                        // Any permutation of [1,2,3] must be equally likely to be returned.
 *                        // Example: return [3, 1, 2]
 * solution.reset();      // Resets the array back to its original configuration [1,2,3]. Return [1, 2, 3]
 * solution.shuffle();    // Returns the random shuffling of array [1,2,3]. Example: return [1, 3, 2]
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * 1 &lt;= nums.length &lt;= 50
 * 	
 * -106 &lt;= nums[i] &lt;= 106
 * 	
 * All the elements of nums are unique.
 * 	
 * At most 104 calls in total will be made to reset and shuffle.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: The solution expects that we always use the original array to shuffle() else some of the test cases fail. (Credits; @snehasingh31)
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
 * @see <a href="https://leetcode.com/problems/shuffle-an-array/">LeetCode #384</a>
 */
public class ShuffleAnArray {

    /** TODO: implement solution for "Shuffle an Array". */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Shuffle an Array");
    }

    // ─── Demo ────────────────────────────────────────────────────
    public static void main(String[] args) {
        System.out.println("=== ShuffleAnArray ===");
        ShuffleAnArray sol = new ShuffleAnArray();
        System.out.println(sol.solve(null));
    }
}
