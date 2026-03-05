package org.leetcode.easy;


/**
 * <b>#3769 - Sort Integers by Binary Reflection</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Sorting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array nums.
 *
 *
 * The binary reflection of a positive integer is defined as the number obtained by reversing the order of its binary digits (ignoring any leading zeros) and interpreting the resulting binary number as a decimal.
 *
 *
 * Sort the array in ascending order based on the binary reflection of each element. If two different numbers have the same binary reflection, the smaller original number should appear first.
 *
 *
 * Return the resulting sorted array.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [4,5,4]
 *
 *
 * Output: [4,4,5]
 *
 *
 * Explanation:
 *
 *
 * Binary reflections are:
 *
 *
 * 4 -&gt; (binary) 100 -&gt; (reversed) 001 -&gt; 1
 *
 * 5 -&gt; (binary) 101 -&gt; (reversed) 101 -&gt; 5
 *
 * 4 -&gt; (binary) 100 -&gt; (reversed) 001 -&gt; 1
 *
 * Sorting by the reflected values gives [4, 4, 5].
 *
 *
 * Example 2:
 *
 * Input: nums = [3,6,5,8]
 *
 *
 * Output: [8,3,6,5]
 *
 *
 * Explanation:
 *
 *
 * Binary reflections are:
 *
 *
 * 3 -&gt; (binary) 11 -&gt; (reversed) 11 -&gt; 3
 *
 * 6 -&gt; (binary) 110 -&gt; (reversed) 011 -&gt; 3
 *
 * 5 -&gt; (binary) 101 -&gt; (reversed) 101 -&gt; 5
 *
 * 8 -&gt; (binary) 1000 -&gt; (reversed) 0001 -&gt; 1
 *
 * Sorting by the reflected values gives [8, 3, 6, 5].
 *
 * Note that 3 and 6 have the same reflection, so we arrange them in increasing order of original value.
 *
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 100
 *
 * 1 &lt;= nums[i] &lt;= 109
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Simulate and sort as described
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Sorting).
 *
 * @see <a href="https://leetcode.com/problems/sort-integers-by-binary-reflection/">LeetCode #3769</a>
  *
  * <p><b>Explanation:</b> Tracks the running minimum in a single O(n) scan.</p>
  */
public class SortIntegersByBinaryReflection {

    /**
     * Solves the problem: Minimum changes.
     *
     * @param s the s (String)
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Tracks the running minimum in a single O(n) scan.</p>
      */
    public int minimumChanges(String s) {
        int len=s.length(), changes=0;
        for (int i=0;i<len/2;i++) {
            char l=s.charAt(i), r=s.charAt(len-1-i);
            if (l!=r) changes++;
        }
        return changes;
    }

    public static void main(String[] args) {
        SortIntegersByBinaryReflection sol = new SortIntegersByBinaryReflection();
        System.out.println(sol.minimumChanges("hello"));
    }
}
