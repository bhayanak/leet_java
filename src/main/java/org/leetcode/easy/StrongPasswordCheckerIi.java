package org.leetcode.easy;


/**
 * <b>#2299 - Strong Password Checker II</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> String</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * A password is said to be strong if it satisfies all the following criteria:
 *
 *
 * It has at least 8 characters.
 *
 * It contains at least one lowercase letter.
 *
 * It contains at least one uppercase letter.
 *
 * It contains at least one digit.
 *
 * It contains at least one special character. The special characters are the characters in the following string: "!@#$%^&amp;*()-+".
 *
 * It does not contain 2 of the same character in adjacent positions (i.e., "aab" violates this condition, but "aba" does not).
 *
 * Given a string password, return true if it is a strong password. Otherwise, return false.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: password = "IloveLe3tcode!"
 * Output: true
 * Explanation: The password meets all the requirements. Therefore, we return true.
 *
 * Example 2:
 *
 * Input: password = "Me+You--IsMyDream"
 * Output: false
 * Explanation: The password does not contain a digit and also contains 2 of the same character in adjacent positions. Therefore, we return false.
 *
 * Example 3:
 *
 * Input: password = "1aB!"
 * Output: false
 * Explanation: The password does not meet the length requirement. Therefore, we return false.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= password.length &lt;= 100
 *
 * password consists of letters, digits, and special characters: "!@#$%^&amp;*()-+".
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: You can use a boolean flag to define certain types of characters seen in the string.
 * Hint 2: In the end, check if all boolean flags have ended up True, and do not forget to check the "adjacent" and "length" criteria.
 *
 * <h2>Approach</h2>
 * Think about the category (String).
 *
 * @see <a href="https://leetcode.com/problems/strong-password-checker-ii/">LeetCode #2299</a>
  *
  * <p><b>Explanation:</b> Validates the condition by scanning the input and returning false on the first violation.</p>
  */
public class StrongPasswordCheckerIi {

    /**
     * Solves the problem: Strong password checker ii.
     *
     * @param password the password (String)
     * @return the computed boolean result
      *
      * <p><b>Explanation:</b> Validates the condition by scanning the input and returning false on the first violation.</p>
      */
    public boolean strongPasswordCheckerIi(String password) {
        if (password.length()<8) return false;
        boolean hasUpper=false, hasLower=false, hasDigit=false, hasSpecial=false;
        String special="!@#$%^&*()-+";
        char prev=0;
        for (char c:password.toCharArray()) {
            if (c==prev) return false;
            if (Character.isUpperCase(c)) hasUpper=true;
            if (Character.isLowerCase(c)) hasLower=true;
            if (Character.isDigit(c)) hasDigit=true;
            if (special.indexOf(c)>=0) hasSpecial=true;
            prev=c;
        }
        return hasUpper&&hasLower&&hasDigit&&hasSpecial;
    }

    public static void main(String[] args) {
        StrongPasswordCheckerIi sol = new StrongPasswordCheckerIi();
                System.out.println(sol.strongPasswordCheckerIi("IloveLe3tcode!")); // true
                System.out.println(sol.strongPasswordCheckerIi("Me+You--IsMyDream")); // false
                System.out.println(sol.strongPasswordCheckerIi("1aB!")); // false
    }
}
