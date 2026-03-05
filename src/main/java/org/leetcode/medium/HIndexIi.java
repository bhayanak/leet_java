package org.leetcode.medium;

/**
 * <b>#275 - H-Index II</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Binary Search</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an array of integers citations where citations[i] is the number of citations a researcher received for their ith paper and citations is sorted in non-descending order, return the researcher's h-index.
 * 
 * 
 * According to the definition of h-index on Wikipedia: The h-index is defined as the maximum value of h such that the given researcher has published at least h papers that have each been cited at least h times.
 * 
 * 
 * You must write an algorithm that runs in logarithmic time.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: citations = [0,1,3,5,6]
 * Output: 3
 * Explanation: [0,1,3,5,6] means the researcher has 5 papers in total and each of them had received 0, 1, 3, 5, 6 citations respectively.
 * Since the researcher has 3 papers with at least 3 citations each and the remaining two with no more than 3 citations each, their h-index is 3.
 * 
 * Example 2:
 * 
 * Input: citations = [1,2,100]
 * Output: 2
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * n == citations.length
 * 	
 * 1 &lt;= n &lt;= 105
 * 	
 * 0 &lt;= citations[i] &lt;= 1000
 * 	
 * citations is sorted in ascending order.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Expected runtime complexity is in <i>O</i>(log <i>n</i>) and the input is sorted.
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
 * @see <a href="https://leetcode.com/problems/h-index-ii/">LeetCode #275</a>
 */
public class HIndexIi {

    /** TODO: implement solution for "H-Index II". */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: H-Index II");
    }

    // ─── Demo ────────────────────────────────────────────────────
    public static void main(String[] args) {
        System.out.println("=== HIndexIi ===");
        HIndexIi sol = new HIndexIi();
        System.out.println(sol.solve(null));
    }
}
