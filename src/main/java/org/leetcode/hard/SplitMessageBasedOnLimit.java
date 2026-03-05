package org.leetcode.hard;


/**
 * <b>#2468 - Split Message Based on Limit</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> String, Enumeration</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a string, message, and a positive integer, limit.
 *
 *
 * You must split message into one or more parts based on limit. Each resulting part should have the suffix "&lt;a/b&gt;", where "b" is to be replaced with the total number of parts and "a" is to be replaced with the index of the part, starting from 1 and going up to b. Additionally, the length of each resulting part (including its suffix) should be equal to limit, except for the last part whose length can be at most limit.
 *
 *
 * The resulting parts should be formed such that when their suffixes are removed and they are all concatenated in order, they should be equal to message. Also, the result should contain as few parts as possible.
 *
 *
 * Return the parts message would be split into as an array of strings. If it is impossible to split message as required, return an empty array.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: message = "this is really a very awesome message", limit = 9
 * Output: ["thi&lt;1/14&gt;","s i&lt;2/14&gt;","s r&lt;3/14&gt;","eal&lt;4/14&gt;","ly &lt;5/14&gt;","a v&lt;6/14&gt;","ery&lt;7/14&gt;"," aw&lt;8/14&gt;","eso&lt;9/14&gt;","me&lt;10/14&gt;"," m&lt;11/14&gt;","es&lt;12/14&gt;","sa&lt;13/14&gt;","ge&lt;14/14&gt;"]
 * Explanation:
 * The first 9 parts take 3 characters each from the beginning of message.
 * The next 5 parts take 2 characters each to finish splitting message. 
 * In this example, each part, including the last, has length 9. 
 * It can be shown it is not possible to split message into less than 14 parts.
 *
 * Example 2:
 *
 * Input: message = "short message", limit = 15
 * Output: ["short mess&lt;1/2&gt;","age&lt;2/2&gt;"]
 * Explanation:
 * Under the given constraints, the string can be split into two parts: 
 * - The first part comprises of the first 10 characters, and has a length 15.
 * - The next part comprises of the last 3 characters, and has a length 8.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= message.length &lt;= 104
 *
 * message consists only of lowercase English letters and ' '.
 *
 * 1 &lt;= limit &lt;= 104
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Could you solve the problem if you knew how many digits the total number of parts has?
 * Hint 2: Try all possible lengths of the total number of parts, and see if the string can be split such that the total number of parts has that length.
 * Hint 3: Binary search can be used for each part length to find the precise number of parts needed.
 *
 * <h2>Approach</h2>
 * Think about the category (String, Enumeration).
 *
 * @see <a href="https://leetcode.com/problems/split-message-based-on-limit/">LeetCode #2468</a>
 */
public class SplitMessageBasedOnLimit {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Split Message Based on Limit");
    }

    public static void main(String[] args) {
        System.out.println("=== SplitMessageBasedOnLimit ===");
        SplitMessageBasedOnLimit sol = new SplitMessageBasedOnLimit();
        System.out.println(sol.solve(null));
    }
}
