package org.leetcode.easy;


/**
 * <b>#2418 - Sort the People</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Hash Table, String, Sorting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an array of strings names, and an array heights that consists of distinct positive integers. Both arrays are of length n.
 *
 *
 * For each index i, names[i] and heights[i] denote the name and height of the ith person.
 *
 *
 * Return names sorted in descending order by the people's heights.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: names = ["Mary","John","Emma"], heights = [180,165,170]
 * Output: ["Mary","Emma","John"]
 * Explanation: Mary is the tallest, followed by Emma and John.
 *
 * Example 2:
 *
 * Input: names = ["Alice","Bob","Bob"], heights = [155,185,150]
 * Output: ["Bob","Alice","Bob"]
 * Explanation: The first Bob is the tallest, followed by Alice and the second Bob.
 *
 *
 *
 * Constraints:
 *
 *
 * n == names.length == heights.length
 *
 * 1 &lt;= n &lt;= 103
 *
 * 1 &lt;= names[i].length &lt;= 20
 *
 * 1 &lt;= heights[i] &lt;= 105
 *
 * names[i] consists of lower and upper case English letters.
 *
 * All the values of heights are distinct.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Find the tallest person and swap with the first person, then find the second tallest person and swap with the second person, etc. Repeat until you fix all n people.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, String, Sorting).
 *
 * @see <a href="https://leetcode.com/problems/sort-the-people/">LeetCode #2418</a>
  *
  * <p><b>Explanation:</b> Sorts the input first to simplify subsequent search or comparison steps.</p>
  */
public class SortThePeople {

    /**
     * Sorts Sort people.
     * Sorts the input first to enable efficient processing.
     *
     * @param names the names (String[])
     * @param heights the heights (int[])
     * @return the computed String[] result
      *
      * <p><b>Explanation:</b> Sorts the input first to simplify subsequent search or comparison steps.</p>
      */
    public String[] sortPeople(String[] names, int[] heights) {
        Integer[] idx=new Integer[names.length];
        for (int i=0;i<idx.length;i++) idx[i]=i;
        java.util.Arrays.sort(idx,(a,b)->heights[b]-heights[a]);
        String[] res=new String[names.length];
        for (int i=0;i<res.length;i++) res[i]=names[idx[i]];
        return res;
    }

    public static void main(String[] args) {
        SortThePeople sol = new SortThePeople();
                System.out.println(java.util.Arrays.toString(sol.sortPeople(new String[]{"Mary","John","Emma"},new int[]{180,165,170}))); // [Mary,Emma,John]
                System.out.println(java.util.Arrays.toString(sol.sortPeople(new String[]{"Alice","Bob","Bob"},new int[]{155,185,150}))); // [Bob,Alice,Bob]
    }
}
