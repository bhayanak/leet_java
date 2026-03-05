package org.leetcode.easy;


/**
 * <b>#1160 - Find Words That Can Be Formed by Characters</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Hash Table, String, Counting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an array of strings words and a string chars.
 *
 *
 * A string is good if it can be formed by characters from chars (each character can only be used once for each word in words).
 *
 *
 * Return the sum of lengths of all good strings in words.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: words = ["cat","bt","hat","tree"], chars = "atach"
 * Output: 6
 * Explanation: The strings that can be formed are "cat" and "hat" so the answer is 3 + 3 = 6.
 *
 * Example 2:
 *
 * Input: words = ["hello","world","leetcode"], chars = "welldonehoneyr"
 * Output: 10
 * Explanation: The strings that can be formed are "hello" and "world" so the answer is 5 + 5 = 10.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= words.length &lt;= 1000
 *
 * 1 &lt;= words[i].length, chars.length &lt;= 100
 *
 * words[i] and chars consist of lowercase English letters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Solve the problem for each string in <code>words</code> independently.
 * Hint 2: Now try to think in frequency of letters.
 * Hint 3: Count how many times each character occurs in string <code>chars</code>.
 * Hint 4: To form a string using characters from <code>chars</code>, the frequency of each character in <code>chars</code> must be greater than or equal the frequency of that character in the string to be formed.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, String, Counting).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/find-words-that-can-be-formed-by-characters/">LeetCode #1160</a>
  *
  * <p><b>Explanation:</b> Iterates once, incrementing a counter each time the target condition is satisfied.</p>
  */
public class FindWordsThatCanBeFormedByCharacters {

    /**
     * Counts Count characters.
     *
     * @param words the words (String[])
     * @param chars the chars (String)
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Iterates once, incrementing a counter each time the target condition is satisfied.</p>
      */
    public int countCharacters(String[] words, String chars) {
        int[] pool = new int[26];
        for (char c : chars.toCharArray()) pool[c-'a']++;
        int total = 0;
        for (String word : words) {
            int[] cnt = new int[26];
            for (char c : word.toCharArray()) cnt[c-'a']++;
            boolean ok = true;
            for (int i=0;i<26;i++) if (cnt[i]>pool[i]) { ok=false; break; }
            if (ok) total += word.length();
        }
        return total;
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac FindWordsThatCanBeFormedByCharacters.java &amp;&amp; java org.leetcode.easy.FindWordsThatCanBeFormedByCharacters</pre>
      *
      * <p><b>Explanation:</b> Processes the string character by character, applying the transformation or predicate.</p>
      */
    public static void main(String[] args) {
        FindWordsThatCanBeFormedByCharacters sol = new FindWordsThatCanBeFormedByCharacters();
                System.out.println(sol.countCharacters(new String[]{"cat","bt","hat","tree"}, "atach")); // 6
                System.out.println(sol.countCharacters(new String[]{"hello","world","leetcode"}, "welldonehoneyr")); // 10
    }
}
