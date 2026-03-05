package org.leetcode.medium;

/**
 * <b>#399 - Evaluate Division</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, String, Depth-First Search, Breadth-First Search, Union-Find, Graph Theory, Shortest Path</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an array of variable pairs equations and an array of real numbers values, where equations[i] = [Ai, Bi] and values[i] represent the equation Ai / Bi = values[i]. Each Ai or Bi is a string that represents a single variable.
 * 
 * 
 * You are also given some queries, where queries[j] = [Cj, Dj] represents the jth query where you must find the answer for Cj / Dj = ?.
 * 
 * 
 * Return the answers to all queries. If a single answer cannot be determined, return -1.0.
 * 
 * 
 * Note: The input is always valid. You may assume that evaluating the queries will not result in division by zero and that there is no contradiction.
 * 
 * 
 * Note: The variables that do not occur in the list of equations are undefined, so the answer cannot be determined for them.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: equations = [["a","b"],["b","c"]], values = [2.0,3.0], queries = [["a","c"],["b","a"],["a","e"],["a","a"],["x","x"]]
 * Output: [6.00000,0.50000,-1.00000,1.00000,-1.00000]
 * Explanation: 
 * Given: a / b = 2.0, b / c = 3.0
 * queries are: a / c = ?, b / a = ?, a / e = ?, a / a = ?, x / x = ? 
 * return: [6.0, 0.5, -1.0, 1.0, -1.0 ]
 * note: x is undefined =&gt; -1.0
 * 
 * Example 2:
 * 
 * Input: equations = [["a","b"],["b","c"],["bc","cd"]], values = [1.5,2.5,5.0], queries = [["a","c"],["c","b"],["bc","cd"],["cd","bc"]]
 * Output: [3.75000,0.40000,5.00000,0.20000]
 * 
 * Example 3:
 * 
 * Input: equations = [["a","b"]], values = [0.5], queries = [["a","b"],["b","a"],["a","c"],["x","y"]]
 * Output: [0.50000,2.00000,-1.00000,-1.00000]
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * 1 &lt;= equations.length &lt;= 20
 * 	
 * equations[i].length == 2
 * 	
 * 1 &lt;= Ai.length, Bi.length &lt;= 5
 * 	
 * values.length == equations.length
 * 	
 * 0.0 &lt; values[i] &lt;= 20.0
 * 	
 * 1 &lt;= queries.length &lt;= 20
 * 	
 * queries[i].length == 2
 * 	
 * 1 &lt;= Cj.length, Dj.length &lt;= 5
 * 	
 * Ai, Bi, Cj, Dj consist of lower case English letters and digits.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Do you recognize this as a graph problem?
 *
 * <h2>Approach</h2>
 * Build a weighted directed graph (a/b = val, b/a = 1/val).
 * Each query is a BFS/DFS shortest path product.
 *
 * <h2>Complexity</h2>
* Time: O((V+E)·Q)  |  Space: O(V+E)
 *
 * @see <a href="https://leetcode.com/problems/evaluate-division/">LeetCode #399</a>
 */
public class EvaluateDivision {

    public double[] calcEquation(java.util.List<java.util.List<String>> equations,
                                   double[] values,
                                   java.util.List<java.util.List<String>> queries) {
        java.util.Map<String,java.util.Map<String,Double>> g=new java.util.HashMap<>();
        for(int i=0;i<equations.size();i++){
            String a=equations.get(i).get(0), b=equations.get(i).get(1);
            g.computeIfAbsent(a,k->new java.util.HashMap<>()).put(b,values[i]);
            g.computeIfAbsent(b,k->new java.util.HashMap<>()).put(a,1.0/values[i]);
        }
        double[] res=new double[queries.size()];
        for(int i=0;i<queries.size();i++){
            String src=queries.get(i).get(0), dst=queries.get(i).get(1);
            res[i]=(!g.containsKey(src)||!g.containsKey(dst)) ? -1.0
                   : bfs(g,src,dst,new java.util.HashSet<>());
        }
        return res;
    }
    private double bfs(java.util.Map<String,java.util.Map<String,Double>> g,
                       String src, String dst, java.util.Set<String> vis){
        if(!g.containsKey(src)) return -1.0;
        if(src.equals(dst)) return 1.0;
        vis.add(src);
        for(var e:g.get(src).entrySet()){
            if(!vis.contains(e.getKey())){
                double r=bfs(g,e.getKey(),dst,vis);
                if(r!=-1.0) return e.getValue()*r;
            }
        }
        return -1.0;
    }

    // ─── Demo ────────────────────────────────────────────────────
    public static void main(String[] args) {
        EvaluateDivision sol = new EvaluateDivision();
        java.util.List<java.util.List<String>> eq=java.util.Arrays.asList(
            java.util.Arrays.asList("a","b"),java.util.Arrays.asList("b","c"));
        double[] vals={2.0,3.0};
        java.util.List<java.util.List<String>> qs=java.util.Arrays.asList(
            java.util.Arrays.asList("a","c"),java.util.Arrays.asList("b","a"),
            java.util.Arrays.asList("a","e"),java.util.Arrays.asList("a","a"),
            java.util.Arrays.asList("x","x"));
        System.out.println(java.util.Arrays.toString(sol.calcEquation(eq,vals,qs)));
        // [6.0, 0.5, -1.0, 1.0, -1.0]
    }
}
