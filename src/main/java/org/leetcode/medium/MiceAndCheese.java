package org.leetcode.medium;


/**
 * <b>#2611 - Mice and Cheese</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Greedy, Sorting, Heap (Priority Queue)</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * There are two mice and n different types of cheese, each type of cheese should be eaten by exactly one mouse.
 *
 *
 * A point of the cheese with index i (0-indexed) is:
 *
 *
 * reward1[i] if the first mouse eats it.
 *
 * reward2[i] if the second mouse eats it.
 *
 * You are given a positive integer array reward1, a positive integer array reward2, and a non-negative integer k.
 *
 *
 * Return the maximum points the mice can achieve if the first mouse eats exactly k types of cheese.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: reward1 = [1,1,3,4], reward2 = [4,4,1,1], k = 2
 * Output: 15
 * Explanation: In this example, the first mouse eats the 2nd (0-indexed) and the 3rd types of cheese, and the second mouse eats the 0th and the 1st types of cheese.
 * The total points are 4 + 4 + 3 + 4 = 15.
 * It can be proven that 15 is the maximum total points that the mice can achieve.
 *
 * Example 2:
 *
 * Input: reward1 = [1,1], reward2 = [1,1], k = 2
 * Output: 2
 * Explanation: In this example, the first mouse eats the 0th (0-indexed) and 1st types of cheese, and the second mouse does not eat any cheese.
 * The total points are 1 + 1 = 2.
 * It can be proven that 2 is the maximum total points that the mice can achieve.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n == reward1.length == reward2.length &lt;= 105
 *
 * 1 &lt;= reward1[i], reward2[i] &lt;= 1000
 *
 * 0 &lt;= k &lt;= n
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: The intended solution uses greedy approach.
 * Hint 2: Imagine at first that the second mouse eats all the cheese, then we should choose k types of cheese with the maximum sum of - reward2[i] + reward1[i].
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Greedy, Sorting, Heap (Priority Queue)).
 *
 * @see <a href="https://leetcode.com/problems/mice-and-cheese/">LeetCode #2611</a>
 */
public class MiceAndCheese {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Mice and Cheese");
    }

    public static void main(String[] args) {
        System.out.println("=== MiceAndCheese ===");
        MiceAndCheese sol = new MiceAndCheese();
        System.out.println(sol.solve(null));
    }
}
