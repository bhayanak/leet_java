package org.leetcode.easy;


/**
 * <b>#2053 - Kth Distinct String in an Array</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Hash Table, String, Counting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * A distinct string is a string that is present only once in an array.
 *
 *
 * Given an array of strings arr, and an integer k, return the kth distinct string present in arr. If there are fewer than k distinct strings, return an empty string "".
 *
 *
 * Note that the strings are considered in the order in which they appear in the array.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: arr = ["d","b","c","b","c","a"], k = 2
 * Output: "a"
 * Explanation:
 * The only distinct strings in arr are "d" and "a".
 * "d" appears 1st, so it is the 1st distinct string.
 * "a" appears 2nd, so it is the 2nd distinct string.
 * Since k == 2, "a" is returned. 
 *
 * Example 2:
 *
 * Input: arr = ["aaa","aa","a"], k = 1
 * Output: "aaa"
 * Explanation:
 * All strings in arr are distinct, so the 1st string "aaa" is returned.
 *
 * Example 3:
 *
 * Input: arr = ["a","b","a"], k = 3
 * Output: ""
 * Explanation:
 * The only distinct string is "b". Since there are fewer than 3 distinct strings, we return an empty string "".
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= k &lt;= arr.length &lt;= 1000
 *
 * 1 &lt;= arr[i].length &lt;= 5
 *
 * arr[i] consists of lowercase English letters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Try 'mapping' the strings to check if they are unique or not.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, String, Counting).
 *
 * @see <a href="https://leetcode.com/problems/kth-distinct-string-in-an-array/">LeetCode #2053</a>
  *
  * <p><b>Explanation:</b> Validates the condition by scanning the input and returning false on the first violation.</p>
  */
public class KthDistinctStringInAnArray {

    /**
     * Solves the problem: Kth distinct.
     * Uses a hash map to track occurrences or cache results.
     *
     * @param arr the arr (String[])
     * @param k the k (int)
     * @return the computed String result
      *
      * <p><b>Explanation:</b> Validates the condition by scanning the input and returning false on the first violation.</p>
      */
    public String kthDistinct(String[] arr, int k) {
        java.util.LinkedHashMap<String,Integer> cnt = new java.util.LinkedHashMap<>();
        for (String s:arr) cnt.merge(s,1,Integer::sum);
        for (var e:cnt.entrySet()) if (e.getValue()==1 && --k==0) return e.getKey();
        return "";
    }

    public static void main(String[] args) {
        KthDistinctStringInAnArray sol = new KthDistinctStringInAnArray();
                System.out.println(sol.kthDistinct(new String[]{"d","b","c","b","c","a"},2)); // "a"
                System.out.println(sol.kthDistinct(new String[]{"aaa","aa","a"},1));           // "aaa"
                System.out.println(sol.kthDistinct(new String[]{"a","b","a"},3));              // ""
    }
}
