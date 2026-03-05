package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;
import java.util.Arrays;

/**
 * LeetCode #455: Assign Cookies
 * @see <a href="https://leetcode.com/problems/assign-cookies/">Problem</a>
 */
public class AssignCookies {

    /**
     * LeetCode #455 – Assign Cookies
     * Difficulty: EASY
     * Topics: Array, Two Pointers, Greedy, Sorting
     *
     * Assume you are an awesome parent and want to give your children some
     * cookies. But, you should give each child at most one cookie.
     * 
     * 
     * Each child i has a greed factor g[i], which is the minimum size of a cookie
     * that the child will be content with; and each cookie j has a size s[j]. If
     * s[j] &gt;= g[i], we can assign the cookie j to the child i, and the child i
     * will be content. Your goal is to maximize the number of your content
     * children and output the maximum number.
     * 
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: g = [1,2,3], s = [1,1]
     * Output: 1
     * Explanation: You have 3 children and 2 cookies. The greed factors of 3
     * children are 1, 2, 3.
     * And even though you have 2 cookies, since their size is both 1, you could
     * only make the child whose greed factor is 1 content.
     * You need to output 1.
     * 
     * Example 2:
     * 
     * Input: g = [1,2], s = [1,2,3]
     * Output: 2
     * Explanation: You have 2 children and 3 cookies. The greed factors of 2
     * children are 1, 2.
     * You have 3 cookies and their sizes are big enough to gratify all of the
     * children,
     * You need to output 2.
     * 
     * 
     * 
     * Constraints:
     * 
     * 
     * 1 &lt;= g.length &lt;= 3 * 104
     * 
     * 0 &lt;= s.length &lt;= 3 * 104
     * 
     * 1 &lt;= g[i], s[j] &lt;= 231 - 1
     * 
     * 
     * 
     * Note: This question is the same as 2410: Maximum Matching of Players With
     * Trainers.
      *
      * <p><b>Explanation:</b> Sorts the input first to simplify subsequent search or comparison steps.</p>
      */
    // Greedy: sort both, assign smallest sufficient cookie to each child
    /**
     * Finds Find content children.
     * Sorts the input first to enable efficient processing.
     *
     * @param g the g (int[])
     * @param s the s (int[])
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Sorts the input first to simplify subsequent search or comparison steps.</p>
      */
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g); Arrays.sort(s);
        int child = 0, cookie = 0;
        while (child < g.length && cookie < s.length) {
            if (s[cookie] >= g[child]) child++;
            cookie++;
        }
        return child;
    }

    public static void main(String[] args) {
        AssignCookies sol = new AssignCookies();
        System.out.println(sol.findContentChildren(new int[]{1,2,3}, new int[]{1,2,3}));
    }
}
