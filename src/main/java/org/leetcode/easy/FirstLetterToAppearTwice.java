package org.leetcode.easy;


/**
 * <b>#2351 - First Letter to Appear Twice</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Hash Table, String, Bit Manipulation, Counting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given a string s consisting of lowercase English letters, return the first letter to appear twice.
 *
 *
 * Note:
 *
 *
 * A letter a appears twice before another letter b if the second occurrence of a is before the second occurrence of b.
 *
 * s will contain at least one letter that appears twice.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "abccbaacz"
 * Output: "c"
 * Explanation:
 * The letter 'a' appears on the indexes 0, 5 and 6.
 * The letter 'b' appears on the indexes 1 and 4.
 * The letter 'c' appears on the indexes 2, 3 and 7.
 * The letter 'z' appears on the index 8.
 * The letter 'c' is the first letter to appear twice, because out of all the letters the index of its second occurrence is the smallest.
 *
 * Example 2:
 *
 * Input: s = "abcdd"
 * Output: "d"
 * Explanation:
 * The only letter that appears twice is 'd' so we return 'd'.
 *
 *
 *
 * Constraints:
 *
 *
 * 2 &lt;= s.length &lt;= 100
 *
 * s consists of lowercase English letters.
 *
 * s has at least one repeated letter.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Iterate through the string from left to right. Keep track of the elements you have already seen in a set.
 * Hint 2: If the current element is already in the set, return that element.
 *
 * <h2>Approach</h2>
 * Think about the category (Hash Table, String, Bit Manipulation, Counting).
 *
 * @see <a href="https://leetcode.com/problems/first-letter-to-appear-twice/">LeetCode #2351</a>
  *
  * <p><b>Explanation:</b> Processes the string character by character, applying the transformation or predicate.</p>
  */
public class FirstLetterToAppearTwice {

    /**
     * Solves the problem: Repeated character.
     *
     * @param s the s (String)
     * @return the computed char result
      *
      * <p><b>Explanation:</b> Processes the string character by character, applying the transformation or predicate.</p>
      */
    public char repeatedCharacter(String s) {
        boolean[] seen=new boolean[26];
        for (char c:s.toCharArray()) { if (seen[c-'a']) return c; seen[c-'a']=true; }
        return 0;
    }

    public static void main(String[] args) {
        FirstLetterToAppearTwice sol = new FirstLetterToAppearTwice();
                System.out.println(sol.repeatedCharacter("abccbaacz")); // 'c'
                System.out.println(sol.repeatedCharacter("abcdd"));     // 'd'
    }
}
