package org.leetcode.medium;


/**
 * <b>#3649 - Number of Perfect Pairs</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Math, Two Pointers, Sorting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array nums.
 *
 *
 * A pair of indices (i, j) is called perfect if the following conditions are satisfied:
 *
 *
 * i &lt; j
 *
 * Let a = nums[i], b = nums[j]. Then:
 *
 *
 *
 * min(|a - b|, |a + b|) &lt;= min(|a|, |b|)
 *
 * max(|a - b|, |a + b|) &gt;= max(|a|, |b|)
 *
 *
 *
 * Return the number of distinct perfect pairs.
 *
 *
 * Note: The absolute value |x| refers to the non-negative value of x.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [0,1,2,3]
 *
 *
 * Output: 2
 *
 *
 * Explanation:
 *
 *
 * There are 2 perfect pairs:
 *
 *
 *
 *
 *
 * 			(i, j)
 * 			(a, b)
 * 			min(|a − b|, |a + b|)
 * 			min(|a|, |b|)
 * 			max(|a − b|, |a + b|)
 * 			max(|a|, |b|)
 *
 *
 *
 *
 *
 *
 * 			(1, 2)
 * 			(1, 2)
 * 			min(|1 − 2|, |1 + 2|) = 1
 * 			1
 * 			max(|1 − 2|, |1 + 2|) = 3
 * 			2
 *
 *
 *
 *
 * 			(2, 3)
 * 			(2, 3)
 * 			min(|2 − 3|, |2 + 3|) = 1
 * 			2
 * 			max(|2 − 3|, |2 + 3|) = 5
 * 			3
 *
 *
 *
 *
 * Example 2:
 *
 * Input: nums = [-3,2,-1,4]
 *
 *
 * Output: 4
 *
 *
 * Explanation:
 *
 *
 * There are 4 perfect pairs:
 *
 *
 *
 *
 *
 * 			(i, j)
 * 			(a, b)
 * 			min(|a − b|, |a + b|)
 * 			min(|a|, |b|)
 * 			max(|a − b|, |a + b|)
 * 			max(|a|, |b|)
 *
 *
 *
 *
 *
 *
 * 			(0, 1)
 * 			(-3, 2)
 * 			min(|-3 - 2|, |-3 + 2|) = 1
 * 			2
 * 			max(|-3 - 2|, |-3 + 2|) = 5
 * 			3
 *
 *
 *
 *
 * 			(0, 3)
 * 			(-3, 4)
 * 			min(|-3 - 4|, |-3 + 4|) = 1
 * 			3
 * 			max(|-3 - 4|, |-3 + 4|) = 7
 * 			4
 *
 *
 *
 *
 * 			(1, 2)
 * 			(2, -1)
 * 			min(|2 - (-1)|, |2 + (-1)|) = 1
 * 			1
 * 			max(|2 - (-1)|, |2 + (-1)|) = 3
 * 			2
 *
 *
 *
 *
 * 			(1, 3)
 * 			(2, 4)
 * 			min(|2 - 4|, |2 + 4|) = 2
 * 			2
 * 			max(|2 - 4|, |2 + 4|) = 6
 * 			4
 *
 *
 *
 *
 * Example 3:
 *
 * Input: nums = [1,10,100,1000]
 *
 *
 * Output: 0
 *
 *
 * Explanation:
 *
 *
 * There are no perfect pairs. Thus, the answer is 0.
 *
 *
 *
 * Constraints:
 *
 *
 * 2 &lt;= nums.length &lt;= 105
 *
 * -109 &lt;= nums[i] &lt;= 109
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: For any pair (a, b), let <code>x = |a|</code> and <code>y = |b|</code> and assume <code>x &lt;= y</code>; the two conditions simplify to <code>y &lt;= 2*x</code>.
 * Hint 2: Sort the array by absolute value.
 * Hint 3: Maintain two pointers <code>i</code> and <code>j</code> (starting at 0 and 1): for each <code>i</code>, advance <code>j</code> while <code>abs(nums[j]) &lt;= 2*abs(nums[i])</code>.
 * Hint 4: For each <code>i</code>, add <code>j - i - 1</code> to your answer.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Math, Two Pointers, Sorting).
 *
 * @see <a href="https://leetcode.com/problems/number-of-perfect-pairs/">LeetCode #3649</a>
 */
public class NumberOfPerfectPairs {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Number of Perfect Pairs");
    }

    public static void main(String[] args) {
        System.out.println("=== NumberOfPerfectPairs ===");
        NumberOfPerfectPairs sol = new NumberOfPerfectPairs();
        System.out.println(sol.solve(null));
    }
}
