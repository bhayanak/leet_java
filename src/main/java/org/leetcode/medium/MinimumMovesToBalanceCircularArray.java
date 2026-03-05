package org.leetcode.medium;


/**
 * <b>#3776 - Minimum Moves to Balance Circular Array</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Greedy, Sorting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a circular array balance of length n, where balance[i] is the net balance of person i.
 *
 *
 * In one move, a person can transfer exactly 1 unit of balance to either their left or right neighbor.
 *
 *
 * Return the minimum number of moves required so that every person has a non-negative balance. If it is impossible, return -1.
 *
 *
 * Note: You are guaranteed that at most 1 index has a negative balance initially.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: balance = [5,1,-4]
 *
 *
 * Output: 4
 *
 *
 * Explanation:
 *
 *
 * One optimal sequence of moves is:
 *
 *
 * Move 1 unit from i = 1 to i = 2, resulting in balance = [5, 0, -3]
 *
 * Move 1 unit from i = 0 to i = 2, resulting in balance = [4, 0, -2]
 *
 * Move 1 unit from i = 0 to i = 2, resulting in balance = [3, 0, -1]
 *
 * Move 1 unit from i = 0 to i = 2, resulting in balance = [2, 0, 0]
 *
 * Thus, the minimum number of moves required is 4.
 *
 * Example 2:
 *
 * Input: balance = [1,2,-5,2]
 *
 *
 * Output: 6
 *
 *
 * Explanation:
 *
 *
 * One optimal sequence of moves is:
 *
 *
 * Move 1 unit from i = 1 to i = 2, resulting in balance = [1, 1, -4, 2]
 *
 * Move 1 unit from i = 1 to i = 2, resulting in balance = [1, 0, -3, 2]
 *
 * Move 1 unit from i = 3 to i = 2, resulting in balance = [1, 0, -2, 1]
 *
 * Move 1 unit from i = 3 to i = 2, resulting in balance = [1, 0, -1, 0]
 *
 * Move 1 unit from i = 0 to i = 1, resulting in balance = [0, 1, -1, 0]
 *
 * Move 1 unit from i = 1 to i = 2, resulting in balance = [0, 0, 0, 0]
 *
 * Thus, the minimum number of moves required is 6.​​​
 *
 * Example 3:
 *
 * Input: balance = [-3,2]
 *
 *
 * Output: -1
 *
 *
 * Explanation:
 *
 *
 * ​​​​​​​It is impossible to make all balances non-negative for balance = [-3, 2], so the answer is -1.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n == balance.length &lt;= 105
 *
 * -109 &lt;= balance[i] &lt;= 109
 *
 * There is at most one negative value in balance initially.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: If there is no negative value, then the answer is 0. If the total sum is less than 0, then the answer is -1.
 * Hint 2: Sort the positive values in <code>nums</code> by their distance from the index with the negative value.
 * Hint 3: Greedily use as many values as needed from the sorted <code>nums</code> to offset the current negative value.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Greedy, Sorting).
 *
 * @see <a href="https://leetcode.com/problems/minimum-moves-to-balance-circular-array/">LeetCode #3776</a>
 */
public class MinimumMovesToBalanceCircularArray {

    /**
     * Solves the problem: Minimum fuel cost.
     * Uses Depth-First Search (DFS) traversal.
     *
     * @param roads the roads (int[][])
     * @param seats the seats (int)
     * @return the computed long result
     */
    public long minimumFuelCost(int[][] roads, int seats) {
        int n=roads.length+1;
        java.util.List<java.util.List<Integer>> adj=new java.util.ArrayList<>();
        for (int i=0;i<n;i++) adj.add(new java.util.ArrayList<>());
        for (int[] r:roads){adj.get(r[0]).add(r[1]);adj.get(r[1]).add(r[0]);}
        long[] fuel={0};
        dfsF(0,-1,adj,seats,fuel);
        return fuel[0];
    }
    private int dfsF(int u,int p,java.util.List<java.util.List<Integer>> adj,int seats,long[] fuel){
        int total=1;
        for (int v:adj.get(u)){if(v==p)continue;int sub=dfsF(v,u,adj,seats,fuel);total+=sub;fuel[0]+=(long)Math.ceil((double)sub/seats);}
        return total;
    }

    public static void main(String[] args) {
        MinimumMovesToBalanceCircularArray sol = new MinimumMovesToBalanceCircularArray();
        System.out.println(sol.minimumFuelCost(new int[][]{{1,2},{3,4}}, 0));
    }
}
