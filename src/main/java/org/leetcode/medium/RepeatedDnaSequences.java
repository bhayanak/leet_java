package org.leetcode.medium;

/**
 * <b>#187 - Repeated DNA Sequences</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Hash Table, String, Bit Manipulation, Sliding Window, Rolling Hash, Hash Function</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * The DNA sequence is composed of a series of nucleotides abbreviated as 'A', 'C', 'G', and 'T'.
 * 
 * 	
 * For example, "ACGAATTCCG" is a DNA sequence.
 * 
 * When studying DNA, it is useful to identify repeated sequences within the DNA.
 * 
 * 
 * Given a string s that represents a DNA sequence, return all the 10-letter-long sequences (substrings) that occur more than once in a DNA molecule. You may return the answer in any order.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT"
 * Output: ["AAAAACCCCC","CCCCCAAAAA"]
 * 
 * 
 * Example 2:
 * 
 * Input: s = "AAAAAAAAAAAAA"
 * Output: ["AAAAAAAAAA"]
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * 1 &lt;= s.length &lt;= 105
 * 	
 * s[i] is either 'A', 'C', 'G', or 'T'.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — work through examples manually first.
 *
 * <h2>Approach</h2>
 * Sliding window of size 10 with a HashSet to track seen substrings.
 * Add to result when a substring is seen for the second time (use a second set).
 *
 * <h2>Complexity</h2>
* Time: O(n)  |  Space: O(n)
 *
 * @see <a href="https://leetcode.com/problems/repeated-dna-sequences/">LeetCode #187</a>
 */
public class RepeatedDnaSequences {

    /**
     * Finds all 10-letter DNA substrings that appear more than once.
     * @param s DNA string (A, C, G, T only)
     * @return list of repeated 10-letter substrings
     */
    public java.util.List<String> findRepeatedDnaSequences(String s) {
        java.util.Set<String> seen = new java.util.HashSet<>(), result = new java.util.HashSet<>();
        for (int i = 0; i + 10 <= s.length(); i++) {
            String sub = s.substring(i, i + 10);
            if (!seen.add(sub)) result.add(sub); // second occurrence → add to result
        }
        return new java.util.ArrayList<>(result);
    }

    // ─── Run & Demo ──────────────────────────────────────────────
    /**
     * Runs sample test cases to demonstrate the solution.
     * Execute: javac RepeatedDnaSequences.java &amp;&amp; java org.leetcode.medium.RepeatedDnaSequences
     *
     * @param args not used
     */
    public static void main(String[] args) {
        RepeatedDnaSequences sol = new RepeatedDnaSequences();
        System.out.println("No method available");
    }
}
