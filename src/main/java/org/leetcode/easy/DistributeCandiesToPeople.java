package org.leetcode.easy;


/**
 * <b>#1103 - Distribute Candies to People</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Math, Simulation</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * We distribute some number of candies, to a row of n = num_people people in the following way:
 *
 *
 * We then give 1 candy to the first person, 2 candies to the second person, and so on until we give n candies to the last person.
 *
 *
 * Then, we go back to the start of the row, giving n + 1 candies to the first person, n + 2 candies to the second person, and so on until we give 2 * n candies to the last person.
 *
 *
 * This process repeats (with us giving one more candy each time, and moving to the start of the row after we reach the end) until we run out of candies.  The last person will receive all of our remaining candies (not necessarily one more than the previous gift).
 *
 *
 * Return an array (of length num_people and sum candies) that represents the final distribution of candies.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: candies = 7, num_people = 4
 * Output: [1,2,3,1]
 * Explanation:
 * On the first turn, ans[0] += 1, and the array is [1,0,0,0].
 * On the second turn, ans[1] += 2, and the array is [1,2,0,0].
 * On the third turn, ans[2] += 3, and the array is [1,2,3,0].
 * On the fourth turn, ans[3] += 1 (because there is only one candy left), and the final array is [1,2,3,1].
 *
 * Example 2:
 *
 * Input: candies = 10, num_people = 3
 * Output: [5,2,3]
 * Explanation: 
 * On the first turn, ans[0] += 1, and the array is [1,0,0].
 * On the second turn, ans[1] += 2, and the array is [1,2,0].
 * On the third turn, ans[2] += 3, and the array is [1,2,3].
 * On the fourth turn, ans[0] += 4, and the final array is [5,2,3].
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= candies &lt;= 10^9
 *
 * 1 &lt;= num_people &lt;= 1000
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Give candy to everyone each "turn" first [until you can't], then give candy to one person per turn.
 *
 * <h2>Approach</h2>
 * Think about the category (Math, Simulation).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/distribute-candies-to-people/">LeetCode #1103</a>
  *
  * <p><b>Explanation:</b> Validates the condition by scanning the input and returning false on the first violation.</p>
  */
public class DistributeCandiesToPeople {

    /**
     * Solves the problem: Distribute candies.
     *
     * @param candies the candies (int)
     * @param num_people the num_people (int)
     * @return the computed int[] result
      *
      * <p><b>Explanation:</b> Validates the condition by scanning the input and returning false on the first violation.</p>
      */
    public int[] distributeCandies(int candies, int num_people) {
        int[] res = new int[num_people];
        int give = 1, i = 0;
        while (candies > 0) {
            res[i % num_people] += Math.min(give, candies);
            candies -= give; give++; i++;
        }
        return res;
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac DistributeCandiesToPeople.java &amp;&amp; java org.leetcode.easy.DistributeCandiesToPeople</pre>
      *
      * <p><b>Explanation:</b> Applies a direct mathematical formula, avoiding the need for iteration or extra space.</p>
      */
    public static void main(String[] args) {
        DistributeCandiesToPeople sol = new DistributeCandiesToPeople();
                System.out.println(java.util.Arrays.toString(sol.distributeCandies(7, 4)));  // [1,2,3,1]
                System.out.println(java.util.Arrays.toString(sol.distributeCandies(10, 3))); // [5,2,3]
    }
}
