package org.leetcode.easy;


/**
 * <b>#3120 - Count the Number of Special Characters I</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Hash Table, String</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a string word. A letter is called special if it appears both in lowercase and uppercase in word.
 *
 *
 * Return the number of special letters in word.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: word = "aaAbcBC"
 *
 *
 * Output: 3
 *
 *
 * Explanation:
 *
 *
 * The special characters in word are 'a', 'b', and 'c'.
 *
 * Example 2:
 *
 * Input: word = "abc"
 *
 *
 * Output: 0
 *
 *
 * Explanation:
 *
 *
 * No character in word appears in uppercase.
 *
 * Example 3:
 *
 * Input: word = "abBCab"
 *
 *
 * Output: 1
 *
 *
 * Explanation:
 *
 *
 * The only special character in word is 'b'.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= word.length &lt;= 50
 *
 * word consists of only lowercase and uppercase English letters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: The constraints are small. For all 52 characters, check if they are present in <code>word</code>.
 *
 * <h2>Approach</h2>
 * Think about the category (Hash Table, String).
 *
 * @see <a href="https://leetcode.com/problems/count-the-number-of-special-characters-i/">LeetCode #3120</a>
  *
  * <p><b>Explanation:</b> Uses a HashSet to detect duplicates or track seen elements in O(1) per operation. Uses StringBuilder for O(1) amortized character appends, avoiding O(n^2) String concatenation.</p>
  */
public class CountTheNumberOfSpecialCharactersI {

    /**
     * Counts Count distinct integers.
     *
     * @param nums the nums (int[])
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Uses a HashSet to detect duplicates or track seen elements in O(1) per operation. Uses StringBuilder for O(1) amortized character appends, avoiding O(n^2) String concatenation.</p>
      */
    public int countDistinctIntegers(int[] nums) {
        java.util.Set<Integer> set=new java.util.HashSet<>();
        for (int n:nums) {
            set.add(n);
            String rev=new StringBuilder(String.valueOf(n)).reverse().toString();
            set.add(Integer.parseInt(rev));
        }
        return set.size();
    }

    public static void main(String[] args) {
        CountTheNumberOfSpecialCharactersI sol = new CountTheNumberOfSpecialCharactersI();
        System.out.println(sol.countDistinctIntegers(new int[]{1,2,3}));
    }
}
