package org.leetcode.hard;


/**
 * <b>#2092 - Find All People With Secret</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Depth-First Search, Breadth-First Search, Union-Find, Graph Theory, Sorting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer n indicating there are n people numbered from 0 to n - 1. You are also given a 0-indexed 2D integer array meetings where meetings[i] = [xi, yi, timei] indicates that person xi and person yi have a meeting at timei. A person may attend multiple meetings at the same time. Finally, you are given an integer firstPerson.
 *
 *
 * Person 0 has a secret and initially shares the secret with a person firstPerson at time 0. This secret is then shared every time a meeting takes place with a person that has the secret. More formally, for every meeting, if a person xi has the secret at timei, then they will share the secret with person yi, and vice versa.
 *
 *
 * The secrets are shared instantaneously. That is, a person may receive the secret and share it with people in other meetings within the same time frame.
 *
 *
 * Return a list of all the people that have the secret after all the meetings have taken place. You may return the answer in any order.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: n = 6, meetings = [[1,2,5],[2,3,8],[1,5,10]], firstPerson = 1
 * Output: [0,1,2,3,5]
 * Explanation:
 * At time 0, person 0 shares the secret with person 1.
 * At time 5, person 1 shares the secret with person 2.
 * At time 8, person 2 shares the secret with person 3.
 * At time 10, person 1 shares the secret with person 5.​​​​
 * Thus, people 0, 1, 2, 3, and 5 know the secret after all the meetings.
 *
 * Example 2:
 *
 * Input: n = 4, meetings = [[3,1,3],[1,2,2],[0,3,3]], firstPerson = 3
 * Output: [0,1,3]
 * Explanation:
 * At time 0, person 0 shares the secret with person 3.
 * At time 2, neither person 1 nor person 2 know the secret.
 * At time 3, person 3 shares the secret with person 0 and person 1.
 * Thus, people 0, 1, and 3 know the secret after all the meetings.
 *
 * Example 3:
 *
 * Input: n = 5, meetings = [[3,4,2],[1,2,1],[2,3,1]], firstPerson = 1
 * Output: [0,1,2,3,4]
 * Explanation:
 * At time 0, person 0 shares the secret with person 1.
 * At time 1, person 1 shares the secret with person 2, and person 2 shares the secret with person 3.
 * Note that person 2 can share the secret at the same time as receiving it.
 * At time 2, person 3 shares the secret with person 4.
 * Thus, people 0, 1, 2, 3, and 4 know the secret after all the meetings.
 *
 *
 *
 * Constraints:
 *
 *
 * 2 &lt;= n &lt;= 105
 *
 * 1 &lt;= meetings.length &lt;= 105
 *
 * meetings[i].length == 3
 *
 * 0 &lt;= xi, yi &lt;= n - 1
 *
 * xi != yi
 *
 * 1 &lt;= timei &lt;= 105
 *
 * 1 &lt;= firstPerson &lt;= n - 1
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Could you model all the meetings happening at the same time as a graph?
 * Hint 2: What data structure can you use to efficiently share the secret?
 * Hint 3: You can use the union-find data structure to quickly determine who knows the secret and share the secret.
 *
 * <h2>Approach</h2>
 * Think about the category (Depth-First Search, Breadth-First Search, Union-Find, Graph Theory, Sorting).
 *
 * @see <a href="https://leetcode.com/problems/find-all-people-with-secret/">LeetCode #2092</a>
 */
public class FindAllPeopleWithSecret {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Find All People With Secret");
    }

    public static void main(String[] args) {
        System.out.println("=== FindAllPeopleWithSecret ===");
        FindAllPeopleWithSecret sol = new FindAllPeopleWithSecret();
        System.out.println(sol.solve(null));
    }
}
