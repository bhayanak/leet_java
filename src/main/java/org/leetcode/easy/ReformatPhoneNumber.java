package org.leetcode.easy;


/**
 * <b>#1694 - Reformat Phone Number</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> String</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a phone number as a string number. number consists of digits, spaces ' ', and/or dashes '-'.
 *
 *
 * You would like to reformat the phone number in a certain manner. Firstly, remove all spaces and dashes. Then, group the digits from left to right into blocks of length 3 until there are 4 or fewer digits. The final digits are then grouped as follows:
 *
 *
 * 2 digits: A single block of length 2.
 *
 * 3 digits: A single block of length 3.
 *
 * 4 digits: Two blocks of length 2 each.
 *
 * The blocks are then joined by dashes. Notice that the reformatting process should never produce any blocks of length 1 and produce at most two blocks of length 2.
 *
 *
 * Return the phone number after formatting.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: number = "1-23-45 6"
 * Output: "123-456"
 * Explanation: The digits are "123456".
 * Step 1: There are more than 4 digits, so group the next 3 digits. The 1st block is "123".
 * Step 2: There are 3 digits remaining, so put them in a single block of length 3. The 2nd block is "456".
 * Joining the blocks gives "123-456".
 *
 * Example 2:
 *
 * Input: number = "123 4-567"
 * Output: "123-45-67"
 * Explanation: The digits are "1234567".
 * Step 1: There are more than 4 digits, so group the next 3 digits. The 1st block is "123".
 * Step 2: There are 4 digits left, so split them into two blocks of length 2. The blocks are "45" and "67".
 * Joining the blocks gives "123-45-67".
 *
 * Example 3:
 *
 * Input: number = "123 4-5678"
 * Output: "123-456-78"
 * Explanation: The digits are "12345678".
 * Step 1: The 1st block is "123".
 * Step 2: The 2nd block is "456".
 * Step 3: There are 2 digits left, so put them in a single block of length 2. The 3rd block is "78".
 * Joining the blocks gives "123-456-78".
 *
 *
 *
 * Constraints:
 *
 *
 * 2 &lt;= number.length &lt;= 100
 *
 * number consists of digits and the characters '-' and ' '.
 *
 * There are at least two digits in number.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Discard all the spaces and dashes.
 * Hint 2: Use a while loop. While the string still has digits, check its length and see which rule to apply.
 *
 * <h2>Approach</h2>
 * Think about the category (String).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/reformat-phone-number/">LeetCode #1694</a>
  *
  * <p><b>Explanation:</b> Uses StringBuilder for O(1) amortized character appends, avoiding O(n^2) String concatenation.</p>
  */
public class ReformatPhoneNumber {

    /**
     * Solves the problem: Reformat number.
     *
     * @param number the number (String)
     * @return the computed String result
      *
      * <p><b>Explanation:</b> Uses StringBuilder for O(1) amortized character appends, avoiding O(n^2) String concatenation.</p>
      */
    public String reformatNumber(String number) {
        String digits = number.replaceAll("[- ]","");
        StringBuilder sb = new StringBuilder();
        int i=0, n=digits.length();
        while (n-i>4) { sb.append(digits, i, i+3).append('-'); i+=3; }
        if (n-i==4) sb.append(digits, i, i+2).append('-').append(digits, i+2, n);
        else sb.append(digits, i, n);
        return sb.toString();
    }

    /**
     * Runs sample test cases.
      *
      * <p><b>Explanation:</b> Processes the string character by character, applying the transformation or predicate.</p>
      */
    public static void main(String[] args) {
        ReformatPhoneNumber sol = new ReformatPhoneNumber();
                System.out.println(sol.reformatNumber("1-23-45 6")); // "123-456"
                System.out.println(sol.reformatNumber("123 4-567")); // "123-45-67"
                System.out.println(sol.reformatNumber("123 4-5678")); // "123-456-78"
                System.out.println(sol.reformatNumber("12")); // "12"
    }
}
