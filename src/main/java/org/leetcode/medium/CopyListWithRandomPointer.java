package org.leetcode.medium;

/**
 * <b>#138 - Copy List with Random Pointer</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Hash Table, Linked List</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * A linked list of length n is given such that each node contains an additional random pointer, which could point to any node in the list, or null.
 * 
 * 
 * Construct a deep copy of the list. The deep copy should consist of exactly n brand new nodes, where each new node has its value set to the value of its corresponding original node. Both the next and random pointer of the new nodes should point to new nodes in the copied list such that the pointers in the original list and copied list represent the same list state. None of the pointers in the new list should point to nodes in the original list.
 * 
 * 
 * For example, if there are two nodes X and Y in the original list, where X.random --&gt; Y, then for the corresponding two nodes x and y in the copied list, x.random --&gt; y.
 * 
 * 
 * Return the head of the copied linked list.
 * 
 * 
 * The linked list is represented in the input/output as a list of n nodes. Each node is represented as a pair of [val, random_index] where:
 * 
 * 	
 * val: an integer representing Node.val
 * 	
 * random_index: the index of the node (range from 0 to n-1) that the random pointer points to, or null if it does not point to any node.
 * 
 * Your code will only be given the head of the original linked list.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: head = [[7,null],[13,0],[11,4],[10,2],[1,0]]
 * Output: [[7,null],[13,0],[11,4],[10,2],[1,0]]
 * 
 * Example 2:
 * 
 * Input: head = [[1,1],[2,1]]
 * Output: [[1,1],[2,1]]
 * 
 * Example 3:
 * 
 * Input: head = [[3,null],[3,0],[3,null]]
 * Output: [[3,null],[3,0],[3,null]]
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * 0 &lt;= n &lt;= 1000
 * 	
 * -104 &lt;= Node.val &lt;= 104
 * 	
 * Node.random is null or is pointing to some node in the linked list.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Just iterate the linked list and create copies of the nodes on the go. Since a node can be referenced from multiple nodes due to the random pointers, ensure you are not making multiple copies of the same node.
 * Hint 2: You may want to use extra space to keep old_node ---&gt; new_node mapping to prevent creating multiple copies of the same node.
 * Hint 3: We can avoid using extra space for old_node ---&gt; new_node mapping by tweaking the original linked list. Simply interweave the nodes of the old and copied list. For example:
Old List: A --> B --> C --> D
InterWeaved List: A --> A' --> B --> B' --> C --> C' --> D --> D'
 * Hint 4: The interweaving is done using next pointers and we can make use of interweaved structure to get the correct reference nodes for random pointers.
 *
 * <h2>Approach</h2>
 * Think about the category first (see tags above), then:
 * 1. Try a brute-force solution to understand the problem.
 * 2. Identify the bottleneck and optimise with the right data structure or algorithm.
 * 3. Consider: sorting, hashing, two pointers, sliding window,
 *    binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: TBD  |  Space: TBD
 *
 * @see <a href="https://leetcode.com/problems/copy-list-with-random-pointer/">LeetCode #138</a>
 */
public class CopyListWithRandomPointer {

    /**
     * TODO: Implement solution for "Copy List with Random Pointer".
     * @param args placeholder — replace with actual parameter(s)
     * @return     placeholder — replace with actual return type
     */
    public Object solve(Object args) {
        throw new UnsupportedOperationException("Not yet implemented: Copy List with Random Pointer");
    }

    // ─── Run & Demo ──────────────────────────────────────────────
    /**
     * Runs sample test cases to demonstrate the solution.
     * Execute: javac CopyListWithRandomPointer.java &amp;&amp; java org.leetcode.medium.CopyListWithRandomPointer
     *
     * @param args not used
     */
    public static void main(String[] args) {
        System.out.println("=== CopyListWithRandomPointer ===");
        CopyListWithRandomPointer sol = new CopyListWithRandomPointer();
        System.out.println(sol.solve(null));
    }
}
