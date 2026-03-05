package org.leetcode.medium;


/**
 * <b>#1744 - Can You Eat Your Favorite Candy on Your Favorite Day?</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Prefix Sum</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a (0-indexed) array of positive integers candiesCount where candiesCount[i] represents the number of candies of the ith type you have. You are also given a 2D array queries where queries[i] = [favoriteTypei, favoriteDayi, dailyCapi].
 *
 *
 * You play a game with the following rules:
 *
 *
 * You start eating candies on day 0.
 *
 * You cannot eat any candy of type i unless you have eaten all candies of type i - 1.
 *
 * You must eat at least one candy per day until you have eaten all the candies.
 *
 * Construct a boolean array answer such that answer.length == queries.length and answer[i] is true if you can eat a candy of type favoriteTypei on day favoriteDayi without eating more than dailyCapi candies on any day, and false otherwise. Note that you can eat different types of candy on the same day, provided that you follow rule 2.
 *
 *
 * Return the constructed array answer.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: candiesCount = [7,4,5,3,8], queries = [[0,2,2],[4,2,4],[2,13,1000000000]]
 * Output: [true,false,true]
 * Explanation:
 * 1- If you eat 2 candies (type 0) on day 0 and 2 candies (type 0) on day 1, you will eat a candy of type 0 on day 2.
 * 2- You can eat at most 4 candies each day.
 *    If you eat 4 candies every day, you will eat 4 candies (type 0) on day 0 and 4 candies (type 0 and type 1) on day 1.
 *    On day 2, you can only eat 4 candies (type 1 and type 2), so you cannot eat a candy of type 4 on day 2.
 * 3- If you eat 1 candy each day, you will eat a candy of type 2 on day 13.
 *
 * Example 2:
 *
 * Input: candiesCount = [5,2,6,4,1], queries = [[3,1,2],[4,10,3],[3,10,100],[4,100,30],[1,3,1]]
 * Output: [false,true,true,false,false]
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= candiesCount.length &lt;= 105
 *
 * 1 &lt;= candiesCount[i] &lt;= 105
 *
 * 1 &lt;= queries.length &lt;= 105
 *
 * queries[i].length == 3
 *
 * 0 &lt;= favoriteTypei &lt; candiesCount.length
 *
 * 0 &lt;= favoriteDayi &lt;= 109
 *
 * 1 &lt;= dailyCapi &lt;= 109
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: The query is true if and only if your favorite day is in between the earliest and latest possible days to eat your favorite candy.
 * Hint 2: To get the earliest day, you need to eat dailyCap candies every day. To get the latest day, you need to eat 1 candy every day.
 * Hint 3: The latest possible day is the total number of candies with a smaller type plus the number of your favorite candy minus 1.
 * Hint 4: The earliest possible day that you can eat your favorite candy is the total number of candies with a smaller type divided by dailyCap.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Prefix Sum).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/can-you-eat-your-favorite-candy-on-your-favorite-day/">LeetCode #1744</a>
 */
public class CanYouEatYourFavoriteCandyOnYourFavoriteDay {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Can You Eat Your Favorite Candy on Your Favorite Day?");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== CanYouEatYourFavoriteCandyOnYourFavoriteDay ===");
        CanYouEatYourFavoriteCandyOnYourFavoriteDay sol = new CanYouEatYourFavoriteCandyOnYourFavoriteDay();
        System.out.println(sol.solve(null));
    }
}
