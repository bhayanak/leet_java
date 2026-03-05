package org.leetcode.easy;


/**
 * <b>#1431 - Kids With the Greatest Number of Candies</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * There are n kids with candies. You are given an integer array candies, where each candies[i] represents the number of candies the ith kid has, and an integer extraCandies, denoting the number of extra candies that you have.
 *
 *
 * Return a boolean array result of length n, where result[i] is true if, after giving the ith kid all the extraCandies, they will have the greatest number of candies among all the kids, or false otherwise.
 *
 *
 * Note that multiple kids can have the greatest number of candies.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: candies = [2,3,5,1,3], extraCandies = 3
 * Output: [true,true,true,false,true] 
 * Explanation: If you give all extraCandies to:
 * - Kid 1, they will have 2 + 3 = 5 candies, which is the greatest among the kids.
 * - Kid 2, they will have 3 + 3 = 6 candies, which is the greatest among the kids.
 * - Kid 3, they will have 5 + 3 = 8 candies, which is the greatest among the kids.
 * - Kid 4, they will have 1 + 3 = 4 candies, which is not the greatest among the kids.
 * - Kid 5, they will have 3 + 3 = 6 candies, which is the greatest among the kids.
 *
 * Example 2:
 *
 * Input: candies = [4,2,1,1,2], extraCandies = 1
 * Output: [true,false,false,false,false] 
 * Explanation: There is only 1 extra candy.
 * Kid 1 will always have the greatest number of candies, even if a different kid is given the extra candy.
 *
 * Example 3:
 *
 * Input: candies = [12,1,12], extraCandies = 10
 * Output: [true,false,true]
 *
 *
 *
 * Constraints:
 *
 *
 * n == candies.length
 *
 * 2 &lt;= n &lt;= 100
 *
 * 1 &lt;= candies[i] &lt;= 100
 *
 * 1 &lt;= extraCandies &lt;= 50
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: For each kid check if candies[i] + extraCandies ≥ maximum in Candies[i].
 *
 * <h2>Approach</h2>
 * Think about the category (Array).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/">LeetCode #1431</a>
 */
public class KidsWithTheGreatestNumberOfCandies {

    public java.util.List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        for (int c : candies) max = Math.max(max, c);
        java.util.List<Boolean> res = new java.util.ArrayList<>();
        for (int c : candies) res.add(c + extraCandies >= max);
        return res;
    }

    /**
     * Runs sample test cases.
      *
      * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
      */
    public static void main(String[] args) {
        KidsWithTheGreatestNumberOfCandies sol = new KidsWithTheGreatestNumberOfCandies();
        System.out.println("No method available");
    }
}
