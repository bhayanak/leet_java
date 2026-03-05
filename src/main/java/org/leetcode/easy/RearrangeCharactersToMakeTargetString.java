package org.leetcode.easy;


/**
 * <b>#2287 - Rearrange Characters to Make Target String</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Hash Table, String, Counting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given two 0-indexed strings s and target. You can take some letters from s and rearrange them to form new strings.
 *
 *
 * Return the maximum number of copies of target that can be formed by taking letters from s and rearranging them.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s = "ilovecodingonleetcode", target = "code"
 * Output: 2
 * Explanation:
 * For the first copy of "code", take the letters at indices 4, 5, 6, and 7.
 * For the second copy of "code", take the letters at indices 17, 18, 19, and 20.
 * The strings that are formed are "ecod" and "code" which can both be rearranged into "code".
 * We can make at most two copies of "code", so we return 2.
 *
 * Example 2:
 *
 * Input: s = "abcba", target = "abc"
 * Output: 1
 * Explanation:
 * We can make one copy of "abc" by taking the letters at indices 0, 1, and 2.
 * We can make at most one copy of "abc", so we return 1.
 * Note that while there is an extra 'a' and 'b' at indices 3 and 4, we cannot reuse the letter 'c' at index 2, so we cannot make a second copy of "abc".
 *
 * Example 3:
 *
 * Input: s = "abbaccaddaeea", target = "aaaaa"
 * Output: 1
 * Explanation:
 * We can make one copy of "aaaaa" by taking the letters at indices 0, 3, 6, 9, and 12.
 * We can make at most one copy of "aaaaa", so we return 1.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= s.length &lt;= 100
 *
 * 1 &lt;= target.length &lt;= 10
 *
 * s and target consist of lowercase English letters.
 *
 *
 *
 * Note: This question is the same as  1189: Maximum Number of Balloons.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Count the frequency of each character in s and target.
 * Hint 2: Consider each letter one at a time. If there are x occurrences of a letter in s and y occurrences of the same letter in target, how many copies of this letter can we make?
 * Hint 3: We can make floor(x / y) copies of the letter.
 *
 * <h2>Approach</h2>
 * Think about the category (Hash Table, String, Counting).
 *
 * @see <a href="https://leetcode.com/problems/rearrange-characters-to-make-target-string/">LeetCode #2287</a>
  *
  * <p><b>Explanation:</b> Processes the string character by character, applying the transformation or predicate.</p>
  */
public class RearrangeCharactersToMakeTargetString {

    /**
     * Solves the problem: Rearrange characters.
     *
     * @param s the s (String)
     * @param target the target (String)
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Processes the string character by character, applying the transformation or predicate.</p>
      */
    public int rearrangeCharacters(String s, String target) {
        int[] sc=new int[26], tc=new int[26];
        for (char c:s.toCharArray()) sc[c-'a']++;
        for (char c:target.toCharArray()) tc[c-'a']++;
        int min=Integer.MAX_VALUE;
        for (int i=0;i<26;i++) if (tc[i]>0) min=Math.min(min,sc[i]/tc[i]);
        return min==Integer.MAX_VALUE?0:min;
    }

    public static void main(String[] args) {
        RearrangeCharactersToMakeTargetString sol = new RearrangeCharactersToMakeTargetString();
                System.out.println(sol.rearrangeCharacters("ilovecodingonleetcode","code")); // 2
                System.out.println(sol.rearrangeCharacters("abcba","abc")); // 1
                System.out.println(sol.rearrangeCharacters("abbaccaddaeea","aaaaa")); // 1
    }
}
