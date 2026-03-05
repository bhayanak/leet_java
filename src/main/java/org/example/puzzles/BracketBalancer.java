package org.example.puzzles;

import java.util.Stack;

/**
 * BracketBalancer
 * <p>
 * Problem: Given a string containing only (, ), {, }, [, ], check if it is balanced.
 * <p>
 * Approach: Use a stack to track opening brackets. For each closing bracket, check if it matches the top of the stack.
 * This is a classic stack problem, often used to test understanding of data structures and parsing.
 * <p>
 * Example:<br>
 *   isBalanced("([]{})") -&gt; true <br>
 *   isBalanced("([)]")   -&gt; false
 */
public class BracketBalancer {
    /**
     * Checks if the input string of brackets is balanced.
     * @param s the string containing only brackets
     * @return true if balanced, false otherwise
     */
    public static boolean isBalanced(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            // Push opening brackets onto the stack
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                // If stack is empty, there's no matching opening bracket
                if (stack.isEmpty()) return false;
                char top = stack.pop();
                // Check for matching pairs
                if ((c == ')' && top != '(') ||
                    (c == '}' && top != '{') ||
                    (c == ']' && top != '[')) {
                    return false;
                }
            }
        }
        // If stack is empty, all brackets matched
        return stack.isEmpty();
    }

    /**
     * Main method to demonstrate bracket balancing.
     */
    public static void main(String[] args) {
        System.out.println(isBalanced("([]{})")); // true
        System.out.println(isBalanced("([)]"));   // false
    }
}
