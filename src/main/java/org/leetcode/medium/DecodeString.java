package org.leetcode.medium;

/**
 * <b>#394 - Decode String</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> String, Stack, Recursion</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an encoded string, return its decoded string.
 * 
 * 
 * The encoding rule is: k[encoded_string], where the encoded_string inside the square brackets is being repeated exactly k times. Note that k is guaranteed to be a positive integer.
 * 
 * 
 * You may assume that the input string is always valid; there are no extra white spaces, square brackets are well-formed, etc. Furthermore, you may assume that the original data does not contain any digits and that digits are only for those repeat numbers, k. For example, there will not be input like 3a or 2[4].
 * 
 * 
 * The test cases are generated so that the length of the output will never exceed 105.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: s = "3[a]2[bc]"
 * Output: "aaabcbc"
 * 
 * Example 2:
 * 
 * Input: s = "3[a2[c]]"
 * Output: "accaccacc"
 * 
 * Example 3:
 * 
 * Input: s = "2[abc]3[cd]ef"
 * Output: "abcabccdcdcdef"
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * 1 &lt;= s.length &lt;= 30
 * 	
 * s consists of lowercase English letters, digits, and square brackets '[]'.
 * 	
 * s is guaranteed to be a valid input.
 * 	
 * All the integers in s are in the range [1, 300].
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — study the examples carefully.
 *
 * <h2>Approach</h2>
 * Stack-based: when '[' is seen, push current string and current count onto stacks.
 * When ']' is seen, pop and repeat the string count times.
 *
 * <h2>Complexity</h2>
* Time: O(output length)  |  Space: O(output length)
 *
 * @see <a href="https://leetcode.com/problems/decode-string/">LeetCode #394</a>
 */
public class DecodeString {

    /**
     * Solves the problem: Decode string.
     *
     * @param s the s (String)
     * @return the computed String result
     */
    public String decodeString(String s) {
        java.util.Deque<String> strS=new java.util.ArrayDeque<>();
        java.util.Deque<Integer> cntS=new java.util.ArrayDeque<>();
        StringBuilder cur=new StringBuilder(); int k=0;
        for(char c:s.toCharArray()){
            if(Character.isDigit(c)){k=k*10+(c-'0');}
            else if(c=='['){strS.push(cur.toString());cntS.push(k);cur=new StringBuilder();k=0;}
            else if(c==']'){
                String prev=strS.pop(); int rep=cntS.pop();
                StringBuilder tmp=new StringBuilder(prev);
                for(int i=0;i<rep;i++) tmp.append(cur);
                cur=tmp;
            } else cur.append(c);
        }
        return cur.toString();
    }

    // ─── Demo ────────────────────────────────────────────────────
    public static void main(String[] args) {
        DecodeString sol = new DecodeString();
        System.out.println(sol.decodeString("3[a]2[bc]"));    // "aaabcbc"
        System.out.println(sol.decodeString("3[a2[c]]"));     // "accaccacc"
        System.out.println(sol.decodeString("2[abc]3[cd]ef")); // "abcabccdcdcdef" 
    }
}
