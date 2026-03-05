package org.leetcode.medium;

import java.util.*;
import java.util.stream.*;
import java.util.ArrayDeque;
import java.util.Deque;

/**
 * LeetCode #402: Remove K Digits
 * @see <a href="https://leetcode.com/problems/remove-k-digits/">Problem</a>
 */
public class RemoveKDigits {

    /**
     * LeetCode #402 – Remove K Digits
     * Difficulty: MEDIUM
     * Topics: String, Stack, Greedy, Monotonic Stack
     *
     * Given string num representing a non-negative integer num, and an integer k,
     * return the smallest possible integer after removing k digits from num.
     * 
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: num = "1432219", k = 3
     * Output: "1219"
     * Explanation: Remove the three digits 4, 3, and 2 to form the new number
     * 1219 which is the smallest.
     * 
     * Example 2:
     * 
     * Input: num = "10200", k = 1
     * Output: "200"
     * Explanation: Remove the leading 1 and the number is 200. Note that the
     * output must not contain leading zeroes.
     * 
     * Example 3:
     * 
     * Input: num = "10", k = 2
     * Output: "0"
     * Explanation: Remove all the digits from the number and it is left with
     * nothing which is 0.
     * 
     * 
     * 
     * Constraints:
     * 
     * 
     * 1 &lt;= k &lt;= num.length &lt;= 105
     * 
     * num consists of only digits.
     * 
     * num does not have any leading zeros except for the zero itself.
     */
    // Greedy: use stack to maintain increasing sequence
    // Remove digits that are greater than next digit
    /**
     * Removes Remove kdigits.
     *
     * @param num the num (String)
     * @param k the k (int)
     * @return the computed String result
     */
    public String removeKdigits(String num, int k) {
        Deque<Character> stack = new ArrayDeque<>();
        for (char c : num.toCharArray()) {
            while (k > 0 && !stack.isEmpty() && stack.peek() > c) {
                stack.pop(); k--;
            }
            stack.push(c);
        }
        while (k-- > 0) stack.pop();
        StringBuilder sb = new StringBuilder();
        boolean leadingZero = true;
        for (char c : stack) {  // stack iterates bottom to top when using LinkedList
            if (leadingZero && c == '0') continue;
            leadingZero = false;
            sb.append(c);
        }
        // Actually need to reverse since Deque push adds to front
        Deque<Character> stk = new ArrayDeque<>();
        for (char c : num.toCharArray()) {
            while (k > 0 && !stk.isEmpty() && stk.peek() > c) {
                stk.pop(); k--;
            }
            stk.push(c);
        }
        while (k-- > 0 && !stk.isEmpty()) stk.pop();
        StringBuilder res = new StringBuilder();
        boolean leading = true;
        // stk is a deque used as stack (LIFO), so need to build result correctly
        char[] arr = new char[stk.size()];
        int i = arr.length - 1;
        while (!stk.isEmpty()) arr[i--] = stk.pop();
        for (char c : arr) {
            if (leading && c == '0') continue;
            leading = false;
            res.append(c);
        }
        return res.length() == 0 ? "0" : res.toString();
    }

    public static void main(String[] args) {
        RemoveKDigits sol = new RemoveKDigits();
        System.out.println(sol.removeKdigits("hello", 0));
    }
}
