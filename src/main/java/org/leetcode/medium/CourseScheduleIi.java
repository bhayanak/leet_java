package org.leetcode.medium;

/**
 * <b>#210 - Course Schedule II</b>
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
 * Return the ordering of courses you should take to finish all courses. If there are many valid answers, return any of them. If it is impossible to finish all courses, return an empty array.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: numCourses = 2, prerequisites = [[1,0]]
 * Output: [0,1]
 * Explanation: There are a total of 2 courses to take. To take course 1 you should have finished course 0. So the correct course order is [0,1].
 * 
 * Example 2:
 * 
 * Input: numCourses = 4, prerequisites = [[1,0],[2,0],[3,1],[3,2]]
 * Output: [0,2,1,3]
 * Explanation: There are a total of 4 courses to take. To take course 3 you should have finished both courses 1 and 2. Both courses 1 and 2 should be taken after you finished course 0.
 * So one correct course order is [0,1,2,3]. Another correct ordering is [0,2,1,3].
 * 
 * Example 3:
 * 
 * Input: numCourses = 1, prerequisites = []
 * Output: [0]
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * 1 &lt;= numCourses &lt;= 2000
 * 	
 * 0 &lt;= prerequisites.length &lt;= numCourses * (numCourses - 1)
 * 	
 * prerequisites[i].length == 2
 * 	
 * 0 &lt;= ai, bi &lt; numCourses
 * 	
 * ai != bi
 * 	
 * All the pairs [ai, bi] are distinct.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: This problem is equivalent to finding the topological order in a directed graph. If a cycle exists, no topological ordering exists and therefore it will be impossible to take all courses.
 * Hint 2: <a href="https://www.youtube.com/watch?v=ozso3xxkVGU" target="_blank">Topological Sort via DFS</a> - A great video tutorial (21 minutes) on Coursera explaining the basic concepts of Topological Sort.
 * Hint 3: Topological sort could also be done via <a href="http://en.wikipedia.org/wiki/Topological_sorting#Algorithms" target="_blank">BFS</a>.
 *
 * <h2>Approach</h2>
 * Topological sort via Kahn's algorithm (BFS).
 * Add nodes with in-degree 0 to queue; decrement neighbors on dequeue.
 *
 * <h2>Complexity</h2>
* Time: O(V+E)  |  Space: O(V+E)
 *
 * @see <a href="https://leetcode.com/problems/course-schedule-ii/">LeetCode #210</a>
 */
public class CourseScheduleIi {

    /**
     * Finds Find order.
     * Uses Breadth-First Search (BFS) traversal.
     *
     * @param numCourses the numCourses (int)
     * @param prerequisites the prerequisites (int[][])
     * @return the computed int[] result
     */
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        java.util.List<java.util.List<Integer>> adj = new java.util.ArrayList<>();
        int[] indeg = new int[numCourses];
        for (int i=0;i<numCourses;i++) adj.add(new java.util.ArrayList<>());
        for (int[] p : prerequisites) { adj.get(p[1]).add(p[0]); indeg[p[0]]++; }
        java.util.Queue<Integer> q = new java.util.LinkedList<>();
        for (int i=0;i<numCourses;i++) if(indeg[i]==0) q.offer(i);
        int[] order = new int[numCourses]; int idx=0;
        while (!q.isEmpty()) {
            int u=q.poll(); order[idx++]=u;
            for (int v : adj.get(u)) if(--indeg[v]==0) q.offer(v);
        }
        return idx==numCourses ? order : new int[0];
    }

    // ─── Demo ────────────────────────────────────────────────────
    public static void main(String[] args) {
        CourseScheduleIi sol = new CourseScheduleIi();
        System.out.println(java.util.Arrays.toString(sol.findOrder(2,new int[][]{{1,0}}))); // [0,1]
        System.out.println(java.util.Arrays.toString(sol.findOrder(4,new int[][]{{1,0},{2,0},{3,1},{3,2}}))); // [0,1,2,3]
        System.out.println(java.util.Arrays.toString(sol.findOrder(2,new int[][]{{1,0},{0,1}}))); // []
    }
}
