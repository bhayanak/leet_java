package org.leetcode.easy;


/**
 * <b>#2085 - Count Common Words With One Occurrence</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Hash Table, String, Counting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given two string arrays words1 and words2, return the number of strings that appear exactly once in each of the two arrays.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: words1 = ["leetcode","is","amazing","as","is"], words2 = ["amazing","leetcode","is"]
 * Output: 2
 * Explanation:
 * - "leetcode" appears exactly once in each of the two arrays. We count this string.
 * - "amazing" appears exactly once in each of the two arrays. We count this string.
 * - "is" appears in each of the two arrays, but there are 2 occurrences of it in words1. We do not count this string.
 * - "as" appears once in words1, but does not appear in words2. We do not count this string.
 * Thus, there are 2 strings that appear exactly once in each of the two arrays.
 *
 * Example 2:
 *
 * Input: words1 = ["b","bb","bbb"], words2 = ["a","aa","aaa"]
 * Output: 0
 * Explanation: There are no strings that appear in each of the two arrays.
 *
 * Example 3:
 *
 * Input: words1 = ["a","ab"], words2 = ["a","a","a","ab"]
 * Output: 1
 * Explanation: The only string that appears exactly once in each of the two arrays is "ab".
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= words1.length, words2.length &lt;= 1000
 *
 * 1 &lt;= words1[i].length, words2[j].length &lt;= 30
 *
 * words1[i] and words2[j] consists only of lowercase English letters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Could you try every word?
 * Hint 2: Could you use a hash map to achieve a good complexity?
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, String, Counting).
 *
 * @see <a href="https://leetcode.com/problems/count-common-words-with-one-occurrence/">LeetCode #2085</a>
  *
  * <p><b>Explanation:</b> Uses a HashMap for O(1) average-time lookups, mapping values to indices/counts.</p>
  */
public class CountCommonWordsWithOneOccurrence {

    /**
     * Counts Count words.
     * Uses a hash map to track occurrences or cache results.
     *
     * @param words1 the words1 (String[])
     * @param words2 the words2 (String[])
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Uses a HashMap for O(1) average-time lookups, mapping values to indices/counts.</p>
      */
    public int countWords(String[] words1, String[] words2) {
        java.util.Map<String,Integer> c1=new java.util.HashMap<>(), c2=new java.util.HashMap<>();
        for (String w:words1) c1.merge(w,1,Integer::sum);
        for (String w:words2) c2.merge(w,1,Integer::sum);
        int count=0;
        for (var e:c1.entrySet())
            if (e.getValue()==1 && c2.getOrDefault(e.getKey(),0)==1) count++;
        return count;
    }

    public static void main(String[] args) {
        CountCommonWordsWithOneOccurrence sol = new CountCommonWordsWithOneOccurrence();
                System.out.println(sol.countWords(new String[]{"leetcode","is","amazing","as","is"},new String[]{"amazing","leetcode","is"})); // 2
                System.out.println(sol.countWords(new String[]{"b","bb","bbb"},new String[]{"a","aa","aaa"})); // 0
                System.out.println(sol.countWords(new String[]{"a","ab"},new String[]{"a","a","a","ab"})); // 1
    }
}
