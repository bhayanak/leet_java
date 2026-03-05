package org.leetcode.medium;


/**
 * <b>#2910 - Minimum Number of Groups to Create a Valid Assignment</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Hash Table, Greedy</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a collection of numbered balls and instructed to sort them into boxes for a nearly balanced distribution. There are two rules you must follow:
 *
 *
 * Balls with the same box must have the same value. But, if you have more than one ball with the same number, you can put them in different boxes.
 *
 * The biggest box can only have one more ball than the smallest box.
 *
 * ​Return the fewest number of boxes to sort these balls following these rules.
 *
 *
 *
 *
 * Example 1: 
 *
 * Input:   balls = [3,2,3,2,3] 
 *
 *
 * Output:   2 
 *
 *
 * Explanation:
 *
 *
 * We can sort balls into boxes as follows:
 *
 *
 * [3,3,3]
 *
 * [2,2]
 *
 * The size difference between the two boxes doesn't exceed one.
 *
 * Example 2: 
 *
 * Input:   balls = [10,10,10,3,1,1] 
 *
 *
 * Output:   4 
 *
 *
 * Explanation:
 *
 *
 * We can sort balls into boxes as follows:
 *
 *
 * [10]
 *
 * [10,10]
 *
 * [3]
 *
 * [1,1]
 *
 * You can't use fewer than four boxes while still following the rules. For example, putting all three balls numbered 10 in one box would break the rule about the maximum size difference between boxes.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 105
 *
 * 1 &lt;= nums[i] &lt;= 109
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Calculate the frequency of each number.
 * Hint 2: For each <code>x</code> in the range <code>[1, minimum_frequency]</code>, try to create groups with either <code>x</code> or <code>x + 1</code> indices assigned to them while minimizing the total number of groups.
 * Hint 3: For each distinct number, using its frequency, check that all its occurrences can be assigned to groups of size <code>x</code> or <code>x + 1</code> while minimizing the number of groups used.
 * Hint 4: To get the minimum number of groups needed for a number having frequency <code>f</code> to be assigned to groups of size <code>x</code> or <code>x + 1</code>, let <code>a = f / (x + 1)</code> and <code>b = f % (x + 1)</code>. <ul> <li>If <code>b == 0</code>, then we can simply create <code>a</code> groups of size <code>x + 1</code>.</li> <li>If <code>x - b &lt;= a</code>, we can have <code>a - (x - b)</code> groups of size <code>x + 1</code> and <code>x - b + 1</code> groups of size <code>x</code>. So, in total, we have <code>a + 1</code> groups.</li> <li>Otherwise, it's impossible.</li> </ul>
 * Hint 5: The minimum number of groups needed for some <code>x</code> is the total minimized number of groups needed for each distinct number.
 * Hint 6: The answer is the minimum number of groups needed for each <code>x</code> in the range <code>[1, minimum_frequency]</code>.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Greedy).
 *
 * @see <a href="https://leetcode.com/problems/minimum-number-of-groups-to-create-a-valid-assignment/">LeetCode #2910</a>
 */
public class MinimumNumberOfGroupsToCreateAValidAssignment {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Minimum Number of Groups to Create a Valid Assignment");
    }

    public static void main(String[] args) {
        System.out.println("=== MinimumNumberOfGroupsToCreateAValidAssignment ===");
        MinimumNumberOfGroupsToCreateAValidAssignment sol = new MinimumNumberOfGroupsToCreateAValidAssignment();
        System.out.println(sol.solve(null));
    }
}
