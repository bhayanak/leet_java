package org.leetcode.easy;


/**
 * <b>#2404 - Most Frequent Even Element</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Hash Table, Counting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an integer array nums, return the most frequent even element.
 *
 *
 * If there is a tie, return the smallest one. If there is no such element, return -1.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [0,1,2,2,4,4,1]
 * Output: 2
 * Explanation:
 * The even elements are 0, 2, and 4. Of these, 2 and 4 appear the most.
 * We return the smallest one, which is 2.
 *
 * Example 2:
 *
 * Input: nums = [4,4,4,9,2,4]
 * Output: 4
 * Explanation: 4 is the even element appears the most.
 *
 * Example 3:
 *
 * Input: nums = [29,47,21,41,13,37,25,7]
 * Output: -1
 * Explanation: There is no even element.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 2000
 *
 * 0 &lt;= nums[i] &lt;= 105
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Could you count the frequency of each even element in the array?
 * Hint 2: Would a hashmap help?
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Counting).
 *
 * @see <a href="https://leetcode.com/problems/most-frequent-even-element/">LeetCode #2404</a>
  *
  * <p><b>Explanation:</b> Uses a HashMap for O(1) average-time lookups, mapping values to indices/counts.</p>
  */
public class MostFrequentEvenElement {

    /**
     * Solves the problem: Most frequent even.
     * Uses a hash map to track occurrences or cache results.
     *
     * @param nums the nums (int[])
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Uses a HashMap for O(1) average-time lookups, mapping values to indices/counts.</p>
      */
    public int mostFrequentEven(int[] nums) {
        java.util.Map<Integer,Integer> cnt=new java.util.HashMap<>();
        for (int n:nums) if (n%2==0) cnt.merge(n,1,Integer::sum);
        int res=-1, maxCnt=0;
        for (var e:cnt.entrySet()) {
            if (e.getValue()>maxCnt||(e.getValue()==maxCnt&&e.getKey()<res)) {
                maxCnt=e.getValue(); res=e.getKey();
            }
        }
        return res;
    }

    public static void main(String[] args) {
        MostFrequentEvenElement sol = new MostFrequentEvenElement();
                System.out.println(sol.mostFrequentEven(new int[]{0,1,2,2,4,4,1})); // 2
                System.out.println(sol.mostFrequentEven(new int[]{4,4,4,9,2,4}));   // 4
                System.out.println(sol.mostFrequentEven(new int[]{29,47,21,41,13,37,25,7})); // -1
    }
}
