package org.leetcode.medium;


/**
 * <b>#2007 - Find Original Array From Doubled Array</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Hash Table, Greedy, Sorting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * An integer array original is transformed into a doubled array changed by appending twice the value of every element in original, and then randomly shuffling the resulting array.
 *
 *
 * Given an array changed, return original if changed is a doubled array. If changed is not a doubled array, return an empty array. The elements in original may be returned in any order.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: changed = [1,3,4,2,6,8]
 * Output: [1,3,4]
 * Explanation: One possible original array could be [1,3,4]:
 * - Twice the value of 1 is 1 * 2 = 2.
 * - Twice the value of 3 is 3 * 2 = 6.
 * - Twice the value of 4 is 4 * 2 = 8.
 * Other original arrays could be [4,3,1] or [3,1,4].
 *
 * Example 2:
 *
 * Input: changed = [6,3,0,1]
 * Output: []
 * Explanation: changed is not a doubled array.
 *
 * Example 3:
 *
 * Input: changed = [1]
 * Output: []
 * Explanation: changed is not a doubled array.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= changed.length &lt;= 105
 *
 * 0 &lt;= changed[i] &lt;= 105
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: If changed is a doubled array, you should be able to delete elements and their doubled values until the array is empty.
 * Hint 2: Which element is guaranteed to not be a doubled value? It is the smallest element.
 * Hint 3: After removing the smallest element and its double from changed, is there another number that is guaranteed to not be a doubled value?
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Greedy, Sorting).
 *
 * @see <a href="https://leetcode.com/problems/find-original-array-from-doubled-array/">LeetCode #2007</a>
 */
public class FindOriginalArrayFromDoubledArray {

    /**
     * Finds Find original array.
     * Uses a hash map to track occurrences or cache results.
     *
     * @param changed the changed (int[])
     * @return the computed int[] result
     */
    public int[] findOriginalArray(int[] changed) {
        if (changed.length%2!=0) return new int[]{};
        java.util.TreeMap<Integer,Integer> map = new java.util.TreeMap<>();
        for (int n:changed) map.merge(n,1,Integer::sum);
        int[] orig = new int[changed.length/2]; int idx=0;
        for (int key : map.keySet()) {
            while (map.getOrDefault(key,0)>0) {
                map.merge(key,-1,Integer::sum);
                if (map.get(key)==0) map.remove(key);
                int dbl=2*key;
                if (map.getOrDefault(dbl,0)==0) return new int[]{};
                map.merge(dbl,-1,Integer::sum);
                if (map.get(dbl)==0) map.remove(dbl);
                orig[idx++]=key;
            }
        }
        return orig;
    }

    public static void main(String[] args) {
        FindOriginalArrayFromDoubledArray sol = new FindOriginalArrayFromDoubledArray();
                System.out.println(java.util.Arrays.toString(sol.findOriginalArray(new int[]{1,3,4,2,6,8}))); // [1,3,4]
                System.out.println(java.util.Arrays.toString(sol.findOriginalArray(new int[]{6,3,0,1}))); // []
                System.out.println(java.util.Arrays.toString(sol.findOriginalArray(new int[]{3,1}))); // []
    }
}
