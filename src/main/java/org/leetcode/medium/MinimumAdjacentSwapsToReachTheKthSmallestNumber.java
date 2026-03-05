package org.leetcode.medium;


/**
 * <b>#1850 - Minimum Adjacent Swaps to Reach the Kth Smallest Number</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Two Pointers, String, Greedy</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a string num, representing a large integer, and an integer k.
 *
 *
 * We call some integer wonderful if it is a permutation of the digits in num and is greater in value than num. There can be many wonderful integers. However, we only care about the smallest-valued ones.
 *
 *
 * For example, when num = "5489355142":
 *
 *
 *
 *
 * The 1st smallest wonderful integer is "5489355214".
 *
 * The 2nd smallest wonderful integer is "5489355241".
 *
 * The 3rd smallest wonderful integer is "5489355412".
 *
 * The 4th smallest wonderful integer is "5489355421".
 *
 *
 *
 * Return the minimum number of adjacent digit swaps that needs to be applied to num to reach the kth smallest wonderful integer.
 *
 *
 * The tests are generated in such a way that kth smallest wonderful integer exists.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: num = "5489355142", k = 4
 * Output: 2
 * Explanation: The 4th smallest wonderful number is "5489355421". To get this number:
 * - Swap index 7 with index 8: "5489355142" -&gt; "5489355412"
 * - Swap index 8 with index 9: "5489355412" -&gt; "5489355421"
 *
 * Example 2:
 *
 * Input: num = "11112", k = 4
 * Output: 4
 * Explanation: The 4th smallest wonderful number is "21111". To get this number:
 * - Swap index 3 with index 4: "11112" -&gt; "11121"
 * - Swap index 2 with index 3: "11121" -&gt; "11211"
 * - Swap index 1 with index 2: "11211" -&gt; "12111"
 * - Swap index 0 with index 1: "12111" -&gt; "21111"
 *
 * Example 3:
 *
 * Input: num = "00123", k = 1
 * Output: 1
 * Explanation: The 1st smallest wonderful number is "00132". To get this number:
 * - Swap index 3 with index 4: "00123" -&gt; "00132"
 *
 *
 *
 * Constraints:
 *
 *
 * 2 &lt;= num.length &lt;= 1000
 *
 * 1 &lt;= k &lt;= 1000
 *
 * num only consists of digits.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Find the next permutation of the given string k times.
 * Hint 2: Try to move each element to its correct position and calculate the number of steps.
 *
 * <h2>Approach</h2>
 * Think about the category (Two Pointers, String, Greedy).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/minimum-adjacent-swaps-to-reach-the-kth-smallest-number/">LeetCode #1850</a>
 */
public class MinimumAdjacentSwapsToReachTheKthSmallestNumber {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Minimum Adjacent Swaps to Reach the Kth Smallest Number");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== MinimumAdjacentSwapsToReachTheKthSmallestNumber ===");
        MinimumAdjacentSwapsToReachTheKthSmallestNumber sol = new MinimumAdjacentSwapsToReachTheKthSmallestNumber();
        System.out.println(sol.solve(null));
    }
}
