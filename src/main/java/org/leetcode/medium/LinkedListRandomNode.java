package org.leetcode.medium;

/**
 * <b>#382 - Linked List Random Node</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Linked List, Math, Reservoir Sampling, Randomized</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given a singly linked list, return a random node's value from the linked list. Each node must have the same probability of being chosen.
 * 
 * 
 * Implement the Solution class:
 * 
 * 	
 * Solution(ListNode head) Initializes the object with the head of the singly-linked list head.
 * 	
 * int getRandom() Chooses a node randomly from the list and returns its value. All the nodes of the list should be equally likely to be chosen.
 * 
 *  
 * 
 * Example 1:
 * 
 * Input
 * ["Solution", "getRandom", "getRandom", "getRandom", "getRandom", "getRandom"]
 * [[[1, 2, 3]], [], [], [], [], []]
 * Output
 * [null, 1, 3, 2, 2, 3]
 * 
 * Explanation
 * Solution solution = new Solution([1, 2, 3]);
 * solution.getRandom(); // return 1
 * solution.getRandom(); // return 3
 * solution.getRandom(); // return 2
 * solution.getRandom(); // return 2
 * solution.getRandom(); // return 3
 * // getRandom() should return either 1, 2, or 3 randomly. Each element should have equal probability of returning.
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * The number of nodes in the linked list will be in the range [1, 104].
 * 	
 * -104 &lt;= Node.val &lt;= 104
 * 	
 * At most 104 calls will be made to getRandom.
 * 
 *  
 * 
 * Follow up:
 * 
 * 	
 * What if the linked list is extremely large and its length is unknown to you?
 * 	
 * Could you solve this efficiently without using extra space?
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
 * @see <a href="https://leetcode.com/problems/linked-list-random-node/">LeetCode #382</a>
 */
public class LinkedListRandomNode {

    /** TODO: implement solution for "Linked List Random Node". */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Linked List Random Node");
    }

    // ─── Demo ────────────────────────────────────────────────────
    public static void main(String[] args) {
        System.out.println("=== LinkedListRandomNode ===");
        LinkedListRandomNode sol = new LinkedListRandomNode();
        System.out.println(sol.solve(null));
    }
}
