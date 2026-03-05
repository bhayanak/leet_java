package org.leetcode.hard;


/**
 * <b>#3510 - Minimum Pair Removal to Sort Array II</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Hash Table, Linked List, Heap (Priority Queue), Simulation, Doubly-Linked List, Ordered Set</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an array nums, you can perform the following operation any number of times:
 *
 *
 * Select the adjacent pair with the minimum sum in nums. If multiple such pairs exist, choose the leftmost one.
 *
 * Replace the pair with their sum.
 *
 * Return the minimum number of operations needed to make the array non-decreasing.
 *
 *
 * An array is said to be non-decreasing if each element is greater than or equal to its previous element (if it exists).
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [5,2,3,1]
 *
 *
 * Output: 2
 *
 *
 * Explanation:
 *
 *
 * The pair (3,1) has the minimum sum of 4. After replacement, nums = [5,2,4].
 *
 * The pair (2,4) has the minimum sum of 6. After replacement, nums = [5,6].
 *
 * The array nums became non-decreasing in two operations.
 *
 * Example 2:
 *
 * Input: nums = [1,2,2]
 *
 *
 * Output: 0
 *
 *
 * Explanation:
 *
 *
 * The array nums is already sorted.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 105
 *
 * -109 &lt;= nums[i] &lt;= 109
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: We can perform the simulation using data structures.
 * Hint 2: Maintain an array index and value using a map since we need to find the next and previous ones.
 * Hint 3: Maintain the indices to be removed using a hash set.
 * Hint 4: Maintain the neighbor sums with the smaller indices (set or priority queue).
 * Hint 5: Keep the 3 structures in sync during the removals.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Linked List, Heap (Priority Queue), Simulation, Doubly-Linked List, Ordered Set).
 *
 * @see <a href="https://leetcode.com/problems/minimum-pair-removal-to-sort-array-ii/">LeetCode #3510</a>
 */
public class MinimumPairRemovalToSortArrayIi {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Minimum Pair Removal to Sort Array II");
    }

    public static void main(String[] args) {
        System.out.println("=== MinimumPairRemovalToSortArrayIi ===");
        MinimumPairRemovalToSortArrayIi sol = new MinimumPairRemovalToSortArrayIi();
        System.out.println(sol.solve(null));
    }
}
