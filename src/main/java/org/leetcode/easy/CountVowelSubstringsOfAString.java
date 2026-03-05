package org.leetcode.easy;


/**
 * <b>#2062 - Count Vowel Substrings of a String</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Hash Table, String</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * A substring is a contiguous (non-empty) sequence of characters within a string.
 *
 *
 * A vowel substring is a substring that only consists of vowels ('a', 'e', 'i', 'o', and 'u') and has all five vowels present in it.
 *
 *
 * Given a string word, return the number of vowel substrings in word.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: word = "aeiouu"
 * Output: 2
 * Explanation: The vowel substrings of word are as follows (underlined):
 * - "aeiouu"
 * - "aeiouu"
 *
 * Example 2:
 *
 * Input: word = "unicornarihan"
 * Output: 0
 * Explanation: Not all 5 vowels are present, so there are no vowel substrings.
 *
 * Example 3:
 *
 * Input: word = "cuaieuouac"
 * Output: 7
 * Explanation: The vowel substrings of word are as follows (underlined):
 * - "cuaieuouac"
 * - "cuaieuouac"
 * - "cuaieuouac"
 * - "cuaieuouac"
 * - "cuaieuouac"
 * - "cuaieuouac"
 * - "cuaieuouac"
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= word.length &lt;= 100
 *
 * word consists of lowercase English letters only.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: While generating substrings starting at any index, do you need to continue generating larger substrings if you encounter a consonant?
 * Hint 2: Can you store the count of characters to avoid generating substrings altogether?
 *
 * <h2>Approach</h2>
 * Think about the category (Hash Table, String).
 *
 * @see <a href="https://leetcode.com/problems/count-vowel-substrings-of-a-string/">LeetCode #2062</a>
  *
  * <p><b>Explanation:</b> Uses a HashSet to detect duplicates or track seen elements in O(1) per operation.</p>
  */
public class CountVowelSubstringsOfAString {

    /**
     * Counts Count vowel substrings.
     *
     * @param word the word (String)
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Uses a HashSet to detect duplicates or track seen elements in O(1) per operation.</p>
      */
    public int countVowelSubstrings(String word) {
        int count=0, n=word.length();
        String vowels="aeiou";
        for (int i=0;i<n;i++) {
            java.util.Set<Character> seen = new java.util.HashSet<>();
            for (int j=i;j<n;j++) {
                char c=word.charAt(j);
                if (vowels.indexOf(c)<0) break;
                seen.add(c);
                if (seen.size()==5) count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        CountVowelSubstringsOfAString sol = new CountVowelSubstringsOfAString();
                System.out.println(sol.countVowelSubstrings("aeiouu")); // 2
                System.out.println(sol.countVowelSubstrings("unicornarihan")); // 0
                System.out.println(sol.countVowelSubstrings("cuaieuouac")); // 7
    }
}
