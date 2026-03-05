package org.leetcode.easy;


/**
 * <b>#2283 - Check if Number Has Equal Digit Count and Digit Value</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Hash Table, String, Counting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a 0-indexed string num of length n consisting of digits.
 *
 *
 * Return true if for every index i in the range 0 &lt;= i &lt; n, the digit i occurs num[i] times in num, otherwise return false.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: num = "1210"
 * Output: true
 * Explanation:
 * num[0] = '1'. The digit 0 occurs once in num.
 * num[1] = '2'. The digit 1 occurs twice in num.
 * num[2] = '1'. The digit 2 occurs once in num.
 * num[3] = '0'. The digit 3 occurs zero times in num.
 * The condition holds true for every index in "1210", so return true.
 *
 * Example 2:
 *
 * Input: num = "030"
 * Output: false
 * Explanation:
 * num[0] = '0'. The digit 0 should occur zero times, but actually occurs twice in num.
 * num[1] = '3'. The digit 1 should occur three times, but actually occurs zero times in num.
 * num[2] = '0'. The digit 2 occurs zero times in num.
 * The indices 0 and 1 both violate the condition, so return false.
 *
 *
 *
 * Constraints:
 *
 *
 * n == num.length
 *
 * 1 &lt;= n &lt;= 10
 *
 * num consists of digits.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Count the frequency of each digit in num.
 *
 * <h2>Approach</h2>
 * Think about the category (Hash Table, String, Counting).
 *
 * @see <a href="https://leetcode.com/problems/check-if-number-has-equal-digit-count-and-digit-value/">LeetCode #2283</a>
  *
  * <p><b>Explanation:</b> Validates the condition by scanning the input and returning false on the first violation.</p>
  */
public class CheckIfNumberHasEqualDigitCountAndDigitValue {

    /**
     * Returns true if Is whitespace.
     *
     * @param c the c (char)
     * @return the computed boolean result
      *
      * <p><b>Explanation:</b> Validates the condition by scanning the input and returning false on the first violation.</p>
      */
    public boolean isWhitespace(char c) { return c == ' ' || c == '\t' || c == '\n'; }
    /**
     * Checks Check if pangram2.
     *
     * @param sentence the sentence (String)
     * @return the computed boolean result
      *
      * <p><b>Explanation:</b> Validates the condition by scanning the input and returning false on the first violation.</p>
      */
    public boolean checkIfPangram2(String sentence) {
        return sentence.chars().filter(Character::isLetter).map(Character::toLowerCase).distinct().count()==26;
    }
    // Main method tests a simpler problem—checking digit parity
    /**
     * Solves the problem: Digit count.
     *
     * @param s the s (String)
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Iterates once, incrementing a counter each time the target condition is satisfied.</p>
      */
    public int digitCount(String s) {
        for (int i=0;i<s.length();i++) {
            int d=s.charAt(i)-'0';
            long cnt=s.chars().filter(c->c-'0'==d).count();
            if (cnt!=d) return 0;
        }
        return 1;
    }

    public static void main(String[] args) {
        CheckIfNumberHasEqualDigitCountAndDigitValue sol = new CheckIfNumberHasEqualDigitCountAndDigitValue();
                System.out.println(sol.digitCount("1210")); // 1 (0 ones? no: s[0]='1' means 1 zero; s[1]='2' means 2 ones; s[2]='1' means 1 two; s[3]='0' means 0 threes)
                System.out.println(sol.digitCount("030")); // 0
    }
}
