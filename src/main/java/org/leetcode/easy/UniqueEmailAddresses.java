package org.leetcode.easy;


/**
 * <b>#929 - Unique Email Addresses</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Hash Table, String</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Every valid email consists of a local name and a domain name, separated by the '@' sign. Besides lowercase letters, the email may contain one or more '.' or '+'.
 *
 *
 * For example, in "alice@leetcode.com", "alice" is the local name, and "leetcode.com" is the domain name.
 *
 * If you add periods '.' between some characters in the local name part of an email address, mail sent there will be forwarded to the same address without dots in the local name. Note that this rule does not apply to domain names.
 *
 *
 * For example, "alice.z@leetcode.com" and "alicez@leetcode.com" forward to the same email address.
 *
 * If you add a plus '+' in the local name, everything after the first plus sign will be ignored. This allows certain emails to be filtered. Note that this rule does not apply to domain names.
 *
 *
 * For example, "m.y+name@email.com" will be forwarded to "my@email.com".
 *
 * It is possible to use both of these rules at the same time.
 *
 *
 * Given an array of strings emails where we send one email to each emails[i], return the number of different addresses that actually receive mails.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: emails = ["test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"]
 * Output: 2
 * Explanation: "testemail@leetcode.com" and "testemail@lee.tcode.com" actually receive mails.
 *
 * Example 2:
 *
 * Input: emails = ["a@leetcode.com","b@leetcode.com","c@leetcode.com"]
 * Output: 3
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= emails.length &lt;= 100
 *
 * 1 &lt;= emails[i].length &lt;= 100
 *
 * emails[i] consist of lowercase English letters, '+', '.' and '@'.
 *
 * Each emails[i] contains exactly one '@' character.
 *
 * All local and domain names are non-empty.
 *
 * Local names do not start with a '+' character.
 *
 * Domain names end with the ".com" suffix.
 *
 * Domain names must contain at least one character before ".com" suffix.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, String).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/unique-email-addresses/">LeetCode #929</a>
  *
  * <p><b>Explanation:</b> Uses a HashSet to detect duplicates or track seen elements in O(1) per operation.</p>
  */
public class UniqueEmailAddresses {

    /**
     * Solves the problem: Num unique emails.
     *
     * @param emails the emails (String[])
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Uses a HashSet to detect duplicates or track seen elements in O(1) per operation.</p>
      */
    public int numUniqueEmails(String[] emails) {
        java.util.Set<String> unique = new java.util.HashSet<>();
        for (String email : emails) {
            String[] parts = email.split("@");
            String local = parts[0].replaceAll("\\+.*", "").replace(".", "");
            unique.add(local + "@" + parts[1]);
        }
        return unique.size();
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac UniqueEmailAddresses.java &amp;&amp; java org.leetcode.easy.UniqueEmailAddresses</pre>
      *
      * <p><b>Explanation:</b> Processes the string character by character, applying the transformation or predicate.</p>
      */
    public static void main(String[] args) {
        UniqueEmailAddresses sol = new UniqueEmailAddresses();
                System.out.println(sol.numUniqueEmails(new String[]{
                    "test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"
                })); // 2
    }
}
