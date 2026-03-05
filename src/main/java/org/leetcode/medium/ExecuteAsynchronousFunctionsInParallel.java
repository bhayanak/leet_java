package org.leetcode.medium;


/**
 * <b>#2721 - Execute Asynchronous Functions in Parallel</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> General</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an array of asynchronous functions functions, return a new promise promise. Each function in the array accepts no arguments and returns a promise. All the promises should be executed in parallel.
 *
 *
 * promise resolves:
 *
 *
 * When all the promises returned from functions were resolved successfully in parallel. The resolved value of promise should be an array of all the resolved values of promises in the same order as they were in the functions. The promise should resolve when all the asynchronous functions in the array have completed execution in parallel.
 *
 * promise rejects:
 *
 *
 * When any of the promises returned from functions were rejected. promise should also reject with the reason of the first rejection.
 *
 * Please solve it without using the built-in Promise.all function.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: functions = [
 *   () =&gt; new Promise(resolve =&gt; setTimeout(() =&gt; resolve(5), 200))
 * ]
 * Output: {"t": 200, "resolved": [5]}
 * Explanation: 
 * promiseAll(functions).then(console.log); // [5]
 *
 * The single function was resolved at 200ms with a value of 5.
 *
 * Example 2:
 *
 * Input: functions = [
 *     () =&gt; new Promise(resolve =&gt; setTimeout(() =&gt; resolve(1), 200)), 
 *     () =&gt; new Promise((resolve, reject) =&gt; setTimeout(() =&gt; reject("Error"), 100))
 * ]
 * Output: {"t": 100, "rejected": "Error"}
 * Explanation: Since one of the promises rejected, the returned promise also rejected with the same error at the same time.
 *
 * Example 3:
 *
 * Input: functions = [
 *     () =&gt; new Promise(resolve =&gt; setTimeout(() =&gt; resolve(4), 50)), 
 *     () =&gt; new Promise(resolve =&gt; setTimeout(() =&gt; resolve(10), 150)), 
 *     () =&gt; new Promise(resolve =&gt; setTimeout(() =&gt; resolve(16), 100))
 * ]
 * Output: {"t": 150, "resolved": [4, 10, 16]}
 * Explanation: All the promises resolved with a value. The returned promise resolved when the last promise resolved.
 *
 *
 *
 * Constraints:
 *
 *
 * functions is an array of functions that returns promises
 *
 * 1 &lt;= functions.length &lt;= 10
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints -- trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (General).
 *
 * @see <a href="https://leetcode.com/problems/execute-asynchronous-functions-in-parallel/">LeetCode #2721</a>
 */
public class ExecuteAsynchronousFunctionsInParallel {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Execute Asynchronous Functions in Parallel");
    }

    public static void main(String[] args) {
        System.out.println("=== ExecuteAsynchronousFunctionsInParallel ===");
        ExecuteAsynchronousFunctionsInParallel sol = new ExecuteAsynchronousFunctionsInParallel();
        System.out.println(sol.solve(null));
    }
}
