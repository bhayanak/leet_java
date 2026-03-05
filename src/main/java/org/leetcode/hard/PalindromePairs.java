package org.leetcode.hard;

/**
 * <b>#336 - Palindrome Pairs</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Hash Table, String, Trie</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a 0-indexed array of unique strings words.
 * 
 * 
 * A palindrome pair is a pair of integers (i, j) such that:
 * 
 * 	
 * 0 &lt;= i, j &lt; words.length,
 * 	
 * i != j, and
 * 	
 * words[i] + words[j] (the concatenation of the two strings) is a palindrome.
 * 
 * Return an array of all the palindrome pairs of words.
 * 
 * 
 * You must write an algorithm with O(sum of words[i].length) runtime complexity.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: words = ["abcd","dcba","lls","s","sssll"]
 * Output: [[0,1],[1,0],[3,2],[2,4]]
 * Explanation: The palindromes are ["abcddcba","dcbaabcd","slls","llssssll"]
 * 
 * Example 2:
 * 
 * Input: words = ["bat","tab","cat"]
 * Output: [[0,1],[1,0]]
 * Explanation: The palindromes are ["battab","tabbat"]
 * 
 * Example 3:
 * 
 * Input: words = ["a",""]
 * Output: [[0,1],[1,0]]
 * Explanation: The palindromes are ["a","a"]
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * 1 &lt;= words.length &lt;= 5000
 * 	
 * 0 &lt;= words[i].length &lt;= 300
 * 	
 * words[i] consists of lowercase English letters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Checking every two pairs will exceed the time limit. It will be O(n^2 * k). We need a faster way.
 * Hint 2: If we hash every string in the array, how can we check if two pairs form a palindrome after the concatenation?
 * Hint 3: We can check every string in words and consider it as words[j] (i.e., the suffix of the target palindrome). We can check if there is a hash of string that can be the prefix to make it a palindrome.
 *
 * <h2>Approach</h2>
 * Break the problem into smaller sub-problems:
 * 1. Try brute force first to understand the constraints.
 * 2. Look for repeated sub-problems (DP), sorted structure (binary search),
 *    adjacency (graph/BFS), or monotonic properties (stack/queue).
 * 3. Refine with the right data structure.
 *
 * <h2>Complexity</h2>
 * Time: TBD  |  Space: TBD
 *
 * @see <a href="https://leetcode.com/problems/palindrome-pairs/">LeetCode #336</a>
 */
public class PalindromePairs {

    /** TODO: implement solution for "Palindrome Pairs". */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Palindrome Pairs");
    }

    // ─── Demo ────────────────────────────────────────────────────
    public static void main(String[] args) {
        System.out.println("=== PalindromePairs ===");
        PalindromePairs sol = new PalindromePairs();
        System.out.println(sol.solve(null));
    }
}
