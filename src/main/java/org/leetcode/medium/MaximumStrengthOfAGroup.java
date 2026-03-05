package org.leetcode.medium;


/**
 * <b>#2708 - Maximum Strength of a Group</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Dynamic Programming, Backtracking, Greedy, Bit Manipulation, Sorting, Enumeration</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a 0-indexed integer array nums representing the score of students in an exam. The teacher would like to form one non-empty group of students with maximal strength, where the strength of a group of students of indices i0, i1, i2, ... , ik is defined as nums[i0] * nums[i1] * nums[i2] * ... * nums[ik​].
 *
 *
 * Return the maximum strength of a group the teacher can create.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [3,-1,-5,2,5,-9]
 * Output: 1350
 * Explanation: One way to form a group of maximal strength is to group the students at indices [0,2,3,4,5]. Their strength is 3 * (-5) * 2 * 5 * (-9) = 1350, which we can show is optimal.
 *
 * Example 2:
 *
 * Input: nums = [-4,-5,-4]
 * Output: 20
 * Explanation: Group the students at indices [0, 1] . Then, we’ll have a resulting strength of 20. We cannot achieve greater strength.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 13
 *
 * -9 &lt;= nums[i] &lt;= 9
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Try to generate all pairs of subsets and check which group provides maximal strength.
 * Hint 2: It can also be solved in O(NlogN) by sorting the array and using all positive integers.
 * Hint 3: Use negative integers only in pairs such that their product becomes positive.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Dynamic Programming, Backtracking, Greedy, Bit Manipulation, Sorting, Enumeration).
 *
 * @see <a href="https://leetcode.com/problems/maximum-strength-of-a-group/">LeetCode #2708</a>
 */
public class MaximumStrengthOfAGroup {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Maximum Strength of a Group");
    }

    public static void main(String[] args) {
        System.out.println("=== MaximumStrengthOfAGroup ===");
        MaximumStrengthOfAGroup sol = new MaximumStrengthOfAGroup();
        System.out.println(sol.solve(null));
    }
}
