package org.leetcode.medium;


/**
 * <b>#1894 - Find the Student that Will Replace the Chalk</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Binary Search, Simulation, Prefix Sum</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * There are n students in a class numbered from 0 to n - 1. The teacher will give each student a problem starting with the student number 0, then the student number 1, and so on until the teacher reaches the student number n - 1. After that, the teacher will restart the process, starting with the student number 0 again.
 *
 *
 * You are given a 0-indexed integer array chalk and an integer k. There are initially k pieces of chalk. When the student number i is given a problem to solve, they will use chalk[i] pieces of chalk to solve that problem. However, if the current number of chalk pieces is strictly less than chalk[i], then the student number i will be asked to replace the chalk.
 *
 *
 * Return the index of the student that will replace the chalk pieces.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: chalk = [5,1,5], k = 22
 * Output: 0
 * Explanation: The students go in turns as follows:
 * - Student number 0 uses 5 chalk, so k = 17.
 * - Student number 1 uses 1 chalk, so k = 16.
 * - Student number 2 uses 5 chalk, so k = 11.
 * - Student number 0 uses 5 chalk, so k = 6.
 * - Student number 1 uses 1 chalk, so k = 5.
 * - Student number 2 uses 5 chalk, so k = 0.
 * Student number 0 does not have enough chalk, so they will have to replace it.
 *
 * Example 2:
 *
 * Input: chalk = [3,4,1,2], k = 25
 * Output: 1
 * Explanation: The students go in turns as follows:
 * - Student number 0 uses 3 chalk so k = 22.
 * - Student number 1 uses 4 chalk so k = 18.
 * - Student number 2 uses 1 chalk so k = 17.
 * - Student number 3 uses 2 chalk so k = 15.
 * - Student number 0 uses 3 chalk so k = 12.
 * - Student number 1 uses 4 chalk so k = 8.
 * - Student number 2 uses 1 chalk so k = 7.
 * - Student number 3 uses 2 chalk so k = 5.
 * - Student number 0 uses 3 chalk so k = 2.
 * Student number 1 does not have enough chalk, so they will have to replace it.
 *
 *
 *
 * Constraints:
 *
 *
 * chalk.length == n
 *
 * 1 &lt;= n &lt;= 105
 *
 * 1 &lt;= chalk[i] &lt;= 105
 *
 * 1 &lt;= k &lt;= 109
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Subtract the sum of chalk from k until k is less than the sum of chalk.
 * Hint 2: Now iterate over the array. If chalk[i] is less than k, this is the answer. Otherwise, subtract chalk[i] from k and continue.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Binary Search, Simulation, Prefix Sum).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/find-the-student-that-will-replace-the-chalk/">LeetCode #1894</a>
 */
public class FindTheStudentThatWillReplaceTheChalk {

    /**
     * Solves the problem: Chalk replacer.
     *
     * @param chalk the chalk (int[])
     * @param k the k (int)
     * @return the computed int result
     */
    public int chalkReplacer(int[] chalk, int k) {
        long total=0; for (int c:chalk) total+=c;
        k=(int)(k%total);
        for (int i=0;i<chalk.length;i++) {
            k-=chalk[i];
            if (k<0) return i;
        }
        return 0;
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        FindTheStudentThatWillReplaceTheChalk sol = new FindTheStudentThatWillReplaceTheChalk();
                System.out.println(sol.chalkReplacer(new int[]{5,1,5},22)); // 0
                System.out.println(sol.chalkReplacer(new int[]{3,4,1,2},25)); // 1
    }
}
