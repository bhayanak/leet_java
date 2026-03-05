package org.leetcode.medium;

/**
 * <b>#208 - Implement Trie (Prefix Tree)</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Hash Table, String, Design, Trie</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * A trie (pronounced as "try") or prefix tree is a tree data structure used to efficiently store and retrieve keys in a dataset of strings. There are various applications of this data structure, such as autocomplete and spellchecker.
 * 
 * 
 * Implement the Trie class:
 * 
 * 	
 * Trie() Initializes the trie object.
 * 	
 * void insert(String word) Inserts the string word into the trie.
 * 	
 * boolean search(String word) Returns true if the string word is in the trie (i.e., was inserted before), and false otherwise.
 * 	
 * boolean startsWith(String prefix) Returns true if there is a previously inserted string word that has the prefix prefix, and false otherwise.
 * 
 *  
 * 
 * Example 1:
 * 
 * Input
 * ["Trie", "insert", "search", "search", "startsWith", "insert", "search"]
 * [[], ["apple"], ["apple"], ["app"], ["app"], ["app"], ["app"]]
 * Output
 * [null, null, true, false, true, null, true]
 * 
 * Explanation
 * Trie trie = new Trie();
 * trie.insert("apple");
 * trie.search("apple");   // return True
 * trie.search("app");     // return False
 * trie.startsWith("app"); // return True
 * trie.insert("app");
 * trie.search("app");     // return True
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * 1 &lt;= word.length, prefix.length &lt;= 2000
 * 	
 * word and prefix consist only of lowercase English letters.
 * 	
 * At most 3 * 104 calls in total will be made to insert, search, and startsWith.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — study the examples carefully.
 *
 * <h2>Approach</h2>
 * Each TrieNode has 26 children (a-z) and a boolean isEnd.
 * insert/search/startsWith all traverse character by character.
 *
 * <h2>Complexity</h2>
* Time: O(m) per operation (m=word length)  |  Space: O(26·m·n)
 *
 * @see <a href="https://leetcode.com/problems/implement-trie-prefix-tree/">LeetCode #208</a>
 */
public class ImplementTriePrefixTree {

    static class Trie {
        private final TrieNode root = new TrieNode();
        private static class TrieNode {
            TrieNode[] ch = new TrieNode[26]; boolean end;
        }
    /**
     * Solves the problem: Insert.
     *
     * @param w the w (String)
     */
        public void insert(String w) {
            TrieNode cur = root;
            for (char c : w.toCharArray()) {
                int i = c-'a';
                if (cur.ch[i]==null) cur.ch[i]=new TrieNode();
                cur = cur.ch[i];
            }
            cur.end = true;
        }
    /**
     * Searches for Search.
     *
     * @param w the w (String)
     * @return the computed boolean result
     */
        public boolean search(String w) {
            TrieNode cur = root;
            for (char c : w.toCharArray()) {
                cur = cur.ch[c-'a'];
                if (cur==null) return false;
            }
            return cur.end;
        }
    /**
     * Solves the problem: Starts with.
     *
     * @param p the p (String)
     * @return the computed boolean result
     */
        public boolean startsWith(String p) {
            TrieNode cur = root;
            for (char c : p.toCharArray()) {
                cur = cur.ch[c-'a'];
                if (cur==null) return false;
            }
            return true;
        }
    }

    // ─── Demo ────────────────────────────────────────────────────
    public static void main(String[] args) {
        Trie sol = new Trie();
        sol.insert("hello");
        System.out.println(sol.search("hello")); // true
        System.out.println(sol.startsWith("hel")); // true
    }
}
