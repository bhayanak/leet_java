package org.leetcode.medium;


/**
 * <b>#900 - RLE Iterator</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Design, Counting, Iterator</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * We can use run-length encoding (i.e., RLE) to encode a sequence of integers. In a run-length encoded array of even length encoding (0-indexed), for all even i, encoding[i] tells us the number of times that the non-negative integer value encoding[i + 1] is repeated in the sequence.
 *
 *
 * For example, the sequence arr = [8,8,8,5,5] can be encoded to be encoding = [3,8,2,5]. encoding = [3,8,0,9,2,5] and encoding = [2,8,1,8,2,5] are also valid RLE of arr.
 *
 * Given a run-length encoded array, design an iterator that iterates through it.
 *
 *
 * Implement the RLEIterator class:
 *
 *
 * RLEIterator(int[] encoded) Initializes the object with the encoded array encoded.
 *
 * int next(int n) Exhausts the next n elements and returns the last element exhausted in this way. If there is no element left to exhaust, return -1 instead.
 *
 *
 *
 * Example 1:
 *
 * Input
 * ["RLEIterator", "next", "next", "next", "next"]
 * [[[3, 8, 0, 9, 2, 5]], [2], [1], [1], [2]]
 * Output
 * [null, 8, 8, 5, -1]
 *
 * Explanation
 * RLEIterator rLEIterator = new RLEIterator([3, 8, 0, 9, 2, 5]); // This maps to the sequence [8,8,8,5,5].
 * rLEIterator.next(2); // exhausts 2 terms of the sequence, returning 8. The remaining sequence is now [8, 5, 5].
 * rLEIterator.next(1); // exhausts 1 term of the sequence, returning 8. The remaining sequence is now [5, 5].
 * rLEIterator.next(1); // exhausts 1 term of the sequence, returning 5. The remaining sequence is now [5].
 * rLEIterator.next(2); // exhausts 2 terms, returning -1. This is because the first term exhausted was 5,
 * but the second term did not exist. Since the last term exhausted does not exist, we return -1.
 *
 *
 *
 * Constraints:
 *
 *
 * 2 &lt;= encoding.length &lt;= 1000
 *
 * encoding.length is even.
 *
 * 0 &lt;= encoding[i] &lt;= 109
 *
 * 1 &lt;= n &lt;= 109
 *
 * At most 1000 calls will be made to next.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Design, Counting, Iterator).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/rle-iterator/">LeetCode #900</a>
 */
public class RleIterator {

    /**
     * TODO: Implement "RLE Iterator".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: RLE Iterator");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac RleIterator.java &amp;&amp; java org.leetcode.medium.RleIterator</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== RleIterator ===");
        RleIterator sol = new RleIterator();
        System.out.println(sol.solve(null));
    }
}
