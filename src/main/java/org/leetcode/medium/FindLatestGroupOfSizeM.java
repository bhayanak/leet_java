package org.leetcode.medium;


/**
 * <b>#1562 - Find Latest Group of Size M</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Hash Table, Binary Search, Simulation</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an array arr that represents a permutation of numbers from 1 to n.
 *
 *
 * You have a binary string of size n that initially has all its bits set to zero. At each step i (assuming both the binary string and arr are 1-indexed) from 1 to n, the bit at position arr[i] is set to 1.
 *
 *
 * You are also given an integer m. Find the latest step at which there exists a group of ones of length m. A group of ones is a contiguous substring of 1's such that it cannot be extended in either direction.
 *
 *
 * Return the latest step at which there exists a group of ones of length exactly m. If no such group exists, return -1.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: arr = [3,5,1,2,4], m = 1
 * Output: 4
 * Explanation: 
 * Step 1: "00100", groups: ["1"]
 * Step 2: "00101", groups: ["1", "1"]
 * Step 3: "10101", groups: ["1", "1", "1"]
 * Step 4: "11101", groups: ["111", "1"]
 * Step 5: "11111", groups: ["11111"]
 * The latest step at which there exists a group of size 1 is step 4.
 *
 * Example 2:
 *
 * Input: arr = [3,1,5,4,2], m = 2
 * Output: -1
 * Explanation: 
 * Step 1: "00100", groups: ["1"]
 * Step 2: "10100", groups: ["1", "1"]
 * Step 3: "10101", groups: ["1", "1", "1"]
 * Step 4: "10111", groups: ["1", "111"]
 * Step 5: "11111", groups: ["11111"]
 * No group of size 2 exists during any step.
 *
 *
 *
 * Constraints:
 *
 *
 * n == arr.length
 *
 * 1 &lt;= m &lt;= n &lt;= 105
 *
 * 1 &lt;= arr[i] &lt;= n
 *
 * All integers in arr are distinct.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Since the problem asks for the latest step, can you start the searching from the end of arr?
 * Hint 2: Use a map to store the current “1” groups.
 * Hint 3: At each step (going backwards) you need to split one group and update the map.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Binary Search, Simulation).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/find-latest-group-of-size-m/">LeetCode #1562</a>
 */
public class FindLatestGroupOfSizeM {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Find Latest Group of Size M");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== FindLatestGroupOfSizeM ===");
        FindLatestGroupOfSizeM sol = new FindLatestGroupOfSizeM();
        System.out.println(sol.solve(null));
    }
}
