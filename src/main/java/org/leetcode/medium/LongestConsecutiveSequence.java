package org.leetcode.medium;

/**
 * <b>#128 - Longest Consecutive Sequence</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Hash Table, Union-Find</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.
 * 
 * 
 * You must write an algorithm that runs in O(n) time.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: nums = [100,4,200,1,3,2]
 * Output: 4
 * Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
 * 
 * Example 2:
 * 
 * Input: nums = [0,3,7,2,5,8,4,6,0,1]
 * Output: 9
 * 
 * Example 3:
 * 
 * Input: nums = [1,0,1,2]
 * Output: 3
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * 0 &lt;= nums.length &lt;= 105
 * 	
 * -109 &lt;= nums[i] &lt;= 109
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — work through examples manually first.
 *
 * <h2>Approach</h2>
 * Add all numbers to a HashSet. For each number that is the start of a sequence
 * (n-1 not in set), count consecutive values. O(n) overall despite nested loop.
 *
 * <h2>Complexity</h2>
* Time: O(n)  |  Space: O(n)
 *
 * @see <a href="https://leetcode.com/problems/longest-consecutive-sequence/">LeetCode #128</a>
 */
public class LongestConsecutiveSequence {

    /**
     * Finds the length of the longest consecutive elements sequence.
     * @param nums unsorted integer array
     * @return length of longest consecutive sequence
     */
    public int longestConsecutive(int[] nums) {
        java.util.Set<Integer> set = new java.util.HashSet<>();
        for (int n : nums) set.add(n);
        int best = 0;
        for (int n : set) {
            if (!set.contains(n - 1)) {  // start of a sequence
                int cur = n, len = 1;
                while (set.contains(cur + 1)) { cur++; len++; }
                best = Math.max(best, len);
            }
        }
        return best;
    }

    // ─── Run & Demo ──────────────────────────────────────────────
    /**
     * Runs sample test cases to demonstrate the solution.
     * Execute: javac LongestConsecutiveSequence.java &amp;&amp; java org.leetcode.medium.LongestConsecutiveSequence
     *
     * @param args not used
     */
    public static void main(String[] args) {
        LongestConsecutiveSequence sol = new LongestConsecutiveSequence();
        System.out.println(sol.longestConsecutive(new int[]{100,4,200,1,3,2}));      // 4 (1-2-3-4)
        System.out.println(sol.longestConsecutive(new int[]{0,3,7,2,5,8,4,6,0,1})); // 9
    }
}
