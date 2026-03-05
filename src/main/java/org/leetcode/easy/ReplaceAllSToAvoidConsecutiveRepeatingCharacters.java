package org.leetcode.easy;


/**
 * <b>#1576 - Replace All ?'s to Avoid Consecutive Repeating Characters</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> String</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given a string s containing only lowercase English letters and the '?' character, convert all the '?' characters into lowercase letters such that the final string does not contain any consecutive repeating characters. You cannot modify the non '?' characters.
 *
 *
 * It is guaranteed that there are no consecutive repeating characters in the given string except for '?'.
 *
 *
 * Return the final string after all the conversions (possibly zero) have been made. If there is more than one solution, return any of them. It can be shown that an answer is always possible with the given constraints.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s = "?zs"
 * Output: "azs"
 * Explanation: There are 25 solutions for this problem. From "azs" to "yzs", all are valid. Only "z" is an invalid modification as the string will consist of consecutive repeating characters in "zzs".
 *
 * Example 2:
 *
 * Input: s = "ubv?w"
 * Output: "ubvaw"
 * Explanation: There are 24 solutions for this problem. Only "v" and "w" are invalid modifications as the strings will consist of consecutive repeating characters in "ubvvw" and "ubvww".
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= s.length &lt;= 100
 *
 * s consist of lowercase English letters and '?'.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Processing string from left to right, whenever you get a ‘?’, check left character and right character, and select a character not equal to either of them
 * Hint 2: Do take care to compare with replaced occurrence of ‘?’ when checking the left character.
 *
 * <h2>Approach</h2>
 * Think about the category (String).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/replace-all-s-to-avoid-consecutive-repeating-characters/">LeetCode #1576</a>
  *
  * <p><b>Explanation:</b> Processes the string character by character, applying the transformation or predicate.</p>
  */
public class ReplaceAllSToAvoidConsecutiveRepeatingCharacters {

    /**
     * Solves the problem: Modify string.
     *
     * @param s the s (String)
     * @return the computed String result
      *
      * <p><b>Explanation:</b> Processes the string character by character, applying the transformation or predicate.</p>
      */
    public String modifyString(String s) {
        char[] arr = s.toCharArray();
        for (int i=0;i<arr.length;i++) {
            if (arr[i]=='?') {
                for (char c='a';c<='c';c++) {
                    if ((i==0||arr[i-1]!=c) && (i==arr.length-1||arr[i+1]!=c)) {
                        arr[i]=c; break;
                    }
                }
            }
        }
        return new String(arr);
    }

    /**
     * Runs sample test cases.
      *
      * <p><b>Explanation:</b> Processes the string character by character, applying the transformation or predicate.</p>
      */
    public static void main(String[] args) {
        ReplaceAllSToAvoidConsecutiveRepeatingCharacters sol = new ReplaceAllSToAvoidConsecutiveRepeatingCharacters();
                System.out.println(sol.modifyString("?zs"));   // e.g. "azs"
                System.out.println(sol.modifyString("ubv?w")); // e.g. "ubvaw"
                System.out.println(sol.modifyString("j?qg??b")); // valid replacement
    }
}
