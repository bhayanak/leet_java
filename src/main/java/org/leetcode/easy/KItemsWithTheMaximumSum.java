package org.leetcode.easy;


/**
 * <b>#2600 - K Items With the Maximum Sum</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Math, Greedy</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * There is a bag that consists of items, each item has a number 1, 0, or -1 written on it.
 *
 *
 * You are given four non-negative integers numOnes, numZeros, numNegOnes, and k.
 *
 *
 * The bag initially contains:
 *
 *
 * numOnes items with 1s written on them.
 *
 * numZeroes items with 0s written on them.
 *
 * numNegOnes items with -1s written on them.
 *
 * We want to pick exactly k items among the available items. Return the maximum possible sum of numbers written on the items.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: numOnes = 3, numZeros = 2, numNegOnes = 0, k = 2
 * Output: 2
 * Explanation: We have a bag of items with numbers written on them {1, 1, 1, 0, 0}. We take 2 items with 1 written on them and get a sum in a total of 2.
 * It can be proven that 2 is the maximum possible sum.
 *
 * Example 2:
 *
 * Input: numOnes = 3, numZeros = 2, numNegOnes = 0, k = 4
 * Output: 3
 * Explanation: We have a bag of items with numbers written on them {1, 1, 1, 0, 0}. We take 3 items with 1 written on them, and 1 item with 0 written on it, and get a sum in a total of 3.
 * It can be proven that 3 is the maximum possible sum.
 *
 *
 *
 * Constraints:
 *
 *
 * 0 &lt;= numOnes, numZeros, numNegOnes &lt;= 50
 *
 * 0 &lt;= k &lt;= numOnes + numZeros + numNegOnes
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: It is always optimal to take items with the number 1 written on them as much as possible.
 * Hint 2: If k &gt; numOnes, after taking all items with the number 1, it is always optimal to take items with the number 0 written on them as much as possible.
 * Hint 3: If k &gt; numOnes + numZeroes we are forced to take k - numOnes - numZeroes -1s.
 *
 * <h2>Approach</h2>
 * Think about the category (Math, Greedy).
 *
 * @see <a href="https://leetcode.com/problems/k-items-with-the-maximum-sum/">LeetCode #2600</a>
  *
  * <p><b>Explanation:</b> Tracks the running maximum in a single O(n) scan without extra space.</p>
  */
public class KItemsWithTheMaximumSum {

    /**
     * Solves the problem: K items with maximum sum.
     *
     * @param numOnes the numOnes (int)
     * @param numZeros the numZeros (int)
     * @param numNegOnes the numNegOnes (int)
     * @param k the k (int)
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Tracks the running maximum in a single O(n) scan without extra space.</p>
      */
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        if (k<=numOnes) return k;
        k-=numOnes;
        if (k<=numZeros) return numOnes;
        k-=numZeros;
        return numOnes-k;
    }

    public static void main(String[] args) {
        KItemsWithTheMaximumSum sol = new KItemsWithTheMaximumSum();
                System.out.println(sol.kItemsWithMaximumSum(3,2,0,2)); // 2
                System.out.println(sol.kItemsWithMaximumSum(3,2,0,4)); // 3
    }
}
