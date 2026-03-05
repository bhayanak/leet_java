package org.leetcode.medium;


/**
 * <b>#1286 - Iterator for Combination</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> String, Backtracking, Design, Iterator</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Design the CombinationIterator class:
 *
 *
 * CombinationIterator(string characters, int combinationLength) Initializes the object with a string characters of sorted distinct lowercase English letters and a number combinationLength as arguments.
 *
 * next() Returns the next combination of length combinationLength in lexicographical order.
 *
 * hasNext() Returns true if and only if there exists a next combination.
 *
 *
 *
 * Example 1:
 *
 * Input
 * ["CombinationIterator", "next", "hasNext", "next", "hasNext", "next", "hasNext"]
 * [["abc", 2], [], [], [], [], [], []]
 * Output
 * [null, "ab", true, "ac", true, "bc", false]
 *
 * Explanation
 * CombinationIterator itr = new CombinationIterator("abc", 2);
 * itr.next();    // return "ab"
 * itr.hasNext(); // return True
 * itr.next();    // return "ac"
 * itr.hasNext(); // return True
 * itr.next();    // return "bc"
 * itr.hasNext(); // return False
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= combinationLength &lt;= characters.length &lt;= 15
 *
 * All the characters of characters are unique.
 *
 * At most 104 calls will be made to next and hasNext.
 *
 * It is guaranteed that all calls of the function next are valid.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Generate all combinations as a preprocessing.
 * Hint 2: Use bit masking to generate all the combinations.
 *
 * <h2>Approach</h2>
 * Think about the category (String, Backtracking, Design, Iterator).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/iterator-for-combination/">LeetCode #1286</a>
 */
public class IteratorForCombination {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Iterator for Combination");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== IteratorForCombination ===");
        IteratorForCombination sol = new IteratorForCombination();
        System.out.println(sol.solve(null));
    }
}
