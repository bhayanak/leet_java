package org.leetcode.hard;


/**
 * <b>#3704 - Count No-Zero Pairs That Sum to N</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Math, Dynamic Programming</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * A no-zero integer is a positive integer that does not contain the digit 0 in its decimal representation.
 *
 *
 * Given an integer n, count the number of pairs (a, b) where:
 *
 *
 * a and b are no-zero integers.
 *
 * a + b = n
 *
 * Return an integer denoting the number of such pairs.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: n = 2
 *
 *
 * Output: 1
 *
 *
 * Explanation:
 *
 *
 * The only pair is (1, 1).
 *
 * Example 2:
 *
 * Input: n = 3
 *
 *
 * Output: 2
 *
 *
 * Explanation:
 *
 *
 * The pairs are (1, 2) and (2, 1).
 *
 * Example 3:
 *
 * Input: n = 11
 *
 *
 * Output: 8
 *
 *
 * Explanation:
 *
 *
 * The pairs are (2, 9), (3, 8), (4, 7), (5, 6), (6, 5), (7, 4), (8, 3), and (9, 2). Note that (1, 10) and (10, 1) do not satisfy the conditions because 10 contains 0 in its decimal representation.
 *
 *
 *
 * Constraints:
 *
 *
 * 2 &lt;= n &lt;= 1015
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use digit DP over the decimal representation of <code>n</code>.
 * Hint 2: At each digit, track whether a carry is present and whether <code>a</code> or <code>b</code> has used a zero so far.
 * Hint 3: Transition by choosing digits for <code>a</code> and <code>b</code> that add up (with carry) to the current digit of <code>n</code>.
 * Hint 4: Subtract the cases where either number ends up being zero-containing when <code>n</code> itself is no-zero.
 *
 * <h2>Approach</h2>
 * Think about the category (Math, Dynamic Programming).
 *
 * @see <a href="https://leetcode.com/problems/count-no-zero-pairs-that-sum-to-n/">LeetCode #3704</a>
 */
public class CountNoZeroPairsThatSumToN {

    /**
     * Solves the problem: Smallest chair.
     * Uses a heap/priority queue for efficient ordering.
     *
     * @param times the times (int[][])
     * @param targetFriend the targetFriend (int)
     * @return the computed int result
     */
    public int smallestChair(int[][] times, int targetFriend) {
        java.util.Arrays.sort(times,(a,b)->a[0]-b[0]);
        java.util.PriorityQueue<int[]> inUse=new java.util.PriorityQueue<>((a,b)->a[0]-b[0]);
        java.util.PriorityQueue<Integer> available=new java.util.PriorityQueue<>();
        for (int i=0;i<times.length;i++) available.add(i);
        int targetArr=times[targetFriend][0];
        for (int[] t:times) {
            while(!inUse.isEmpty()&&inUse.peek()[0]<=t[0]) available.add(inUse.poll()[1]);
            int chair=available.poll();
            if (t[0]==targetArr) return chair;
            inUse.add(new int[]{t[1],chair});
        }
        return -1;
    }

    public static void main(String[] args) {
        CountNoZeroPairsThatSumToN sol = new CountNoZeroPairsThatSumToN();
        System.out.println(sol.smallestChair(new int[][]{{1,2},{3,4}}, 0));
    }
}
