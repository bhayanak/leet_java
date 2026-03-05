package org.leetcode.medium;


/**
 * <b>#2327 - Number of People Aware of a Secret</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Dynamic Programming, Queue, Simulation</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * On day 1, one person discovers a secret.
 *
 *
 * You are given an integer delay, which means that each person will share the secret with a new person every day, starting from delay days after discovering the secret. You are also given an integer forget, which means that each person will forget the secret forget days after discovering it. A person cannot share the secret on the same day they forgot it, or on any day afterwards.
 *
 *
 * Given an integer n, return the number of people who know the secret at the end of day n. Since the answer may be very large, return it modulo 109 + 7.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: n = 6, delay = 2, forget = 4
 * Output: 5
 * Explanation:
 * Day 1: Suppose the first person is named A. (1 person)
 * Day 2: A is the only person who knows the secret. (1 person)
 * Day 3: A shares the secret with a new person, B. (2 people)
 * Day 4: A shares the secret with a new person, C. (3 people)
 * Day 5: A forgets the secret, and B shares the secret with a new person, D. (3 people)
 * Day 6: B shares the secret with E, and C shares the secret with F. (5 people)
 *
 * Example 2:
 *
 * Input: n = 4, delay = 1, forget = 3
 * Output: 6
 * Explanation:
 * Day 1: The first person is named A. (1 person)
 * Day 2: A shares the secret with B. (2 people)
 * Day 3: A and B share the secret with 2 new people, C and D. (4 people)
 * Day 4: A forgets the secret. B, C, and D share the secret with 3 new people. (6 people)
 *
 *
 *
 * Constraints:
 *
 *
 * 2 &lt;= n &lt;= 1000
 *
 * 1 &lt;= delay &lt; forget &lt;= n
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Let dp[i][j] be the number of people who have known the secret for exactly j + 1 days, at day i.
 * Hint 2: If j &gt; 0, dp[i][j] = dp[i – 1][j – 1].
 * Hint 3: dp[i][0] = sum(dp[i – 1][j]) for j in [delay – 1, forget – 2].
 *
 * <h2>Approach</h2>
 * Think about the category (Dynamic Programming, Queue, Simulation).
 *
 * @see <a href="https://leetcode.com/problems/number-of-people-aware-of-a-secret/">LeetCode #2327</a>
 */
public class NumberOfPeopleAwareOfASecret {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Number of People Aware of a Secret");
    }

    public static void main(String[] args) {
        System.out.println("=== NumberOfPeopleAwareOfASecret ===");
        NumberOfPeopleAwareOfASecret sol = new NumberOfPeopleAwareOfASecret();
        System.out.println(sol.solve(null));
    }
}
