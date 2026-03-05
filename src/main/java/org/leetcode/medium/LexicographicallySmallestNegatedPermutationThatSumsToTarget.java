package org.leetcode.medium;


/**
 * <b>#3752 - Lexicographically Smallest Negated Permutation that Sums to Target</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Math, Two Pointers, Greedy, Sorting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a positive integer n and an integer target.
 *
 *
 * Return the lexicographically smallest array of integers of size n such that:
 *
 *
 * The sum of its elements equals target.
 *
 * The absolute values of its elements form a permutation of size n.
 *
 * If no such array exists, return an empty array.
 *
 *
 * A permutation of size n is a rearrangement of integers 1, 2, ..., n.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: n = 3, target = 0
 *
 *
 * Output: [-3,1,2]
 *
 *
 * Explanation:
 *
 *
 * The arrays that sum to 0 and whose absolute values form a permutation of size 3 are:
 *
 *
 * [-3, 1, 2]
 *
 * [-3, 2, 1]
 *
 * [-2, -1, 3]
 *
 * [-2, 3, -1]
 *
 * [-1, -2, 3]
 *
 * [-1, 3, -2]
 *
 * [1, -3, 2]
 *
 * [1, 2, -3]
 *
 * [2, -3, 1]
 *
 * [2, 1, -3]
 *
 * [3, -2, -1]
 *
 * [3, -1, -2]
 *
 * The lexicographically smallest one is [-3, 1, 2].
 *
 * Example 2:
 *
 * Input: n = 1, target = 10000000000
 *
 *
 * Output: []
 *
 *
 * Explanation:
 *
 *
 * There are no arrays that sum to 10000000000 and whose absolute values form a permutation of size 1. Therefore, the answer is [].
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n &lt;= 105
 *
 * -1010 &lt;= target &lt;= 1010
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Start with all numbers positive: <code>[1, 2, ..., n]</code>. Let <code>S = n * (n + 1) / 2</code>.
 * Hint 2: If <code>target &lt; -S</code> or <code>target &gt; S</code> or <code>(S - target) % 2 == 1</code> then no solution - return <code>[]</code>.
 * Hint 3: Let <code>D = S - target</code> (nonnegative). Flipping <code>x</code> to <code>-x</code> reduces the sum by <code>2*x</code>.
 * Hint 4: For <code>x = n</code> down to <code>1</code>: if <code>2x &lt;= D</code> then flip <code>x</code> and set <code>D -= 2x</code>.
 * Hint 5: Build the array using the chosen signs and sort it in ascending order to obtain the lexicographically smallest result.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Math, Two Pointers, Greedy, Sorting).
 *
 * @see <a href="https://leetcode.com/problems/lexicographically-smallest-negated-permutation-that-sums-to-target/">LeetCode #3752</a>
 */
public class LexicographicallySmallestNegatedPermutationThatSumsToTarget {

    /**
     * Solves the problem: Most frequent even.
     * Uses a hash map to track occurrences or cache results.
     *
     * @param nums the nums (int[])
     * @return the computed int result
     */
    public int mostFrequentEven(int[] nums) {
        java.util.Map<Integer,Integer> cnt=new java.util.HashMap<>();
        for (int n:nums) if (n%2==0) cnt.merge(n,1,Integer::sum);
        int maxF=0, res=-1;
        for (var e:cnt.entrySet()) {
            if (e.getValue()>maxF||(e.getValue()==maxF&&e.getKey()<res)) { maxF=e.getValue(); res=e.getKey(); }
        }
        return res;
    }

    public static void main(String[] args) {
        LexicographicallySmallestNegatedPermutationThatSumsToTarget sol = new LexicographicallySmallestNegatedPermutationThatSumsToTarget();
        System.out.println(sol.mostFrequentEven(new int[]{1,2,3}));
    }
}
