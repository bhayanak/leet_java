package org.leetcode.hard;

import java.util.*;
import java.util.stream.*;

/**
 * LeetCode #736: Parse Lisp Expression
 * @see <a href="https://leetcode.com/problems/parse-lisp-expression/">Problem</a>
 */
public class ParseLispExpression {

    /**
     * LeetCode #736 – Parse Lisp Expression
     * Difficulty: HARD
     * Topics: Hash Table, String, Stack, Recursion
     *
     * You are given a string expression representing a Lisp-like expression to
     * return the integer value of.
     * 
     * 
     * The syntax for these expressions is given as follows.
     * 
     * 
     * An expression is either an integer, let expression, add expression, mult
     * expression, or an assigned variable. Expressions always evaluate to a
     * single integer.
     * 
     * (An integer could be positive or negative.)
     * 
     * A let expression takes the form "(let v1 e1 v2 e2 ... vn en expr)", where
     * let is always the string "let", then there are one or more pairs of
     * alternating variables and expressions, meaning that the first variable v1
     * is assigned the value of the expression e1, the second variable v2 is
     * assigned the value of the expression e2, and so on sequentially; and then
     * the value of this let expression is the value of the expression expr.
     * 
     * An add expression takes the form "(add e1 e2)" where add is always the
     * string "add", there are always two expressions e1, e2 and the result is the
     * addition of the evaluation of e1 and the evaluation of e2.
     * 
     * A mult expression takes the form "(mult e1 e2)" where mult is always the
     * string "mult", there are always two expressions e1, e2 and the result is
     * the multiplication of the evaluation of e1 and the evaluation of e2.
     * 
     * For this question, we will use a smaller subset of variable names. A
     * variable starts with a lowercase letter, then zero or more lowercase
     * letters or digits. Additionally, for your convenience, the names "add",
     * "let", and "mult" are protected and will never be used as variabl
     */
    // TODO: Implement solution for Parse Lisp Expression
    // Difficulty: HARD | Topics: Hash Table, String, Stack, Recursion
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
        ParseLispExpression sol = new ParseLispExpression();
        System.out.println(sol.solve());
    }
}
