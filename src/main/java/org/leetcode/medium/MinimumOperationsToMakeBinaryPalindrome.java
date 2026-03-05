package org.leetcode.medium;


/**
 * <b>#3766 - Minimum Operations to Make Binary Palindrome</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Two Pointers, Binary Search, Bit Manipulation</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array nums.
 *
 *
 * For each element nums[i], you may perform the following operations any number of times (including zero):
 *
 *
 * Increase nums[i] by 1, or
 *
 * Decrease nums[i] by 1.
 *
 * A number is called a binary palindrome if its binary representation without leading zeros reads the same forward and backward.
 *
 *
 * Your task is to return an integer array ans, where ans[i] represents the minimum number of operations required to convert nums[i] into a binary palindrome.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,2,4]
 *
 *
 * Output: [0,1,1]
 *
 *
 * Explanation:
 *
 *
 * One optimal set of operations:
 *
 *
 *
 *
 *
 * 			nums[i]
 * 			Binary(nums[i])
 * 			Nearest
 *
 * 			Palindrome
 * 			Binary
 *
 * 			(Palindrome)
 * 			Operations Required
 * 			ans[i]
 *
 *
 *
 *
 *
 *
 * 			1
 * 			1
 * 			1
 * 			1
 * 			Already palindrome
 * 			0
 *
 *
 *
 *
 * 			2
 * 			10
 * 			3
 * 			11
 * 			Increase by 1
 * 			1
 *
 *
 *
 *
 * 			4
 * 			100
 * 			3
 * 			11
 * 			Decrease by 1
 * 			1
 *
 *
 *
 *
 * Thus, ans = [0, 1, 1].
 *
 * Example 2:
 *
 * Input: nums = [6,7,12]
 *
 *
 * Output: [1,0,3]
 *
 *
 * Explanation:
 *
 *
 * One optimal set of operations:
 *
 *
 *
 *
 *
 * 			nums[i]
 * 			Binary(nums[i])
 * 			Nearest
 *
 * 			Palindrome
 * 			Binary
 *
 * 			(Palindrome)
 * 			Operations Required
 * 			ans[i]
 *
 *
 *
 *
 *
 *
 * 			6
 * 			110
 * 			5
 * 			101
 * 			Decrease by 1
 * 			1
 *
 *
 *
 *
 * 			7
 * 			111
 * 			7
 * 			111
 * 			Already palindrome
 * 			0
 *
 *
 *
 *
 * 			12
 * 			1100
 * 			15
 * 			1111
 * 			Increase by 3
 * 			3
 *
 *
 *
 *
 * Thus, ans = [1, 0, 3].
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 5000
 *
 * ​​​​​​​1 &lt;= nums[i] &lt;= 5000
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Preprocess the binary palindromes
 * Hint 2: For each <code>nums[i]</code> find the closest binary palindrome from the preprocessed values
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Two Pointers, Binary Search, Bit Manipulation).
 *
 * @see <a href="https://leetcode.com/problems/minimum-operations-to-make-binary-palindrome/">LeetCode #3766</a>
 */
public class MinimumOperationsToMakeBinaryPalindrome {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Minimum Operations to Make Binary Palindrome");
    }

    public static void main(String[] args) {
        System.out.println("=== MinimumOperationsToMakeBinaryPalindrome ===");
        MinimumOperationsToMakeBinaryPalindrome sol = new MinimumOperationsToMakeBinaryPalindrome();
        System.out.println(sol.solve(null));
    }
}
