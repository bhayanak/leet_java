package org.leetcode.hard;

/**
 * <b>#30 - Substring with Concatenation of All Words</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Hash Table, String, Sliding Window</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a string s and an array of strings words. All the strings of words are of the same length.
 * 
 * 
 * A concatenated string is a string that exactly contains all the strings of any permutation of words concatenated.
 * 
 * 	
 * For example, if words = ["ab","cd","ef"], then "abcdef", "abefcd", "cdabef", "cdefab", "efabcd", and "efcdab" are all concatenated strings. "acdbef" is not a concatenated string because it is not the concatenation of any permutation of words.
 * 
 * Return an array of the starting indices of all the concatenated substrings in s. You can return the answer in any order.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: s = "barfoothefoobarman", words = ["foo","bar"]
 * 
 * 
 * Output: [0,9]
 * 
 * 
 * Explanation:
 * 
 * 
 * The substring starting at 0 is "barfoo". It is the concatenation of ["bar","foo"] which is a permutation of words.
 * 
 * The substring starting at 9 is "foobar". It is the concatenation of ["foo","bar"] which is a permutation of words.
 * 
 * Example 2:
 * 
 * Input: s = "wordgoodgoodgoodbestword", words = ["word","good","best","word"]
 * 
 * 
 * Output: []
 * 
 * 
 * Explanation:
 * 
 * 
 * There is no concatenated substring.
 * 
 * Example 3:
 * 
 * Input: s = "barfoofoobarthefoobarman", words = ["bar","foo","the"]
 * 
 * 
 * Output: [6,9,12]
 * 
 * 
 * Explanation:
 * 
 * 
 * The substring starting at 6 is "foobarthe". It is the concatenation of ["foo","bar","the"].
 * 
 * The substring starting at 9 is "barthefoo". It is the concatenation of ["bar","the","foo"].
 * 
 * The substring starting at 12 is "thefoobar". It is the concatenation of ["the","foo","bar"].
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * 1 &lt;= s.length &lt;= 104
 * 	
 * 1 &lt;= words.length &lt;= 5000
 * 	
 * 1 &lt;= words[i].length &lt;= 30
 * 	
 * s and words[i] consist of lowercase English letters.
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
 * @see <a href="https://leetcode.com/problems/substring-with-concatenation-of-all-words/">LeetCode #30</a>
 */
public class SubstringWithConcatenationOfAllWords {

    /**
     * TODO: Implement solution for "Substring with Concatenation of All Words".
     *
     * <p>Start with a brute-force and identify the bottleneck.
     * Hint: think about the data structure or algorithm category above.</p>
     *
     * @param args placeholder — replace with the real method signature
     * @return     placeholder — replace with the real return type
     */
    public Object solve(Object args) {
        // TODO: implement
        throw new UnsupportedOperationException("Not yet implemented: Substring with Concatenation of All Words");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== SubstringWithConcatenationOfAllWords ===");
        System.out.println("See class methods for usage.");
    }
}
