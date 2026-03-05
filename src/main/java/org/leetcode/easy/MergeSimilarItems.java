package org.leetcode.easy;


/**
 * <b>#2363 - Merge Similar Items</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Hash Table, Sorting, Ordered Set</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given two 2D integer arrays, items1 and items2, representing two sets of items. Each array items has the following properties:
 *
 *
 * items[i] = [valuei, weighti] where valuei represents the value and weighti represents the weight of the ith item.
 *
 * The value of each item in items is unique.
 *
 * Return a 2D integer array ret where ret[i] = [valuei, weighti], with weighti being the sum of weights of all items with value valuei.
 *
 *
 * Note: ret should be returned in ascending order by value.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: items1 = [[1,1],[4,5],[3,8]], items2 = [[3,1],[1,5]]
 * Output: [[1,6],[3,9],[4,5]]
 * Explanation: 
 * The item with value = 1 occurs in items1 with weight = 1 and in items2 with weight = 5, total weight = 1 + 5 = 6.
 * The item with value = 3 occurs in items1 with weight = 8 and in items2 with weight = 1, total weight = 8 + 1 = 9.
 * The item with value = 4 occurs in items1 with weight = 5, total weight = 5.  
 * Therefore, we return [[1,6],[3,9],[4,5]].
 *
 * Example 2:
 *
 * Input: items1 = [[1,1],[3,2],[2,3]], items2 = [[2,1],[3,2],[1,3]]
 * Output: [[1,4],[2,4],[3,4]]
 * Explanation: 
 * The item with value = 1 occurs in items1 with weight = 1 and in items2 with weight = 3, total weight = 1 + 3 = 4.
 * The item with value = 2 occurs in items1 with weight = 3 and in items2 with weight = 1, total weight = 3 + 1 = 4.
 * The item with value = 3 occurs in items1 with weight = 2 and in items2 with weight = 2, total weight = 2 + 2 = 4.
 * Therefore, we return [[1,4],[2,4],[3,4]].
 *
 * Example 3:
 *
 * Input: items1 = [[1,3],[2,2]], items2 = [[7,1],[2,2],[1,4]]
 * Output: [[1,7],[2,4],[7,1]]
 * Explanation:
 * The item with value = 1 occurs in items1 with weight = 3 and in items2 with weight = 4, total weight = 3 + 4 = 7. 
 * The item with value = 2 occurs in items1 with weight = 2 and in items2 with weight = 2, total weight = 2 + 2 = 4. 
 * The item with value = 7 occurs in items2 with weight = 1, total weight = 1.
 * Therefore, we return [[1,7],[2,4],[7,1]].
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= items1.length, items2.length &lt;= 1000
 *
 * items1[i].length == items2[i].length == 2
 *
 * 1 &lt;= valuei, weighti &lt;= 1000
 *
 * Each valuei in items1 is unique.
 *
 * Each valuei in items2 is unique.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Map the weights using the corresponding values as keys.
 * Hint 2: Make sure your output is sorted in ascending order by value.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Sorting, Ordered Set).
 *
 * @see <a href="https://leetcode.com/problems/merge-similar-items/">LeetCode #2363</a>
 */
public class MergeSimilarItems {


    /**
     * Merges two item arrays, summing weights for items with the same value.
     *
     * @param items1 first array of [value, weight] pairs
     * @param items2 second array of [value, weight] pairs
     * @return merged sorted list of [value, total_weight] pairs
     *
     * <p><b>Explanation:</b> Uses a TreeMap (sorted by value) to accumulate weights for</p>
     *   both arrays, then streams entries into the result list. Time O(n log n).
     */
    public java.util.List<java.util.List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        java.util.TreeMap<Integer,Integer> map=new java.util.TreeMap<>();
        for (int[] it:items1) map.merge(it[0],it[1],Integer::sum);
        for (int[] it:items2) map.merge(it[0],it[1],Integer::sum);
        java.util.List<java.util.List<Integer>> res=new java.util.ArrayList<>();
        for (var e:map.entrySet()) res.add(java.util.Arrays.asList(e.getKey(),e.getValue()));
        return res;
    }

    public static void main(String[] args) {
        MergeSimilarItems sol = new MergeSimilarItems();
        System.out.println(sol.mergeSimilarItems(new int[][]{{1,1},{4,5},{3,8}}, new int[][]{{3,1},{1,5}}));
    }
}
