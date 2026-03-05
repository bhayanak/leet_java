package org.leetcode.medium;


/**
 * <b>#2526 - Find Consecutive Integers from a Data Stream</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Hash Table, Design, Queue, Counting, Data Stream</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * For a stream of integers, implement a data structure that checks if the last k integers parsed in the stream are equal to value.
 *
 *
 * Implement the DataStream class:
 *
 *
 * DataStream(int value, int k) Initializes the object with an empty integer stream and the two integers value and k.
 *
 * boolean consec(int num) Adds num to the stream of integers. Returns true if the last k integers are equal to value, and false otherwise. If there are less than k integers, the condition does not hold true, so returns false.
 *
 *
 *
 * Example 1:
 *
 * Input
 * ["DataStream", "consec", "consec", "consec", "consec"]
 * [[4, 3], [4], [4], [4], [3]]
 * Output
 * [null, false, false, true, false]
 *
 * Explanation
 * DataStream dataStream = new DataStream(4, 3); //value = 4, k = 3 
 * dataStream.consec(4); // Only 1 integer is parsed, so returns False. 
 * dataStream.consec(4); // Only 2 integers are parsed.
 *                       // Since 2 is less than k, returns False. 
 * dataStream.consec(4); // The 3 integers parsed are all equal to value, so returns True. 
 * dataStream.consec(3); // The last k integers parsed in the stream are [4,4,3].
 *                       // Since 3 is not equal to value, it returns False.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= value, num &lt;= 109
 *
 * 1 &lt;= k &lt;= 105
 *
 * At most 105 calls will be made to consec.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Keep track of the last integer which is not equal to <code>value</code>.
 * Hint 2: Use a queue-type data structure to store the last <code>k</code> integers.
 *
 * <h2>Approach</h2>
 * Think about the category (Hash Table, Design, Queue, Counting, Data Stream).
 *
 * @see <a href="https://leetcode.com/problems/find-consecutive-integers-from-a-data-stream/">LeetCode #2526</a>
 */
public class FindConsecutiveIntegersFromADataStream {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Find Consecutive Integers from a Data Stream");
    }

    public static void main(String[] args) {
        System.out.println("=== FindConsecutiveIntegersFromADataStream ===");
        FindConsecutiveIntegersFromADataStream sol = new FindConsecutiveIntegersFromADataStream();
        System.out.println(sol.solve(null));
    }
}
