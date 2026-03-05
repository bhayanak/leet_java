package org.leetcode.easy;

/**
 * <b>#344 - Reverse String</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Two Pointers, String</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Write a function that reverses a string. The input string is given as an array of characters s.
 * 
 * 
 * You must do this by modifying the input array in-place with O(1) extra memory.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: s = ["h","e","l","l","o"]
 * Output: ["o","l","l","e","h"]
 * 
 * 
 * Example 2:
 * 
 * Input: s = ["H","a","n","n","a","h"]
 * Output: ["h","a","n","n","a","H"]
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * 1 &lt;= s.length &lt;= 105
 * 	
 * s[i] is a printable ascii character.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: The entire logic for reversing a string is based on using the opposite directional two-pointer approach!
 *
 * <h2>Approach</h2>
 * Two-pointer in-place swap from ends toward center.
 *
 * <h2>Complexity</h2>
* Time: O(n)  |  Space: O(1)
 *
 * @see <a href="https://leetcode.com/problems/reverse-string/">LeetCode #344</a>
  *
  * <p><b>Explanation:</b> Iterates from both ends, swapping characters/elements inward to reverse in-place in O(n).</p>
  */
public class ReverseString {

    /**
     * Solves the problem: Reverse string.
     *
     * @param s the s (char[])
      *
      * <p><b>Explanation:</b> Iterates from both ends, swapping characters/elements inward to reverse in-place in O(n).</p>
      */
    public void reverseString(char[] s) {
        int l=0,r=s.length-1;
        while(l<r){char t=s[l];s[l++]=s[r];s[r--]=t;}
    }

    // ─── Demo ────────────────────────────────────────────────────
    public static void main(String[] args) {
        ReverseString sol = new ReverseString();
        char[] a={'h','e','l','l','o'}; sol.reverseString(a);
        System.out.println(new String(a)); // "olleh" 
    }
}
