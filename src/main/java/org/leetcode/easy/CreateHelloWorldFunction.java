package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;

/** CreateHelloWorldFunction solution. */
public class CreateHelloWorldFunction {

    /**
     * Java equivalent of JS createHelloWorld: always returns "Hello World".
     * @return "Hello World"
     * <p><b>Explanation:</b> Function closure ignoring arguments; always returns the same string.</p>
     */
    public String solve() {
        return "Hello World";
    }

    public static void main(String[] args) {
        CreateHelloWorldFunction sol = new CreateHelloWorldFunction();
        System.out.println(sol.solve()); // "Hello World"
    }

}
