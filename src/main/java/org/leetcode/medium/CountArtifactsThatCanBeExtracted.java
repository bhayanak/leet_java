package org.leetcode.medium;


/**
 * <b>#2201 - Count Artifacts That Can Be Extracted</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Hash Table, Simulation</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * There is an n x n 0-indexed grid with some artifacts buried in it. You are given the integer n and a 0-indexed 2D integer array artifacts describing the positions of the rectangular artifacts where artifacts[i] = [r1i, c1i, r2i, c2i] denotes that the ith artifact is buried in the subgrid where:
 *
 *
 * (r1i, c1i) is the coordinate of the top-left cell of the ith artifact and
 *
 * (r2i, c2i) is the coordinate of the bottom-right cell of the ith artifact.
 *
 * You will excavate some cells of the grid and remove all the mud from them. If the cell has a part of an artifact buried underneath, it will be uncovered. If all the parts of an artifact are uncovered, you can extract it.
 *
 *
 * Given a 0-indexed 2D integer array dig where dig[i] = [ri, ci] indicates that you will excavate the cell (ri, ci), return the number of artifacts that you can extract.
 *
 *
 * The test cases are generated such that:
 *
 *
 * No two artifacts overlap.
 *
 * Each artifact only covers at most 4 cells.
 *
 * The entries of dig are unique.
 *
 *
 *
 * Example 1:
 *
 * Input: n = 2, artifacts = [[0,0,0,0],[0,1,1,1]], dig = [[0,0],[0,1]]
 * Output: 1
 * Explanation: 
 * The different colors represent different artifacts. Excavated cells are labeled with a 'D' in the grid.
 * There is 1 artifact that can be extracted, namely the red artifact.
 * The blue artifact has one part in cell (1,1) which remains uncovered, so we cannot extract it.
 * Thus, we return 1.
 *
 * Example 2:
 *
 * Input: n = 2, artifacts = [[0,0,0,0],[0,1,1,1]], dig = [[0,0],[0,1],[1,1]]
 * Output: 2
 * Explanation: Both the red and blue artifacts have all parts uncovered (labeled with a 'D') and can be extracted, so we return 2. 
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n &lt;= 1000
 *
 * 1 &lt;= artifacts.length, dig.length &lt;= min(n2, 105)
 *
 * artifacts[i].length == 4
 *
 * dig[i].length == 2
 *
 * 0 &lt;= r1i, c1i, r2i, c2i, ri, ci &lt;= n - 1
 *
 * r1i &lt;= r2i
 *
 * c1i &lt;= c2i
 *
 * No two artifacts will overlap.
 *
 * The number of cells covered by an artifact is at most 4.
 *
 * The entries of dig are unique.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Check if each coordinate of each artifact has been excavated. How can we do this quickly without iterating over the dig array every time?
 * Hint 2: Consider marking all excavated cells in a 2D boolean array.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Simulation).
 *
 * @see <a href="https://leetcode.com/problems/count-artifacts-that-can-be-extracted/">LeetCode #2201</a>
 */
public class CountArtifactsThatCanBeExtracted {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Count Artifacts That Can Be Extracted");
    }

    public static void main(String[] args) {
        System.out.println("=== CountArtifactsThatCanBeExtracted ===");
        CountArtifactsThatCanBeExtracted sol = new CountArtifactsThatCanBeExtracted();
        System.out.println(sol.solve(null));
    }
}
