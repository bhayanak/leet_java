package org.leetcode.medium;


/**
 * <b>#831 - Masking Personal Information</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> String</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a personal information string s, representing either an email address or a phone number. Return the masked personal information using the below rules.
 *
 *
 * Email address:
 *
 *
 * An email address is:
 *
 *
 * A name consisting of uppercase and lowercase English letters, followed by
 *
 * The '@' symbol, followed by
 *
 * The domain consisting of uppercase and lowercase English letters with a dot '.' somewhere in the middle (not the first or last character).
 *
 * To mask an email:
 *
 *
 * The uppercase letters in the name and domain must be converted to lowercase letters.
 *
 * The middle letters of the name (i.e., all but the first and last letters) must be replaced by 5 asterisks "*****".
 *
 * Phone number:
 *
 *
 * A phone number is formatted as follows:
 *
 *
 * The phone number contains 10-13 digits.
 *
 * The last 10 digits make up the local number.
 *
 * The remaining 0-3 digits, in the beginning, make up the country code.
 *
 * Separation characters from the set {'+', '-', '(', ')', ' '} separate the above digits in some way.
 *
 * To mask a phone number:
 *
 *
 * Remove all separation characters.
 *
 * The masked phone number should have the form:
 *
 *
 *
 * "***-***-XXXX" if the country code has 0 digits.
 *
 * "+*-***-***-XXXX" if the country code has 1 digit.
 *
 * "+**-***-***-XXXX" if the country code has 2 digits.
 *
 * "+***-***-***-XXXX" if the country code has 3 digits.
 *
 *
 *
 * "XXXX" is the last 4 digits of the local number.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "LeetCode@LeetCode.com"
 * Output: "l*****e@leetcode.com"
 * Explanation: s is an email address.
 * The name and domain are converted to lowercase, and the middle of the name is replaced by 5 asterisks.
 *
 * Example 2:
 *
 * Input: s = "AB@qq.com"
 * Output: "a*****b@qq.com"
 * Explanation: s is an email address.
 * The name and domain are converted to lowercase, and the middle of the name is replaced by 5 asterisks.
 * Note that even though "ab" is 2 characters, it still must have 5 asterisks in the middle.
 *
 * Example 3:
 *
 * Input: s = "1(234)567-890"
 * Output: "***-***-7890"
 * Explanation: s is a phone number.
 * There are 10 digits, so the local number is 10 digits and the country code is 0 digits.
 * Thus, the resulting masked number is "***-***-7890".
 *
 *
 *
 * Constraints:
 *
 *
 * s is either a valid email or a phone number.
 *
 * If s is an email:
 *
 *
 *
 * 8 &lt;= s.length &lt;= 40
 *
 * s consists of uppercase and lowercase English letters and exactly one '@' symbol and '.' symbol.
 *
 *
 *
 * If s is a phone number:
 *
 *
 *
 * 10 &lt;= s.length &lt;= 20
 *
 * s consists of digits, spaces, and the symbols '(', ')', '-', and '+'.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (String).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/masking-personal-information/">LeetCode #831</a>
 */
public class MaskingPersonalInformation {

    /**
     * TODO: Implement "Masking Personal Information".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Masking Personal Information");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac MaskingPersonalInformation.java &amp;&amp; java org.leetcode.medium.MaskingPersonalInformation</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== MaskingPersonalInformation ===");
        MaskingPersonalInformation sol = new MaskingPersonalInformation();
        System.out.println(sol.solve(null));
    }
}
