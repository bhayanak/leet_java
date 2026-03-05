package org.leetcode.medium;

/**
 * <b>#274 - H-Index</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Sorting, Counting Sort</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an array of integers citations where citations[i] is the number of citations a researcher received for their ith paper, return the researcher's h-index.
 * 
 * 
 * According to the definition of h-index on Wikipedia: The h-index is defined as the maximum value of h such that the given researcher has published at least h papers that have each been cited at least h times.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: citations = [3,0,6,1,5]
 * Output: 3
 * Explanation: [3,0,6,1,5] means the researcher has 5 papers in total and each of them had received 3, 0, 6, 1, 5 citations respectively.
 * Since the researcher has 3 papers with at least 3 citations each and the remaining two with no more than 3 citations each, their h-index is 3.
 * 
 * Example 2:
 * 
 * Input: citations = [1,3,1]
 * Output: 1
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * n == citations.length
 * 	
 * 1 &lt;= n &lt;= 5000
 * 	
 * 0 &lt;= citations[i] &lt;= 1000
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: An easy approach is to sort the array first.
 * Hint 2: What are the possible values of h-index?
 * Hint 3: A faster approach is to use extra space.
 *
 * <h2>Approach</h2>
 * Break the problem into smaller sub-problems:
 * 1. Try brute force first to understand the constraints.
 * 2. Look for repeated sub-problems (DP), sorted structure (binary search),
 *    adjacency (graph/BFS), or monotonic properties (stack/queue).
 * 3. Refine with the right data structure.
 *
 * <h2>Complexity</h2>
 * Time: TBD  |  Space: TBD
 *
 * @see <a href="https://leetcode.com/problems/h-index/">LeetCode #274</a>
 */
public class HIndex {

    /** TODO: implement solution for "H-Index". */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: H-Index");
    }

    // ─── Demo ────────────────────────────────────────────────────
    public static void main(String[] args) {
        System.out.println("=== HIndex ===");
        HIndex sol = new HIndex();
        System.out.println(sol.solve(null));
    }
}
