package org.leetcode.easy;


/**
 * <b>#1496 - Path Crossing</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Hash Table, String</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given a string path, where path[i] = 'N', 'S', 'E' or 'W', each representing moving one unit north, south, east, or west, respectively. You start at the origin (0, 0) on a 2D plane and walk on the path specified by path.
 *
 *
 * Return true if the path crosses itself at any point, that is, if at any time you are on a location you have previously visited. Return false otherwise.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: path = "NES"
 * Output: false 
 * Explanation: Notice that the path doesn't cross any point more than once.
 *
 * Example 2:
 *
 * Input: path = "NESWW"
 * Output: true
 * Explanation: Notice that the path visits the origin twice.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= path.length &lt;= 104
 *
 * path[i] is either 'N', 'S', 'E', or 'W'.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Simulate the process while keeping track of visited points.
 * Hint 2: Use a set to store previously visited points.
 *
 * <h2>Approach</h2>
 * Think about the category (Hash Table, String).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/path-crossing/">LeetCode #1496</a>
  *
  * <p><b>Explanation:</b> Uses a HashSet to detect duplicates or track seen elements in O(1) per operation.</p>
  */
public class PathCrossing {

    /**
     * Returns true if Is path crossing.
     *
     * @param path the path (String)
     * @return the computed boolean result
      *
      * <p><b>Explanation:</b> Uses a HashSet to detect duplicates or track seen elements in O(1) per operation.</p>
      */
    public boolean isPathCrossing(String path) {
        java.util.Set<String> visited = new java.util.HashSet<>();
        int x=0,y=0; visited.add(x+","+y);
        for (char c : path.toCharArray()) {
            if      (c=='N') y++;
            else if (c=='S') y--;
            else if (c=='E') x++;
            else             x--;
            if (!visited.add(x+","+y)) return true;
        }
        return false;
    }

    /**
     * Runs sample test cases.
      *
      * <p><b>Explanation:</b> Processes the string character by character, applying the transformation or predicate.</p>
      */
    public static void main(String[] args) {
        PathCrossing sol = new PathCrossing();
                System.out.println(sol.isPathCrossing("NES"));       // false
                System.out.println(sol.isPathCrossing("NESWW"));     // true
                System.out.println(sol.isPathCrossing("NNSWWEWSSESSWENNW")); // false
    }
}
