package org.leetcode.medium;

/**
 * <b>#207 - Course Schedule</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Depth-First Search, Breadth-First Search, Graph Theory, Topological Sort</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * There are a total of numCourses courses you have to take, labeled from 0 to numCourses - 1. You are given an array prerequisites where prerequisites[i] = [ai, bi] indicates that you must take course bi first if you want to take course ai.
 * 
 * 	
 * For example, the pair [0, 1], indicates that to take course 0 you have to first take course 1.
 * 
 * Return true if you can finish all courses. Otherwise, return false.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: numCourses = 2, prerequisites = [[1,0]]
 * Output: true
 * Explanation: There are a total of 2 courses to take. 
 * To take course 1 you should have finished course 0. So it is possible.
 * 
 * Example 2:
 * 
 * Input: numCourses = 2, prerequisites = [[1,0],[0,1]]
 * Output: false
 * Explanation: There are a total of 2 courses to take. 
 * To take course 1 you should have finished course 0, and to take course 0 you should also have finished course 1. So it is impossible.
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * 1 &lt;= numCourses &lt;= 2000
 * 	
 * 0 &lt;= prerequisites.length &lt;= 5000
 * 	
 * prerequisites[i].length == 2
 * 	
 * 0 &lt;= ai, bi &lt; numCourses
 * 	
 * All the pairs prerequisites[i] are unique.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: This problem is equivalent to finding if a cycle exists in a directed graph. If a cycle exists, no topological ordering exists and therefore it will be impossible to take all courses.
 * Hint 2: <a href="https://www.cs.princeton.edu/~wayne/kleinberg-tardos/pdf/03Graphs.pdf" target="_blank">Topological Sort via DFS</a> - A great tutorial explaining the basic concepts of Topological Sort.
 * Hint 3: Topological sort could also be done via <a href="http://en.wikipedia.org/wiki/Topological_sorting#Algorithms" target="_blank">BFS</a>.
 *
 * <h2>Approach</h2>
 * Model prerequisites as a directed graph. Use DFS cycle detection:
 * visiting=1, visited=2. If we reach a node already being visited → cycle.
 *
 * <h2>Complexity</h2>
* Time: O(V+E)  |  Space: O(V+E)
 *
 * @see <a href="https://leetcode.com/problems/course-schedule/">LeetCode #207</a>
 */
public class CourseSchedule {

    /**
     * Returns true if the input can Can finish.
     *
     * @param numCourses the numCourses (int)
     * @param prerequisites the prerequisites (int[][])
     * @return the computed boolean result
     */
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        java.util.List<java.util.List<Integer>> adj = new java.util.ArrayList<>();
        for (int i = 0; i < numCourses; i++) adj.add(new java.util.ArrayList<>());
        for (int[] p : prerequisites) adj.get(p[1]).add(p[0]);
        int[] state = new int[numCourses]; // 0=unvisited 1=visiting 2=done
        for (int i = 0; i < numCourses; i++)
            if (state[i] == 0 && hasCycle(adj, state, i)) return false;
        return true;
    }
    private boolean hasCycle(java.util.List<java.util.List<Integer>> adj, int[] st, int u) {
        st[u] = 1;
        for (int v : adj.get(u)) {
            if (st[v] == 1) return true;
            if (st[v] == 0 && hasCycle(adj, st, v)) return true;
        }
        st[u] = 2; return false;
    }

    // ─── Demo ────────────────────────────────────────────────────
    public static void main(String[] args) {
        CourseSchedule sol = new CourseSchedule();
        System.out.println(sol.canFinish(2, new int[][]{{1,0}}));           // true
        System.out.println(sol.canFinish(2, new int[][]{{1,0},{0,1}}));     // false (cycle)
    }
}
