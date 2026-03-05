package org.leetcode.medium;


/**
 * <b>#3234 - Count the Number of Substrings With Dominant Ones</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> String, Enumeration</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a binary string s.
 *
 *
 * Return the number of substrings with dominant ones.
 *
 *
 * A string has dominant ones if the number of ones in the string is greater than or equal to the square of the number of zeros in the string.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s = "00011"
 *
 *
 * Output: 5
 *
 *
 * Explanation:
 *
 *
 * The substrings with dominant ones are shown in the table below.
 *
 *
 *
 *
 * 			i
 * 			j
 * 			s[i..j]
 * 			Number of Zeros
 * 			Number of Ones
 *
 *
 *
 *
 *
 *
 * 			3
 * 			3
 * 			1
 * 			0
 * 			1
 *
 *
 *
 *
 * 			4
 * 			4
 * 			1
 * 			0
 * 			1
 *
 *
 *
 *
 * 			2
 * 			3
 * 			01
 * 			1
 * 			1
 *
 *
 *
 *
 * 			3
 * 			4
 * 			11
 * 			0
 * 			2
 *
 *
 *
 *
 * 			2
 * 			4
 * 			011
 * 			1
 * 			2
 *
 *
 *
 *
 * Example 2:
 *
 * Input: s = "101101"
 *
 *
 * Output: 16
 *
 *
 * Explanation:
 *
 *
 * The substrings with non-dominant ones are shown in the table below.
 *
 *
 * Since there are 21 substrings total and 5 of them have non-dominant ones, it follows that there are 16 substrings with dominant ones.
 *
 *
 *
 *
 * 			i
 * 			j
 * 			s[i..j]
 * 			Number of Zeros
 * 			Number of Ones
 *
 *
 *
 *
 *
 *
 * 			1
 * 			1
 * 			0
 * 			1
 * 			0
 *
 *
 *
 *
 * 			4
 * 			4
 * 			0
 * 			1
 * 			0
 *
 *
 *
 *
 * 			1
 * 			4
 * 			0110
 * 			2
 * 			2
 *
 *
 *
 *
 * 			0
 * 			4
 * 			10110
 * 			2
 * 			3
 *
 *
 *
 *
 * 			1
 * 			5
 * 			01101
 * 			2
 * 			3
 *
 *
 *
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= s.length &lt;= 4 * 104
 *
 * s consists only of characters '0' and '1'.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Let us fix the starting index <code>l</code> of the substring and count the number of indices <code>r</code> such that <code>l &lt;= r</code> and the substring <code>s[l..r]</code> has dominant ones.
 * Hint 2: A substring with dominant ones has at most <code>sqrt(n)</code> zeros.
 * Hint 3: We cannot iterate over every <code>r</code> and check if the  <code>s[l..r]</code> has dominant ones. Instead, we iterate over the next <code>sqrt(n)</code> zeros to the left of <code>l</code> and count the number of substrings with dominant ones where the current zero is the rightmost zero of the substring.
 *
 * <h2>Approach</h2>
 * Think about the category (String, Enumeration).
 *
 * @see <a href="https://leetcode.com/problems/count-the-number-of-substrings-with-dominant-ones/">LeetCode #3234</a>
 */
public class CountTheNumberOfSubstringsWithDominantOnes {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Count the Number of Substrings With Dominant Ones");
    }

    public static void main(String[] args) {
        System.out.println("=== CountTheNumberOfSubstringsWithDominantOnes ===");
        CountTheNumberOfSubstringsWithDominantOnes sol = new CountTheNumberOfSubstringsWithDominantOnes();
        System.out.println(sol.solve(null));
    }
}
