package org.leetcode.easy;


/**
 * <b>#2379 - Minimum Recolors to Get K Consecutive Black Blocks</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> String, Sliding Window</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a 0-indexed string blocks of length n, where blocks[i] is either 'W' or 'B', representing the color of the ith block. The characters 'W' and 'B' denote the colors white and black, respectively.
 *
 *
 * You are also given an integer k, which is the desired number of consecutive black blocks.
 *
 *
 * In one operation, you can recolor a white block such that it becomes a black block.
 *
 *
 * Return the minimum number of operations needed such that there is at least one occurrence of k consecutive black blocks.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: blocks = "WBBWWBBWBW", k = 7
 * Output: 3
 * Explanation:
 * One way to achieve 7 consecutive black blocks is to recolor the 0th, 3rd, and 4th blocks
 * so that blocks = "BBBBBBBWBW". 
 * It can be shown that there is no way to achieve 7 consecutive black blocks in less than 3 operations.
 * Therefore, we return 3.
 *
 * Example 2:
 *
 * Input: blocks = "WBWBBBW", k = 2
 * Output: 0
 * Explanation:
 * No changes need to be made, since 2 consecutive black blocks already exist.
 * Therefore, we return 0.
 *
 *
 *
 * Constraints:
 *
 *
 * n == blocks.length
 *
 * 1 &lt;= n &lt;= 100
 *
 * blocks[i] is either 'W' or 'B'.
 *
 * 1 &lt;= k &lt;= n
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Iterate through all possible consecutive substrings of k characters.
 * Hint 2: Find the number of changes for each substring to make all blocks black, and return the minimum of these.
 *
 * <h2>Approach</h2>
 * Think about the category (String, Sliding Window).
 *
 * @see <a href="https://leetcode.com/problems/minimum-recolors-to-get-k-consecutive-black-blocks/">LeetCode #2379</a>
  *
  * <p><b>Explanation:</b> Tracks the running minimum in a single O(n) scan.</p>
  */
public class MinimumRecolorsToGetKConsecutiveBlackBlocks {

    /**
     * Solves the problem: Minimum recolors.
     *
     * @param blocks the blocks (String)
     * @param k the k (int)
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Tracks the running minimum in a single O(n) scan.</p>
      */
    public int minimumRecolors(String blocks, int k) {
        int whites=0, min=Integer.MAX_VALUE;
        for (int i=0;i<blocks.length();i++) {
            if (blocks.charAt(i)=='W') whites++;
            if (i>=k && blocks.charAt(i-k)=='W') whites--;
            if (i>=k-1) min=Math.min(min,whites);
        }
        return min;
    }

    public static void main(String[] args) {
        MinimumRecolorsToGetKConsecutiveBlackBlocks sol = new MinimumRecolorsToGetKConsecutiveBlackBlocks();
                System.out.println(sol.minimumRecolors("WBBWWBBWBW",7)); // 3
                System.out.println(sol.minimumRecolors("WBWBBBW",2)); // 0
    }
}
