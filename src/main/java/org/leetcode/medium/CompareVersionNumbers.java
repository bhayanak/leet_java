package org.leetcode.medium;

/**
 * <b>#165 - Compare Version Numbers</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Two Pointers, String</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given two version strings, version1 and version2, compare them. A version string consists of revisions separated by dots '.'. The value of the revision is its integer conversion ignoring leading zeros.
 * 
 * 
 * To compare version strings, compare their revision values in left-to-right order. If one of the version strings has fewer revisions, treat the missing revision values as 0.
 * 
 * 
 * Return the following:
 * 
 * 	
 * If version1 &lt; version2, return -1.
 * 	
 * If version1 &gt; version2, return 1.
 * 	
 * Otherwise, return 0.
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: version1 = "1.2", version2 = "1.10"
 * 
 * 
 * Output: -1
 * 
 * 
 * Explanation:
 * 
 * 
 * version1's second revision is "2" and version2's second revision is "10": 2 &lt; 10, so version1 &lt; version2.
 * 
 * Example 2:
 * 
 * Input: version1 = "1.01", version2 = "1.001"
 * 
 * 
 * Output: 0
 * 
 * 
 * Explanation:
 * 
 * 
 * Ignoring leading zeroes, both "01" and "001" represent the same integer "1".
 * 
 * Example 3:
 * 
 * Input: version1 = "1.0", version2 = "1.0.0.0"
 * 
 * 
 * Output: 0
 * 
 * 
 * Explanation:
 * 
 * 
 * version1 has less revisions, which means every missing revision are treated as "0".
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * 1 &lt;= version1.length, version2.length &lt;= 500
 * 	
 * version1 and version2 only contain digits and '.'.
 * 	
 * version1 and version2 are valid version numbers.
 * 	
 * All the given revisions in version1 and version2 can be stored in a 32-bit integer.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: You can use two pointers for each version string to traverse them together while comparing the corresponding segments.
 * Hint 2: Utilize the substring method to extract each version segment delimited by '.'. Ensure you're extracting the segments correctly by adjusting the start and end indices accordingly.
 *
 * <h2>Approach</h2>
 * Think about the category first (see tags above), then:
 * 1. Try a brute-force solution to understand the problem.
 * 2. Identify the bottleneck and optimise with the right data structure or algorithm.
 * 3. Consider: sorting, hashing, two pointers, sliding window,
 *    binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: TBD  |  Space: TBD
 *
 * @see <a href="https://leetcode.com/problems/compare-version-numbers/">LeetCode #165</a>
 */
public class CompareVersionNumbers {

    /**
     * TODO: Implement solution for "Compare Version Numbers".
     * @param args placeholder — replace with actual parameter(s)
     * @return     placeholder — replace with actual return type
     */
    public Object solve(Object args) {
        throw new UnsupportedOperationException("Not yet implemented: Compare Version Numbers");
    }

    // ─── Run & Demo ──────────────────────────────────────────────
    /**
     * Runs sample test cases to demonstrate the solution.
     * Execute: javac CompareVersionNumbers.java &amp;&amp; java org.leetcode.medium.CompareVersionNumbers
     *
     * @param args not used
     */
    public static void main(String[] args) {
        System.out.println("=== CompareVersionNumbers ===");
        CompareVersionNumbers sol = new CompareVersionNumbers();
        System.out.println(sol.solve(null));
    }
}
