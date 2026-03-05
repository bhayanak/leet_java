package org.leetcode.medium;


/**
 * <b>#841 - Keys and Rooms</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Depth-First Search, Breadth-First Search, Graph Theory</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * There are n rooms labeled from 0 to n - 1 and all the rooms are locked except for room 0. Your goal is to visit all the rooms. However, you cannot enter a locked room without having its key.
 *
 *
 * When you visit a room, you may find a set of distinct keys in it. Each key has a number on it, denoting which room it unlocks, and you can take all of them with you to unlock the other rooms.
 *
 *
 * Given an array rooms where rooms[i] is the set of keys that you can obtain if you visited room i, return true if you can visit all the rooms, or false otherwise.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: rooms = [[1],[2],[3],[]]
 * Output: true
 * Explanation: 
 * We visit room 0 and pick up key 1.
 * We then visit room 1 and pick up key 2.
 * We then visit room 2 and pick up key 3.
 * We then visit room 3.
 * Since we were able to visit every room, we return true.
 *
 * Example 2:
 *
 * Input: rooms = [[1,3],[3,0,1],[2],[0]]
 * Output: false
 * Explanation: We can not enter room number 2 since the only key that unlocks it is in that room.
 *
 *
 *
 * Constraints:
 *
 *
 * n == rooms.length
 *
 * 2 &lt;= n &lt;= 1000
 *
 * 0 &lt;= rooms[i].length &lt;= 1000
 *
 * 1 &lt;= sum(rooms[i].length) &lt;= 3000
 *
 * 0 &lt;= rooms[i][j] &lt; n
 *
 * All the values of rooms[i] are unique.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (Depth-First Search, Breadth-First Search, Graph Theory).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/keys-and-rooms/">LeetCode #841</a>
 */
public class KeysAndRooms {

    /**
     * TODO: Implement "Keys and Rooms".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Keys and Rooms");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac KeysAndRooms.java &amp;&amp; java org.leetcode.medium.KeysAndRooms</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== KeysAndRooms ===");
        KeysAndRooms sol = new KeysAndRooms();
        System.out.println(sol.solve(null));
    }
}
