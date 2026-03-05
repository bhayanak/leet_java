package org.leetcode.easy;


/**
 * <b>#3304 - Find the K-th Character in String Game I</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Math, Bit Manipulation, Recursion, Simulation</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Alice and Bob are playing a game. Initially, Alice has a string word = "a".
 *
 *
 * You are given a positive integer k.
 *
 *
 * Now Bob will ask Alice to perform the following operation forever:
 *
 *
 * Generate a new string by changing each character in word to its next character in the English alphabet, and append it to the original word.
 *
 * For example, performing the operation on "c" generates "cd" and performing the operation on "zb" generates "zbac".
 *
 *
 * Return the value of the kth character in word, after enough operations have been done for word to have at least k characters.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: k = 5
 *
 *
 * Output: "b"
 *
 *
 * Explanation:
 *
 *
 * Initially, word = "a". We need to do the operation three times:
 *
 *
 * Generated string is "b", word becomes "ab".
 *
 * Generated string is "bc", word becomes "abbc".
 *
 * Generated string is "bccd", word becomes "abbcbccd".
 *
 * Example 2:
 *
 * Input: k = 10
 *
 *
 * Output: "c"
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= k &lt;= 500
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: The constraints are small. Construct the string by simulating the operations.
 *
 * <h2>Approach</h2>
 * Think about the category (Math, Bit Manipulation, Recursion, Simulation).
 *
 * @see <a href="https://leetcode.com/problems/find-the-k-th-character-in-string-game-i/">LeetCode #3304</a>
  *
  * <p><b>Explanation:</b> Uses StringBuilder for O(1) amortized character appends, avoiding O(n^2) String concatenation.</p>
  */
public class FindTheKThCharacterInStringGameI {

    /**
     * Solves the problem: Kth character.
     *
     * @param k the k (int)
     * @return the computed char result
      *
      * <p><b>Explanation:</b> Uses StringBuilder for O(1) amortized character appends, avoiding O(n^2) String concatenation.</p>
      */
    public char kthCharacter(int k) {
        String s="a";
        while (s.length()<k) {
            StringBuilder next=new StringBuilder(s);
            for (char c:s.toCharArray()) next.append((char)((c-'a'+1)%26+'a'));
            s=next.toString();
        }
        return s.charAt(k-1);
    }

    public static void main(String[] args) {
        FindTheKThCharacterInStringGameI sol = new FindTheKThCharacterInStringGameI();
        System.out.println(sol.kthCharacter(0));
    }
}
