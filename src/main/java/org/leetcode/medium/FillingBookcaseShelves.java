package org.leetcode.medium;


/**
 * <b>#1105 - Filling Bookcase Shelves</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Dynamic Programming</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an array books where books[i] = [thicknessi, heighti] indicates the thickness and height of the ith book. You are also given an integer shelfWidth.
 *
 *
 * We want to place these books in order onto bookcase shelves that have a total width shelfWidth.
 *
 *
 * We choose some of the books to place on this shelf such that the sum of their thickness is less than or equal to shelfWidth, then build another level of the shelf of the bookcase so that the total height of the bookcase has increased by the maximum height of the books we just put down. We repeat this process until there are no more books to place.
 *
 *
 * Note that at each step of the above process, the order of the books we place is the same order as the given sequence of books.
 *
 *
 * For example, if we have an ordered list of 5 books, we might place the first and second book onto the first shelf, the third book on the second shelf, and the fourth and fifth book on the last shelf.
 *
 * Return the minimum possible height that the total bookshelf can be after placing shelves in this manner.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: books = [[1,1],[2,3],[2,3],[1,1],[1,1],[1,1],[1,2]], shelfWidth = 4
 * Output: 6
 * Explanation:
 * The sum of the heights of the 3 shelves is 1 + 3 + 2 = 6.
 * Notice that book number 2 does not have to be on the first shelf.
 *
 * Example 2:
 *
 * Input: books = [[1,3],[2,4],[3,2]], shelfWidth = 6
 * Output: 4
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= books.length &lt;= 1000
 *
 * 1 &lt;= thicknessi &lt;= shelfWidth &lt;= 1000
 *
 * 1 &lt;= heighti &lt;= 1000
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use dynamic programming:  dp(i) will be the answer to the problem for books[i:].
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Dynamic Programming).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/filling-bookcase-shelves/">LeetCode #1105</a>
 */
public class FillingBookcaseShelves {

    /**
     * TODO: Implement "Filling Bookcase Shelves".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Filling Bookcase Shelves");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac FillingBookcaseShelves.java &amp;&amp; java org.leetcode.medium.FillingBookcaseShelves</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== FillingBookcaseShelves ===");
        FillingBookcaseShelves sol = new FillingBookcaseShelves();
        System.out.println(sol.solve(null));
    }
}
