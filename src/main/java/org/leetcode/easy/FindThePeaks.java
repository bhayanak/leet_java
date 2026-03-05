package org.leetcode.easy;


/**
 * <b>#2951 - Find the Peaks</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Enumeration</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a 0-indexed array mountain. Your task is to find all the peaks in the mountain array.
 *
 *
 * Return an array that consists of indices of peaks in the given array in any order.
 *
 *
 * Notes:
 *
 *
 * A peak is defined as an element that is strictly greater than its neighboring elements.
 *
 * The first and last elements of the array are not a peak.
 *
 *
 *
 * Example 1:
 *
 * Input: mountain = [2,4,4]
 * Output: []
 * Explanation: mountain[0] and mountain[2] can not be a peak because they are first and last elements of the array.
 * mountain[1] also can not be a peak because it is not strictly greater than mountain[2].
 * So the answer is [].
 *
 * Example 2:
 *
 * Input: mountain = [1,4,3,8,5]
 * Output: [1,3]
 * Explanation: mountain[0] and mountain[4] can not be a peak because they are first and last elements of the array.
 * mountain[2] also can not be a peak because it is not strictly greater than mountain[3] and mountain[1].
 * But mountain [1] and mountain[3] are strictly greater than their neighboring elements.
 * So the answer is [1,3].
 *
 *
 *
 * Constraints:
 *
 *
 * 3 &lt;= mountain.length &lt;= 100
 *
 * 1 &lt;= mountain[i] &lt;= 100
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: If <code>nums[i] &gt; num[i - 1]</code> and <code>nums[i] &gt; nums[i + 1]</code> <code>nums[i]</code> is a peak.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Enumeration).
 *
 * @see <a href="https://leetcode.com/problems/find-the-peaks/">LeetCode #2951</a>
  *
  * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
  */
public class FindThePeaks {

    public java.util.List<Integer> findPeaks(int[] mountain) {
        java.util.List<Integer> res=new java.util.ArrayList<>();
        for (int i=1;i<mountain.length-1;i++) if (mountain[i]>mountain[i-1]&&mountain[i]>mountain[i+1]) res.add(i);
        return res;
    }

    public static void main(String[] args) {
        FindThePeaks sol = new FindThePeaks();
        System.out.println("No method available");
    }
}
