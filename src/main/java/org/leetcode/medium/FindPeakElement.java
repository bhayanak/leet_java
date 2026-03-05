package org.leetcode.medium;

/**
 * <b>#162 - Find Peak Element</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Binary Search</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * A peak element is an element that is strictly greater than its neighbors.
 * 
 * 
 * Given a 0-indexed integer array nums, find a peak element, and return its index. If the array contains multiple peaks, return the index to any of the peaks.
 * 
 * 
 * You may imagine that nums[-1] = nums[n] = -∞. In other words, an element is always considered to be strictly greater than a neighbor that is outside the array.
 * 
 * 
 * You must write an algorithm that runs in O(log n) time.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: nums = [1,2,3,1]
 * Output: 2
 * Explanation: 3 is a peak element and your function should return the index number 2.
 * 
 * Example 2:
 * 
 * Input: nums = [1,2,1,3,5,6,4]
 * Output: 5
 * Explanation: Your function can return either index number 1 where the peak element is 2, or index number 5 where the peak element is 6.
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * 1 &lt;= nums.length &lt;= 1000
 * 	
 * -231 &lt;= nums[i] &lt;= 231 - 1
 * 	
 * nums[i] != nums[i + 1] for all valid i.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — work through examples manually first.
 *
 * <h2>Approach</h2>
 * Binary search: if nums[mid] &lt; nums[mid+1], a peak exists to the right.
 * Otherwise a peak exists at mid or to the left.
 *
 * <h2>Complexity</h2>
* Time: O(log n)  |  Space: O(1)
 *
 * @see <a href="https://leetcode.com/problems/find-peak-element/">LeetCode #162</a>
 */
public class FindPeakElement {

    /**
     * Finds a peak element (greater than its neighbors). Multiple peaks may exist.
     * @param nums input array (nums[-1] = nums[n] = -∞)
     * @return index of any peak element
     */
    public int findPeakElement(int[] nums) {
        int lo = 0, hi = nums.length - 1;
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            if (nums[mid] < nums[mid + 1]) lo = mid + 1; // peak is to the right
            else                           hi = mid;      // peak is at mid or left
        }
        return lo;
    }

    // ─── Run & Demo ──────────────────────────────────────────────
    /**
     * Runs sample test cases to demonstrate the solution.
     * Execute: javac FindPeakElement.java &amp;&amp; java org.leetcode.medium.FindPeakElement
     *
     * @param args not used
     */
    public static void main(String[] args) {
        FindPeakElement sol = new FindPeakElement();
        int[] a = {1,2,3,1};
        System.out.println("Peak index: " + sol.findPeakElement(a) + " (val=" + a[sol.findPeakElement(a)] + ")"); // 2
        int[] b = {1,2,1,3,5,6,4};
        System.out.println("Peak index: " + sol.findPeakElement(b)); // 1 or 5
    }
}
