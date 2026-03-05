package org.leetcode.easy;


/**
 * <b>#2315 - Count Asterisks</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> String</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a string s, where every two consecutive vertical bars '|' are grouped into a pair. In other words, the 1st and 2nd '|' make a pair, the 3rd and 4th '|' make a pair, and so forth.
 *
 *
 * Return the number of '*' in s, excluding the '*' between each pair of '|'.
 *
 *
 * Note that each '|' will belong to exactly one pair.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s = "l|*e*et|c**o|*de|"
 * Output: 2
 * Explanation: The considered characters are underlined: "l|*e*et|c**o|*de|".
 * The characters between the first and second '|' are excluded from the answer.
 * Also, the characters between the third and fourth '|' are excluded from the answer.
 * There are 2 asterisks considered. Therefore, we return 2.
 *
 * Example 2:
 *
 * Input: s = "iamprogrammer"
 * Output: 0
 * Explanation: In this example, there are no asterisks in s. Therefore, we return 0.
 *
 * Example 3:
 *
 * Input: s = "yo|uar|e**|b|e***au|tifu|l"
 * Output: 5
 * Explanation: The considered characters are underlined: "yo|uar|e**|b|e***au|tifu|l". There are 5 asterisks considered. Therefore, we return 5.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= s.length &lt;= 1000
 *
 * s consists of lowercase English letters, vertical bars '|', and asterisks '*'.
 *
 * s contains an even number of vertical bars '|'.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Iterate through each character, while maintaining whether we are currently between a pair of ‘|’ or not.
 * Hint 2: If we are not in between a pair of ‘|’ and there is a ‘*’, increment the answer by 1.
 *
 * <h2>Approach</h2>
 * Think about the category (String).
 *
 * @see <a href="https://leetcode.com/problems/count-asterisks/">LeetCode #2315</a>
  *
  * <p><b>Explanation:</b> Iterates once, incrementing a counter each time the target condition is satisfied.</p>
  */
public class CountAsterisks {

    /**
     * Counts Count asterisks.
     *
     * @param s the s (String)
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Iterates once, incrementing a counter each time the target condition is satisfied.</p>
      */
    public int countAsterisks(String s) {
        int cnt=0; boolean inside=false;
        for (char c:s.toCharArray()) {
            if (c=='|') inside=!inside;
            else if (c=='*'&&!inside) cnt++;
        }
        return cnt;
    }

    public static void main(String[] args) {
        CountAsterisks sol = new CountAsterisks();
                System.out.println(sol.countAsterisks("l|*e*et|c**o|*de|")); // 2
                System.out.println(sol.countAsterisks("iamprogrammer")); // 0
    }
}
