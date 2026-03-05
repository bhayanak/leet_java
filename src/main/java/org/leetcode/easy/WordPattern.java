package org.leetcode.easy;

/**
 * <b>#290 - Word Pattern</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Hash Table, String</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given a pattern and a string s, find if s follows the same pattern.
 * 
 * 
 * Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s. Specifically:
 * 
 * 	
 * Each letter in pattern maps to exactly one unique word in s.
 * 	
 * Each unique word in s maps to exactly one letter in pattern.
 * 	
 * No two letters map to the same word, and no two words map to the same letter.
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: pattern = "abba", s = "dog cat cat dog"
 * 
 * 
 * Output: true
 * 
 * 
 * Explanation:
 * 
 * 
 * The bijection can be established as:
 * 
 * 	
 * 'a' maps to "dog".
 * 	
 * 'b' maps to "cat".
 * 
 * Example 2:
 * 
 * Input: pattern = "abba", s = "dog cat cat fish"
 * 
 * 
 * Output: false
 * 
 * Example 3:
 * 
 * Input: pattern = "aaaa", s = "dog cat cat dog"
 * 
 * 
 * Output: false
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * 1 &lt;= pattern.length &lt;= 300
 * 	
 * pattern contains only lower-case English letters.
 * 	
 * 1 &lt;= s.length &lt;= 3000
 * 	
 * s contains only lowercase English letters and spaces ' '.
 * 	
 * s does not contain any leading or trailing spaces.
 * 	
 * All the words in s are separated by a single space.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — study the examples carefully.
 *
 * <h2>Approach</h2>
 * Two maps: word→char and char→word. If either mapping conflicts, return false.
 *
 * <h2>Complexity</h2>
* Time: O(n)  |  Space: O(n)
 *
 * @see <a href="https://leetcode.com/problems/word-pattern/">LeetCode #290</a>
  *
  * <p><b>Explanation:</b> Uses a HashMap for O(1) average-time lookups, mapping values to indices/counts.</p>
  */
public class WordPattern {

    /**
     * Solves the problem: Word pattern.
     * Uses a hash map to track occurrences or cache results.
     *
     * @param pattern the pattern (String)
     * @param s the s (String)
     * @return the computed boolean result
      *
      * <p><b>Explanation:</b> Uses a HashMap for O(1) average-time lookups, mapping values to indices/counts.</p>
      */
    public boolean wordPattern(String pattern, String s) {
        String[] words=s.split(" ");
        if(words.length!=pattern.length()) return false;
        java.util.Map<Character,String> cToW=new java.util.HashMap<>();
        java.util.Map<String,Character> wToC=new java.util.HashMap<>();
        for(int i=0;i<pattern.length();i++){
            char c=pattern.charAt(i); String w=words[i];
            if(cToW.containsKey(c)&&!cToW.get(c).equals(w)) return false;
            if(wToC.containsKey(w)&&wToC.get(w)!=c)         return false;
            cToW.put(c,w); wToC.put(w,c);
        }
        return true;
    }

    // ─── Demo ────────────────────────────────────────────────────
    public static void main(String[] args) {
        WordPattern sol = new WordPattern();
        System.out.println(sol.wordPattern("abba","dog cat cat dog")); // true
        System.out.println(sol.wordPattern("abba","dog cat cat fish")); // false
        System.out.println(sol.wordPattern("aaaa","dog cat cat dog")); // false
    }
}
