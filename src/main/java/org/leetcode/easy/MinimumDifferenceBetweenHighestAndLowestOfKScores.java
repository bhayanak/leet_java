package org.leetcode.easy;


/**
 * <b>#1984 - Minimum Difference Between Highest and Lowest of K Scores</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Sliding Window, Sorting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a 0-indexed integer array nums, where nums[i] represents the score of the ith student. You are also given an integer k.
 *
 *
 * Pick the scores of any k students from the array so that the difference between the highest and the lowest of the k scores is minimized.
 *
 *
 * Return the minimum possible difference.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [90], k = 1
 * Output: 0
 * Explanation: There is one way to pick score(s) of one student:
 * - [90]. The difference between the highest and lowest score is 90 - 90 = 0.
 * The minimum possible difference is 0.
 *
 * Example 2:
 *
 * Input: nums = [9,4,1,7], k = 2
 * Output: 2
 * Explanation: There are six ways to pick score(s) of two students:
 * - [9,4,1,7]. The difference between the highest and lowest score is 9 - 4 = 5.
 * - [9,4,1,7]. The difference between the highest and lowest score is 9 - 1 = 8.
 * - [9,4,1,7]. The difference between the highest and lowest score is 9 - 7 = 2.
 * - [9,4,1,7]. The difference between the highest and lowest score is 4 - 1 = 3.
 * - [9,4,1,7]. The difference between the highest and lowest score is 7 - 4 = 3.
 * - [9,4,1,7]. The difference between the highest and lowest score is 7 - 1 = 6.
 * The minimum possible difference is 2.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= k &lt;= nums.length &lt;= 1000
 *
 * 0 &lt;= nums[i] &lt;= 105
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: For the difference between the highest and lowest element to be minimized, the k chosen scores need to be as close to each other as possible.
 * Hint 2: What if the array was sorted?
 * Hint 3: After sorting the scores, any contiguous k scores are as close to each other as possible.
 * Hint 4: Apply a sliding window solution to iterate over each contiguous k scores, and find the minimum of the differences of all windows.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Sliding Window, Sorting).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/minimum-difference-between-highest-and-lowest-of-k-scores/">LeetCode #1984</a>
  *
  * <p><b>Explanation:</b> Sorts the input first to simplify subsequent search or comparison steps.</p>
  */
public class MinimumDifferenceBetweenHighestAndLowestOfKScores {

    /**
     * Solves the problem: Minimum difference.
     * Sorts the input first to enable efficient processing.
     *
     * @param nums the nums (int[])
     * @param k the k (int)
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Sorts the input first to simplify subsequent search or comparison steps.</p>
      */
    public int minimumDifference(int[] nums, int k) {
        java.util.Arrays.sort(nums);
        int min=Integer.MAX_VALUE;
        for (int i=0;i+k-1<nums.length;i++)
            min=Math.min(min, nums[i+k-1]-nums[i]);
        return min;
    }

    /**
     * Runs sample test cases.
      *
      * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
      */
    public static void main(String[] args) {
        MinimumDifferenceBetweenHighestAndLowestOfKScores sol = new MinimumDifferenceBetweenHighestAndLowestOfKScores();
                System.out.println(sol.minimumDifference(new int[]{90},1)); // 0
                System.out.println(sol.minimumDifference(new int[]{9,4,1,7},2)); // 2
    }
}
