package org.leetcode.medium;


/**
 * <b>#3478 - Choose K Elements With Maximum Sum</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Sorting, Heap (Priority Queue)</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given two integer arrays, nums1 and nums2, both of length n, along with a positive integer k.
 *
 *
 * For each index i from 0 to n - 1, perform the following:
 *
 *
 * Find all indices j where nums1[j] is less than nums1[i].
 *
 * Choose at most k values of nums2[j] at these indices to maximize the total sum.
 *
 * Return an array answer of size n, where answer[i] represents the result for the corresponding index i.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums1 = [4,2,1,5,3], nums2 = [10,20,30,40,50], k = 2
 *
 *
 * Output: [80,30,0,80,50]
 *
 *
 * Explanation:
 *
 *
 * For i = 0: Select the 2 largest values from nums2 at indices [1, 2, 4] where nums1[j] &lt; nums1[0], resulting in 50 + 30 = 80.
 *
 * For i = 1: Select the 2 largest values from nums2 at index [2] where nums1[j] &lt; nums1[1], resulting in 30.
 *
 * For i = 2: No indices satisfy nums1[j] &lt; nums1[2], resulting in 0.
 *
 * For i = 3: Select the 2 largest values from nums2 at indices [0, 1, 2, 4] where nums1[j] &lt; nums1[3], resulting in 50 + 30 = 80.
 *
 * For i = 4: Select the 2 largest values from nums2 at indices [1, 2] where nums1[j] &lt; nums1[4], resulting in 30 + 20 = 50.
 *
 * Example 2:
 *
 * Input: nums1 = [2,2,2,2], nums2 = [3,1,2,3], k = 1
 *
 *
 * Output: [0,0,0,0]
 *
 *
 * Explanation:
 *
 *
 * Since all elements in nums1 are equal, no indices satisfy the condition nums1[j] &lt; nums1[i] for any i, resulting in 0 for all positions.
 *
 *
 *
 * Constraints:
 *
 *
 * n == nums1.length == nums2.length
 *
 * 1 &lt;= n &lt;= 105
 *
 * 1 &lt;= nums1[i], nums2[i] &lt;= 106
 *
 * 1 &lt;= k &lt;= n
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Sort <code>nums1</code> and its corresponding <code>nums2</code> values together based on <code>nums1</code>.
 * Hint 2: Use a max heap to track the top <code>k</code> values of <code>nums2</code> as you process each element in the sorted order.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Sorting, Heap (Priority Queue)).
 *
 * @see <a href="https://leetcode.com/problems/choose-k-elements-with-maximum-sum/">LeetCode #3478</a>
 */
public class ChooseKElementsWithMaximumSum {

    /**
     * Calculates Calculate score.
     *
     * @param instructions the instructions (String[])
     * @param arg the arg (int)
     * @return the computed int result
     */
    public int calculateScore(String[] instructions, int arg) {
        int score=0;
        for (String ins:instructions) {
            if (ins.startsWith("add")) score+=Integer.parseInt(ins.split(" ")[1]);
        }
        return score;
    }

    public static void main(String[] args) {
        ChooseKElementsWithMaximumSum sol = new ChooseKElementsWithMaximumSum();
                System.out.println(sol.calculateScore(new String[]{"add 1","add 2","multiply 3"},0)); // 3
                System.out.println(sol.calculateScore(new String[]{"add 5"},0)); // 5
    }
}
