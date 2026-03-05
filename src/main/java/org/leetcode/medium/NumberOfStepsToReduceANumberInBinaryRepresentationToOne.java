package org.leetcode.medium;


/**
 * <b>#1404 - Number of Steps to Reduce a Number in Binary Representation to One</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> String, Bit Manipulation, Simulation</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given the binary representation of an integer as a string s, return the number of steps to reduce it to 1 under the following rules:
 *
 *
 *
 *
 * If the current number is even, you have to divide it by 2.
 *
 *
 *
 *
 * If the current number is odd, you have to add 1 to it.
 *
 *
 * It is guaranteed that you can always reach one for all test cases.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s = "1101"
 * Output: 6
 * Explanation: "1101" corressponds to number 13 in their decimal representation.
 * Step 1) 13 is odd, add 1 and obtain 14. 
 * Step 2) 14 is even, divide by 2 and obtain 7.
 * Step 3) 7 is odd, add 1 and obtain 8.
 * Step 4) 8 is even, divide by 2 and obtain 4.  
 * Step 5) 4 is even, divide by 2 and obtain 2. 
 * Step 6) 2 is even, divide by 2 and obtain 1.  
 *
 * Example 2:
 *
 * Input: s = "10"
 * Output: 1
 * Explanation: "10" corresponds to number 2 in their decimal representation.
 * Step 1) 2 is even, divide by 2 and obtain 1.  
 *
 * Example 3:
 *
 * Input: s = "1"
 * Output: 0
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= s.length &lt;= 500
 *
 * s consists of characters '0' or '1'
 *
 * s[0] == '1'
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Read the string from right to left, if the string ends in '0' then the number is even otherwise it is odd.
 * Hint 2: Simulate the steps described in the binary string.
 *
 * <h2>Approach</h2>
 * Think about the category (String, Bit Manipulation, Simulation).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/number-of-steps-to-reduce-a-number-in-binary-representation-to-one/">LeetCode #1404</a>
 */
public class NumberOfStepsToReduceANumberInBinaryRepresentationToOne {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Number of Steps to Reduce a Number in Binary Representation to One");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== NumberOfStepsToReduceANumberInBinaryRepresentationToOne ===");
        NumberOfStepsToReduceANumberInBinaryRepresentationToOne sol = new NumberOfStepsToReduceANumberInBinaryRepresentationToOne();
        System.out.println(sol.solve(null));
    }
}
