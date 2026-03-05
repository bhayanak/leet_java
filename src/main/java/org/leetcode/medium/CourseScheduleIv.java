package org.leetcode.medium;


/**
 * <b>#1462 - Course Schedule IV</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Depth-First Search, Breadth-First Search, Graph Theory, Topological Sort</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * There are a total of numCourses courses you have to take, labeled from 0 to numCourses - 1. You are given an array prerequisites where prerequisites[i] = [ai, bi] indicates that you must take course ai first if you want to take course bi.
 *
 *
 * For example, the pair [0, 1] indicates that you have to take course 0 before you can take course 1.
 *
 * Prerequisites can also be indirect. If course a is a prerequisite of course b, and course b is a prerequisite of course c, then course a is a prerequisite of course c.
 *
 *
 * You are also given an array queries where queries[j] = [uj, vj]. For the jth query, you should answer whether course uj is a prerequisite of course vj or not.
 *
 *
 * Return a boolean array answer, where answer[j] is the answer to the jth query.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: numCourses = 2, prerequisites = [[1,0]], queries = [[0,1],[1,0]]
 * Output: [false,true]
 * Explanation: The pair [1, 0] indicates that you have to take course 1 before you can take course 0.
 * Course 0 is not a prerequisite of course 1, but the opposite is true.
 *
 * Example 2:
 *
 * Input: numCourses = 2, prerequisites = [], queries = [[1,0],[0,1]]
 * Output: [false,false]
 * Explanation: There are no prerequisites, and each course is independent.
 *
 * Example 3:
 *
 * Input: numCourses = 3, prerequisites = [[1,2],[1,0],[2,0]], queries = [[1,0],[1,2]]
 * Output: [true,true]
 *
 *
 *
 * Constraints:
 *
 *
 * 2 &lt;= numCourses &lt;= 100
 *
 * 0 &lt;= prerequisites.length &lt;= (numCourses * (numCourses - 1) / 2)
 *
 * prerequisites[i].length == 2
 *
 * 0 &lt;= ai, bi &lt;= numCourses - 1
 *
 * ai != bi
 *
 * All the pairs [ai, bi] are unique.
 *
 * The prerequisites graph has no cycles.
 *
 * 1 &lt;= queries.length &lt;= 104
 *
 * 0 &lt;= ui, vi &lt;= numCourses - 1
 *
 * ui != vi
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Imagine if the courses are nodes of a graph. We need to build an array isReachable[i][j].
 * Hint 2: Start a bfs from each course i and assign for each course j you visit isReachable[i][j] = True.
 * Hint 3: Answer the queries from the isReachable array.
 *
 * <h2>Approach</h2>
 * Think about the category (Depth-First Search, Breadth-First Search, Graph Theory, Topological Sort).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/course-schedule-iv/">LeetCode #1462</a>
 */
public class CourseScheduleIv {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Course Schedule IV");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== CourseScheduleIv ===");
        CourseScheduleIv sol = new CourseScheduleIv();
        System.out.println(sol.solve(null));
    }
}
