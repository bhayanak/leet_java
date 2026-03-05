package org.leetcode.easy;


/**
 * <b>#2591 - Distribute Money to Maximum Children</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Math, Greedy</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer money denoting the amount of money (in dollars) that you have and another integer children denoting the number of children that you must distribute the money to.
 *
 *
 * You have to distribute the money according to the following rules:
 *
 *
 * All money must be distributed.
 *
 * Everyone must receive at least 1 dollar.
 *
 * Nobody receives 4 dollars.
 *
 * Return the maximum number of children who may receive exactly 8 dollars if you distribute the money according to the aforementioned rules. If there is no way to distribute the money, return -1.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: money = 20, children = 3
 * Output: 1
 * Explanation: 
 * The maximum number of children with 8 dollars will be 1. One of the ways to distribute the money is:
 * - 8 dollars to the first child.
 * - 9 dollars to the second child. 
 * - 3 dollars to the third child.
 * It can be proven that no distribution exists such that number of children getting 8 dollars is greater than 1.
 *
 * Example 2:
 *
 * Input: money = 16, children = 2
 * Output: 2
 * Explanation: Each child can be given 8 dollars.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= money &lt;= 200
 *
 * 2 &lt;= children &lt;= 30
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Can we distribute the money according to the rules if we give 'k' children exactly 8 dollars?
 * Hint 2: Brute force to find the largest possible value of k, or return -1 if there doesn’t exist any such k.
 *
 * <h2>Approach</h2>
 * Think about the category (Math, Greedy).
 *
 * @see <a href="https://leetcode.com/problems/distribute-money-to-maximum-children/">LeetCode #2591</a>
  *
  * <p><b>Explanation:</b> Tracks the running minimum in a single O(n) scan.</p>
  */
public class DistributeMoneyToMaximumChildren {

    /**
     * Computes the minimum Min split.
     *
     * @param n the n (int)
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Tracks the running minimum in a single O(n) scan.</p>
      */
    public int minSplit(int n) {
        if (n<=1) return n;
        int splits=0, left=n;
        int[] fibs=getFibs(n);
        for (int i=fibs.length-1;i>=0&&left>0;i--) while (left>=fibs[i]) { left-=fibs[i]; splits++; }
        return splits;
    }
    private int[] getFibs(int n) {
        java.util.List<Integer> fibs=new java.util.ArrayList<>();
        int a=1,b=2; fibs.add(a); fibs.add(b);
        while (b<=n) { int c=a+b; a=b; b=c; if (b<=n) fibs.add(b); }
        return fibs.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        DistributeMoneyToMaximumChildren sol = new DistributeMoneyToMaximumChildren();
                System.out.println(sol.minSplit(8));  // 1 (Fibonacci numbers)
                System.out.println(sol.minSplit(10)); // 2
                System.out.println(sol.minSplit(11)); // 2
    }
}
