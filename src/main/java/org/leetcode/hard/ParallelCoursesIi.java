package org.leetcode.hard;


/**
 * <b>#1494 - Parallel Courses II</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Dynamic Programming, Bit Manipulation, Graph Theory, Bitmask</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer n, which indicates that there are n courses labeled from 1 to n. You are also given an array relations where relations[i] = [prevCoursei, nextCoursei], representing a prerequisite relationship between course prevCoursei and course nextCoursei: course prevCoursei has to be taken before course nextCoursei. Also, you are given the integer k.
 *
 *
 * In one semester, you can take at most k courses as long as you have taken all the prerequisites in the previous semesters for the courses you are taking.
 *
 *
 * Return the minimum number of semesters needed to take all courses. The testcases will be generated such that it is possible to take every course.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: n = 4, relations = [[2,1],[3,1],[1,4]], k = 2
 * Output: 3
 * Explanation: The figure above represents the given graph.
 * In the first semester, you can take courses 2 and 3.
 * In the second semester, you can take course 1.
 * In the third semester, you can take course 4.
 *
 * Example 2:
 *
 * Input: n = 5, relations = [[2,1],[3,1],[4,1],[1,5]], k = 2
 * Output: 4
 * Explanation: The figure above represents the given graph.
 * In the first semester, you can only take courses 2 and 3 since you cannot take more than two per semester.
 * In the second semester, you can take course 4.
 * In the third semester, you can take course 1.
 * In the fourth semester, you can take course 5.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n &lt;= 15
 *
 * 1 &lt;= k &lt;= n
 *
 * 0 &lt;= relations.length &lt;= n * (n-1) / 2
 *
 * relations[i].length == 2
 *
 * 1 &lt;= prevCoursei, nextCoursei &lt;= n
 *
 * prevCoursei != nextCoursei
 *
 * All the pairs [prevCoursei, nextCoursei] are unique.
 *
 * The given graph is a directed acyclic graph.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use backtracking with states (bitmask, degrees) where bitmask represents the set of courses, if the ith bit is 1 then the ith course was taken, otherwise, you can take the ith course. Degrees represent the degree for each course (nodes in the graph).
 * Hint 2: Note that you can only take nodes (courses) with degree = 0 and it is optimal at every step in the backtracking take the maximum number of courses limited by k.
 *
 * <h2>Approach</h2>
 * Think about the category (Dynamic Programming, Bit Manipulation, Graph Theory, Bitmask).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/parallel-courses-ii/">LeetCode #1494</a>
 */
public class ParallelCoursesIi {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Parallel Courses II");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== ParallelCoursesIi ===");
        ParallelCoursesIi sol = new ParallelCoursesIi();
        System.out.println(sol.solve(null));
    }
}
