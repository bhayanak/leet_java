package org.leetcode.medium;

/**
 * <b>#97 - Interleaving String</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> String, Dynamic Programming</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given strings s1, s2, and s3, find whether s3 is formed by an interleaving of s1 and s2.
 * 
 * 
 * An interleaving of two strings s and t is a configuration where s and t are divided into n and m substrings respectively, such that:
 * 
 * 	
 * s = s1 + s2 + ... + sn
 * 	
 * t = t1 + t2 + ... + tm
 * 	
 * |n - m| &lt;= 1
 * 	
 * The interleaving is s1 + t1 + s2 + t2 + s3 + t3 + ... or t1 + s1 + t2 + s2 + t3 + s3 + ...
 * 
 * Note: a + b is the concatenation of strings a and b.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: s1 = "aabcc", s2 = "dbbca", s3 = "aadbbcbcac"
 * Output: true
 * Explanation: One way to obtain s3 is:
 * Split s1 into s1 = "aa" + "bc" + "c", and s2 into s2 = "dbbc" + "a".
 * Interleaving the two splits, we get "aa" + "dbbc" + "bc" + "a" + "c" = "aadbbcbcac".
 * Since s3 can be obtained by interleaving s1 and s2, we return true.
 * 
 * Example 2:
 * 
 * Input: s1 = "aabcc", s2 = "dbbca", s3 = "aadbbbaccc"
 * Output: false
 * Explanation: Notice how it is impossible to interleave s2 with any other string to obtain s3.
 * 
 * Example 3:
 * 
 * Input: s1 = "", s2 = "", s3 = ""
 * Output: true
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * 0 &lt;= s1.length, s2.length &lt;= 100
 * 	
 * 0 &lt;= s3.length &lt;= 200
 * 	
 * s1, s2, and s3 consist of lowercase English letters.
 * 
 *  
 * 
 * Follow up: Could you solve it using only O(s2.length) additional memory space?
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
 * @see <a href="https://leetcode.com/problems/interleaving-string/">LeetCode #97</a>
 */
public class InterleavingString {

    /**
     * TODO: Implement solution for "Interleaving String".
     *
     * <p>Start with a brute-force and identify the bottleneck.
     * Hint: think about the data structure or algorithm category above.</p>
     *
     * @param args placeholder — replace with the real method signature
     * @return     placeholder — replace with the real return type
     */
    public Object solve(Object args) {
        // TODO: implement
        throw new UnsupportedOperationException("Not yet implemented: Interleaving String");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        InterleavingString sol = new InterleavingString();
        System.out.println(sol.solve(null));
    }
}
