package org.leetcode.easy;


/**
 * <b>#2956 - Find Common Elements Between Two Arrays</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Hash Table</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given two integer arrays nums1 and nums2 of sizes n and m, respectively. Calculate the following values:
 *
 *
 * answer1 : the number of indices i such that nums1[i] exists in nums2.
 *
 * answer2 : the number of indices i such that nums2[i] exists in nums1.
 *
 * Return [answer1,answer2].
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums1 = [2,3,2], nums2 = [1,2]
 *
 *
 * Output: [2,1]
 *
 *
 * Explanation:
 *
 * Example 2:
 *
 * Input: nums1 = [4,3,2,3,1], nums2 = [2,2,5,2,3,6]
 *
 *
 * Output: [3,4]
 *
 *
 * Explanation:
 *
 *
 * The elements at indices 1, 2, and 3 in nums1 exist in nums2 as well. So answer1 is 3.
 *
 *
 * The elements at indices 0, 1, 3, and 4 in nums2 exist in nums1. So answer2 is 4.
 *
 * Example 3:
 *
 * Input: nums1 = [3,4,2,3], nums2 = [1,5]
 *
 *
 * Output: [0,0]
 *
 *
 * Explanation:
 *
 *
 * No numbers are common between nums1 and nums2, so answer is [0,0].
 *
 *
 *
 * Constraints:
 *
 *
 * n == nums1.length
 *
 * m == nums2.length
 *
 * 1 &lt;= n, m &lt;= 100
 *
 * 1 &lt;= nums1[i], nums2[i] &lt;= 100
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Since the constraints are small, you can use brute force to solve the problem.
 * Hint 2: For each element <code>i</code> in <code>nums1</code>, iterate over all elements of <code>nums2</code> to find if it occurs.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table).
 *
 * @see <a href="https://leetcode.com/problems/find-common-elements-between-two-arrays/">LeetCode #2956</a>
  *
  * <p><b>Explanation:</b> Uses a HashSet to detect duplicates or track seen elements in O(1) per operation. Uses StringBuilder for O(1) amortized character appends, avoiding O(n^2) String concatenation.</p>
  */
public class FindCommonElementsBetweenTwoArrays {

    /**
     * Solves the problem: Unique morse representations.
     *
     * @param words the words (String[])
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Uses a HashSet to detect duplicates or track seen elements in O(1) per operation. Uses StringBuilder for O(1) amortized character appends, avoiding O(n^2) String concatenation.</p>
      */
    public int uniqueMorseRepresentations(String[] words) {
        String[] morse={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        java.util.Set<String> set=new java.util.HashSet<>();
        for (String w:words) { StringBuilder sb=new StringBuilder(); for (char c:w.toCharArray()) sb.append(morse[c-'a']); set.add(sb.toString()); }
        return set.size();
    }

    public static void main(String[] args) {
        FindCommonElementsBetweenTwoArrays sol = new FindCommonElementsBetweenTwoArrays();
        System.out.println(sol.uniqueMorseRepresentations(new String[]{"a","b"}));
    }
}
