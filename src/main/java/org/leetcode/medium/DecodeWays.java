package org.leetcode.medium;

/**
 * <b>#91 - Decode Ways</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> String, Dynamic Programming</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You have intercepted a secret message encoded as a string of numbers. The message is decoded via the following mapping:
 * 
 * 
 * "1" -&gt; 'A'
 * 
 * "2" -&gt; 'B'
 * 
 * ...
 * 
 * "25" -&gt; 'Y'
 * 
 * "26" -&gt; 'Z'
 * 
 * 
 * However, while decoding the message, you realize that there are many different ways you can decode the message because some codes are contained in other codes ("2" and "5" vs "25").
 * 
 * 
 * For example, "11106" can be decoded into:
 * 
 * 	
 * "AAJF" with the grouping (1, 1, 10, 6)
 * 	
 * "KJF" with the grouping (11, 10, 6)
 * 	
 * The grouping (1, 11, 06) is invalid because "06" is not a valid code (only "6" is valid).
 * 
 * Note: there may be strings that are impossible to decode.
 * 
 * Given a string s containing only digits, return the number of ways to decode it. If the entire string cannot be decoded in any valid way, return 0.
 * 
 * 
 * The test cases are generated so that the answer fits in a 32-bit integer.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: s = "12"
 * 
 * 
 * Output: 2
 * 
 * 
 * Explanation:
 * 
 * 
 * "12" could be decoded as "AB" (1 2) or "L" (12).
 * 
 * Example 2:
 * 
 * Input: s = "226"
 * 
 * 
 * Output: 3
 * 
 * 
 * Explanation:
 * 
 * 
 * "226" could be decoded as "BZ" (2 26), "VF" (22 6), or "BBF" (2 2 6).
 * 
 * Example 3:
 * 
 * Input: s = "06"
 * 
 * 
 * Output: 0
 * 
 * 
 * Explanation:
 * 
 * 
 * "06" cannot be mapped to "F" because of the leading zero ("6" is different from "06"). In this case, the string is not a valid encoding, so return 0.
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * 1 &lt;= s.length &lt;= 100
 * 	
 * s contains only digits and may contain leading zero(s).
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints available — try to figure out the category and approach first!
 *
 * <h2>Approach</h2>
 * Break the problem into smaller sub-problems or work through examples manually.
 * Consider: brute-force first, then optimise with sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, dynamic programming, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: TBD  |  Space: TBD
 *
 * @see <a href="https://leetcode.com/problems/decode-ways/">LeetCode #91</a>
 */
public class DecodeWays {

    /**
     * TODO: Implement solution for "Decode Ways".
     *
     * <p>Start with a brute-force and identify the bottleneck.
     * Hint: think about the data structure or algorithm category above.</p>
     *
     * @param args placeholder — replace with the real method signature
     * @return     placeholder — replace with the real return type
     */
    public Object solve(Object args) {
        // TODO: implement
        throw new UnsupportedOperationException("Not yet implemented: Decode Ways");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        DecodeWays sol = new DecodeWays();
        System.out.println(sol.solve(null));
    }
}
