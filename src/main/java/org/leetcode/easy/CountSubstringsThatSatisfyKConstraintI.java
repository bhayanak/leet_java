package org.leetcode.easy;


/**
 * <b>#3258 - Count Substrings That Satisfy K-Constraint I</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> String, Sliding Window</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a binary string s and an integer k.
 *
 *
 * A binary string satisfies the k-constraint if either of the following conditions holds:
 *
 *
 * The number of 0's in the string is at most k.
 *
 * The number of 1's in the string is at most k.
 *
 * Return an integer denoting the number of substrings of s that satisfy the k-constraint.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s = "10101", k = 1
 *
 *
 * Output: 12
 *
 *
 * Explanation:
 *
 *
 * Every substring of s except the substrings "1010", "10101", and "0101" satisfies the k-constraint.
 *
 * Example 2:
 *
 * Input: s = "1010101", k = 2
 *
 *
 * Output: 25
 *
 *
 * Explanation:
 *
 *
 * Every substring of s except the substrings with a length greater than 5 satisfies the k-constraint.
 *
 * Example 3:
 *
 * Input: s = "11111", k = 1
 *
 *
 * Output: 15
 *
 *
 * Explanation:
 *
 *
 * All substrings of s satisfy the k-constraint.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= s.length &lt;= 50 
 *
 * 1 &lt;= k &lt;= s.length
 *
 * s[i] is either '0' or '1'.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Using a brute force approach, check each index until a substring satisfying the k-constraint is found, then increment.
 *
 * <h2>Approach</h2>
 * Think about the category (String, Sliding Window).
 *
 * @see <a href="https://leetcode.com/problems/count-substrings-that-satisfy-k-constraint-i/">LeetCode #3258</a>
  *
  * <p><b>Explanation:</b> Iterates once, incrementing a counter each time the target condition is satisfied.</p>
  */
public class CountSubstringsThatSatisfyKConstraintI {

    /**
     * Counts Count k constraint substrings.
     *
     * @param s the s (String)
     * @param k the k (int)
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Iterates once, incrementing a counter each time the target condition is satisfied.</p>
      */
    public int countKConstraintSubstrings(String s, int k) {
        int cnt=0, n=s.length();
        for (int i=0;i<n;i++) {
            int zeros=0, ones=0;
            for (int j=i;j<n;j++) {
                if (s.charAt(j)=='0') zeros++; else ones++;
                if (zeros<=k||ones<=k) cnt++;
                else break;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        CountSubstringsThatSatisfyKConstraintI sol = new CountSubstringsThatSatisfyKConstraintI();
        System.out.println(sol.countKConstraintSubstrings("test", 0));
    }
}
