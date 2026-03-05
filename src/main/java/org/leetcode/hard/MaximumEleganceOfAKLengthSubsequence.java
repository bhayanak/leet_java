package org.leetcode.hard;


/**
 * <b>#2813 - Maximum Elegance of a K-Length Subsequence</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Hash Table, Stack, Greedy, Sorting, Heap (Priority Queue)</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a 0-indexed 2D integer array items of length n and an integer k.
 *
 *
 * items[i] = [profiti, categoryi], where profiti and categoryi denote the profit and category of the ith item respectively.
 *
 *
 * Let's define the elegance of a subsequence of items as total_profit + distinct_categories2, where total_profit is the sum of all profits in the subsequence, and distinct_categories is the number of distinct categories from all the categories in the selected subsequence.
 *
 *
 * Your task is to find the maximum elegance from all subsequences of size k in items.
 *
 *
 * Return an integer denoting the maximum elegance of a subsequence of items with size exactly k.
 *
 *
 * Note: A subsequence of an array is a new array generated from the original array by deleting some elements (possibly none) without changing the remaining elements' relative order.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: items = [[3,2],[5,1],[10,1]], k = 2
 * Output: 17
 * Explanation: In this example, we have to select a subsequence of size 2.
 * We can select items[0] = [3,2] and items[2] = [10,1].
 * The total profit in this subsequence is 3 + 10 = 13, and the subsequence contains 2 distinct categories [2,1].
 * Hence, the elegance is 13 + 22 = 17, and we can show that it is the maximum achievable elegance. 
 *
 * Example 2:
 *
 * Input: items = [[3,1],[3,1],[2,2],[5,3]], k = 3
 * Output: 19
 * Explanation: In this example, we have to select a subsequence of size 3. 
 * We can select items[0] = [3,1], items[2] = [2,2], and items[3] = [5,3]. 
 * The total profit in this subsequence is 3 + 2 + 5 = 10, and the subsequence contains 3 distinct categories [1,2,3]. 
 * Hence, the elegance is 10 + 32 = 19, and we can show that it is the maximum achievable elegance.
 *
 * Example 3:
 *
 * Input: items = [[1,1],[2,1],[3,1]], k = 3
 * Output: 7
 * Explanation: In this example, we have to select a subsequence of size 3. 
 * We should select all the items. 
 * The total profit will be 1 + 2 + 3 = 6, and the subsequence contains 1 distinct category [1]. 
 * Hence, the maximum elegance is 6 + 12 = 7.  
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= items.length == n &lt;= 105
 *
 * items[i].length == 2
 *
 * items[i][0] == profiti
 *
 * items[i][1] == categoryi
 *
 * 1 &lt;= profiti &lt;= 109
 *
 * 1 &lt;= categoryi &lt;= n 
 *
 * 1 &lt;= k &lt;= n
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: <div class="_1l1MA">Greedy algorithm.</div>
 * Hint 2: <div class="_1l1MA">Sort items in non-increasing order of profits.</div>
 * Hint 3: <div class="_1l1MA">Select the first <code>k</code> items (the top <code>k</code> most profitable items). Keep track of the items as the candidate set.</div>
 * Hint 4: <div class="_1l1MA">For the remaining <code>n - k</code> items sorted in non-increasing order of profits, try replacing an item in the candidate set using the current item.</div>
 * Hint 5: <div class="_1l1MA">The replacing item should add a new category to the candidate set and should remove the item with the minimum profit that occurs more than once in the candidate set.</div>
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Stack, Greedy, Sorting, Heap (Priority Queue)).
 *
 * @see <a href="https://leetcode.com/problems/maximum-elegance-of-a-k-length-subsequence/">LeetCode #2813</a>
 */
public class MaximumEleganceOfAKLengthSubsequence {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Maximum Elegance of a K-Length Subsequence");
    }

    public static void main(String[] args) {
        System.out.println("=== MaximumEleganceOfAKLengthSubsequence ===");
        MaximumEleganceOfAKLengthSubsequence sol = new MaximumEleganceOfAKLengthSubsequence();
        System.out.println(sol.solve(null));
    }
}
