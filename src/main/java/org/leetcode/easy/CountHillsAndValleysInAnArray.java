package org.leetcode.easy;


/**
 * <b>#2210 - Count Hills and Valleys in an Array</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a 0-indexed integer array nums. An index i is part of a hill in nums if the closest non-equal neighbors of i are smaller than nums[i]. Similarly, an index i is part of a valley in nums if the closest non-equal neighbors of i are larger than nums[i]. Adjacent indices i and j are part of the same hill or valley if nums[i] == nums[j].
 *
 *
 * Note that for an index to be part of a hill or valley, it must have a non-equal neighbor on both the left and right of the index.
 *
 *
 * Return the number of hills and valleys in nums.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [2,4,1,1,6,5]
 * Output: 3
 * Explanation:
 * At index 0: There is no non-equal neighbor of 2 on the left, so index 0 is neither a hill nor a valley.
 * At index 1: The closest non-equal neighbors of 4 are 2 and 1. Since 4 &gt; 2 and 4 &gt; 1, index 1 is a hill. 
 * At index 2: The closest non-equal neighbors of 1 are 4 and 6. Since 1 &lt; 4 and 1 &lt; 6, index 2 is a valley.
 * At index 3: The closest non-equal neighbors of 1 are 4 and 6. Since 1 &lt; 4 and 1 &lt; 6, index 3 is a valley, but note that it is part of the same valley as index 2.
 * At index 4: The closest non-equal neighbors of 6 are 1 and 5. Since 6 &gt; 1 and 6 &gt; 5, index 4 is a hill.
 * At index 5: There is no non-equal neighbor of 5 on the right, so index 5 is neither a hill nor a valley. 
 * There are 3 hills and valleys so we return 3.
 *
 * Example 2:
 *
 * Input: nums = [6,6,5,5,4,1]
 * Output: 0
 * Explanation:
 * At index 0: There is no non-equal neighbor of 6 on the left, so index 0 is neither a hill nor a valley.
 * At index 1: There is no non-equal neighbor of 6 on the left, so index 1 is neither a hill nor a valley.
 * At index 2: The closest non-equal neighbors of 5 are 6 and 4. Since 5 &lt; 6 and 5 &gt; 4, index 2 is neither a hill nor a valley.
 * At index 3: The closest non-equal neighbors of 5 are 6 and 4. Since 5 &lt; 6 and 5 &gt; 4, index 3 is neither a hill nor a valley.
 * At index 4: The closest non-equal neighbors of 4 are 5 and 1. Since 4 &lt; 5 and 4 &gt; 1, index 4 is neither a hill nor a valley.
 * At index 5: There is no non-equal neighbor of 1 on the right, so index 5 is neither a hill nor a valley.
 * There are 0 hills and valleys so we return 0.
 *
 *
 *
 * Constraints:
 *
 *
 * 3 &lt;= nums.length &lt;= 100
 *
 * 1 &lt;= nums[i] &lt;= 100
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: For each index, could you find the closest non-equal neighbors?
 * Hint 2: Ensure that adjacent indices that are part of the same hill or valley are not double-counted.
 *
 * <h2>Approach</h2>
 * Think about the category (Array).
 *
 * @see <a href="https://leetcode.com/problems/count-hills-and-valleys-in-an-array/">LeetCode #2210</a>
  *
  * <p><b>Explanation:</b> Iterates once, incrementing a counter each time the target condition is satisfied.</p>
  */
public class CountHillsAndValleysInAnArray {

    /**
     * Counts Count hill valley.
     *
     * @param nums the nums (int[])
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Iterates once, incrementing a counter each time the target condition is satisfied.</p>
      */
    public int countHillValley(int[] nums) {
        // Remove consecutive duplicates
        java.util.List<Integer> a=new java.util.ArrayList<>();
        for (int n:nums) if (a.isEmpty()||n!=a.get(a.size()-1)) a.add(n);
        int count=0;
        for (int i=1;i<a.size()-1;i++) {
            if (a.get(i)>a.get(i-1)&&a.get(i)>a.get(i+1)) count++;
            else if (a.get(i)<a.get(i-1)&&a.get(i)<a.get(i+1)) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        CountHillsAndValleysInAnArray sol = new CountHillsAndValleysInAnArray();
                System.out.println(sol.countHillValley(new int[]{2,4,1,1,6,5})); // 3
                System.out.println(sol.countHillValley(new int[]{6,6,5,5,4,1})); // 0
    }
}
