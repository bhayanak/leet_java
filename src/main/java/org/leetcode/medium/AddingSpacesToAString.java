package org.leetcode.medium;


/**
 * <b>#2109 - Adding Spaces to a String</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Two Pointers, String, Simulation</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a 0-indexed string s and a 0-indexed integer array spaces that describes the indices in the original string where spaces will be added. Each space should be inserted before the character at the given index.
 *
 *
 * For example, given s = "EnjoyYourCoffee" and spaces = [5, 9], we place spaces before 'Y' and 'C', which are at indices 5 and 9 respectively. Thus, we obtain "Enjoy Your Coffee".
 *
 * Return the modified string after the spaces have been added.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s = "LeetcodeHelpsMeLearn", spaces = [8,13,15]
 * Output: "Leetcode Helps Me Learn"
 * Explanation: 
 * The indices 8, 13, and 15 correspond to the underlined characters in "LeetcodeHelpsMeLearn".
 * We then place spaces before those characters.
 *
 * Example 2:
 *
 * Input: s = "icodeinpython", spaces = [1,5,7,9]
 * Output: "i code in py thon"
 * Explanation:
 * The indices 1, 5, 7, and 9 correspond to the underlined characters in "icodeinpython".
 * We then place spaces before those characters.
 *
 * Example 3:
 *
 * Input: s = "spacing", spaces = [0,1,2,3,4,5,6]
 * Output: " s p a c i n g"
 * Explanation:
 * We are also able to place spaces before the first character of the string.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= s.length &lt;= 3 * 105
 *
 * s consists only of lowercase and uppercase English letters.
 *
 * 1 &lt;= spaces.length &lt;= 3 * 105
 *
 * 0 &lt;= spaces[i] &lt;= s.length - 1
 *
 * All the values of spaces are strictly increasing.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Create a new string, initially empty, as the modified string. Iterate through the original string and append each character of the original string to the new string. However, each time you reach a character that requires a space before it, append a space before appending the character.
 * Hint 2: Since the array of indices for the space locations is sorted, use a pointer to keep track of the next index to place a space. Only increment the pointer once a space has been appended.
 * Hint 3: Ensure that your append operation can be done in O(1).
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Two Pointers, String, Simulation).
 *
 * @see <a href="https://leetcode.com/problems/adding-spaces-to-a-string/">LeetCode #2109</a>
 */
public class AddingSpacesToAString {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Adding Spaces to a String");
    }

    public static void main(String[] args) {
        System.out.println("=== AddingSpacesToAString ===");
        AddingSpacesToAString sol = new AddingSpacesToAString();
        System.out.println(sol.solve(null));
    }
}
