package org.leetcode.easy;


/**
 * <b>#2900 - Longest Unequal Adjacent Groups Subsequence I</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, String, Dynamic Programming, Greedy</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a string array words and a binary array groups both of length n.
 *
 *
 * A subsequence of words is alternating if for any two consecutive strings in the sequence, their corresponding elements at the same indices in groups are different (that is, there cannot be consecutive 0 or 1).
 *
 *
 * Your task is to select the longest alternating subsequence from words.
 *
 *
 * Return the selected subsequence. If there are multiple answers, return any of them.
 *
 *
 * Note: The elements in words are distinct.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: words = ["e","a","b"], groups = [0,0,1]
 *
 *
 * Output: ["e","b"]
 *
 *
 * Explanation: A subsequence that can be selected is ["e","b"] because groups[0] != groups[2]. Another subsequence that can be selected is ["a","b"] because groups[1] != groups[2]. It can be demonstrated that the length of the longest subsequence of indices that satisfies the condition is 2.
 *
 * Example 2:
 *
 * Input: words = ["a","b","c","d"], groups = [1,0,1,1]
 *
 *
 * Output: ["a","b","c"]
 *
 *
 * Explanation: A subsequence that can be selected is ["a","b","c"] because groups[0] != groups[1] and groups[1] != groups[2]. Another subsequence that can be selected is ["a","b","d"] because groups[0] != groups[1] and groups[1] != groups[3]. It can be shown that the length of the longest subsequence of indices that satisfies the condition is 3.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n == words.length == groups.length &lt;= 100
 *
 * 1 &lt;= words[i].length &lt;= 10
 *
 * groups[i] is either 0 or 1.
 *
 * words consists of distinct strings.
 *
 * words[i] consists of lowercase English letters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: This problem can be solved greedily.
 * Hint 2: Begin by constructing the answer starting with the first number in <code>groups</code>.
 * Hint 3: For each index <code>i</code> in the range <code>[1, n - 1]</code>, add <code>i</code> to the answer if <code>groups[i] != groups[i - 1]</code>.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, String, Dynamic Programming, Greedy).
 *
 * @see <a href="https://leetcode.com/problems/longest-unequal-adjacent-groups-subsequence-i/">LeetCode #2900</a>
 */
public class LongestUnequalAdjacentGroupsSubsequenceI {


    /**
     * Returns the longest alternating-group subsequence of words.
     *
     * @param words  array of words
     * @param groups binary group assignment for each word
     * @return longest subsequence where adjacent groups alternate
     *
     * <p><b>Explanation:</b> Greedily picks a word whenever its group differs from the</p>
     *   previous selected group, ensuring adjacent groups always alternate.
     *   Time O(n), Space O(n).
     */
    public java.util.List<String> getLongestSubsequence(String[] words, int[] groups) {
        java.util.List<String> res=new java.util.ArrayList<>();
        res.add(words[0]); int lastGroup=groups[0];
        for (int i=1;i<words.length;i++) if (groups[i]!=lastGroup) { res.add(words[i]); lastGroup=groups[i]; }
        return res;
    }

    public static void main(String[] args) {
        LongestUnequalAdjacentGroupsSubsequenceI sol = new LongestUnequalAdjacentGroupsSubsequenceI();
        System.out.println(sol.getLongestSubsequence(new String[]{"a","b","c","d"}, new int[]{1,0,1,1}));
    }
}
