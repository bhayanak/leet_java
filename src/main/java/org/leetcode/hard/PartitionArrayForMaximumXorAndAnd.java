package org.leetcode.hard;


/**
 * <b>#3630 - Partition Array for Maximum XOR and AND</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Math, Greedy, Bit Manipulation, Enumeration</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array nums.
 *
 *
 * Partition the array into three (possibly empty) subsequences A, B, and C such that every element of nums belongs to exactly one subsequence.
 *
 *
 * Your goal is to maximize the value of: XOR(A) + AND(B) + XOR(C)
 *
 *
 * where:
 *
 *
 * XOR(arr) denotes the bitwise XOR of all elements in arr. If arr is empty, its value is defined as 0.
 *
 * AND(arr) denotes the bitwise AND of all elements in arr. If arr is empty, its value is defined as 0.
 *
 * Return the maximum value achievable.
 *
 *
 * Note: If multiple partitions result in the same maximum sum, you can consider any one of them.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [2,3]
 *
 *
 * Output: 5
 *
 *
 * Explanation:
 *
 *
 * One optimal partition is:
 *
 *
 * A = [3], XOR(A) = 3
 *
 * B = [2], AND(B) = 2
 *
 * C = [], XOR(C) = 0
 *
 * The maximum value of: XOR(A) + AND(B) + XOR(C) = 3 + 2 + 0 = 5. Thus, the answer is 5.
 *
 * Example 2:
 *
 * Input: nums = [1,3,2]
 *
 *
 * Output: 6
 *
 *
 * Explanation:
 *
 *
 * One optimal partition is:
 *
 *
 * A = [1], XOR(A) = 1
 *
 * B = [2], AND(B) = 2
 *
 * C = [3], XOR(C) = 3
 *
 * The maximum value of: XOR(A) + AND(B) + XOR(C) = 1 + 2 + 3 = 6. Thus, the answer is 6.
 *
 * Example 3:
 *
 * Input: nums = [2,3,6,7]
 *
 *
 * Output: 15
 *
 *
 * Explanation:
 *
 *
 * One optimal partition is:
 *
 *
 * A = [7], XOR(A) = 7
 *
 * B = [2,3], AND(B) = 2
 *
 * C = [6], XOR(C) = 6
 *
 * The maximum value of: XOR(A) + AND(B) + XOR(C) = 7 + 2 + 6 = 15. Thus, the answer is 15.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 19
 *
 * 1 &lt;= nums[i] &lt;= 109
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Brute-force all subsets for <code>B</code>.
 * Hint 2: Let <code>s</code> = XOR of all elements not in <code>B</code>.
 * Hint 3: We want to choose a value <code>x</code> (a subset‐XOR of the "remaining" elements) to maximize <code>x + (s XOR x)</code>.
 * Hint 4: Observe that <code>x + (s XOR x) = s + 2 * (x AND ~s)</code>.
 * Hint 5: To do this efficiently, build a linear XOR basis over the values <code>nums[j] &amp; ~s</code> for each index <code>j</code> not in <code>B</code>.
 * Hint 6: Finally, greedily extract the maximum <code>x</code> from that basis.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Math, Greedy, Bit Manipulation, Enumeration).
 *
 * @see <a href="https://leetcode.com/problems/partition-array-for-maximum-xor-and-and/">LeetCode #3630</a>
 */
public class PartitionArrayForMaximumXorAndAnd {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Partition Array for Maximum XOR and AND");
    }

    public static void main(String[] args) {
        System.out.println("=== PartitionArrayForMaximumXorAndAnd ===");
        PartitionArrayForMaximumXorAndAnd sol = new PartitionArrayForMaximumXorAndAnd();
        System.out.println(sol.solve(null));
    }
}
