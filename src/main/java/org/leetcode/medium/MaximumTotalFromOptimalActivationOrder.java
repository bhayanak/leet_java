package org.leetcode.medium;


/**
 * <b>#3645 - Maximum Total from Optimal Activation Order</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Two Pointers, Greedy, Sorting, Heap (Priority Queue)</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given two integer arrays value and limit, both of length n.
 *
 *
 * Initially, all elements are inactive. You may activate them in any order.
 *
 *
 * To activate an inactive element at index i, the number of currently active elements must be strictly less than limit[i].
 *
 * When you activate the element at index i, it adds value[i] to the total activation value (i.e., the sum of value[i] for all elements that have undergone activation operations).
 *
 * After each activation, if the number of currently active elements becomes x, then all elements j with limit[j] &lt;= x become permanently inactive, even if they are already active.
 *
 * Return the maximum total you can obtain by choosing the activation order optimally.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: value = [3,5,8], limit = [2,1,3]
 *
 *
 * Output: 16
 *
 *
 * Explanation:
 *
 *
 * One optimal activation order is:
 *
 *
 *
 *
 *
 * 			Step
 * 			Activated i
 * 			value[i]
 * 			Active Before i
 * 			Active After i
 * 			Becomes Inactive j
 * 			Inactive Elements
 * 			Total
 *
 *
 *
 *
 *
 *
 * 			1
 * 			1
 * 			5
 * 			0
 * 			1
 * 			j = 1 as limit[1] = 1
 * 			[1]
 * 			5
 *
 *
 *
 *
 * 			2
 * 			0
 * 			3
 * 			0
 * 			1
 * 			-
 * 			[1]
 * 			8
 *
 *
 *
 *
 * 			3
 * 			2
 * 			8
 * 			1
 * 			2
 * 			j = 0 as limit[0] = 2
 * 			[0, 1]
 * 			16
 *
 *
 *
 *
 * Thus, the maximum possible total is 16.
 *
 * Example 2:
 *
 * Input: value = [4,2,6], limit = [1,1,1]
 *
 *
 * Output: 6
 *
 *
 * Explanation:
 *
 *
 * One optimal activation order is:
 *
 *
 *
 *
 *
 * 			Step
 * 			Activated i
 * 			value[i]
 * 			Active Before i
 * 			Active After i
 * 			Becomes Inactive j
 * 			Inactive Elements
 * 			Total
 *
 *
 *
 *
 *
 *
 * 			1
 * 			2
 * 			6
 * 			0
 * 			1
 * 			j = 0, 1, 2 as limit[j] = 1
 * 			[0, 1, 2]
 * 			6
 *
 *
 *
 *
 * Thus, the maximum possible total is 6.
 *
 * Example 3:
 *
 * Input: value = [4,1,5,2], limit = [3,3,2,3]
 *
 *
 * Output: 12
 *
 *
 * Explanation:
 *
 *
 * One optimal activation order is:​​​​​​​​​​​​​​
 *
 *
 *
 *
 *
 * 			Step
 * 			Activated i
 * 			value[i]
 * 			Active Before i
 * 			Active After i
 * 			Becomes Inactive j
 * 			Inactive Elements
 * 			Total
 *
 *
 *
 *
 *
 *
 * 			1
 * 			2
 * 			5
 * 			0
 * 			1
 * 			-
 * 			[ ]
 * 			5
 *
 *
 *
 *
 * 			2
 * 			0
 * 			4
 * 			1
 * 			2
 * 			j = 2 as limit[2] = 2
 * 			[2]
 * 			9
 *
 *
 *
 *
 * 			3
 * 			1
 * 			1
 * 			1
 * 			2
 * 			-
 * 			[2]
 * 			10
 *
 *
 *
 *
 * 			4
 * 			3
 * 			2
 * 			2
 * 			3
 * 			j = 0, 1, 3 as limit[j] = 3
 * 			[0, 1, 2, 3]
 * 			12
 *
 *
 *
 *
 * Thus, the maximum possible total is 12.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n == value.length == limit.length &lt;= 105
 *
 * 1 &lt;= value[i] &lt;= 105​​​​​​​
 *
 * 1 &lt;= limit[i] &lt;= n
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Group the items by their <code>limit</code> values, as decisions for each <code>limit</code> are independent.
 * Hint 2: For a group with <code>limit = j</code> and <code>m</code> items, its contribution is the sum of the top <code>min(j, m)</code> values.
 * Hint 3: To extract each group's top values, use a min-heap of capacity <code>j</code>: push each <code>value[i]</code>, and whenever the heap size exceeds <code>j</code>, pop the smallest.
 * Hint 4: After processing a group's heap, sum its elements and add to the overall total; repeat for all groups in any order.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Two Pointers, Greedy, Sorting, Heap (Priority Queue)).
 *
 * @see <a href="https://leetcode.com/problems/maximum-total-from-optimal-activation-order/">LeetCode #3645</a>
 */
public class MaximumTotalFromOptimalActivationOrder {

    /**
     * Computes the minimum Min operations to make unique.
     * Sorts the input first to enable efficient processing.
     *
     * @param nums the nums (int[])
     * @return the computed int result
     */
    public int minOperationsToMakeUnique(int[] nums) {
        java.util.Arrays.sort(nums);
        int ops=0;
        for (int i=1;i<nums.length;i++) {
            if (nums[i]<=nums[i-1]) { ops+=nums[i-1]+1-nums[i]; nums[i]=nums[i-1]+1; }
        }
        return ops;
    }

    public static void main(String[] args) {
        MaximumTotalFromOptimalActivationOrder sol = new MaximumTotalFromOptimalActivationOrder();
        System.out.println(sol.minOperationsToMakeUnique(new int[]{1,2,3}));
    }
}
