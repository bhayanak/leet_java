package org.leetcode.medium;


/**
 * <b>#1338 - Reduce Array Size to The Half</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Hash Table, Greedy, Sorting, Heap (Priority Queue)</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array arr. You can choose a set of integers and remove all the occurrences of these integers in the array.
 *
 *
 * Return the minimum size of the set so that at least half of the integers of the array are removed.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: arr = [3,3,3,3,5,5,5,2,2,7]
 * Output: 2
 * Explanation: Choosing {3,7} will make the new array [5,5,5,2,2] which has size 5 (i.e equal to half of the size of the old array).
 * Possible sets of size 2 are {3,5},{3,2},{5,2}.
 * Choosing set {2,7} is not possible as it will make the new array [3,3,3,3,5,5,5] which has a size greater than half of the size of the old array.
 *
 * Example 2:
 *
 * Input: arr = [7,7,7,7,7,7]
 * Output: 1
 * Explanation: The only possible set you can choose is {7}. This will make the new array empty.
 *
 *
 *
 * Constraints:
 *
 *
 * 2 &lt;= arr.length &lt;= 105
 *
 * arr.length is even.
 *
 * 1 &lt;= arr[i] &lt;= 105
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Count the frequency of each integer in the array.
 * Hint 2: Start with an empty set, add to the set the integer with the maximum frequency.
 * Hint 3: Keep Adding the integer with the max frequency until you remove at least half of the integers.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Greedy, Sorting, Heap (Priority Queue)).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/reduce-array-size-to-the-half/">LeetCode #1338</a>
 */
public class ReduceArraySizeToTheHalf {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Reduce Array Size to The Half");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== ReduceArraySizeToTheHalf ===");
        ReduceArraySizeToTheHalf sol = new ReduceArraySizeToTheHalf();
        System.out.println(sol.solve(null));
    }
}
