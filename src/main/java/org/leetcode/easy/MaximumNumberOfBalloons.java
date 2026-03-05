package org.leetcode.easy;


/**
 * <b>#1189 - Maximum Number of Balloons</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Hash Table, String, Counting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given a string text, you want to use the characters of text to form as many instances of the word "balloon" as possible.
 *
 *
 * You can use each character in text at most once. Return the maximum number of instances that can be formed.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: text = "nlaebolko"
 * Output: 1
 *
 * Example 2:
 *
 * Input: text = "loonbalxballpoon"
 * Output: 2
 *
 * Example 3:
 *
 * Input: text = "leetcode"
 * Output: 0
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= text.length &lt;= 104
 *
 * text consists of lower case English letters only.
 *
 *
 *
 * Note: This question is the same as  2287: Rearrange Characters to Make Target String.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Count the frequency of letters in the given string.
 * Hint 2: Find the letter than can make the minimum number of instances of the word "balloon".
 *
 * <h2>Approach</h2>
 * Think about the category (Hash Table, String, Counting).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/maximum-number-of-balloons/">LeetCode #1189</a>
  *
  * <p><b>Explanation:</b> Tracks the running maximum in a single O(n) scan without extra space.</p>
  */
public class MaximumNumberOfBalloons {

    /**
     * Computes the maximum Max number of balloons.
     *
     * @param text the text (String)
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Tracks the running maximum in a single O(n) scan without extra space.</p>
      */
    public int maxNumberOfBalloons(String text) {
        int[] cnt = new int[26];
        for (char c : text.toCharArray()) cnt[c-'a']++;
        return java.util.Arrays.stream(new int[]{cnt['b'-'a'], cnt['a'-'a'],
            cnt['l'-'a']/2, cnt['o'-'a']/2, cnt['n'-'a']}).min().getAsInt();
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac MaximumNumberOfBalloons.java &amp;&amp; java org.leetcode.easy.MaximumNumberOfBalloons</pre>
      *
      * <p><b>Explanation:</b> Processes the string character by character, applying the transformation or predicate.</p>
      */
    public static void main(String[] args) {
        MaximumNumberOfBalloons sol = new MaximumNumberOfBalloons();
                System.out.println(sol.maxNumberOfBalloons("nlaebolko"));       // 1
                System.out.println(sol.maxNumberOfBalloons("loonbalxballpoon")); // 2
                System.out.println(sol.maxNumberOfBalloons("leetcode"));         // 0
    }
}
