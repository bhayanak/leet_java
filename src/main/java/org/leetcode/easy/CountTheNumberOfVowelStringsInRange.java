package org.leetcode.easy;


/**
 * <b>#2586 - Count the Number of Vowel Strings in Range</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, String, Counting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a 0-indexed array of string words and two integers left and right.
 *
 *
 * A string is called a vowel string if it starts with a vowel character and ends with a vowel character where vowel characters are 'a', 'e', 'i', 'o', and 'u'.
 *
 *
 * Return the number of vowel strings words[i] where i belongs to the inclusive range [left, right].
 *
 *
 *
 *
 * Example 1:
 *
 * Input: words = ["are","amy","u"], left = 0, right = 2
 * Output: 2
 * Explanation: 
 * - "are" is a vowel string because it starts with 'a' and ends with 'e'.
 * - "amy" is not a vowel string because it does not end with a vowel.
 * - "u" is a vowel string because it starts with 'u' and ends with 'u'.
 * The number of vowel strings in the mentioned range is 2.
 *
 * Example 2:
 *
 * Input: words = ["hey","aeo","mu","ooo","artro"], left = 1, right = 4
 * Output: 3
 * Explanation: 
 * - "aeo" is a vowel string because it starts with 'a' and ends with 'o'.
 * - "mu" is not a vowel string because it does not start with a vowel.
 * - "ooo" is a vowel string because it starts with 'o' and ends with 'o'.
 * - "artro" is a vowel string because it starts with 'a' and ends with 'o'.
 * The number of vowel strings in the mentioned range is 3.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= words.length &lt;= 1000
 *
 * 1 &lt;= words[i].length &lt;= 10
 *
 * words[i] consists of only lowercase English letters.
 *
 * 0 &lt;= left &lt;= right &lt; words.length
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: consider iterating over all strings from left to right and use an if condition to check if the first character and last character are vowels.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, String, Counting).
 *
 * @see <a href="https://leetcode.com/problems/count-the-number-of-vowel-strings-in-range/">LeetCode #2586</a>
  *
  * <p><b>Explanation:</b> Uses a HashMap for O(1) average-time lookups, mapping values to indices/counts. Uses a HashSet to detect duplicates or track seen elements in O(1) per operation.</p>
  */
public class CountTheNumberOfVowelStringsInRange {

    /**
     * Counts Count complete components.
     * Uses a hash map to track occurrences or cache results.
     *
     * @param n the n (int)
     * @param edges the edges (int[][])
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Uses a HashMap for O(1) average-time lookups, mapping values to indices/counts. Uses a HashSet to detect duplicates or track seen elements in O(1) per operation.</p>
      */
    public int countCompleteComponents(int n, int[][] edges) {
        // Union-Find
        int[] parent=new int[n]; java.util.Arrays.fill(parent,-1);
        java.util.function.IntUnaryOperator find = null;
        // Simple adjacency check
        java.util.Map<Integer,java.util.Set<Integer>> adj=new java.util.HashMap<>();
        for (int i=0;i<n;i++) adj.put(i,new java.util.HashSet<>());
        for (int[] e:edges) { adj.get(e[0]).add(e[1]); adj.get(e[1]).add(e[0]); }
        boolean[] visited=new boolean[n]; int count=0;
        for (int i=0;i<n;i++) {
            if (!visited[i]) {
                java.util.List<Integer> comp=new java.util.ArrayList<>();
                java.util.Queue<Integer> q=new java.util.LinkedList<>();
                q.add(i); visited[i]=true;
                while (!q.isEmpty()) { int v=q.poll(); comp.add(v); for (int nb:adj.get(v)) if (!visited[nb]) { visited[nb]=true; q.add(nb); } }
                int vSize=comp.size();
                int eCount=comp.stream().mapToInt(v->adj.get(v).size()).sum()/2;
                if (eCount==vSize*(vSize-1)/2) count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        CountTheNumberOfVowelStringsInRange sol = new CountTheNumberOfVowelStringsInRange();
        System.out.println(sol.countCompleteComponents(0, new int[][]{{1,2},{3,4}}));
    }
}
