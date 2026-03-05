package org.leetcode.easy;


/**
 * <b>#3856 - Trim Trailing Vowels</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> General</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a string s that consists of lowercase English letters.
 *
 *
 * Return the string obtained by removing all trailing vowels from s.
 *
 *
 * The vowels consist of the characters 'a', 'e', 'i', 'o', and 'u'.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s = "idea"
 *
 *
 * Output: "id"
 *
 *
 * Explanation:
 *
 *
 * Removing "idea", we obtain the string "id".
 *
 * Example 2:
 *
 * Input: s = "day"
 *
 *
 * Output: "day"
 *
 *
 * Explanation:
 *
 *
 * There are no trailing vowels in the string "day".
 *
 * Example 3:
 *
 * Input: s = "aeiou"
 *
 *
 * Output: ""
 *
 *
 * Explanation:
 *
 *
 * Removing "aeiou", we obtain the string "".
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= s.length &lt;= 100
 *
 * s consists of only lowercase English letters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Simulate; pop the last character as long as it is a vowel.
 *
 * <h2>Approach</h2>
 * Think about the category (General).
 *
 * @see <a href="https://leetcode.com/problems/trim-trailing-vowels/">LeetCode #3856</a>
  *
  * <p><b>Explanation:</b> Uses a HashSet to detect duplicates or track seen elements in O(1) per operation.</p>
  */
public class TrimTrailingVowels {

    /**
     * Computes the sum of Sum counts.
     *
     * @param nums the nums (java.util.List&lt;Integer&gt;)
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Uses a HashSet to detect duplicates or track seen elements in O(1) per operation.</p>
      */
    public int sumCounts(java.util.List<Integer> nums) {
        int sum=0, n=nums.size();
        for (int i=0;i<n;i++) {
            java.util.Set<Integer> set=new java.util.HashSet<>();
            for (int j=i;j<n;j++) {
                set.add(nums.get(j)); int cnt=set.size(); sum+=cnt*cnt;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        TrimTrailingVowels sol = new TrimTrailingVowels();
        System.out.println(sol.sumCounts(null));
    }
}
