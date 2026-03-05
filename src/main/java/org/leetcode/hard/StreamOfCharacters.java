package org.leetcode.hard;


/**
 * <b>#1032 - Stream of Characters</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, String, Design, Trie, Data Stream</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Design an algorithm that accepts a stream of characters and checks if a suffix of these characters is a string of a given array of strings words.
 *
 *
 * For example, if words = ["abc", "xyz"] and the stream added the four characters (one by one) 'a', 'x', 'y', and 'z', your algorithm should detect that the suffix "xyz" of the characters "axyz" matches "xyz" from words.
 *
 *
 * Implement the StreamChecker class:
 *
 *
 * StreamChecker(String[] words) Initializes the object with the strings array words.
 *
 * boolean query(char letter) Accepts a new character from the stream and returns true if any non-empty suffix from the stream forms a word that is in words.
 *
 *
 *
 * Example 1:
 *
 * Input
 * ["StreamChecker", "query", "query", "query", "query", "query", "query", "query", "query", "query", "query", "query", "query"]
 * [[["cd", "f", "kl"]], ["a"], ["b"], ["c"], ["d"], ["e"], ["f"], ["g"], ["h"], ["i"], ["j"], ["k"], ["l"]]
 * Output
 * [null, false, false, false, true, false, true, false, false, false, false, false, true]
 *
 * Explanation
 * StreamChecker streamChecker = new StreamChecker(["cd", "f", "kl"]);
 * streamChecker.query("a"); // return False
 * streamChecker.query("b"); // return False
 * streamChecker.query("c"); // return False
 * streamChecker.query("d"); // return True, because 'cd' is in the wordlist
 * streamChecker.query("e"); // return False
 * streamChecker.query("f"); // return True, because 'f' is in the wordlist
 * streamChecker.query("g"); // return False
 * streamChecker.query("h"); // return False
 * streamChecker.query("i"); // return False
 * streamChecker.query("j"); // return False
 * streamChecker.query("k"); // return False
 * streamChecker.query("l"); // return True, because 'kl' is in the wordlist
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= words.length &lt;= 2000
 *
 * 1 &lt;= words[i].length &lt;= 200
 *
 * words[i] consists of lowercase English letters.
 *
 * letter is a lowercase English letter.
 *
 * At most 4 * 104 calls will be made to query.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Put the words into a trie, and manage a set of pointers within that trie.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, String, Design, Trie, Data Stream).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/stream-of-characters/">LeetCode #1032</a>
 */
public class StreamOfCharacters {

    /**
     * TODO: Implement "Stream of Characters".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Stream of Characters");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac StreamOfCharacters.java &amp;&amp; java org.leetcode.hard.StreamOfCharacters</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== StreamOfCharacters ===");
        StreamOfCharacters sol = new StreamOfCharacters();
        System.out.println(sol.solve(null));
    }
}
