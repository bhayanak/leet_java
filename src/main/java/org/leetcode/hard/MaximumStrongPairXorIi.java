package org.leetcode.hard;


/**
 * <b>#2935 - Maximum Strong Pair XOR II</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Hash Table, Bit Manipulation, Trie, Sliding Window</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a 0-indexed integer array nums. A pair of integers x and y is called a strong pair if it satisfies the condition:
 *
 *
 * |x - y| &lt;= min(x, y)
 *
 * You need to select two integers from nums such that they form a strong pair and their bitwise XOR is the maximum among all strong pairs in the array.
 *
 *
 * Return the maximum XOR value out of all possible strong pairs in the array nums.
 *
 *
 * Note that you can pick the same integer twice to form a pair.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,2,3,4,5]
 * Output: 7
 * Explanation: There are 11 strong pairs in the array nums: (1, 1), (1, 2), (2, 2), (2, 3), (2, 4), (3, 3), (3, 4), (3, 5), (4, 4), (4, 5) and (5, 5).
 * The maximum XOR possible from these pairs is 3 XOR 4 = 7.
 *
 * Example 2:
 *
 * Input: nums = [10,100]
 * Output: 0
 * Explanation: There are 2 strong pairs in the array nums: (10, 10) and (100, 100).
 * The maximum XOR possible from these pairs is 10 XOR 10 = 0 since the pair (100, 100) also gives 100 XOR 100 = 0.
 *
 * Example 3:
 *
 * Input: nums = [500,520,2500,3000]
 * Output: 1020
 * Explanation: There are 6 strong pairs in the array nums: (500, 500), (500, 520), (520, 520), (2500, 2500), (2500, 3000) and (3000, 3000).
 * The maximum XOR possible from these pairs is 500 XOR 520 = 1020 since the only other non-zero XOR value is 2500 XOR 3000 = 636.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 5 * 104
 *
 * 1 &lt;= nums[i] &lt;= 220 - 1
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Sort the array, now let <code>x &lt;= y</code> which means <code>|x - y| &lt;= min(x, y)</code> can now be written as <code>y - x &lt;= x</code> or in other words, <code>y &lt;= 2 * x</code>.
 * Hint 2: If <code>x</code> and <code>y</code> have the same number of bits, try making<code>y</code>’s bits different from x if possible for each bit starting from the second most significant bit.
 * Hint 3: If <code>y</code> has 1 more bit than <code>x</code> and <code>y &lt;= 2 * x</code> use the idea about Digit DP to make <code>y</code>’s prefix smaller than <code>2 * x + 1</code> as well as trying to make each bit different from <code>x</code> using a Hashmap.
 * Hint 4: Alternatively, use Trie data structure to find the pair with maximum <code>XOR</code>.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Bit Manipulation, Trie, Sliding Window).
 *
 * @see <a href="https://leetcode.com/problems/maximum-strong-pair-xor-ii/">LeetCode #2935</a>
 */
public class MaximumStrongPairXorIi {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Maximum Strong Pair XOR II");
    }

    public static void main(String[] args) {
        System.out.println("=== MaximumStrongPairXorIi ===");
        MaximumStrongPairXorIi sol = new MaximumStrongPairXorIi();
        System.out.println(sol.solve(null));
    }
}
