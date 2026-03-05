package org.leetcode.hard;

import java.util.*;
import java.util.stream.*;

/**
 * LeetCode #770: Basic Calculator IV
 * @see <a href="https://leetcode.com/problems/basic-calculator-iv/">Problem</a>
 */
public class BasicCalculatorIv {

    /**
     * LeetCode #770 – Basic Calculator IV
     * Difficulty: HARD
     * Topics: Hash Table, Math, String, Stack, Recursion
     *
     * Given an expression such as expression = "e + 8 - a + 5" and an evaluation
     * map such as {"e": 1} (given in terms of evalvars = ["e"] and evalints =
     * [1]), return a list of tokens representing the simplified expression, such
     * as ["-1*a","14"]
     * 
     * 
     * An expression alternates chunks and symbols, with a space separating each
     * chunk and symbol.
     * 
     * A chunk is either an expression in parentheses, a variable, or a
     * non-negative integer.
     * 
     * A variable is a string of lowercase letters (not including digits.) Note
     * that variables can be multiple letters, and note that variables never have
     * a leading coefficient or unary operator like "2x" or "-x".
     * 
     * Expressions are evaluated in the usual order: brackets first, then
     * multiplication, then addition and subtraction.
     * 
     * 
     * For example, expression = "1 + 2 * 3" has an answer of ["7"].
     * 
     * The format of the output is as follows:
     * 
     * 
     * For each term of free variables with a non-zero coefficient, we write the
     * free variables within a term in sorted order lexicographically.
     * 
     * 
     * 
     * For example, we would never write a term like "b*a*c", only "a*b*c".
     * 
     * 
     * 
     * Terms have degrees equal to the number of free variables being multiplied,
     * counting multiplicity. We write the largest degree terms of our answer
     * first, breaking ties by lexicographic order ignoring the leading
     * coefficient of the term.
     * 
     * 
     * 
     * For example, "a*a*b*c" has degree 4.
     * 
     * 
     * 
     * The leading coefficient of the term is placed directly to the left with an
     * asterisk separating it from the variables (if they exist.) A lead
     */
    // TODO: Implement solution for Basic Calculator IV
    // Difficulty: HARD | Topics: Hash Table, Math, String, Stack, Recursion
    /**
     * Solves the problem and Solve.
     *
     * @return the computed Object result
     */
    public Object solve() {
        // Your solution here
        return null;
    }

    public static void main(String[] args) {
        BasicCalculatorIv sol = new BasicCalculatorIv();
        System.out.println(sol.solve());
    }
}
