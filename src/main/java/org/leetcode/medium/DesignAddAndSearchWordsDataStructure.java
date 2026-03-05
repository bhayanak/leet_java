package org.leetcode.medium;

/**
 * <b>#211 - Design Add and Search Words Data Structure</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> String, Depth-First Search, Design, Trie</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Design a data structure that supports adding new words and finding if a string matches any previously added string.
 * 
 * 
 * Implement the WordDictionary class:
 * 
 * 	
 * WordDictionary() Initializes the object.
 * 	
 * void addWord(word) Adds word to the data structure, it can be matched later.
 * 	
 * bool search(word) Returns true if there is any string in the data structure that matches word or false otherwise. word may contain dots '.' where dots can be matched with any letter.
 * 
 *  
 * 
 * Example:
 * 
 * Input
 * ["WordDictionary","addWord","addWord","addWord","search","search","search","search"]
 * [[],["bad"],["dad"],["mad"],["pad"],["bad"],[".ad"],["b.."]]
 * Output
 * [null,null,null,null,false,true,true,true]
 * 
 * Explanation
 * WordDictionary wordDictionary = new WordDictionary();
 * wordDictionary.addWord("bad");
 * wordDictionary.addWord("dad");
 * wordDictionary.addWord("mad");
 * wordDictionary.search("pad"); // return False
 * wordDictionary.search("bad"); // return True
 * wordDictionary.search(".ad"); // return True
 * wordDictionary.search("b.."); // return True
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * 1 &lt;= word.length &lt;= 25
 * 	
 * word in addWord consists of lowercase English letters.
 * 	
 * word in search consist of '.' or lowercase English letters.
 * 	
 * There will be at most 2 dots in word for search queries.
 * 	
 * At most 104 calls will be made to addWord and search.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: You should be familiar with how a Trie works. If not, please work on this problem: <a href="https://leetcode.com/problems/implement-trie-prefix-tree/">Implement Trie (Prefix Tree)</a> first.
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
 * @see <a href="https://leetcode.com/problems/design-add-and-search-words-data-structure/">LeetCode #211</a>
 */
public class DesignAddAndSearchWordsDataStructure {

    /** TODO: implement solution for "Design Add and Search Words Data Structure". */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Design Add and Search Words Data Structure");
    }

    // ─── Demo ────────────────────────────────────────────────────
    public static void main(String[] args) {
        System.out.println("=== DesignAddAndSearchWordsDataStructure ===");
        DesignAddAndSearchWordsDataStructure sol = new DesignAddAndSearchWordsDataStructure();
        System.out.println(sol.solve(null));
    }
}
