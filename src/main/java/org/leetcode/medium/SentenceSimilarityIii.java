package org.leetcode.medium;


/**
 * <b>#1813 - Sentence Similarity III</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Two Pointers, String</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given two strings sentence1 and sentence2, each representing a sentence composed of words. A sentence is a list of words that are separated by a single space with no leading or trailing spaces. Each word consists of only uppercase and lowercase English characters.
 *
 *
 * Two sentences s1 and s2 are considered similar if it is possible to insert an arbitrary sentence (possibly empty) inside one of these sentences such that the two sentences become equal. Note that the inserted sentence must be separated from existing words by spaces.
 *
 *
 * For example,
 *
 *
 * s1 = "Hello Jane" and s2 = "Hello my name is Jane" can be made equal by inserting "my name is" between "Hello" and "Jane" in s1.
 *
 * s1 = "Frog cool" and s2 = "Frogs are cool" are not similar, since although there is a sentence "s are" inserted into s1, it is not separated from "Frog" by a space.
 *
 * Given two sentences sentence1 and sentence2, return true if sentence1 and sentence2 are similar. Otherwise, return false.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: sentence1 = "My name is Haley", sentence2 = "My Haley"
 *
 *
 * Output: true
 *
 *
 * Explanation:
 *
 *
 * sentence2 can be turned to sentence1 by inserting "name is" between "My" and "Haley".
 *
 * Example 2:
 *
 * Input: sentence1 = "of", sentence2 = "A lot of words"
 *
 *
 * Output: false
 *
 *
 * Explanation:
 *
 *
 * No single sentence can be inserted inside one of the sentences to make it equal to the other.
 *
 * Example 3:
 *
 * Input: sentence1 = "Eating right now", sentence2 = "Eating"
 *
 *
 * Output: true
 *
 *
 * Explanation:
 *
 *
 * sentence2 can be turned to sentence1 by inserting "right now" at the end of the sentence.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= sentence1.length, sentence2.length &lt;= 100
 *
 * sentence1 and sentence2 consist of lowercase and uppercase English letters and spaces.
 *
 * The words in sentence1 and sentence2 are separated by a single space.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: One way to look at it is to find one sentence as a concatenation of a prefix and suffix from the other sentence.
 * Hint 2: Get the longest common prefix between them and the longest common suffix.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Two Pointers, String).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/sentence-similarity-iii/">LeetCode #1813</a>
 */
public class SentenceSimilarityIii {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Sentence Similarity III");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== SentenceSimilarityIii ===");
        SentenceSimilarityIii sol = new SentenceSimilarityIii();
        System.out.println(sol.solve(null));
    }
}
