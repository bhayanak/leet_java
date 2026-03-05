package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;

/** MinimumStringLengthAfterRemovingSubstrings solution. */
public class MinimumStringLengthAfterRemovingSubstrings {

    /**
     * Returns the minimum length of the string after repeatedly removing "AB" or "CD".
     * @param s input string
     * @return minimum remaining length
     * <p><b>Explanation:</b> Stack-based simulation: push chars; if top+new == "AB" or "CD", pop.</p>
     */
    public int solve(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for (char c : s.toCharArray()) {
            if (!stack.isEmpty()
                && ((stack.peek() == 'A' && c == 'B') || (stack.peek() == 'C' && c == 'D'))) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        return stack.size();
    }

    public static void main(String[] args) {
        MinimumStringLengthAfterRemovingSubstrings sol = new MinimumStringLengthAfterRemovingSubstrings();
        System.out.println(sol.solve("ABFCACDB")); // 2
        System.out.println(sol.solve("ACBBD"));    // 5
    }

}
