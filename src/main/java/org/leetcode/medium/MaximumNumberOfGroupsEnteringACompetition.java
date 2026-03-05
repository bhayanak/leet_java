package org.leetcode.medium;


/**
 * <b>#2358 - Maximum Number of Groups Entering a Competition</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Math, Binary Search, Greedy</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a positive integer array grades which represents the grades of students in a university. You would like to enter all these students into a competition in ordered non-empty groups, such that the ordering meets the following conditions:
 *
 *
 * The sum of the grades of students in the ith group is less than the sum of the grades of students in the (i + 1)th group, for all groups (except the last).
 *
 * The total number of students in the ith group is less than the total number of students in the (i + 1)th group, for all groups (except the last).
 *
 * Return the maximum number of groups that can be formed.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: grades = [10,6,12,7,3,5]
 * Output: 3
 * Explanation: The following is a possible way to form 3 groups of students:
 * - 1st group has the students with grades = [12]. Sum of grades: 12. Student count: 1
 * - 2nd group has the students with grades = [6,7]. Sum of grades: 6 + 7 = 13. Student count: 2
 * - 3rd group has the students with grades = [10,3,5]. Sum of grades: 10 + 3 + 5 = 18. Student count: 3
 * It can be shown that it is not possible to form more than 3 groups.
 *
 * Example 2:
 *
 * Input: grades = [8,8]
 * Output: 1
 * Explanation: We can only form 1 group, since forming 2 groups would lead to an equal number of students in both groups.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= grades.length &lt;= 105
 *
 * 1 &lt;= grades[i] &lt;= 105
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Would it be easier to place the students into valid groups after sorting them based on their grades in ascending order?
 * Hint 2: Notice that, after sorting, we can separate them into groups of sizes 1, 2, 3, and so on.
 * Hint 3: If the last group is invalid, we can merge it with the previous group.
 * Hint 4: This creates the maximum number of groups because we always greedily form the smallest possible group.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Math, Binary Search, Greedy).
 *
 * @see <a href="https://leetcode.com/problems/maximum-number-of-groups-entering-a-competition/">LeetCode #2358</a>
 */
public class MaximumNumberOfGroupsEnteringACompetition {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Maximum Number of Groups Entering a Competition");
    }

    public static void main(String[] args) {
        System.out.println("=== MaximumNumberOfGroupsEnteringACompetition ===");
        MaximumNumberOfGroupsEnteringACompetition sol = new MaximumNumberOfGroupsEnteringACompetition();
        System.out.println(sol.solve(null));
    }
}
