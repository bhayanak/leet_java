package org.leetcode.medium;

/**
 * <b>#341 - Flatten Nested List Iterator</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Stack, Tree, Depth-First Search, Design, Queue, Iterator</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a nested list of integers nestedList. Each element is either an integer or a list whose elements may also be integers or other lists. Implement an iterator to flatten it.
 * 
 * 
 * Implement the NestedIterator class:
 * 
 * 	
 * NestedIterator(List&lt;NestedInteger&gt; nestedList) Initializes the iterator with the nested list nestedList.
 * 	
 * int next() Returns the next integer in the nested list.
 * 	
 * boolean hasNext() Returns true if there are still some integers in the nested list and false otherwise.
 * 
 * Your code will be tested with the following pseudocode:
 * 
 * initialize iterator with nestedList
 * res = []
 * while iterator.hasNext()
 *     append iterator.next() to the end of res
 * return res
 * 
 * If res matches the expected flattened list, then your code will be judged as correct.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: nestedList = [[1,1],2,[1,1]]
 * Output: [1,1,2,1,1]
 * Explanation: By calling next repeatedly until hasNext returns false, the order of elements returned by next should be: [1,1,2,1,1].
 * 
 * Example 2:
 * 
 * Input: nestedList = [1,[4,[6]]]
 * Output: [1,4,6]
 * Explanation: By calling next repeatedly until hasNext returns false, the order of elements returned by next should be: [1,4,6].
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * 1 &lt;= nestedList.length &lt;= 500
 * 	
 * The values of the integers in the nested list is in the range [-106, 106].
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — study the examples carefully.
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
 * @see <a href="https://leetcode.com/problems/flatten-nested-list-iterator/">LeetCode #341</a>
 */
public class FlattenNestedListIterator {

    /** TODO: implement solution for "Flatten Nested List Iterator". */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Flatten Nested List Iterator");
    }

    // ─── Demo ────────────────────────────────────────────────────
    public static void main(String[] args) {
        System.out.println("=== FlattenNestedListIterator ===");
        FlattenNestedListIterator sol = new FlattenNestedListIterator();
        System.out.println(sol.solve(null));
    }
}
