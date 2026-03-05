package org.leetcode.medium;


/**
 * <b>#3527 - Find the Most Common Response</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Hash Table, String, Counting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a 2D string array responses where each responses[i] is an array of strings representing survey responses from the ith day.
 *
 *
 * Return the most common response across all days after removing duplicate responses within each responses[i]. If there is a tie, return the lexicographically smallest response.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: responses = [["good","ok","good","ok"],["ok","bad","good","ok","ok"],["good"],["bad"]]
 *
 *
 * Output: "good"
 *
 *
 * Explanation:
 *
 *
 * After removing duplicates within each list, responses = [["good", "ok"], ["ok", "bad", "good"], ["good"], ["bad"]].
 *
 * "good" appears 3 times, "ok" appears 2 times, and "bad" appears 2 times.
 *
 * Return "good" because it has the highest frequency.
 *
 * Example 2:
 *
 * Input: responses = [["good","ok","good"],["ok","bad"],["bad","notsure"],["great","good"]]
 *
 *
 * Output: "bad"
 *
 *
 * Explanation:
 *
 *
 * After removing duplicates within each list we have responses = [["good", "ok"], ["ok", "bad"], ["bad", "notsure"], ["great", "good"]].
 *
 * "bad", "good", and "ok" each occur 2 times.
 *
 * The output is "bad" because it is the lexicographically smallest amongst the words with the highest frequency.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= responses.length &lt;= 1000
 *
 * 1 &lt;= responses[i].length &lt;= 1000
 *
 * 1 &lt;= responses[i][j].length &lt;= 10
 *
 * responses[i][j] consists of only lowercase English letters
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use a HashMap.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, String, Counting).
 *
 * @see <a href="https://leetcode.com/problems/find-the-most-common-response/">LeetCode #3527</a>
 */
public class FindTheMostCommonResponse {

    /**
     * Finds Find champion2.
     *
     * @param n the n (int)
     * @param edges the edges (int[][])
     * @return the computed int result
     */
    public int findChampion2(int n, int[][] edges) {
        int[] inDeg=new int[n];
        for (int[] e:edges) inDeg[e[1]]++;
        int champ=-1, cnt=0;
        for (int i=0;i<n;i++) if (inDeg[i]==0) { champ=i; cnt++; }
        return cnt==1?champ:-1;
    }

    public static void main(String[] args) {
        FindTheMostCommonResponse sol = new FindTheMostCommonResponse();
        System.out.println(sol.findChampion2(0, new int[][]{{1,2},{3,4}}));
    }
}
