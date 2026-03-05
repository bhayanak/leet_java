package org.leetcode.easy;


/**
 * <b>#3238 - Find the Number of Winning Players</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Hash Table, Counting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer n representing the number of players in a game and a 2D array pick where pick[i] = [xi, yi] represents that the player xi picked a ball of color yi.
 *
 *
 * Player i wins the game if they pick strictly more than i balls of the same color. In other words,
 *
 *
 * Player 0 wins if they pick any ball.
 *
 * Player 1 wins if they pick at least two balls of the same color.
 *
 * ...
 *
 * Player i wins if they pick at least i + 1 balls of the same color.
 *
 * Return the number of players who win the game.
 *
 *
 * Note that multiple players can win the game.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: n = 4, pick = [[0,0],[1,0],[1,0],[2,1],[2,1],[2,0]]
 *
 *
 * Output: 2
 *
 *
 * Explanation:
 *
 *
 * Player 0 and player 1 win the game, while players 2 and 3 do not win.
 *
 * Example 2:
 *
 * Input: n = 5, pick = [[1,1],[1,2],[1,3],[1,4]]
 *
 *
 * Output: 0
 *
 *
 * Explanation:
 *
 *
 * No player wins the game.
 *
 * Example 3:
 *
 * Input: n = 5, pick = [[1,1],[2,4],[2,4],[2,4]]
 *
 *
 * Output: 1
 *
 *
 * Explanation:
 *
 *
 * Player 2 wins the game by picking 3 balls with color 4.
 *
 *
 *
 * Constraints:
 *
 *
 * 2 &lt;= n &lt;= 10
 *
 * 1 &lt;= pick.length &lt;= 100
 *
 * pick[i].length == 2
 *
 * 0 &lt;= xi &lt;= n - 1 
 *
 * 0 &lt;= yi &lt;= 10
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Keep track of the number of balls of each color for each user using hashing.
 * Hint 2: Find the maximum color that occurred for each player.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Counting).
 *
 * @see <a href="https://leetcode.com/problems/find-the-number-of-winning-players/">LeetCode #3238</a>
  *
  * <p><b>Explanation:</b> Uses a PriorityQueue (heap) for efficient O(log n) min/max retrieval.</p>
  */
public class FindTheNumberOfWinningPlayers {

    /**
     * Finds Find score.
     * Uses a heap/priority queue for efficient ordering.
     *
     * @param nums the nums (int[])
     * @return the computed long result
      *
      * <p><b>Explanation:</b> Uses a PriorityQueue (heap) for efficient O(log n) min/max retrieval.</p>
      */
    public long findScore(int[] nums) {
        long score=0;
        boolean[] marked=new boolean[nums.length];
        java.util.PriorityQueue<int[]> pq=new java.util.PriorityQueue<>((a,b)->a[0]!=b[0]?a[0]-b[0]:a[1]-b[1]);
        for (int i=0;i<nums.length;i++) pq.offer(new int[]{nums[i],i});
        while (!pq.isEmpty()) {
            int[] cur=pq.poll();
            if (marked[cur[1]]) continue;
            score+=cur[0];
            marked[cur[1]]=true;
            if (cur[1]>0) marked[cur[1]-1]=true;
            if (cur[1]<nums.length-1) marked[cur[1]+1]=true;
        }
        return score;
    }

    public static void main(String[] args) {
        FindTheNumberOfWinningPlayers sol = new FindTheNumberOfWinningPlayers();
        System.out.println(sol.findScore(new int[]{1,2,3}));
    }
}
