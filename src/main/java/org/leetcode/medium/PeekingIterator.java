package org.leetcode.medium;

/**
 * <b>#284 - Peeking Iterator</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Design, Iterator</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Design an iterator that supports the peek operation on an existing iterator in addition to the hasNext and the next operations.
 * 
 * 
 * Implement the PeekingIterator class:
 * 
 * 	
 * PeekingIterator(Iterator&lt;int&gt; nums) Initializes the object with the given integer iterator iterator.
 * 	
 * int next() Returns the next element in the array and moves the pointer to the next element.
 * 	
 * boolean hasNext() Returns true if there are still elements in the array.
 * 	
 * int peek() Returns the next element in the array without moving the pointer.
 * 
 * Note: Each language may have a different implementation of the constructor and Iterator, but they all support the int next() and boolean hasNext() functions.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input
 * ["PeekingIterator", "next", "peek", "next", "next", "hasNext"]
 * [[[1, 2, 3]], [], [], [], [], []]
 * Output
 * [null, 1, 2, 2, 3, false]
 * 
 * Explanation
 * PeekingIterator peekingIterator = new PeekingIterator([1, 2, 3]); // [1,2,3]
 * peekingIterator.next();    // return 1, the pointer moves to the next element [1,2,3].
 * peekingIterator.peek();    // return 2, the pointer does not move [1,2,3].
 * peekingIterator.next();    // return 2, the pointer moves to the next element [1,2,3]
 * peekingIterator.next();    // return 3, the pointer moves to the next element [1,2,3]
 * peekingIterator.hasNext(); // return False
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * 1 &lt;= nums.length &lt;= 1000
 * 	
 * 1 &lt;= nums[i] &lt;= 1000
 * 	
 * All the calls to next and peek are valid.
 * 	
 * At most 1000 calls will be made to next, hasNext, and peek.
 * 
 *  
 * Follow up: How would you extend your design to be generic and work with all types, not just integer?
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Think of "looking ahead". You want to cache the next element.
 * Hint 2: Is one variable sufficient? Why or why not?
 * Hint 3: Test your design with call order of <code>peek()</code> before <code>next()</code> vs <code>next()</code> before <code>peek()</code>.
 * Hint 4: For a clean implementation, check out <a href="https://github.com/google/guava/blob/703ef758b8621cfbab16814f01ddcc5324bdea33/guava-gwt/src-super/com/google/common/collect/super/com/google/common/collect/Iterators.java#L1125" target="_blank">Google's guava library source code</a>.
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
 * @see <a href="https://leetcode.com/problems/peeking-iterator/">LeetCode #284</a>
 */
public class PeekingIterator {

    /** TODO: implement solution for "Peeking Iterator". */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Peeking Iterator");
    }

    // ─── Demo ────────────────────────────────────────────────────
    public static void main(String[] args) {
        System.out.println("=== PeekingIterator ===");
        PeekingIterator sol = new PeekingIterator();
        System.out.println(sol.solve(null));
    }
}
