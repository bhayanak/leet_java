package org.leetcode.medium;

/**
 * <b>#93 - Restore IP Addresses</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> String, Backtracking</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * A valid IP address consists of exactly four integers separated by single dots. Each integer is between 0 and 255 (inclusive) and cannot have leading zeros.
 * 
 * 	
 * For example, "0.1.2.201" and "192.168.1.1" are valid IP addresses, but "0.011.255.245", "192.168.1.312" and "192.168@1.1" are invalid IP addresses.
 * 
 * Given a string s containing only digits, return all possible valid IP addresses that can be formed by inserting dots into s. You are not allowed to reorder or remove any digits in s. You may return the valid IP addresses in any order.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: s = "25525511135"
 * Output: ["255.255.11.135","255.255.111.35"]
 * 
 * Example 2:
 * 
 * Input: s = "0000"
 * Output: ["0.0.0.0"]
 * 
 * Example 3:
 * 
 * Input: s = "101023"
 * Output: ["1.0.10.23","1.0.102.3","10.1.0.23","10.10.2.3","101.0.2.3"]
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * 1 &lt;= s.length &lt;= 20
 * 	
 * s consists of digits only.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints available — try to figure out the category and approach first!
 *
 * <h2>Approach</h2>
 * Break the problem into smaller sub-problems or work through examples manually.
 * Consider: brute-force first, then optimise with sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, dynamic programming, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: TBD  |  Space: TBD
 *
 * @see <a href="https://leetcode.com/problems/restore-ip-addresses/">LeetCode #93</a>
 */
public class RestoreIpAddresses {

    /**
     * TODO: Implement solution for "Restore IP Addresses".
     *
     * <p>Start with a brute-force and identify the bottleneck.
     * Hint: think about the data structure or algorithm category above.</p>
     *
     * @param args placeholder — replace with the real method signature
     * @return     placeholder — replace with the real return type
     */
    public Object solve(Object args) {
        // TODO: implement
        throw new UnsupportedOperationException("Not yet implemented: Restore IP Addresses");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        RestoreIpAddresses sol = new RestoreIpAddresses();
        System.out.println(sol.solve(null));
    }
}
