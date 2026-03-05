package org.leetcode.easy;


/**
 * <b>#953 - Verifying an Alien Dictionary</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Hash Table, String</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * In an alien language, surprisingly, they also use English lowercase letters, but possibly in a different order. The order of the alphabet is some permutation of lowercase letters.
 *
 *
 * Given a sequence of words written in the alien language, and the order of the alphabet, return true if and only if the given words are sorted lexicographically in this alien language.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: words = ["hello","leetcode"], order = "hlabcdefgijkmnopqrstuvwxyz"
 * Output: true
 * Explanation: As 'h' comes before 'l' in this language, then the sequence is sorted.
 *
 * Example 2:
 *
 * Input: words = ["word","world","row"], order = "worldabcefghijkmnpqstuvxyz"
 * Output: false
 * Explanation: As 'd' comes after 'l' in this language, then words[0] &gt; words[1], hence the sequence is unsorted.
 *
 * Example 3:
 *
 * Input: words = ["apple","app"], order = "abcdefghijklmnopqrstuvwxyz"
 * Output: false
 * Explanation: The first three characters "app" match, and the second string is shorter (in size.) According to lexicographical rules "apple" &gt; "app", because 'l' &gt; '∅', where '∅' is defined as the blank character which is less than any other character (More info).
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= words.length &lt;= 100
 *
 * 1 &lt;= words[i].length &lt;= 20
 *
 * order.length == 26
 *
 * All characters in words[i] and order are English lowercase letters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, String).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/verifying-an-alien-dictionary/">LeetCode #953</a>
  *
  * <p><b>Explanation:</b> Sorts using the natural order or a custom comparator.</p>
  */
public class VerifyingAnAlienDictionary {

    /**
     * Returns true if Is alien sorted.
     * Sorts the input first to enable efficient processing.
     *
     * @param words the words (String[])
     * @param order the order (String)
     * @return the computed boolean result
      *
      * <p><b>Explanation:</b> Sorts using the natural order or a custom comparator.</p>
      */
    public boolean isAlienSorted(String[] words, String order) {
        int[] rank = new int[26];
        for (int i = 0; i < order.length(); i++) rank[order.charAt(i)-'a'] = i;
        for (int i = 0; i < words.length-1; i++) {
            String a = words[i], b = words[i+1];
            int len = Math.min(a.length(), b.length());
            boolean found = false;
            for (int j = 0; j < len; j++) {
                int ra = rank[a.charAt(j)-'a'], rb = rank[b.charAt(j)-'a'];
                if (ra < rb) { found = true; break; }
                if (ra > rb) return false;
            }
            if (!found && a.length() > b.length()) return false;
        }
        return true;
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac VerifyingAnAlienDictionary.java &amp;&amp; java org.leetcode.easy.VerifyingAnAlienDictionary</pre>
      *
      * <p><b>Explanation:</b> Processes the string character by character, applying the transformation or predicate.</p>
      */
    public static void main(String[] args) {
        VerifyingAnAlienDictionary sol = new VerifyingAnAlienDictionary();
                System.out.println(sol.isAlienSorted(new String[]{"hello","leetcode"}, "hlabcdefgijkmnopqrstuvwxyz")); // true
                System.out.println(sol.isAlienSorted(new String[]{"word","world","row"}, "worldabcefghijkmnpqstuvxyz")); // false
                System.out.println(sol.isAlienSorted(new String[]{"apple","app"}, "abcdefghijklmnopqrstuvwxyz")); // false
    }
}
