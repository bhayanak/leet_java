package org.leetcode.hard;


/**
 * <b>#913 - Cat and Mouse</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Math, Dynamic Programming, Graph Theory, Topological Sort, Memoization, Game Theory</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * A game on an undirected graph is played by two players, Mouse and Cat, who alternate turns.
 *
 *
 * The graph is given as follows: graph[a] is a list of all nodes b such that ab is an edge of the graph.
 *
 *
 * The mouse starts at node 1 and goes first, the cat starts at node 2 and goes second, and there is a hole at node 0.
 *
 *
 * During each player's turn, they must travel along one edge of the graph that meets where they are.  For example, if the Mouse is at node 1, it must travel to any node in graph[1].
 *
 *
 * Additionally, it is not allowed for the Cat to travel to the Hole (node 0).
 *
 *
 * Then, the game can end in three ways:
 *
 *
 * If ever the Cat occupies the same node as the Mouse, the Cat wins.
 *
 * If ever the Mouse reaches the Hole, the Mouse wins.
 *
 * If ever a position is repeated (i.e., the players are in the same position as a previous turn, and it is the same player's turn to move), the game is a draw.
 *
 * Given a graph, and assuming both players play optimally, return
 *
 *
 * 1 if the mouse wins the game,
 *
 * 2 if the cat wins the game, or
 *
 * 0 if the game is a draw.
 *
 *
 *
 * Example 1:
 *
 * Input: graph = [[2,5],[3],[0,4,5],[1,4,5],[2,3],[0,2,3]]
 * Output: 0
 *
 * Example 2:
 *
 * Input: graph = [[1,3],[0],[3],[0,2]]
 * Output: 1
 *
 *
 *
 * Constraints:
 *
 *
 * 3 &lt;= graph.length &lt;= 50
 *
 * 1 &lt;= graph[i].length &lt; graph.length
 *
 * 0 &lt;= graph[i][j] &lt; graph.length
 *
 * graph[i][j] != i
 *
 * graph[i] is unique.
 *
 * The mouse and the cat can always move.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (Math, Dynamic Programming, Graph Theory, Topological Sort, Memoization, Game Theory).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/cat-and-mouse/">LeetCode #913</a>
 */
public class CatAndMouse {

    /**
     * TODO: Implement "Cat and Mouse".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Cat and Mouse");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac CatAndMouse.java &amp;&amp; java org.leetcode.hard.CatAndMouse</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== CatAndMouse ===");
        CatAndMouse sol = new CatAndMouse();
        System.out.println(sol.solve(null));
    }
}
