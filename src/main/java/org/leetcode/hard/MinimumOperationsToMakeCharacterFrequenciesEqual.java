package org.leetcode.hard;


/**
 * <b>#3389 - Minimum Operations to Make Character Frequencies Equal</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Hash Table, String, Dynamic Programming, Counting, Enumeration</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a string s.
 *
 *
 * A string t is called good if all characters of t occur the same number of times.
 *
 *
 * You can perform the following operations any number of times:
 *
 *
 * Delete a character from s.
 *
 * Insert a character in s.
 *
 * Change a character in s to its next letter in the alphabet.
 *
 * Note that you cannot change 'z' to 'a' using the third operation.
 *
 *
 * Return the minimum number of operations required to make s good.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s = "acab"
 *
 *
 * Output: 1
 *
 *
 * Explanation:
 *
 *
 * We can make s good by deleting one occurrence of character 'a'.
 *
 * Example 2:
 *
 * Input: s = "wddw"
 *
 *
 * Output: 0
 *
 *
 * Explanation:
 *
 *
 * We do not need to perform any operations since s is initially good.
 *
 * Example 3:
 *
 * Input: s = "aaabc"
 *
 *
 * Output: 2
 *
 *
 * Explanation:
 *
 *
 * We can make s good by applying these operations:
 *
 *
 * Change one occurrence of 'a' to 'b'
 *
 * Insert one occurrence of 'c' into s
 *
 *
 *
 * Constraints:
 *
 *
 * 3 &lt;= s.length &lt;= 2 * 104
 *
 * s contains only lowercase English letters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: The order of the letters in the string is irrelevant.
 * Hint 2: Compute an occurrence array <code>occ</code> where <code>occ[x]</code> is the number of occurrences of the <code>x<sup>th</sup></code> character of the alphabet. How do the described operations change <code>occ</code>?
 * Hint 3: We have three types of operations: increase any <code>occ[x]</code> by 1, decrease any <code>occ[x]</code> by 1, or decrease any <code>occ[x]</code> by 1 and simultaneously increase <code>occ[x + 1]</code> by 1 at the same time. To make <code>s</code> good, we need to make <code>occ</code> good. <code>occ</code> is good if and only if every <code>occ[x]</code> equals either 0 or some constant <code>c</code>.
 * Hint 4: If you know the value of <code>c</code>, how can you calculate the minimum operations required to make <code>occ</code> good?
 * Hint 5: Observation 1: It is never optimal to apply the third type of operation (simultaneous decrease and increase) on two continuous elements <code>occ[x]</code> and <code>occ[x + 1]</code>. Instead, we can decrease <code>occ[x]</code> by 1 then increase <code>occ[x + 2]</code> by 1 to achieve the same effect.
 * Hint 6: Observation 2: It is never optimal to increase an element of <code>occ</code> then decrease it, or vice versa.
 * Hint 7: Use dynamic programming where <code>dp[i]</code> is the minimum number of operations required to make <code>occ[0..i]</code> good. You will need to use the above observations to come up with the transitions.
 *
 * <h2>Approach</h2>
 * Think about the category (Hash Table, String, Dynamic Programming, Counting, Enumeration).
 *
 * @see <a href="https://leetcode.com/problems/minimum-operations-to-make-character-frequencies-equal/">LeetCode #3389</a>
 */
public class MinimumOperationsToMakeCharacterFrequenciesEqual {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Minimum Operations to Make Character Frequencies Equal");
    }

    public static void main(String[] args) {
        System.out.println("=== MinimumOperationsToMakeCharacterFrequenciesEqual ===");
        MinimumOperationsToMakeCharacterFrequenciesEqual sol = new MinimumOperationsToMakeCharacterFrequenciesEqual();
        System.out.println(sol.solve(null));
    }
}
