package org.leetcode.hard;


/**
 * <b>#3451 - Find Invalid IP Addresses</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Database</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Table:  logs
 *
 * +-------------+---------+
 * | Column Name | Type    |
 * +-------------+---------+
 * | log_id      | int     |
 * | ip          | varchar |
 * | status_code | int     |
 * +-------------+---------+
 * log_id is the unique key for this table.
 * Each row contains server access log information including IP address and HTTP status code.
 *
 * Write a solution to find invalid IP addresses. An IPv4 address is invalid if it meets any of these conditions:
 *
 *
 * Contains numbers greater than 255 in any octet
 *
 * Has leading zeros in any octet (like 01.02.03.04)
 *
 * Has less or more than 4 octets
 *
 * Return the result table ordered by invalid_count, ip in descending order respectively. 
 *
 *
 * The result format is in the following example.
 *
 *
 *
 *
 * Example:
 *
 * Input:
 *
 *
 * logs table:
 *
 * +--------+---------------+-------------+
 * | log_id | ip            | status_code | 
 * +--------+---------------+-------------+
 * | 1      | 192.168.1.1   | 200         | 
 * | 2      | 256.1.2.3     | 404         | 
 * | 3      | 192.168.001.1 | 200         | 
 * | 4      | 192.168.1.1   | 200         | 
 * | 5      | 192.168.1     | 500         | 
 * | 6      | 256.1.2.3     | 404         | 
 * | 7      | 192.168.001.1 | 200         | 
 * +--------+---------------+-------------+
 *
 * Output:
 *
 * +---------------+--------------+
 * | ip            | invalid_count|
 * +---------------+--------------+
 * | 256.1.2.3     | 2            |
 * | 192.168.001.1 | 2            |
 * | 192.168.1     | 1            |
 * +---------------+--------------+
 *
 * Explanation:
 *
 *
 * 256.1.2.3 is invalid because 256 &gt; 255
 *
 * 192.168.001.1 is invalid because of leading zeros
 *
 * 192.168.1 is invalid because it has only 3 octets
 *
 * The output table is ordered by invalid_count, ip in descending order respectively.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints -- trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (Database).
 *
 * @see <a href="https://leetcode.com/problems/find-invalid-ip-addresses/">LeetCode #3451</a>
 */
public class FindInvalidIpAddresses {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Find Invalid IP Addresses");
    }

    public static void main(String[] args) {
        System.out.println("=== FindInvalidIpAddresses ===");
        FindInvalidIpAddresses sol = new FindInvalidIpAddresses();
        System.out.println(sol.solve(null));
    }
}
