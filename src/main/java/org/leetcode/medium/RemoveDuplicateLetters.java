package org.leetcode.medium;

/**
 * <b>#316 - Remove Duplicate Letters</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> String, Stack, Greedy, Monotonic Stack</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given a string s, remove duplicate letters so that every letter appears once and only once. You must make sure your result is the smallest in lexicographical order among all possible results.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: s = "bcabc"
 * Output: "abc"
 * 
 * Example 2:
 * 
 * Input: s = "cbacdcbc"
 * Output: "acdb"
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * 1 &lt;= s.length &lt;= 104
 * 	
 * s consists of lowercase English letters.
 * 
 *  
 * 
 * Note: This question is the same as 1081: https://leetcode.com/problems/smallest-subsequence-of-distinct-characters/
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Greedily try to add one missing character. How to check if adding some character will not cause problems ? Use bit-masks to check whether you will be able to complete the sub-sequence if you add the character at some index i.
 *
 * <h2>Approach</h2>
 * Greedy + monotonic stack: maintain lexicographically smallest result.
 * For each char: pop stack if top &gt; curr AND top appears later.
 *
 * <h2>Complexity</h2>
* Time: O(n)  |  Space: O(26)
 *
 * @see <a href="https://leetcode.com/problems/remove-duplicate-letters/">LeetCode #316</a>
 */
public class RemoveDuplicateLetters {

    /**
     * Removes Remove duplicate letters.
     * Uses Depth-First Search (DFS) traversal.
     *
     * @param s the s (String)
     * @return the computed String result
     */
    public String removeDuplicateLetters(String s) {
        int[] cnt=new int[26]; boolean[] inStack=new boolean[26];
        for(char c:s.toCharArray()) cnt[c-'a']++;
        java.util.Deque<Character> stack=new java.util.ArrayDeque<>();
        for(char c:s.toCharArray()){
            cnt[c-'a']--;
            if(inStack[c-'a']) continue;
            while(!stack.isEmpty()&&stack.peek()>c&&cnt[stack.peek()-'a']>0){
                inStack[stack.pop()-'a']=false;
            }
            stack.push(c); inStack[c-'a']=true;
        }
        StringBuilder sb=new StringBuilder();
        for(char c:stack) sb.insert(0,c);
        return sb.toString();
    }

    // ─── Demo ────────────────────────────────────────────────────
    public static void main(String[] args) {
        RemoveDuplicateLetters sol = new RemoveDuplicateLetters();
        System.out.println(sol.removeDuplicateLetters("bcabc"));  // "abc"
        System.out.println(sol.removeDuplicateLetters("cbacdcbc")); // "acdb" 
    }
}
