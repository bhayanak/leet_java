package org.leetcode.medium;

/**
 * <b>#133 - Clone Graph</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Hash Table, Depth-First Search, Breadth-First Search, Graph Theory</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given a reference of a node in a connected undirected graph.
 * 
 * 
 * Return a deep copy (clone) of the graph.
 * 
 * 
 * Each node in the graph contains a value (int) and a list (List[Node]) of its neighbors.
 * 
 * class Node {
 *     public int val;
 *     public List&lt;Node&gt; neighbors;
 * }
 * 
 *  
 * 
 * 
 * Test case format:
 * 
 * 
 * For simplicity, each node's value is the same as the node's index (1-indexed). For example, the first node with val == 1, the second node with val == 2, and so on. The graph is represented in the test case using an adjacency list.
 * 
 * 
 * An adjacency list is a collection of unordered lists used to represent a finite graph. Each list describes the set of neighbors of a node in the graph.
 * 
 * 
 * The given node will always be the first node with val = 1. You must return the copy of the given node as a reference to the cloned graph.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: adjList = [[2,4],[1,3],[2,4],[1,3]]
 * Output: [[2,4],[1,3],[2,4],[1,3]]
 * Explanation: There are 4 nodes in the graph.
 * 1st node (val = 1)'s neighbors are 2nd node (val = 2) and 4th node (val = 4).
 * 2nd node (val = 2)'s neighbors are 1st node (val = 1) and 3rd node (val = 3).
 * 3rd node (val = 3)'s neighbors are 2nd node (val = 2) and 4th node (val = 4).
 * 4th node (val = 4)'s neighbors are 1st node (val = 1) and 3rd node (val = 3).
 * 
 * Example 2:
 * 
 * Input: adjList = [[]]
 * Output: [[]]
 * Explanation: Note that the input contains one empty list. The graph consists of only one node with val = 1 and it does not have any neighbors.
 * 
 * Example 3:
 * 
 * Input: adjList = []
 * Output: []
 * Explanation: This an empty graph, it does not have any nodes.
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * The number of nodes in the graph is in the range [0, 100].
 * 	
 * 1 &lt;= Node.val &lt;= 100
 * 	
 * Node.val is unique for each node.
 * 	
 * There are no repeated edges and no self-loops in the graph.
 * 	
 * The Graph is connected and all nodes can be visited starting from the given node.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — work through examples manually first.
 *
 * <h2>Approach</h2>
 * BFS/DFS with a HashMap&lt;Node, Node&gt; mapping original nodes to their clones.
 * When visiting a neighbor, clone it if not already cloned, then add to neighbor list.
 *
 * <h2>Complexity</h2>
* Time: O(n+e)  |  Space: O(n)
 *
 * @see <a href="https://leetcode.com/problems/clone-graph/">LeetCode #133</a>
 */
public class CloneGraph {

    /** Graph node for Clone Graph. */
    public static class Node {
        int val;
        java.util.List<Node> neighbors;
        Node(int v) { val = v; neighbors = new java.util.ArrayList<>(); }
    }

    /**
     * Deep-clones a connected undirected graph.
     * @param node any node in the graph
     * @return the corresponding node in the cloned graph
     */
    public Node cloneGraph(Node node) {
        if (node == null) return null;
        java.util.Map<Node, Node> map = new java.util.HashMap<>();
        java.util.Queue<Node> queue = new java.util.LinkedList<>();
        queue.offer(node);
        map.put(node, new Node(node.val));
        while (!queue.isEmpty()) {
            Node cur = queue.poll();
            for (Node nb : cur.neighbors) {
                if (!map.containsKey(nb)) { map.put(nb, new Node(nb.val)); queue.offer(nb); }
                map.get(cur).neighbors.add(map.get(nb));
            }
        }
        return map.get(node);
    }

    // ─── Run & Demo ──────────────────────────────────────────────
    /**
     * Runs sample test cases to demonstrate the solution.
     * Execute: javac CloneGraph.java &amp;&amp; java org.leetcode.medium.CloneGraph
     *
     * @param args not used
     */
    public static void main(String[] args) {
        CloneGraph sol = new CloneGraph();
        // Build: 1-2-3-4-1 (cycle)
        Node n1=new Node(1), n2=new Node(2), n3=new Node(3), n4=new Node(4);
        n1.neighbors.add(n2); n1.neighbors.add(n4);
        n2.neighbors.add(n1); n2.neighbors.add(n3);
        n3.neighbors.add(n2); n3.neighbors.add(n4);
        n4.neighbors.add(n1); n4.neighbors.add(n3);
        Node clone = sol.cloneGraph(n1);
        System.out.println("Clone root val: " + clone.val);                       // 1
        System.out.println("Clone != original: " + (clone != n1));                // true
        System.out.println("Neighbor count: "   + clone.neighbors.size());        // 2
    }
}
