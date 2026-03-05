package org.leetcode.medium;

/**
 * <b>#11 - Container With Most Water</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Two Pointers, Greedy</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
 * 
 * 
 * Find two lines that together with the x-axis form a container, such that the container contains the most water.
 * 
 * 
 * Return the maximum amount of water a container can store.
 * 
 * 
 * Notice that you may not slant the container.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: height = [1,8,6,2,5,4,8,3,7]
 * Output: 49
 * Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.
 * 
 * Example 2:
 * 
 * Input: height = [1,1]
 * Output: 1
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * n == height.length
 * 	
 * 2 &lt;= n &lt;= 105
 * 	
 * 0 &lt;= height[i] &lt;= 104
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * - If you simulate the problem, it will be O(n^2) which is not efficient.
 * - Try to use two-pointers. Set one pointer to the left and one to the right of the array. Always move the pointer that points to the lower line.
 * - How can you calculate the amount of water at each step?
 *
 * <h2>Approach</h2>
 * Two Pointers: start with the widest possible container (l=0, r=n-1).
 * Move the pointer with the shorter height inward — moving the taller one
 * can only decrease or keep the area the same.
 * Greedy argument: the bottleneck is always the shorter side.
 *
 * <h2>Complexity</h2>
* Time: O(n)  |  Space: O(1)
 *
 * @see <a href="https://leetcode.com/problems/container-with-most-water/">LeetCode #11</a>
 */
public class ContainerWithMostWater {

    /**
     * Finds two lines that together with the x-axis form a container holding the most water.
     *
     * @param height array of line heights
     * @return       maximum water volume
     */
    public int maxArea(int[] height) {
        int left = 0, right = height.length - 1, max = 0;
        while (left < right) {
            int area = Math.min(height[left], height[right]) * (right - left);
            max = Math.max(max, area);
            // Move the shorter wall inward
            if (height[left] < height[right]) left++;
            else right--;
        }
        return max;
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
                ContainerWithMostWater sol = new ContainerWithMostWater();
                System.out.println(sol.maxArea(new int[]{1,8,6,2,5,4,8,3,7})); // 49
                System.out.println(sol.maxArea(new int[]{1,1}));                // 1
    }
}
