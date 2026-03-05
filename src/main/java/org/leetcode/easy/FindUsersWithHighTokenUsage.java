package org.leetcode.easy;


/**
 * <b>#3793 - Find Users with High Token Usage</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> General</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Table: prompts
 *
 * +-------------+---------+
 * | Column Name | Type    |
 * +-------------+---------+
 * | user_id     | int     |
 * | prompt      | varchar |
 * | tokens      | int     |
 * +-------------+---------+
 * (user_id, prompt) is the primary key (unique value) for this table.
 * Each row represents a prompt submitted by a user to an AI system along with the number of tokens consumed.
 *
 * Write a solution to analyze AI prompt usage patterns based on the following requirements:
 *
 *
 * For each user, calculate the total number of prompts they have submitted.
 *
 * For each user, calculate the average tokens used per prompt (Rounded to 2 decimal places).
 *
 * Only include users who have submitted at least 3 prompts.
 *
 * Only include users who have submitted at least one prompt with tokens greater than their own average token usage.
 *
 * Return the result table ordered by average tokens in descending order, and then by user_id in ascending order.
 *
 *
 * The result format is in the following example.
 *
 *
 *
 *
 * Example:
 *
 * Input:
 *
 *
 * prompts table:
 *
 * +---------+--------------------------+--------+
 * | user_id | prompt                   | tokens |
 * +---------+--------------------------+--------+
 * | 1       | Write a blog outline     | 120    |
 * | 1       | Generate SQL query       | 80     |
 * | 1       | Summarize an article     | 200    |
 * | 2       | Create resume bullet     | 60     |
 * | 2       | Improve LinkedIn bio     | 70     |
 * | 3       | Explain neural networks  | 300    |
 * | 3       | Generate interview Q&amp;A   | 250    |
 * | 3       | Write cover letter       | 180    |
 * | 3       | Optimize Python code     | 220    |
 * +---------+--------------------------+--------+
 *
 * Output:
 *
 * +---------+---------------+------------+
 * | user_id | prompt_count  | avg_tokens |
 * +---------+---------------+------------+
 * | 3       | 4             | 237.5      |
 * | 1       | 3             | 133.33     |
 * +---------+---------------+------------+
 *
 * Explanation:
 *
 *
 * User 1:
 *
 *
 *
 *
 * Total prompts = 3
 *
 * Average tokens = (120 + 80 + 200) / 3 = 133.33
 *
 * Has a prompt with 200 tokens, which is greater than the average
 *
 * Included in the result
 *
 *
 *
 * User 2:
 *
 *
 *
 * Total prompts = 2 (less than the required minimum)
 *
 * Excluded from the result
 *
 *
 *
 * User 3:
 *
 *
 *
 * Total prompts = 4
 *
 * Average tokens = (300 + 250 + 180 + 220) / 4 = 237.5
 *
 * Has prompts with 300 and 250 tokens, both greater than the average
 *
 * Included in the result
 *
 *
 *
 * The Results table is ordered by avg_tokens in descending order, then by user_id in ascending order
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints -- trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (General).
 *
 * @see <a href="https://leetcode.com/problems/find-users-with-high-token-usage/">LeetCode #3793</a>
  *
  * <p><b>Explanation:</b> Sorts the input first to simplify subsequent search or comparison steps.</p>
  */
public class FindUsersWithHighTokenUsage {

    /**
     * Counts Count good droplets.
     * Sorts the input first to enable efficient processing.
     *
     * @param nums the nums (int[])
     * @param k the k (int)
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Sorts the input first to simplify subsequent search or comparison steps.</p>
      */
    public int countGoodDroplets(int[] nums, int k) {
        int cnt=0, n=nums.length;
        for (int i=0;i<n-k+1;i++) {
            int[] sub=java.util.Arrays.copyOfRange(nums,i,i+k);
            java.util.Arrays.sort(sub);
            if (sub[k-1]-sub[0]<=1) cnt++;
        }
        return cnt;
    }

    public static void main(String[] args) {
        FindUsersWithHighTokenUsage sol = new FindUsersWithHighTokenUsage();
        System.out.println(sol.countGoodDroplets(new int[]{1,2,3}, 0));
    }
}
