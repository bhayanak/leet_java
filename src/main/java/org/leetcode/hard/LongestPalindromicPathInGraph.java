package org.leetcode.hard;


/**
 * <b>#3615 - Longest Palindromic Path in Graph</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> String, Dynamic Programming, Bit Manipulation, Graph Theory, Bitmask</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer n and an undirected graph with n nodes labeled from 0 to n - 1 and a 2D array edges, where edges[i] = [ui, vi] indicates an edge between nodes ui and vi.
 *
 *
 * You are also given a string label of length n, where label[i] is the character associated with node i.
 *
 *
 * You may start at any node and move to any adjacent node, visiting each node at most once.
 *
 *
 * Return the maximum possible length of a palindrome that can be formed by visiting a set of unique nodes along a valid path.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: n = 3, edges = [[0,1],[1,2]], label = "aba"
 *
 *
 * Output: 3
 *
 *
 * Explanation:
 *
 *
 * The longest palindromic path is from node 0 to node 2 via node 1, following the path 0 → 1 → 2 forming string "aba".
 *
 * This is a valid palindrome of length 3.
 *
 * Example 2:
 *
 * Input: n = 3, edges = [[0,1],[0,2]], label = "abc"
 *
 *
 * Output: 1
 *
 *
 * Explanation:
 *
 *
 * No path with more than one node forms a palindrome.
 *
 * The best option is any single node, giving a palindrome of length 1.
 *
 * Example 3:
 *
 * Input: n = 4, edges = [[0,2],[0,3],[3,1]], label = "bbac"
 *
 *
 * Output: 3
 *
 *
 * Explanation:
 *
 *
 * The longest palindromic path is from node 0 to node 1, following the path 0 → 3 → 1, forming string "bcb".
 *
 * This is a valid palindrome of length 3.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n &lt;= 14
 *
 * n - 1 &lt;= edges.length &lt;= n * (n - 1) / 2
 *
 * edges[i] == [ui, vi]
 *
 * 0 &lt;= ui, vi &lt;= n - 1
 *
 * ui != vi
 *
 * label.length == n
 *
 * label consists of lowercase English letters.
 *
 * There are no duplicate edges.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use bitmask dynamic programming.
 * Hint 2: Build the palindrome by expanding from both endpoints: you can include a new pair of nodes as endpoints if neither is already in the current bitmask <code>mask</code>.
 * Hint 3: Before adding new endpoints to the current palindrome, ensure their labels match the labels at the previous endpoints <code>prev_l</code> and <code>prev_r</code>.
 * Hint 4: Memoize each state as <code>dp[mask][prev_l][prev_r]</code>, representing the maximum palindrome length achievable using the set of visited nodes in <code>mask</code> with current endpoints at <code>prev_l</code> and <code>prev_r</code>.
 *
 * <h2>Approach</h2>
 * Think about the category (String, Dynamic Programming, Bit Manipulation, Graph Theory, Bitmask).
 *
 * @see <a href="https://leetcode.com/problems/longest-palindromic-path-in-graph/">LeetCode #3615</a>
 */
public class LongestPalindromicPathInGraph {

    /**
     * Finds the longest Longest oscillating subarray.
     *
     * @param nums the nums (int[])
     * @return the computed int result
     */
    public int longestOscillatingSubarray(int[] nums) {
        int max=1, cur=1;
        for (int i=1;i<nums.length;i++) {
            if ((i%2==1&&nums[i]>nums[i-1])||(i%2==0&&nums[i]<nums[i-1])) cur++;
            else cur=1;
            max=Math.max(max,cur);
        }
        return max;
    }

    public static void main(String[] args) {
        LongestPalindromicPathInGraph sol = new LongestPalindromicPathInGraph();
        System.out.println(sol.longestOscillatingSubarray(new int[]{1,2,3}));
    }
}
