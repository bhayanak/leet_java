package org.leetcode.hard;

/**
 * <b>#127 - Word Ladder</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Hash Table, String, Breadth-First Search</p>
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
 * Given two words, beginWord and endWord, and a dictionary wordList, return the number of words in the shortest transformation sequence from beginWord to endWord, or 0 if no such sequence exists.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: beginWord = "hit", endWord = "cog", wordList = ["hot","dot","dog","lot","log","cog"]
 * Output: 5
 * Explanation: One shortest transformation sequence is "hit" -&gt; "hot" -&gt; "dot" -&gt; "dog" -&gt; cog", which is 5 words long.
 * 
 * Example 2:
 * 
 * Input: beginWord = "hit", endWord = "cog", wordList = ["hot","dot","dog","lot","log"]
 * Output: 0
 * Explanation: The endWord "cog" is not in wordList, therefore there is no valid transformation sequence.
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * 1 &lt;= beginWord.length &lt;= 10
 * 	
 * endWord.length == beginWord.length
 * 	
 * 1 &lt;= wordList.length &lt;= 5000
 * 	
 * wordList[i].length == beginWord.length
 * 	
 * beginWord, endWord, and wordList[i] consist of lowercase English letters.
 * 	
 * beginWord != endWord
 * 	
 * All the words in wordList are unique.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — work through examples manually first.
 *
 * <h2>Approach</h2>
 * BFS from beginWord, changing one character at a time.
 * Each reachable word at distance d represents a transformation step.
 * Use a Set of remaining words to avoid revisiting. Return BFS depth when endWord found.
 *
 * <h2>Complexity</h2>
* Time: O(M²·N) where M=word length, N=word list size  |  Space: O(M²·N)
 *
 * @see <a href="https://leetcode.com/problems/word-ladder/">LeetCode #127</a>
 */
public class WordLadder {

    /**
     * Returns the fewest transformations from beginWord to endWord (each step changes 1 letter).
     * @param beginWord  start word
     * @param endWord    target word
     * @param wordList   valid intermediate words
     * @return transformation length, or 0 if no path
     */
    public int ladderLength(String beginWord, String endWord, java.util.List<String> wordList) {
        java.util.Set<String> bank = new java.util.HashSet<>(wordList);
        if (!bank.contains(endWord)) return 0;
        java.util.Queue<String> queue = new java.util.LinkedList<>();
        queue.offer(beginWord);
        int steps = 1;
        while (!queue.isEmpty()) {
            int sz = queue.size();
            for (int i = 0; i < sz; i++) {
                String cur = queue.poll();
                char[] arr = cur.toCharArray();
                for (int j = 0; j < arr.length; j++) {
                    char orig = arr[j];
                    for (char c = 'a'; c <= 'z'; c++) {
                        if (c == orig) continue;
                        arr[j] = c;
                        String next = new String(arr);
                        if (next.equals(endWord)) return steps + 1;
                        if (bank.remove(next)) queue.offer(next);
                    }
                    arr[j] = orig;
                }
            }
            steps++;
        }
        return 0;
    }

    // ─── Run & Demo ──────────────────────────────────────────────
    /**
     * Runs sample test cases to demonstrate the solution.
     * Execute: javac WordLadder.java &amp;&amp; java org.leetcode.hard.WordLadder
     *
     * @param args not used
     */
    public static void main(String[] args) {
        WordLadder sol = new WordLadder();
        System.out.println(sol.ladderLength("hit","cog",java.util.Arrays.asList("hot","dot","dog","lot","log","cog"))); // 5
        System.out.println(sol.ladderLength("hit","cog",java.util.Arrays.asList("hot","dot","dog","lot","log")));       // 0
    }
}
