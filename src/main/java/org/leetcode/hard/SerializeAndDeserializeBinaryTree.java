package org.leetcode.hard;

/**
 * <b>#297 - Serialize and Deserialize Binary Tree</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> String, Tree, Depth-First Search, Breadth-First Search, Design, Binary Tree</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Serialization is the process of converting a data structure or object into a sequence of bits so that it can be stored in a file or memory buffer, or transmitted across a network connection link to be reconstructed later in the same or another computer environment.
 * 
 * 
 * Design an algorithm to serialize and deserialize a binary tree. There is no restriction on how your serialization/deserialization algorithm should work. You just need to ensure that a binary tree can be serialized to a string and this string can be deserialized to the original tree structure.
 * 
 * 
 * Clarification: The input/output format is the same as how LeetCode serializes a binary tree. You do not necessarily need to follow this format, so please be creative and come up with different approaches yourself.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: root = [1,2,3,null,null,4,5]
 * Output: [1,2,3,null,null,4,5]
 * 
 * Example 2:
 * 
 * Input: root = []
 * Output: []
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * The number of nodes in the tree is in the range [0, 104].
 * 	
 * -1000 &lt;= Node.val &lt;= 1000
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — study the examples carefully.
 *
 * <h2>Approach</h2>
 * Pre-order serialization: use 'null' as sentinel for absent nodes.
 * Deserialization reconstructs by consuming tokens from a queue.
 *
 * <h2>Complexity</h2>
* Time: O(n)  |  Space: O(n)
 *
 * @see <a href="https://leetcode.com/problems/serialize-and-deserialize-binary-tree/">LeetCode #297</a>
 */
public class SerializeAndDeserializeBinaryTree {

    public static class TreeNode {
        int val; TreeNode left, right;
        TreeNode(int v) { val = v; }
    }
    /**
     * Solves the problem: Bt.
     * Uses Breadth-First Search (BFS) traversal.
     *
     * @param v the v (Integer...)
     * @return the computed TreeNode result
     */
    public static TreeNode bt(Integer... v) {
        if (v==null||v.length==0||v[0]==null) return null;
        TreeNode r=new TreeNode(v[0]);
        java.util.Queue<TreeNode> q=new java.util.LinkedList<>(); q.offer(r);
        int i=1;
        while(!q.isEmpty()&&i<v.length) {
            TreeNode c=q.poll();
            if(i<v.length&&v[i]!=null){c.left=new TreeNode(v[i]);q.offer(c.left);}i++;
            if(i<v.length&&v[i]!=null){c.right=new TreeNode(v[i]);q.offer(c.right);}i++;
        }
        return r;
    }
    static final String NULL_MARKER = "#";
    /**
     * Solves the problem: Serialize.
     * Uses Breadth-First Search (BFS) traversal.
     *
     * @param root the root (TreeNode)
     * @return the computed String result
     */
    public String serialize(TreeNode root) {
        StringBuilder sb=new StringBuilder();
        serDFS(root,sb); return sb.toString();
    }
    private void serDFS(TreeNode n, StringBuilder sb){
        if(n==null){sb.append(NULL_MARKER).append(',');return;}
        sb.append(n.val).append(',');
        serDFS(n.left,sb); serDFS(n.right,sb);
    }
    /**
     * Solves the problem: Deserialize.
     * Uses Breadth-First Search (BFS) traversal.
     *
     * @param data the data (String)
     * @return the computed TreeNode result
     */
    public TreeNode deserialize(String data) {
        java.util.Queue<String> q=new java.util.LinkedList<>(java.util.Arrays.asList(data.split(",")));
        return desDFS(q);
    }
    private TreeNode desDFS(java.util.Queue<String> q){
        String t=q.poll();
        if(NULL_MARKER.equals(t)) return null;
        TreeNode n=new TreeNode(Integer.parseInt(t));
        n.left=desDFS(q); n.right=desDFS(q);
        return n;
    }

    // ─── Demo ────────────────────────────────────────────────────
    public static void main(String[] args) {
        SerializeAndDeserializeBinaryTree sol = new SerializeAndDeserializeBinaryTree();
        TreeNode root=bt(1,2,3,null,null,4,5);
        String s=sol.serialize(root);
        System.out.println("Serialized: "+s);
        TreeNode r2=sol.deserialize(s);
        System.out.println("Root after deserialize: "+r2.val); // 1
    }
}
