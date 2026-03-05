package org.leetcode.easy;


/**
 * <b>#3330 - Find the Original Typed String I</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> String</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Alice is attempting to type a specific string on her computer. However, she tends to be clumsy and may press a key for too long, resulting in a character being typed multiple times.
 *
 *
 * Although Alice tried to focus on her typing, she is aware that she may still have done this at most once.
 *
 *
 * You are given a string word, which represents the final output displayed on Alice's screen.
 *
 *
 * Return the total number of possible original strings that Alice might have intended to type.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: word = "abbcccc"
 *
 *
 * Output: 5
 *
 *
 * Explanation:
 *
 *
 * The possible strings are: "abbcccc", "abbccc", "abbcc", "abbc", and "abcccc".
 *
 * Example 2:
 *
 * Input: word = "abcd"
 *
 *
 * Output: 1
 *
 *
 * Explanation:
 *
 *
 * The only possible string is "abcd".
 *
 * Example 3:
 *
 * Input: word = "aaaa"
 *
 *
 * Output: 4
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= word.length &lt;= 100
 *
 * word consists only of lowercase English letters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Any group of consecutive characters might have been the mistake.
 *
 * <h2>Approach</h2>
 * Think about the category (String).
 *
 * @see <a href="https://leetcode.com/problems/find-the-original-typed-string-i/">LeetCode #3330</a>
  *
  * <p><b>Explanation:</b> Iterates once, incrementing a counter each time the target condition is satisfied.</p>
  */
public class FindTheOriginalTypedStringI {

    /**
     * Solves the problem: Possible string count.
     *
     * @param word the word (String)
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Iterates once, incrementing a counter each time the target condition is satisfied.</p>
      */
    public int possibleStringCount(String word) {
        int cnt=1;
        for (int i=1;i<word.length();i++) if (word.charAt(i)==word.charAt(i-1)) cnt++;
        return cnt;
    }

    public static void main(String[] args) {
        FindTheOriginalTypedStringI sol = new FindTheOriginalTypedStringI();
        System.out.println(sol.possibleStringCount("hello"));
    }
}
