package org.leetcode.easy;


/**
 * <b>#2506 - Count Pairs Of Similar Strings</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Hash Table, String, Bit Manipulation, Counting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a 0-indexed string array words.
 *
 *
 * Two strings are similar if they consist of the same characters.
 *
 *
 * For example, "abca" and "cba" are similar since both consist of characters 'a', 'b', and 'c'.
 *
 * However, "abacba" and "bcfd" are not similar since they do not consist of the same characters.
 *
 * Return the number of pairs (i, j) such that 0 &lt;= i &lt; j &lt;= word.length - 1 and the two strings words[i] and words[j] are similar.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: words = ["aba","aabb","abcd","bac","aabc"]
 * Output: 2
 * Explanation: There are 2 pairs that satisfy the conditions:
 * - i = 0 and j = 1 : both words[0] and words[1] only consist of characters 'a' and 'b'. 
 * - i = 3 and j = 4 : both words[3] and words[4] only consist of characters 'a', 'b', and 'c'. 
 *
 * Example 2:
 *
 * Input: words = ["aabb","ab","ba"]
 * Output: 3
 * Explanation: There are 3 pairs that satisfy the conditions:
 * - i = 0 and j = 1 : both words[0] and words[1] only consist of characters 'a' and 'b'. 
 * - i = 0 and j = 2 : both words[0] and words[2] only consist of characters 'a' and 'b'.
 * - i = 1 and j = 2 : both words[1] and words[2] only consist of characters 'a' and 'b'.
 *
 * Example 3:
 *
 * Input: words = ["nba","cba","dba"]
 * Output: 0
 * Explanation: Since there does not exist any pair that satisfies the conditions, we return 0.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= words.length &lt;= 100
 *
 * 1 &lt;= words[i].length &lt;= 100
 *
 * words[i] consist of only lowercase English letters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: How can you check if two strings are similar?
 * Hint 2: Use a hashSet to store the character of each string.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, String, Bit Manipulation, Counting).
 *
 * @see <a href="https://leetcode.com/problems/count-pairs-of-similar-strings/">LeetCode #2506</a>
  *
  * <p><b>Explanation:</b> Uses a HashSet to detect duplicates or track seen elements in O(1) per operation.</p>
  */
public class CountPairsOfSimilarStrings {

    /**
     * Solves the problem: Similar pairs.
     *
     * @param words the words (String[])
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Uses a HashSet to detect duplicates or track seen elements in O(1) per operation.</p>
      */
    public int similarPairs(String[] words) {
        int cnt=0;
        for (int i=0;i<words.length-1;i++) for (int j=i+1;j<words.length;j++) {
            java.util.Set<Character> s1=new java.util.HashSet<>(), s2=new java.util.HashSet<>();
            for (char c:words[i].toCharArray()) s1.add(c);
            for (char c:words[j].toCharArray()) s2.add(c);
            if (s1.equals(s2)) cnt++;
        }
        return cnt;
    }

    public static void main(String[] args) {
        CountPairsOfSimilarStrings sol = new CountPairsOfSimilarStrings();
                System.out.println(sol.similarPairs(new String[]{"aba","aabb","abcd","bac","aabc"})); // 2
                System.out.println(sol.similarPairs(new String[]{"aabb","ab","ba"})); // 3
    }
}
