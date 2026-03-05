package org.leetcode.easy;


/**
 * <b>#1974 - Minimum Time to Type Word Using Special Typewriter</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> String, Greedy</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * There is a special typewriter with lowercase English letters 'a' to 'z' arranged in a circle with a pointer. A character can only be typed if the pointer is pointing to that character. The pointer is initially pointing to the character 'a'.
 *
 *
 * Each second, you may perform one of the following operations:
 *
 *
 * Move the pointer one character counterclockwise or clockwise.
 *
 * Type the character the pointer is currently on.
 *
 * Given a string word, return the minimum number of seconds to type out the characters in word.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: word = "abc"
 * Output: 5
 * Explanation: 
 * The characters are printed as follows:
 * - Type the character 'a' in 1 second since the pointer is initially on 'a'.
 * - Move the pointer clockwise to 'b' in 1 second.
 * - Type the character 'b' in 1 second.
 * - Move the pointer clockwise to 'c' in 1 second.
 * - Type the character 'c' in 1 second.
 *
 * Example 2:
 *
 * Input: word = "bza"
 * Output: 7
 * Explanation:
 * The characters are printed as follows:
 * - Move the pointer clockwise to 'b' in 1 second.
 * - Type the character 'b' in 1 second.
 * - Move the pointer counterclockwise to 'z' in 2 seconds.
 * - Type the character 'z' in 1 second.
 * - Move the pointer clockwise to 'a' in 1 second.
 * - Type the character 'a' in 1 second.
 *
 * Example 3:
 *
 * Input: word = "zjpc"
 * Output: 34
 * Explanation:
 * The characters are printed as follows:
 * - Move the pointer counterclockwise to 'z' in 1 second.
 * - Type the character 'z' in 1 second.
 * - Move the pointer clockwise to 'j' in 10 seconds.
 * - Type the character 'j' in 1 second.
 * - Move the pointer clockwise to 'p' in 6 seconds.
 * - Type the character 'p' in 1 second.
 * - Move the pointer counterclockwise to 'c' in 13 seconds.
 * - Type the character 'c' in 1 second.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= word.length &lt;= 100
 *
 * word consists of lowercase English letters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: There are only two possible directions you can go when you move to the next letter.
 * Hint 2: When moving to the next letter, you will always go in the direction that takes the least amount of time.
 *
 * <h2>Approach</h2>
 * Think about the category (String, Greedy).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/minimum-time-to-type-word-using-special-typewriter/">LeetCode #1974</a>
  *
  * <p><b>Explanation:</b> Tracks the running minimum in a single O(n) scan.</p>
  */
public class MinimumTimeToTypeWordUsingSpecialTypewriter {

    /**
     * Computes the minimum Min time to type.
     *
     * @param word the word (String)
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Tracks the running minimum in a single O(n) scan.</p>
      */
    public int minTimeToType(String word) {
        int time=word.length(); char cur='a';
        for (char c:word.toCharArray()) {
            int diff=Math.abs(c-cur);
            time+=Math.min(diff,26-diff);
            cur=c;
        }
        return time;
    }

    /**
     * Runs sample test cases.
      *
      * <p><b>Explanation:</b> Processes the string character by character, applying the transformation or predicate.</p>
      */
    public static void main(String[] args) {
        MinimumTimeToTypeWordUsingSpecialTypewriter sol = new MinimumTimeToTypeWordUsingSpecialTypewriter();
                System.out.println(sol.minTimeToType("abc")); // 5
                System.out.println(sol.minTimeToType("bza")); // 7
                System.out.println(sol.minTimeToType("zjpc")); // 34
    }
}
