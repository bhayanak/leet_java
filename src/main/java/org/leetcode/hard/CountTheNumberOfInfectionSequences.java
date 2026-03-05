package org.leetcode.hard;


/**
 * <b>#2954 - Count the Number of Infection Sequences</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Math, Combinatorics</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer n and an array sick sorted in increasing order, representing positions of infected people in a line of n people.
 *
 *
 * At each step, one uninfected person adjacent to an infected person gets infected. This process continues until everyone is infected.
 *
 *
 * An infection sequence is the order in which uninfected people become infected, excluding those initially infected.
 *
 *
 * Return the number of different infection sequences possible, modulo 109+7.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: n = 5, sick = [0,4]
 *
 *
 * Output: 4
 *
 *
 * Explanation:
 *
 *
 * There is a total of 6 different sequences overall.
 *
 *
 * Valid infection sequences are [1,2,3], [1,3,2], [3,2,1] and [3,1,2].
 *
 * [2,3,1] and [2,1,3] are not valid infection sequences because the person at index 2 cannot be infected at the first step.
 *
 * Example 2:
 *
 * Input: n = 4, sick = [1]
 *
 *
 * Output: 3
 *
 *
 * Explanation:
 *
 *
 * There is a total of 6 different sequences overall.
 *
 *
 * Valid infection sequences are [0,2,3], [2,0,3] and [2,3,0].
 *
 * [3,2,0], [3,0,2], and [0,3,2] are not valid infection sequences because the infection starts at the person at index 1, then the order of infection is 2, then 3, and hence 3 cannot be infected earlier than 2.
 *
 *
 *
 * Constraints:
 *
 *
 * 2 &lt;= n &lt;= 105
 *
 * 1 &lt;= sick.length &lt;= n - 1
 *
 * 0 &lt;= sick[i] &lt;= n - 1
 *
 * sick is sorted in increasing order.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Consider infected children as <code>0</code> and non-infected as <code>1</code>, then divide the array into segments with the same value.
 * Hint 2: For each segment of non-infected children whose indices are <code>[i, j]</code> and indices <code>(i - 1)</code> and <code>(j + 1)</code>, if they exist, are already infected. Then if <code>i == 0</code> or <code>j == n - 1</code>, each second there is only one kid that can be infected (which is at the other endpoint).
 * Hint 3: If <code>i &gt; 0</code> and <code>j &lt; n - 1</code>, we have two choices per second since the children at the two endpoints can both be the infect candidates. So there are <code>2<sup>j - i</sup></code> orders to infect all children in the segment.
 * Hint 4: Each second we can select a segment and select one endpoint from it.
 * Hint 5: The answer is: 
<code>S! / (len[1]! * len[2]! * ... * len[m]! * len<sub>start</sub>! * len<sub>end</sub>!) * 2<sup>k</sup></code> 
where <code>len[1], len[2], ..., len[m]</code> are the lengths of each segment of non-infected children that have an infected child at both endpoints, <code>len<sub>start</sub></code> and <code>len<sub>end</sub></code> denote the number of non-infected children with infected child at one endpoint, <code>S</code> is the total length of all segments of non-infected children, and <code>k = (len[1] - 1) + (len[2] - 1) + ... + (len[m] - 1)</code>.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Math, Combinatorics).
 *
 * @see <a href="https://leetcode.com/problems/count-the-number-of-infection-sequences/">LeetCode #2954</a>
 */
public class CountTheNumberOfInfectionSequences {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Count the Number of Infection Sequences");
    }

    public static void main(String[] args) {
        System.out.println("=== CountTheNumberOfInfectionSequences ===");
        CountTheNumberOfInfectionSequences sol = new CountTheNumberOfInfectionSequences();
        System.out.println(sol.solve(null));
    }
}
