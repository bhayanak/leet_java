package org.leetcode.easy;


/**
 * <b>#3014 - Minimum Number of Pushes to Type Word I</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Math, String, Greedy</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a string word containing distinct lowercase English letters.
 *
 *
 * Telephone keypads have keys mapped with distinct collections of lowercase English letters, which can be used to form words by pushing them. For example, the key 2 is mapped with ["a","b","c"], we need to push the key one time to type "a", two times to type "b", and three times to type "c" .
 *
 *
 * It is allowed to remap the keys numbered 2 to 9 to distinct collections of letters. The keys can be remapped to any amount of letters, but each letter must be mapped to exactly one key. You need to find the minimum number of times the keys will be pushed to type the string word.
 *
 *
 * Return the minimum number of pushes needed to type word after remapping the keys.
 *
 *
 * An example mapping of letters to keys on a telephone keypad is given below. Note that 1, *, #, and 0 do not map to any letters.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: word = "abcde"
 * Output: 5
 * Explanation: The remapped keypad given in the image provides the minimum cost.
 * "a" -&gt; one push on key 2
 * "b" -&gt; one push on key 3
 * "c" -&gt; one push on key 4
 * "d" -&gt; one push on key 5
 * "e" -&gt; one push on key 6
 * Total cost is 1 + 1 + 1 + 1 + 1 = 5.
 * It can be shown that no other mapping can provide a lower cost.
 *
 * Example 2:
 *
 * Input: word = "xycdefghij"
 * Output: 12
 * Explanation: The remapped keypad given in the image provides the minimum cost.
 * "x" -&gt; one push on key 2
 * "y" -&gt; two pushes on key 2
 * "c" -&gt; one push on key 3
 * "d" -&gt; two pushes on key 3
 * "e" -&gt; one push on key 4
 * "f" -&gt; one push on key 5
 * "g" -&gt; one push on key 6
 * "h" -&gt; one push on key 7
 * "i" -&gt; one push on key 8
 * "j" -&gt; one push on key 9
 * Total cost is 1 + 2 + 1 + 2 + 1 + 1 + 1 + 1 + 1 + 1 = 12.
 * It can be shown that no other mapping can provide a lower cost.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= word.length &lt;= 26
 *
 * word consists of lowercase English letters.
 *
 * All letters in word are distinct.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: We have 8 keys in total. We can type 8 characters with one push each, 8 different characters with two pushes each, and so on.
 * Hint 2: The optimal way is to map letters to keys evenly.
 *
 * <h2>Approach</h2>
 * Think about the category (Math, String, Greedy).
 *
 * @see <a href="https://leetcode.com/problems/minimum-number-of-pushes-to-type-word-i/">LeetCode #3014</a>
  *
  * <p><b>Explanation:</b> Sorts the input first to simplify subsequent search or comparison steps.</p>
  */
public class MinimumNumberOfPushesToTypeWordI {

    /**
     * Solves the problem: Minimum pushes.
     * Sorts the input first to enable efficient processing.
     *
     * @param word the word (String)
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Sorts the input first to simplify subsequent search or comparison steps.</p>
      */
    public int minimumPushes(String word) {
        int[] freq=new int[26];
        for (char c:word.toCharArray()) freq[c-'a']++;
        java.util.Arrays.sort(freq);
        int presses=0;
        for (int i=25,key=1;i>=0&&freq[i]>0;i--) {
            presses+=key*freq[i];
            if ((25-i)%8==7) key++;
        }
        return presses;
    }

    public static void main(String[] args) {
        MinimumNumberOfPushesToTypeWordI sol = new MinimumNumberOfPushesToTypeWordI();
                System.out.println(sol.minimumPushes("abcde")); // 5
                System.out.println(sol.minimumPushes("xyzxyzxyzxyz")); // 12
                System.out.println(sol.minimumPushes("aabbccddeeffgghhiiiiii")); // 24
    }
}
