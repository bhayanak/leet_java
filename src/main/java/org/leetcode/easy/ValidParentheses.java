package org.leetcode.easy;

/**
 * <b>#20 - Valid Parentheses</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> String, Stack</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * 
 * 
 * An input string is valid if:
 * 
 * 
 * 	
 * Open brackets must be closed by the same type of brackets.
 * 	
 * Open brackets must be closed in the correct order.
 * 	
 * Every close bracket has a corresponding open bracket of the same type.
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: s = "()"
 * 
 * 
 * Output: true
 * 
 * Example 2:
 * 
 * Input: s = "()[]{}"
 * 
 * 
 * Output: true
 * 
 * Example 3:
 * 
 * Input: s = "(]"
 * 
 * 
 * Output: false
 * 
 * Example 4:
 * 
 * Input: s = "([])"
 * 
 * 
 * Output: true
 * 
 * Example 5:
 * 
 * Input: s = "([)]"
 * 
 * 
 * Output: false
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * 1 &lt;= s.length &lt;= 104
 * 	
 * s consists of parentheses only '()[]{}'.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * - Use a stack of characters.
 * - When you encounter an opening bracket, push it to the top of the stack.
 * - When you encounter a closing bracket, check if the top of the stack was the opening for it. If yes, pop it from the stack. Otherwise, return false.
 *
 * <h2>Approach</h2>
 * Stack: push opening brackets; for each closing bracket, check the top of the stack.
 * Valid if all brackets are matched and the stack is empty at the end.
 *
 * <h2>Complexity</h2>
* Time: O(n)  |  Space: O(n)
 *
 * @see <a href="https://leetcode.com/problems/valid-parentheses/">LeetCode #20</a>
  *
  * <p><b>Explanation:</b> Uses a Stack/Deque for LIFO processing, ideal for nested structures or history tracking.</p>
  */
public class ValidParentheses {

    /**
     * Checks whether the bracket string is valid (properly opened and closed).
     *
     * @param s string containing only '(', ')', '{', '}', '[', ']'
     * @return  true if all brackets are correctly matched
      *
      * <p><b>Explanation:</b> Uses a Stack/Deque for LIFO processing, ideal for nested structures or history tracking.</p>
      */
    public boolean isValid(String s) {
        java.util.Deque<Character> stack = new java.util.ArrayDeque<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) return false;
                char top = stack.pop();
                if (c == ')' && top != '(') return false;
                if (c == '}' && top != '{') return false;
                if (c == ']' && top != '[') return false;
            }
        }
        return stack.isEmpty();
    }

    /**
     * Runs sample test cases.
      *
      * <p><b>Explanation:</b> Processes the string character by character, applying the transformation or predicate.</p>
      */
    public static void main(String[] args) {
                ValidParentheses sol = new ValidParentheses();
                System.out.println(sol.isValid("()"));    // true
                System.out.println(sol.isValid("()[]{}")); // true
                System.out.println(sol.isValid("(]"));    // false
    }
}
