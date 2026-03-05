package org.leetcode.hard;


/**
 * <b>#1835 - Find XOR Sum of All Pairs Bitwise AND</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Math, Bit Manipulation</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * The XOR sum of a list is the bitwise XOR of all its elements. If the list only contains one element, then its XOR sum will be equal to this element.
 *
 *
 * For example, the XOR sum of [1,2,3,4] is equal to 1 XOR 2 XOR 3 XOR 4 = 4, and the XOR sum of [3] is equal to 3.
 *
 * You are given two 0-indexed arrays arr1 and arr2 that consist only of non-negative integers.
 *
 *
 * Consider the list containing the result of arr1[i] AND arr2[j] (bitwise AND) for every (i, j) pair where 0 &lt;= i &lt; arr1.length and 0 &lt;= j &lt; arr2.length.
 *
 *
 * Return the XOR sum of the aforementioned list.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: arr1 = [1,2,3], arr2 = [6,5]
 * Output: 0
 * Explanation: The list = [1 AND 6, 1 AND 5, 2 AND 6, 2 AND 5, 3 AND 6, 3 AND 5] = [0,1,2,0,2,1].
 * The XOR sum = 0 XOR 1 XOR 2 XOR 0 XOR 2 XOR 1 = 0.
 *
 * Example 2:
 *
 * Input: arr1 = [12], arr2 = [4]
 * Output: 4
 * Explanation: The list = [12 AND 4] = [4]. The XOR sum = 4.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= arr1.length, arr2.length &lt;= 105
 *
 * 0 &lt;= arr1[i], arr2[j] &lt;= 109
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Think about (a&amp;b) ^ (a&amp;c). Can you simplify this expression?
 * Hint 2: It is equal to a&amp;(b^c). Then, (arr1[i]&amp;arr2[0])^(arr1[i]&amp;arr2[1]).. = arr1[i]&amp;(arr2[0]^arr2[1]^arr[2]...).
 * Hint 3: Let arr2XorSum = (arr2[0]^arr2[1]^arr2[2]...), arr1XorSum = (arr1[0]^arr1[1]^arr1[2]...) so the final answer is (arr2XorSum&amp;arr1[0]) ^ (arr2XorSum&amp;arr1[1]) ^ (arr2XorSum&amp;arr1[2]) ^ ... = arr2XorSum &amp; arr1XorSum.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Math, Bit Manipulation).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/find-xor-sum-of-all-pairs-bitwise-and/">LeetCode #1835</a>
 */
public class FindXorSumOfAllPairsBitwiseAnd {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Find XOR Sum of All Pairs Bitwise AND");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== FindXorSumOfAllPairsBitwiseAnd ===");
        FindXorSumOfAllPairsBitwiseAnd sol = new FindXorSumOfAllPairsBitwiseAnd();
        System.out.println(sol.solve(null));
    }
}
