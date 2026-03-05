package org.leetcode.easy;


/**
 * <b>#1108 - Defanging an IP Address</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> String</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given a valid (IPv4) IP address, return a defanged version of that IP address.
 *
 *
 * A defanged IP address replaces every period "." with "[.]".
 *
 *
 *
 *
 * Example 1:
 *
 * Input: address = "1.1.1.1"
 * Output: "1[.]1[.]1[.]1"
 *
 *
 * Example 2:
 *
 * Input: address = "255.100.50.0"
 * Output: "255[.]100[.]50[.]0"
 *
 *
 *
 *
 *
 * Constraints:
 *
 *
 *
 *
 * The given address is a valid IPv4 address.
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
 * @see <a href="https://leetcode.com/problems/defanging-an-ip-address/">LeetCode #1108</a>
  *
  * <p><b>Explanation:</b> Processes the string character by character, applying the transformation or predicate.</p>
  */
public class DefangingAnIpAddress {

    /**
     * Solves the problem: Defang i paddr.
     *
     * @param address the address (String)
     * @return the computed String result
      *
      * <p><b>Explanation:</b> Processes the string character by character, applying the transformation or predicate.</p>
      */
    public String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac DefangingAnIpAddress.java &amp;&amp; java org.leetcode.easy.DefangingAnIpAddress</pre>
      *
      * <p><b>Explanation:</b> Processes the string character by character, applying the transformation or predicate.</p>
      */
    public static void main(String[] args) {
        DefangingAnIpAddress sol = new DefangingAnIpAddress();
                System.out.println(sol.defangIPaddr("1.1.1.1"));     // "1[.]1[.]1[.]1"
                System.out.println(sol.defangIPaddr("255.100.50.0")); // "255[.]100[.]50[.]0"
    }
}
