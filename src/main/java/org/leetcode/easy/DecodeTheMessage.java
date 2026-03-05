package org.leetcode.easy;


/**
 * <b>#2325 - Decode the Message</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Hash Table, String</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given the strings key and message, which represent a cipher key and a secret message, respectively. The steps to decode message are as follows:
 *
 *
 * Use the first appearance of all 26 lowercase English letters in key as the order of the substitution table.
 *
 * Align the substitution table with the regular English alphabet.
 *
 * Each letter in message is then substituted using the table.
 *
 * Spaces ' ' are transformed to themselves.
 *
 *
 * For example, given key = "happy boy" (actual key would have at least one instance of each letter in the alphabet), we have the partial substitution table of ('h' -&gt; 'a', 'a' -&gt; 'b', 'p' -&gt; 'c', 'y' -&gt; 'd', 'b' -&gt; 'e', 'o' -&gt; 'f').
 *
 * Return the decoded message.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: key = "the quick brown fox jumps over the lazy dog", message = "vkbs bs t suepuv"
 * Output: "this is a secret"
 * Explanation: The diagram above shows the substitution table.
 * It is obtained by taking the first appearance of each letter in "the quick brown fox jumps over the lazy dog".
 *
 * Example 2:
 *
 * Input: key = "eljuxhpwnyrdgtqkviszcfmabo", message = "zwx hnfx lqantp mnoeius ycgk vcnjrdb"
 * Output: "the five boxing wizards jump quickly"
 * Explanation: The diagram above shows the substitution table.
 * It is obtained by taking the first appearance of each letter in "eljuxhpwnyrdgtqkviszcfmabo".
 *
 *
 *
 * Constraints:
 *
 *
 * 26 &lt;= key.length &lt;= 2000
 *
 * key consists of lowercase English letters and ' '.
 *
 * key contains every letter in the English alphabet ('a' to 'z') at least once.
 *
 * 1 &lt;= message.length &lt;= 2000
 *
 * message consists of lowercase English letters and ' '.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Iterate through the characters in the key to construct a mapping to the English alphabet.
 * Hint 2: Make sure to check that the current character is not already in the mapping (only the first appearance is considered).
 * Hint 3: Map the characters in the message according to the constructed mapping.
 *
 * <h2>Approach</h2>
 * Think about the category (Hash Table, String).
 *
 * @see <a href="https://leetcode.com/problems/decode-the-message/">LeetCode #2325</a>
  *
  * <p><b>Explanation:</b> Uses StringBuilder for O(1) amortized character appends, avoiding O(n^2) String concatenation.</p>
  */
public class DecodeTheMessage {

    /**
     * Solves the problem: Decode message.
     *
     * @param key the key (String)
     * @param message the message (String)
     * @return the computed String result
      *
      * <p><b>Explanation:</b> Uses StringBuilder for O(1) amortized character appends, avoiding O(n^2) String concatenation.</p>
      */
    public String decodeMessage(String key, String message) {
        int[] decode=new int[26]; java.util.Arrays.fill(decode,-1); int idx=0;
        for (char c:key.toCharArray()) if (c!=' ' && decode[c-'a']==-1) decode[c-'a']=idx++;
        StringBuilder sb=new StringBuilder();
        for (char c:message.toCharArray()) sb.append(c==' '?' ':(char)('a'+decode[c-'a']));
        return sb.toString();
    }

    public static void main(String[] args) {
        DecodeTheMessage sol = new DecodeTheMessage();
                System.out.println(sol.decodeMessage("the quick brown fox jumps over the lazy dog","vkbs bs t suepuv")); // "this is a secret"
                System.out.println(sol.decodeMessage("eljuxhpwnyrdgtqkviszcfmabo","zwx hnfx lqantp mnoeius ycgk vcnjrdb")); // "the five boxing wizards jump quickly"
    }
}
