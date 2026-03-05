package org.leetcode.medium;

/**
 * <b>#17 - Letter Combinations of a Phone Number</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Hash Table, String, Backtracking</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent. Return the answer in any order.
 * 
 * 
 * A mapping of digits to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: digits = "23"
 * Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]
 * 
 * Example 2:
 * 
 * Input: digits = "2"
 * Output: ["a","b","c"]
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * 1 &lt;= digits.length &lt;= 4
 * 	
 * digits[i] is a digit in the range ['2', '9'].
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints available — try to figure out the category and approach first!
 *
 * <h2>Approach</h2>
 * Backtracking (or BFS): map digits to their phone letters.
 * Build combinations character by character, branching for each letter of the current digit.
 *
 * <h2>Complexity</h2>
* Time: O(4ⁿ · n)  |  Space: O(4ⁿ · n)
 *
 * @see <a href="https://leetcode.com/problems/letter-combinations-of-a-phone-number/">LeetCode #17</a>
 */
public class LetterCombinationsOfAPhoneNumber {

    /**
     * Returns all possible letter combinations for a phone number digit string.
     *
     * @param digits string of digits 2-9
     * @return       list of all possible letter combinations
     */
    public java.util.List<String> letterCombinations(String digits) {
        java.util.List<String> result = new java.util.ArrayList<>();
        if (digits == null || digits.isEmpty()) return result;

        String[] map = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        backtrack(result, new StringBuilder(), digits, 0, map);
        return result;
    }

    private void backtrack(java.util.List<String> res, StringBuilder cur, String digits, int index, String[] map) {
        if (index == digits.length()) { res.add(cur.toString()); return; }
        for (char c : map[digits.charAt(index) - '0'].toCharArray()) {
            cur.append(c);
            backtrack(res, cur, digits, index + 1, map);
            cur.deleteCharAt(cur.length() - 1); // undo
        }
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        LetterCombinationsOfAPhoneNumber sol = new LetterCombinationsOfAPhoneNumber();
        System.out.println("No method available");
    }
}
