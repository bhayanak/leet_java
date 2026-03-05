package org.leetcode.easy;


/**
 * <b>#2833 - Furthest Point From Origin</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> String, Counting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a string moves of length n consisting only of characters 'L', 'R', and '_'. The string represents your movement on a number line starting from the origin 0.
 *
 *
 * In the ith move, you can choose one of the following directions:
 *
 *
 * move to the left if moves[i] = 'L' or moves[i] = '_'
 *
 * move to the right if moves[i] = 'R' or moves[i] = '_'
 *
 * Return the distance from the origin of the furthest point you can get to after n moves.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: moves = "L_RL__R"
 * Output: 3
 * Explanation: The furthest point we can reach from the origin 0 is point -3 through the following sequence of moves "LLRLLLR".
 *
 * Example 2:
 *
 * Input: moves = "_R__LL_"
 * Output: 5
 * Explanation: The furthest point we can reach from the origin 0 is point -5 through the following sequence of moves "LRLLLLL".
 *
 * Example 3:
 *
 * Input: moves = "_______"
 * Output: 7
 * Explanation: The furthest point we can reach from the origin 0 is point 7 through the following sequence of moves "RRRRRRR".
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= moves.length == n &lt;= 50
 *
 * moves consists only of characters 'L', 'R' and '_'.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: <div class="_1l1MA">In an optimal answer, all occurrences of <code>'_’</code> will be replaced with the <strong>same</strong> character.</div>
 * Hint 2: <div class="_1l1MA">Replace all characters of <code>'_’</code> with the character that occurs the most. </div>
 *
 * <h2>Approach</h2>
 * Think about the category (String, Counting).
 *
 * @see <a href="https://leetcode.com/problems/furthest-point-from-origin/">LeetCode #2833</a>
  *
  * <p><b>Explanation:</b> Tracks the running minimum in a single O(n) scan.</p>
  */
public class FurthestPointFromOrigin {

    /**
     * Computes the minimum Min absolute difference.
     *
     * @param nums the nums (java.util.List&lt;Integer&gt;)
     * @param x the x (int)
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Tracks the running minimum in a single O(n) scan.</p>
      */
    public int minAbsoluteDifference(java.util.List<Integer> nums, int x) {
        java.util.TreeSet<Integer> seen=new java.util.TreeSet<>();
        int min=Integer.MAX_VALUE;
        for (int i=x;i<nums.size();i++) {
            seen.add(nums.get(i-x));
            Integer lo=seen.floor(nums.get(i)), hi=seen.ceiling(nums.get(i));
            if (lo!=null) min=Math.min(min,Math.abs(nums.get(i)-lo));
            if (hi!=null) min=Math.min(min,Math.abs(nums.get(i)-hi));
        }
        return min;
    }

    public static void main(String[] args) {
        FurthestPointFromOrigin sol = new FurthestPointFromOrigin();
        System.out.println(sol.minAbsoluteDifference(null, 0));
    }
}
