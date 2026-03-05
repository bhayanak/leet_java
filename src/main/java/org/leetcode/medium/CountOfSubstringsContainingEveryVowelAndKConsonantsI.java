package org.leetcode.medium;


/**
 * <b>#3305 - Count of Substrings Containing Every Vowel and K Consonants I</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Hash Table, String, Sliding Window</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a string word and a non-negative integer k.
 *
 *
 * Return the total number of substrings of word that contain every vowel ('a', 'e', 'i', 'o', and 'u') at least once and exactly k consonants.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: word = "aeioqq", k = 1
 *
 *
 * Output: 0
 *
 *
 * Explanation:
 *
 *
 * There is no substring with every vowel.
 *
 * Example 2:
 *
 * Input: word = "aeiou", k = 0
 *
 *
 * Output: 1
 *
 *
 * Explanation:
 *
 *
 * The only substring with every vowel and zero consonants is word[0..4], which is "aeiou".
 *
 * Example 3:
 *
 * Input: word = "ieaouqqieaouqq", k = 1
 *
 *
 * Output: 3
 *
 *
 * Explanation:
 *
 *
 * The substrings with every vowel and one consonant are:
 *
 *
 * word[0..5], which is "ieaouq".
 *
 * word[6..11], which is "qieaou".
 *
 * word[7..12], which is "ieaouq".
 *
 *
 *
 * Constraints:
 *
 *
 * 5 &lt;= word.length &lt;= 250
 *
 * word consists only of lowercase English letters.
 *
 * 0 &lt;= k &lt;= word.length - 5
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use a HashMap and check all the substrings.
 *
 * <h2>Approach</h2>
 * Think about the category (Hash Table, String, Sliding Window).
 *
 * @see <a href="https://leetcode.com/problems/count-of-substrings-containing-every-vowel-and-k-consonants-i/">LeetCode #3305</a>
 */
public class CountOfSubstringsContainingEveryVowelAndKConsonantsI {

    /**
     * Solves the problem: Number of components.
     *
     * @param properties the properties (int[][])
     * @param k the k (int)
     * @return the computed int result
     */
    public int numberOfComponents(int[][] properties, int k) {
        int n=properties.length;
        int[] parent=new int[n]; for (int i=0;i<n;i++) parent[i]=i;
        for (int i=0;i<n;i++) for (int j=i+1;j<n;j++) {
            int common=0;
            java.util.Set<Integer> si=new java.util.HashSet<>();
            for (int v:properties[i]) si.add(v);
            for (int v:properties[j]) if (si.contains(v)) common++;
            if (common>=k) union(parent,i,j);
        }
        java.util.Set<Integer> roots=new java.util.HashSet<>();
        for (int i=0;i<n;i++) roots.add(find(parent,i));
        return roots.size();
    }
    private int find(int[] p,int i){return p[i]==i?i:(p[i]=find(p,p[i]));}
    private void union(int[] p,int a,int b){p[find(p,a)]=find(p,b);}

    public static void main(String[] args) {
        CountOfSubstringsContainingEveryVowelAndKConsonantsI sol = new CountOfSubstringsContainingEveryVowelAndKConsonantsI();
        System.out.println(sol.numberOfComponents(new int[][]{{1,2},{3,4}}, 0));
    }
}
