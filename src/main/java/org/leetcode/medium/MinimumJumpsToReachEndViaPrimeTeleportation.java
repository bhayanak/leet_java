package org.leetcode.medium;


/**
 * <b>#3629 - Minimum Jumps to Reach End via Prime Teleportation</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Hash Table, Math, Breadth-First Search, Number Theory</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array nums of length n.
 *
 *
 * You start at index 0, and your goal is to reach index n - 1.
 *
 *
 * From any index i, you may perform one of the following operations:
 *
 *
 * Adjacent Step: Jump to index i + 1 or i - 1, if the index is within bounds.
 *
 * Prime Teleportation: If nums[i] is a prime number p, you may instantly jump to any index j != i such that nums[j] % p == 0.
 *
 * Return the minimum number of jumps required to reach index n - 1.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,2,4,6]
 *
 *
 * Output: 2
 *
 *
 * Explanation:
 *
 *
 * One optimal sequence of jumps is:
 *
 *
 * Start at index i = 0. Take an adjacent step to index 1.
 *
 * At index i = 1, nums[1] = 2 is a prime number. Therefore, we teleport to index i = 3 as nums[3] = 6 is divisible by 2.
 *
 * Thus, the answer is 2.
 *
 * Example 2:
 *
 * Input: nums = [2,3,4,7,9]
 *
 *
 * Output: 2
 *
 *
 * Explanation:
 *
 *
 * One optimal sequence of jumps is:
 *
 *
 * Start at index i = 0. Take an adjacent step to index i = 1.
 *
 * At index i = 1, nums[1] = 3 is a prime number. Therefore, we teleport to index i = 4 since nums[4] = 9 is divisible by 3.
 *
 * Thus, the answer is 2.
 *
 * Example 3:
 *
 * Input: nums = [4,6,5,8]
 *
 *
 * Output: 3
 *
 *
 * Explanation:
 *
 *
 * Since no teleportation is possible, we move through 0 → 1 → 2 → 3. Thus, the answer is 3.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n == nums.length &lt;= 105
 *
 * 1 &lt;= nums[i] &lt;= 106
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use a breadth-first search.
 * Hint 2: Precompute prime factors of each <code>nums[i]</code> via a sieve, and build a bucket <code>bucket[p]</code> mapping each prime <code>p</code> to all indices <code>j</code> with <code>nums[j] % p == 0</code>.
 * Hint 3: During the BFS, when at index <code>i</code>, enqueue its adjacent steps (<code>i+1</code> and <code>i-1</code>) and all indices in <code>bucket[p]</code> for each prime <code>p</code> dividing <code>nums[i]</code>, then clear <code>bucket[p]</code> so each prime's bucket is visited only once.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Math, Breadth-First Search, Number Theory).
 *
 * @see <a href="https://leetcode.com/problems/minimum-jumps-to-reach-end-via-prime-teleportation/">LeetCode #3629</a>
 */
public class MinimumJumpsToReachEndViaPrimeTeleportation {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Minimum Jumps to Reach End via Prime Teleportation");
    }

    public static void main(String[] args) {
        System.out.println("=== MinimumJumpsToReachEndViaPrimeTeleportation ===");
        MinimumJumpsToReachEndViaPrimeTeleportation sol = new MinimumJumpsToReachEndViaPrimeTeleportation();
        System.out.println(sol.solve(null));
    }
}
