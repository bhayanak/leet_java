package org.leetcode.easy;


/**
 * <b>#2716 - Minimize String Length</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Hash Table, String</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given a string s, you have two types of operation:
 *
 *
 * Choose an index i in the string, and let c be the character in position i. Delete the closest occurrence of c to the left of i (if exists).
 *
 * Choose an index i in the string, and let c be the character in position i. Delete the closest occurrence of c to the right of i (if exists).
 *
 * Your task is to minimize the length of s by performing the above operations zero or more times.
 *
 *
 * Return an integer denoting the length of the minimized string.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s = "aaabc"
 *
 *
 * Output: 3
 *
 *
 * Explanation:
 *
 *
 * Operation 2: we choose i = 1 so c is 'a', then we remove s[2] as it is closest 'a' character to the right of s[1].
 *
 * 	s becomes "aabc" after this.
 *
 * Operation 1: we choose i = 1 so c is 'a', then we remove s[0] as it is closest 'a' character to the left of s[1].
 *
 * 	s becomes "abc" after this.
 *
 * Example 2:
 *
 * Input: s = "cbbd"
 *
 *
 * Output: 3
 *
 *
 * Explanation:
 *
 *
 * Operation 1: we choose i = 2 so c is 'b', then we remove s[1] as it is closest 'b' character to the left of s[1].
 *
 * 	s becomes "cbd" after this.
 *
 * Example 3:
 *
 * Input: s = "baadccab"
 *
 *
 * Output: 4
 *
 *
 * Explanation:
 *
 *
 * Operation 1: we choose i = 6 so c is 'a', then we remove s[2] as it is closest 'a' character to the left of s[6].
 *
 * 	s becomes "badccab" after this.
 *
 * Operation 2: we choose i = 0 so c is 'b', then we remove s[6] as it is closest 'b' character to the right of s[0].
 *
 * 	s becomes "badcca" fter this.
 *
 * Operation 2: we choose i = 3 so c is 'c', then we remove s[4] as it is closest 'c' character to the right of s[3].
 *
 * 	s becomes "badca" after this.
 *
 * Operation 1: we choose i = 4 so c is 'a', then we remove s[1] as it is closest 'a' character to the left of s[4].
 *
 * 	s becomes "bdca" after this.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= s.length &lt;= 100
 *
 * s contains only lowercase English letters
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: The minimized string will not contain duplicate characters.
 * Hint 2: The minimized string will contain all distinct characters of the original string.
 *
 * <h2>Approach</h2>
 * Think about the category (Hash Table, String).
 *
 * @see <a href="https://leetcode.com/problems/minimize-string-length/">LeetCode #2716</a>
  *
  * <p><b>Explanation:</b> Tracks the running minimum in a single O(n) scan.</p>
  */
public class MinimizeStringLength {

    /**
     * Solves the problem: Minimized string length.
     *
     * @param s the s (String)
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Tracks the running minimum in a single O(n) scan.</p>
      */
    public int minimizedStringLength(String s) {
        return (int)s.chars().distinct().count();
    }

    public static void main(String[] args) {
        MinimizeStringLength sol = new MinimizeStringLength();
                System.out.println(sol.minimizedStringLength("aaabc")); // 3
                System.out.println(sol.minimizedStringLength("cbbd"));  // 3
                System.out.println(sol.minimizedStringLength("baadccab")); // 4
    }
}
