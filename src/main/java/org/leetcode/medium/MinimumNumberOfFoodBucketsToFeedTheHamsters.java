package org.leetcode.medium;


/**
 * <b>#2086 - Minimum Number of Food Buckets to Feed the Hamsters</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> String, Dynamic Programming, Greedy</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a 0-indexed string hamsters where hamsters[i] is either:
 *
 *
 * 'H' indicating that there is a hamster at index i, or
 *
 * '.' indicating that index i is empty.
 *
 * You will add some number of food buckets at the empty indices in order to feed the hamsters. A hamster can be fed if there is at least one food bucket to its left or to its right. More formally, a hamster at index i can be fed if you place a food bucket at index i - 1 and/or at index i + 1.
 *
 *
 * Return the minimum number of food buckets you should place at empty indices to feed all the hamsters or -1 if it is impossible to feed all of them.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: hamsters = "H..H"
 * Output: 2
 * Explanation: We place two food buckets at indices 1 and 2.
 * It can be shown that if we place only one food bucket, one of the hamsters will not be fed.
 *
 * Example 2:
 *
 * Input: hamsters = ".H.H."
 * Output: 1
 * Explanation: We place one food bucket at index 2.
 *
 * Example 3:
 *
 * Input: hamsters = ".HHH."
 * Output: -1
 * Explanation: If we place a food bucket at every empty index as shown, the hamster at index 2 will not be able to eat.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= hamsters.length &lt;= 105
 *
 * hamsters[i] is either'H' or '.'.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: When is it impossible to feed all the hamsters?
 * Hint 2: When one or more hamsters do not have an empty space adjacent to it.
 * Hint 3: Assuming all previous hamsters are fed. If there is a hamster at index i and you are able to place a bucket at index i - 1 or i + 1, where should you put it?
 * Hint 4: It is always better to place a bucket at index i + 1 because it can feed the next hamster as well.
 *
 * <h2>Approach</h2>
 * Think about the category (String, Dynamic Programming, Greedy).
 *
 * @see <a href="https://leetcode.com/problems/minimum-number-of-food-buckets-to-feed-the-hamsters/">LeetCode #2086</a>
 */
public class MinimumNumberOfFoodBucketsToFeedTheHamsters {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Minimum Number of Food Buckets to Feed the Hamsters");
    }

    public static void main(String[] args) {
        System.out.println("=== MinimumNumberOfFoodBucketsToFeedTheHamsters ===");
        MinimumNumberOfFoodBucketsToFeedTheHamsters sol = new MinimumNumberOfFoodBucketsToFeedTheHamsters();
        System.out.println(sol.solve(null));
    }
}
