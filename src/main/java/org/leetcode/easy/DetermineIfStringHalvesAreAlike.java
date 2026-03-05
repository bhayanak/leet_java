package org.leetcode.easy;


/**
 * <b>#1704 - Determine if String Halves Are Alike</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> String, Counting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a string s of even length. Split this string into two halves of equal lengths, and let a be the first half and b be the second half.
 *
 *
 * Two strings are alike if they have the same number of vowels ('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'). Notice that s contains uppercase and lowercase letters.
 *
 *
 * Return true if a and b are alike. Otherwise, return false.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s = "book"
 * Output: true
 * Explanation: a = "bo" and b = "ok". a has 1 vowel and b has 1 vowel. Therefore, they are alike.
 *
 * Example 2:
 *
 * Input: s = "textbook"
 * Output: false
 * Explanation: a = "text" and b = "book". a has 1 vowel whereas b has 2. Therefore, they are not alike.
 * Notice that the vowel o is counted twice.
 *
 *
 *
 * Constraints:
 *
 *
 * 2 &lt;= s.length &lt;= 1000
 *
 * s.length is even.
 *
 * s consists of uppercase and lowercase letters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Create a function that checks if a character is a vowel, either uppercase or lowercase.
 *
 * <h2>Approach</h2>
 * Think about the category (String, Counting).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/determine-if-string-halves-are-alike/">LeetCode #1704</a>
  *
  * <p><b>Explanation:</b> Applies binary search to halve the search space each step, achieving O(log n) time.</p>
  */
public class DetermineIfStringHalvesAreAlike {

    /**
     * Solves the problem: Halves are alike.
     *
     * @param s the s (String)
     * @return the computed boolean result
      *
      * <p><b>Explanation:</b> Applies binary search to halve the search space each step, achieving O(log n) time.</p>
      */
    public boolean halvesAreAlike(String s) {
        String vowels="aeiouAEIOU";
        int mid=s.length()/2, left=0, right=0;
        for (int i=0;i<mid;i++) if (vowels.indexOf(s.charAt(i))>=0) left++;
        for (int i=mid;i<s.length();i++) if (vowels.indexOf(s.charAt(i))>=0) right++;
        return left==right;
    }

    /**
     * Runs sample test cases.
      *
      * <p><b>Explanation:</b> Processes the string character by character, applying the transformation or predicate.</p>
      */
    public static void main(String[] args) {
        DetermineIfStringHalvesAreAlike sol = new DetermineIfStringHalvesAreAlike();
                System.out.println(sol.halvesAreAlike("book")); // true
                System.out.println(sol.halvesAreAlike("textbook")); // false
    }
}
