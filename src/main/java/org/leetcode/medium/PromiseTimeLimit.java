package org.leetcode.medium;


/**
 * <b>#2637 - Promise Time Limit</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> General</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an asynchronous function fn and a time t in milliseconds, return a new time limited version of the input function. fn takes arguments provided to the time limited function.
 *
 *
 * The time limited function should follow these rules:
 *
 *
 * If the fn completes within the time limit of t milliseconds, the time limited function should resolve with the result.
 *
 * If the execution of the fn exceeds the time limit, the time limited function should reject with the string "Time Limit Exceeded".
 *
 *
 *
 * Example 1:
 *
 * Input: 
 * fn = async (n) =&gt; { 
 *   await new Promise(res =&gt; setTimeout(res, 100)); 
 *   return n * n; 
 * }
 * inputs = [5]
 * t = 50
 * Output: {"rejected":"Time Limit Exceeded","time":50}
 * Explanation:
 * const limited = timeLimit(fn, t)
 * const start = performance.now()
 * let result;
 * try {
 *    const res = await limited(...inputs)
 *    result = {"resolved": res, "time": Math.floor(performance.now() - start)};
 * } catch (err) {
 *    result = {"rejected": err, "time": Math.floor(performance.now() - start)};
 * }
 * console.log(result) // Output
 *
 * The provided function is set to resolve after 100ms. However, the time limit is set to 50ms. It rejects at t=50ms because the time limit was reached.
 *
 * Example 2:
 *
 * Input: 
 * fn = async (n) =&gt; { 
 *   await new Promise(res =&gt; setTimeout(res, 100)); 
 *   return n * n; 
 * }
 * inputs = [5]
 * t = 150
 * Output: {"resolved":25,"time":100}
 * Explanation:
 * The function resolved 5 * 5 = 25 at t=100ms. The time limit is never reached.
 *
 * Example 3:
 *
 * Input: 
 * fn = async (a, b) =&gt; { 
 *   await new Promise(res =&gt; setTimeout(res, 120)); 
 *   return a + b; 
 * }
 * inputs = [5,10]
 * t = 150
 * Output: {"resolved":15,"time":120}
 * Explanation:
 * ​​​​The function resolved 5 + 10 = 15 at t=120ms. The time limit is never reached.
 *
 * Example 4:
 *
 * Input: 
 * fn = async () =&gt; { 
 *   throw "Error";
 * }
 * inputs = []
 * t = 1000
 * Output: {"rejected":"Error","time":0}
 * Explanation:
 * The function immediately throws an error.
 *
 *
 *
 * Constraints:
 *
 *
 * 0 &lt;= inputs.length &lt;= 10
 *
 * 0 &lt;= t &lt;= 1000
 *
 * fn returns a promise
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: You can return a copy of a function with: 

function outerFunction(fn) { 
  return function innerFunction(...params) {
    return fn(...params);
  };
}
 * Hint 2: Inside the inner function, you will need to return a new Promise.
 * Hint 3: You can create a new promise like: new Promise((resolve, reject) =&gt; {}).
 * Hint 4: You can execute code with a delay with "setTimeout(fn, delay)"
 * Hint 5: To reject a promise after a delay, "setTimeout(() =&gt; reject('err'), delay)"
 * Hint 6: You can resolve and reject when the passed promise resolves or rejects with: "fn(...params).then(resolve).catch(reject)"
 *
 * <h2>Approach</h2>
 * Think about the category (General).
 *
 * @see <a href="https://leetcode.com/problems/promise-time-limit/">LeetCode #2637</a>
 */
public class PromiseTimeLimit {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Promise Time Limit");
    }

    public static void main(String[] args) {
        System.out.println("=== PromiseTimeLimit ===");
        PromiseTimeLimit sol = new PromiseTimeLimit();
        System.out.println(sol.solve(null));
    }
}
