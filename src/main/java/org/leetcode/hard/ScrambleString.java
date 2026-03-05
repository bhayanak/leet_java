package org.leetcode.hard;

/**
 * <b>#87 - Scramble String</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> String, Dynamic Programming</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * We can scramble a string s to get a string t using the following algorithm:
 * 
 * 
 * 	
 * If the length of the string is 1, stop.
 * 	
 * If the length of the string is &gt; 1, do the following:
 * 	
 * 
 * 		
 * Split the string into two non-empty substrings at a random index, i.e., if the string is s, divide it to x and y where s = x + y.
 * 		
 * Randomly decide to swap the two substrings or to keep them in the same order. i.e., after this step, s may become s = x + y or s = y + x.
 * 		
 * Apply step 1 recursively on each of the two substrings x and y.
 * 	
 * 	
 * 
 * Given two strings s1 and s2 of the same length, return true if s2 is a scrambled string of s1, otherwise, return false.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: s1 = "great", s2 = "rgeat"
 * Output: true
 * Explanation: One possible scenario applied on s1 is:
 * "great" --&gt; "gr/eat" // divide at random index.
 * "gr/eat" --&gt; "gr/eat" // random decision is not to swap the two substrings and keep them in order.
 * "gr/eat" --&gt; "g/r / e/at" // apply the same algorithm recursively on both substrings. divide at random index each of them.
 * "g/r / e/at" --&gt; "r/g / e/at" // random decision was to swap the first substring and to keep the second substring in the same order.
 * "r/g / e/at" --&gt; "r/g / e/ a/t" // again apply the algorithm recursively, divide "at" to "a/t".
 * "r/g / e/ a/t" --&gt; "r/g / e/ a/t" // random decision is to keep both substrings in the same order.
 * The algorithm stops now, and the result string is "rgeat" which is s2.
 * As one possible scenario led s1 to be scrambled to s2, we return true.
 * 
 * Example 2:
 * 
 * Input: s1 = "abcde", s2 = "caebd"
 * Output: false
 * 
 * Example 3:
 * 
 * Input: s1 = "a", s2 = "a"
 * Output: true
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * s1.length == s2.length
 * 	
 * 1 &lt;= s1.length &lt;= 30
 * 	
 * s1 and s2 consist of lowercase English letters.
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
 * @see <a href="https://leetcode.com/problems/scramble-string/">LeetCode #87</a>
 */
public class ScrambleString {

    /**
     * TODO: Implement solution for "Scramble String".
     *
     * <p>Start with a brute-force and identify the bottleneck.
     * Hint: think about the data structure or algorithm category above.</p>
     *
     * @param args placeholder — replace with the real method signature
     * @return     placeholder — replace with the real return type
     */
    public Object solve(Object args) {
        // TODO: implement
        throw new UnsupportedOperationException("Not yet implemented: Scramble String");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        ScrambleString sol = new ScrambleString();
        System.out.println(sol.solve(null));
    }
}
