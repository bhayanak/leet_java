package org.leetcode.medium;


/**
 * <b>#2381 - Shifting Letters II</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, String, Prefix Sum</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a string s of lowercase English letters and a 2D integer array shifts where shifts[i] = [starti, endi, directioni]. For every i, shift the characters in s from the index starti to the index endi (inclusive) forward if directioni = 1, or shift the characters backward if directioni = 0.
 *
 *
 * Shifting a character forward means replacing it with the next letter in the alphabet (wrapping around so that 'z' becomes 'a'). Similarly, shifting a character backward means replacing it with the previous letter in the alphabet (wrapping around so that 'a' becomes 'z').
 *
 *
 * Return the final string after all such shifts to s are applied.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s = "abc", shifts = [[0,1,0],[1,2,1],[0,2,1]]
 * Output: "ace"
 * Explanation: Firstly, shift the characters from index 0 to index 1 backward. Now s = "zac".
 * Secondly, shift the characters from index 1 to index 2 forward. Now s = "zbd".
 * Finally, shift the characters from index 0 to index 2 forward. Now s = "ace".
 *
 * Example 2:
 *
 * Input: s = "dztz", shifts = [[0,0,0],[1,1,1]]
 * Output: "catz"
 * Explanation: Firstly, shift the characters from index 0 to index 0 backward. Now s = "cztz".
 * Finally, shift the characters from index 1 to index 1 forward. Now s = "catz".
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= s.length, shifts.length &lt;= 5 * 104
 *
 * shifts[i].length == 3
 *
 * 0 &lt;= starti &lt;= endi &lt; s.length
 *
 * 0 &lt;= directioni &lt;= 1
 *
 * s consists of lowercase English letters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Instead of shifting every character in each shift, could you keep track of which characters are shifted and by how much across all shifts?
 * Hint 2: Try marking the start and ends of each shift, then perform a prefix sum of the shifts.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, String, Prefix Sum).
 *
 * @see <a href="https://leetcode.com/problems/shifting-letters-ii/">LeetCode #2381</a>
 */
public class ShiftingLettersIi {

    /**
     * Solves the problem: Shifting letters.
     *
     * @param s the s (String)
     * @param shifts the shifts (int[][])
     * @return the computed String result
     */
    public String shiftingLetters(String s, int[][] shifts) {
        int n=s.length();
        int[] diff=new int[n+1];
        for (int[] sh:shifts) {
            int dir=(sh[2]==1)?1:-1;
            diff[sh[0]]+=dir; diff[sh[1]+1]-=dir;
        }
        char[] arr=s.toCharArray();
        int cur=0;
        for (int i=0;i<n;i++) {
            cur+=diff[i];
            arr[i]=(char)('a'+(arr[i]-'a'+cur%26+26)%26);
        }
        return new String(arr);
    }

    public static void main(String[] args) {
        ShiftingLettersIi sol = new ShiftingLettersIi();
                System.out.println(sol.shiftingLetters("abc",new int[][]{{0,1,0},{1,2,1},{0,2,1}})); // "ace"
                System.out.println(sol.shiftingLetters("dztz",new int[][]{{0,0,0},{1,1,1}})); // "catz"
    }
}
