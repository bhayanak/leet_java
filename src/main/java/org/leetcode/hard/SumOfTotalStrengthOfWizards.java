package org.leetcode.hard;


/**
 * <b>#2281 - Sum of Total Strength of Wizards</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Stack, Monotonic Stack, Prefix Sum</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * As the ruler of a kingdom, you have an army of wizards at your command.
 *
 *
 * You are given a 0-indexed integer array strength, where strength[i] denotes the strength of the ith wizard. For a contiguous group of wizards (i.e. the wizards' strengths form a subarray of strength), the total strength is defined as the product of the following two values:
 *
 *
 * The strength of the weakest wizard in the group.
 *
 * The total of all the individual strengths of the wizards in the group.
 *
 * Return the sum of the total strengths of all contiguous groups of wizards. Since the answer may be very large, return it modulo 109 + 7.
 *
 *
 * A subarray is a contiguous non-empty sequence of elements within an array.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: strength = [1,3,1,2]
 * Output: 44
 * Explanation: The following are all the contiguous groups of wizards:
 * - [1] from [1,3,1,2] has a total strength of min([1]) * sum([1]) = 1 * 1 = 1
 * - [3] from [1,3,1,2] has a total strength of min([3]) * sum([3]) = 3 * 3 = 9
 * - [1] from [1,3,1,2] has a total strength of min([1]) * sum([1]) = 1 * 1 = 1
 * - [2] from [1,3,1,2] has a total strength of min([2]) * sum([2]) = 2 * 2 = 4
 * - [1,3] from [1,3,1,2] has a total strength of min([1,3]) * sum([1,3]) = 1 * 4 = 4
 * - [3,1] from [1,3,1,2] has a total strength of min([3,1]) * sum([3,1]) = 1 * 4 = 4
 * - [1,2] from [1,3,1,2] has a total strength of min([1,2]) * sum([1,2]) = 1 * 3 = 3
 * - [1,3,1] from [1,3,1,2] has a total strength of min([1,3,1]) * sum([1,3,1]) = 1 * 5 = 5
 * - [3,1,2] from [1,3,1,2] has a total strength of min([3,1,2]) * sum([3,1,2]) = 1 * 6 = 6
 * - [1,3,1,2] from [1,3,1,2] has a total strength of min([1,3,1,2]) * sum([1,3,1,2]) = 1 * 7 = 7
 * The sum of all the total strengths is 1 + 9 + 1 + 4 + 4 + 4 + 3 + 5 + 6 + 7 = 44.
 *
 * Example 2:
 *
 * Input: strength = [5,4,6]
 * Output: 213
 * Explanation: The following are all the contiguous groups of wizards: 
 * - [5] from [5,4,6] has a total strength of min([5]) * sum([5]) = 5 * 5 = 25
 * - [4] from [5,4,6] has a total strength of min([4]) * sum([4]) = 4 * 4 = 16
 * - [6] from [5,4,6] has a total strength of min([6]) * sum([6]) = 6 * 6 = 36
 * - [5,4] from [5,4,6] has a total strength of min([5,4]) * sum([5,4]) = 4 * 9 = 36
 * - [4,6] from [5,4,6] has a total strength of min([4,6]) * sum([4,6]) = 4 * 10 = 40
 * - [5,4,6] from [5,4,6] has a total strength of min([5,4,6]) * sum([5,4,6]) = 4 * 15 = 60
 * The sum of all the total strengths is 25 + 16 + 36 + 36 + 40 + 60 = 213.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= strength.length &lt;= 105
 *
 * 1 &lt;= strength[i] &lt;= 109
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Consider the contribution of each wizard to the answer.
 * Hint 2: Can you efficiently calculate the total contribution to the answer for all subarrays that end at each index?
 * Hint 3: Denote the total contribution of all subarrays ending at index i as solve[i]. Can you express solve[i] in terms of solve[m] for some m &lt; i?
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Stack, Monotonic Stack, Prefix Sum).
 *
 * @see <a href="https://leetcode.com/problems/sum-of-total-strength-of-wizards/">LeetCode #2281</a>
 */
public class SumOfTotalStrengthOfWizards {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Sum of Total Strength of Wizards");
    }

    public static void main(String[] args) {
        System.out.println("=== SumOfTotalStrengthOfWizards ===");
        SumOfTotalStrengthOfWizards sol = new SumOfTotalStrengthOfWizards();
        System.out.println(sol.solve(null));
    }
}
