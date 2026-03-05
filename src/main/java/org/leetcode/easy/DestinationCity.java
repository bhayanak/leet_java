package org.leetcode.easy;

import java.util.List;
import java.util.Arrays;


/**
 * <b>#1436 - Destination City</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Hash Table, String</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given the array paths, where paths[i] = [cityAi, cityBi] means there exists a direct path going from cityAi to cityBi. Return the destination city, that is, the city without any path outgoing to another city.
 *
 *
 * It is guaranteed that the graph of paths forms a line without any loop, therefore, there will be exactly one destination city.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: paths = [["London","New York"],["New York","Lima"],["Lima","Sao Paulo"]]
 * Output: "Sao Paulo" 
 * Explanation: Starting at "London" city you will reach "Sao Paulo" city which is the destination city. Your trip consist of: "London" -&gt; "New York" -&gt; "Lima" -&gt; "Sao Paulo".
 *
 * Example 2:
 *
 * Input: paths = [["B","C"],["D","B"],["C","A"]]
 * Output: "A"
 * Explanation: All possible trips are: 
 * "D" -&gt; "B" -&gt; "C" -&gt; "A". 
 * "B" -&gt; "C" -&gt; "A". 
 * "C" -&gt; "A". 
 * "A". 
 * Clearly the destination city is "A".
 *
 * Example 3:
 *
 * Input: paths = [["A","Z"]]
 * Output: "Z"
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= paths.length &lt;= 100
 *
 * paths[i].length == 2
 *
 * 1 &lt;= cityAi.length, cityBi.length &lt;= 10
 *
 * cityAi != cityBi
 *
 * All strings consist of lowercase and uppercase English letters and the space character.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Start in any city and use the path to move to the next city.
 * Hint 2: Eventually, you will reach a city with no path outgoing, this is the destination city.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, String).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/destination-city/">LeetCode #1436</a>
  *
  * <p><b>Explanation:</b> Uses a HashSet to detect duplicates or track seen elements in O(1) per operation.</p>
  */
public class DestinationCity {

    /**
     * Solves the problem: Dest city.
     *
     * @param paths the paths (java.util.List&lt;java.util.List&lt;String&gt;&gt;)
     * @return the computed String result
      *
      * <p><b>Explanation:</b> Uses a HashSet to detect duplicates or track seen elements in O(1) per operation.</p>
      */
    public String destCity(java.util.List<java.util.List<String>> paths) {
        java.util.Set<String> sources = new java.util.HashSet<>();
        for (var p : paths) sources.add(p.get(0));
        for (var p : paths) if (!sources.contains(p.get(1))) return p.get(1);
        return "";
    }

    /**
     * Runs sample test cases.
      *
      * <p><b>Explanation:</b> Processes the string character by character, applying the transformation or predicate.</p>
      */
    public static void main(String[] args) {
        DestinationCity sol = new DestinationCity();
                System.out.println(sol.destCity(java.util.Arrays.asList(
                    java.util.Arrays.asList("London","New York"),
                    java.util.Arrays.asList("New York","Lima"),
                    java.util.Arrays.asList("Lima","Sao Paulo")
                ))); // "Sao Paulo"
    }
}
