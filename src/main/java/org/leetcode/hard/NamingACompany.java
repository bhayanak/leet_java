package org.leetcode.hard;


/**
 * <b>#2306 - Naming a Company</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Hash Table, String, Bit Manipulation, Enumeration</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an array of strings ideas that represents a list of names to be used in the process of naming a company. The process of naming a company is as follows:
 *
 *
 * Choose 2 distinct names from ideas, call them ideaA and ideaB.
 *
 * Swap the first letters of ideaA and ideaB with each other.
 *
 * If both of the new names are not found in the original ideas, then the name ideaA ideaB (the concatenation of ideaA and ideaB, separated by a space) is a valid company name.
 *
 * Otherwise, it is not a valid name.
 *
 * Return the number of distinct valid names for the company.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: ideas = ["coffee","donuts","time","toffee"]
 * Output: 6
 * Explanation: The following selections are valid:
 * - ("coffee", "donuts"): The company name created is "doffee conuts".
 * - ("donuts", "coffee"): The company name created is "conuts doffee".
 * - ("donuts", "time"): The company name created is "tonuts dime".
 * - ("donuts", "toffee"): The company name created is "tonuts doffee".
 * - ("time", "donuts"): The company name created is "dime tonuts".
 * - ("toffee", "donuts"): The company name created is "doffee tonuts".
 * Therefore, there are a total of 6 distinct company names.
 *
 * The following are some examples of invalid selections:
 * - ("coffee", "time"): The name "toffee" formed after swapping already exists in the original array.
 * - ("time", "toffee"): Both names are still the same after swapping and exist in the original array.
 * - ("coffee", "toffee"): Both names formed after swapping already exist in the original array.
 *
 * Example 2:
 *
 * Input: ideas = ["lack","back"]
 * Output: 0
 * Explanation: There are no valid selections. Therefore, 0 is returned.
 *
 *
 *
 * Constraints:
 *
 *
 * 2 &lt;= ideas.length &lt;= 5 * 104
 *
 * 1 &lt;= ideas[i].length &lt;= 10
 *
 * ideas[i] consists of lowercase English letters.
 *
 * All the strings in ideas are unique.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: How can we divide the ideas into groups to make it easier to find valid pairs?
 * Hint 2: Group ideas that share the same suffix (all characters except the first) together and notice that a pair of ideas from the same group is invalid. What about pairs of ideas from different groups?
 * Hint 3: The first letter of the idea in the first group must not be the first letter of an idea in the second group and vice versa.
 * Hint 4: We can efficiently count the valid pairings for an idea if we already know how many ideas starting with a letter x are within a group that does not contain any ideas with starting letter y for all letters x and y.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, String, Bit Manipulation, Enumeration).
 *
 * @see <a href="https://leetcode.com/problems/naming-a-company/">LeetCode #2306</a>
 */
public class NamingACompany {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Naming a Company");
    }

    public static void main(String[] args) {
        System.out.println("=== NamingACompany ===");
        NamingACompany sol = new NamingACompany();
        System.out.println(sol.solve(null));
    }
}
