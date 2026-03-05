package org.leetcode.hard;

/**
 * <b>#126 - Word Ladder II</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Hash Table, String, Backtracking, Breadth-First Search</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * A transformation sequence from word beginWord to word endWord using a dictionary wordList is a sequence of words beginWord -&gt; s1 -&gt; s2 -&gt; ... -&gt; sk such that:
 * 
 * 	
 * Every adjacent pair of words differs by a single letter.
 * 	
 * Every si for 1 &lt;= i &lt;= k is in wordList. Note that beginWord does not need to be in wordList.
 * 	
 * sk == endWord
 * 
 * Given two words, beginWord and endWord, and a dictionary wordList, return all the shortest transformation sequences from beginWord to endWord, or an empty list if no such sequence exists. Each sequence should be returned as a list of the words [beginWord, s1, s2, ..., sk].
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: beginWord = "hit", endWord = "cog", wordList = ["hot","dot","dog","lot","log","cog"]
 * Output: [["hit","hot","dot","dog","cog"],["hit","hot","lot","log","cog"]]
 * Explanation: There are 2 shortest transformation sequences:
 * "hit" -&gt; "hot" -&gt; "dot" -&gt; "dog" -&gt; "cog"
 * "hit" -&gt; "hot" -&gt; "lot" -&gt; "log" -&gt; "cog"
 * 
 * Example 2:
 * 
 * Input: beginWord = "hit", endWord = "cog", wordList = ["hot","dot","dog","lot","log"]
 * Output: []
 * Explanation: The endWord "cog" is not in wordList, therefore there is no valid transformation sequence.
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * 1 &lt;= beginWord.length &lt;= 5
 * 	
 * endWord.length == beginWord.length
 * 	
 * 1 &lt;= wordList.length &lt;= 500
 * 	
 * wordList[i].length == beginWord.length
 * 	
 * beginWord, endWord, and wordList[i] consist of lowercase English letters.
 * 	
 * beginWord != endWord
 * 	
 * All the words in wordList are unique.
 * 	
 * The sum of all shortest transformation sequences does not exceed 105.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — work through examples manually first.
 *
 * <h2>Approach</h2>
 * Think about the category first (see tags above), then:
 * 1. Try a brute-force solution to understand the problem.
 * 2. Identify the bottleneck and optimise with the right data structure or algorithm.
 * 3. Consider: sorting, hashing, two pointers, sliding window,
 *    binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: TBD  |  Space: TBD
 *
 * @see <a href="https://leetcode.com/problems/word-ladder-ii/">LeetCode #126</a>
 */
public class WordLadderIi {

    /**
     * TODO: Implement solution for "Word Ladder II".
     * @param args placeholder — replace with actual parameter(s)
     * @return     placeholder — replace with actual return type
     */
    public Object solve(Object args) {
        throw new UnsupportedOperationException("Not yet implemented: Word Ladder II");
    }

    // ─── Run & Demo ──────────────────────────────────────────────
    /**
     * Runs sample test cases to demonstrate the solution.
     * Execute: javac WordLadderIi.java &amp;&amp; java org.leetcode.hard.WordLadderIi
     *
     * @param args not used
     */
    public static void main(String[] args) {
        System.out.println("=== WordLadderIi ===");
        WordLadderIi sol = new WordLadderIi();
        System.out.println(sol.solve(null));
    }
}
