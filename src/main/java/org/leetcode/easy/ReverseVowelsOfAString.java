package org.leetcode.easy;

/**
 * <b>#345 - Reverse Vowels of a String</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Two Pointers, String</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given a string s, reverse only all the vowels in the string and return it.
 * 
 * 
 * The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: s = "IceCreAm"
 * 
 * 
 * Output: "AceCreIm"
 * 
 * 
 * Explanation:
 * 
 * 
 * The vowels in s are ['I', 'e', 'e', 'A']. On reversing the vowels, s becomes "AceCreIm".
 * 
 * Example 2:
 * 
 * Input: s = "leetcode"
 * 
 * 
 * Output: "leotcede"
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * 1 &lt;= s.length &lt;= 3 * 105
 * 	
 * s consist of printable ASCII characters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — study the examples carefully.
 *
 * <h2>Approach</h2>
 * Two pointers skipping non-vowels; swap vowels when both pointers meet vowels.
 *
 * <h2>Complexity</h2>
* Time: O(n)  |  Space: O(n) (char array)
 *
 * @see <a href="https://leetcode.com/problems/reverse-vowels-of-a-string/">LeetCode #345</a>
  *
  * <p><b>Explanation:</b> Iterates from both ends, swapping characters/elements inward to reverse in-place in O(n).</p>
  */
public class ReverseVowelsOfAString {

    /**
     * Solves the problem: Reverse vowels.
     *
     * @param s the s (String)
     * @return the computed String result
      *
      * <p><b>Explanation:</b> Iterates from both ends, swapping characters/elements inward to reverse in-place in O(n).</p>
      */
    public String reverseVowels(String s) {
        char[] a=s.toCharArray(); int l=0,r=a.length-1;
        String v="aeiouAEIOU";
        while(l<r){
            while(l<r&&v.indexOf(a[l])<0) l++;
            while(l<r&&v.indexOf(a[r])<0) r--;
            if(l<r){char t=a[l];a[l++]=a[r];a[r--]=t;}
        }
        return new String(a);
    }

    // ─── Demo ────────────────────────────────────────────────────
    public static void main(String[] args) {
        ReverseVowelsOfAString sol = new ReverseVowelsOfAString();
        System.out.println(sol.reverseVowels("IceCreAm")); // "AceCreIm"
        System.out.println(sol.reverseVowels("leetcode")); // "leotcede" 
    }
}
