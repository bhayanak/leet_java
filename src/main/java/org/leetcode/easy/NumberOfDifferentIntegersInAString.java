package org.leetcode.easy;


/**
 * <b>#1805 - Number of Different Integers in a String</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Hash Table, String</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a string word that consists of digits and lowercase English letters.
 *
 *
 * You will replace every non-digit character with a space. For example, "a123bc34d8ef34" will become " 123  34 8  34". Notice that you are left with some integers that are separated by at least one space: "123", "34", "8", and "34".
 *
 *
 * Return the number of different integers after performing the replacement operations on word.
 *
 *
 * Two integers are considered different if their decimal representations without any leading zeros are different.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: word = "a123bc34d8ef34"
 * Output: 3
 * Explanation: The three different integers are "123", "34", and "8". Notice that "34" is only counted once.
 *
 * Example 2:
 *
 * Input: word = "leet1234code234"
 * Output: 2
 *
 * Example 3:
 *
 * Input: word = "a1b01c001"
 * Output: 1
 * Explanation: The three integers "1", "01", and "001" all represent the same integer because
 * the leading zeros are ignored when comparing their decimal values.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= word.length &lt;= 1000
 *
 * word consists of digits and lowercase English letters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Try to split the string so that each integer is in a different string.
 * Hint 2: Try to remove each integer's leading zeroes and compare the strings to find how many of them are unique.
 *
 * <h2>Approach</h2>
 * Think about the category (Hash Table, String).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/number-of-different-integers-in-a-string/">LeetCode #1805</a>
  *
  * <p><b>Explanation:</b> Uses a HashSet to detect duplicates or track seen elements in O(1) per operation.</p>
  */
public class NumberOfDifferentIntegersInAString {

    /**
     * Solves the problem: Num different integers.
     *
     * @param word the word (String)
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Uses a HashSet to detect duplicates or track seen elements in O(1) per operation.</p>
      */
    public int numDifferentIntegers(String word) {
        java.util.Set<String> set = new java.util.HashSet<>();
        int n=word.length(), i=0;
        while (i<n) {
            if (Character.isDigit(word.charAt(i))) {
                while (i<n && word.charAt(i)=='0') i++; // skip leading zeros
                int start=i;
                while (i<n && Character.isDigit(word.charAt(i))) i++;
                set.add(word.substring(start,i));
            } else i++;
        }
        return set.size();
    }

    /**
     * Runs sample test cases.
      *
      * <p><b>Explanation:</b> Processes the string character by character, applying the transformation or predicate.</p>
      */
    public static void main(String[] args) {
        NumberOfDifferentIntegersInAString sol = new NumberOfDifferentIntegersInAString();
                System.out.println(sol.numDifferentIntegers("a123bc34d8ef34")); // 3
                System.out.println(sol.numDifferentIntegers("leet1234code234")); // 2
                System.out.println(sol.numDifferentIntegers("a1b01c001")); // 1
    }
}
