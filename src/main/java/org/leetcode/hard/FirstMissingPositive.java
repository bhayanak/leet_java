package org.leetcode.hard;

/**
 * <b>#41 - First Missing Positive</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Hash Table</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an unsorted integer array nums. Return the smallest positive integer that is not present in nums.
 * 
 * 
 * You must implement an algorithm that runs in O(n) time and uses O(1) auxiliary space.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: nums = [1,2,0]
 * Output: 3
 * Explanation: The numbers in the range [1,2] are all in the array.
 * 
 * Example 2:
 * 
 * Input: nums = [3,4,-1,1]
 * Output: 2
 * Explanation: 1 is in the array but 2 is missing.
 * 
 * Example 3:
 * 
 * Input: nums = [7,8,9,11,12]
 * Output: 1
 * Explanation: The smallest positive integer 1 is missing.
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * 1 &lt;= nums.length &lt;= 105
 * 	
 * -231 &lt;= nums[i] &lt;= 231 - 1
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * - Think about how you would solve the problem in non-constant space.  Can you apply that logic to the existing space?
 * - We don't care about duplicates or non-positive integers
 * - Remember that O(2n) = O(n)
 *
 * <h2>Approach</h2>
 * Break the problem into smaller sub-problems or work through examples manually.
 * Consider: brute-force first, then optimise with sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, dynamic programming, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: TBD  |  Space: TBD
 *
 * @see <a href="https://leetcode.com/problems/first-missing-positive/">LeetCode #41</a>
 */
public class FirstMissingPositive {

    /**
     * TODO: Implement solution for "First Missing Positive".
     *
     * <p>Start with a brute-force and identify the bottleneck.
     * Hint: think about the data structure or algorithm category above.</p>
     *
     * @param args placeholder — replace with the real method signature
     * @return     placeholder — replace with the real return type
     */
    public Object solve(Object args) {
        // TODO: implement
        throw new UnsupportedOperationException("Not yet implemented: First Missing Positive");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== FirstMissingPositive ===");
        System.out.println("See class methods for usage.");
    }
}
