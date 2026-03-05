package org.leetcode.medium;


/**
 * <b>#2622 - Cache With Time Limit</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> General</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Write a class that allows getting and setting key-value pairs, however a time until expiration is associated with each key.
 *
 *
 * The class has three public methods:
 *
 *
 * set(key, value, duration): accepts an integer key, an integer value, and a duration in milliseconds. Once the duration has elapsed, the key should be inaccessible. The method should return true if the same un-expired key already exists and false otherwise. Both the value and duration should be overwritten if the key already exists.
 *
 *
 * get(key): if an un-expired key exists, it should return the associated value. Otherwise it should return -1.
 *
 *
 * count(): returns the count of un-expired keys.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: 
 * actions = ["TimeLimitedCache", "set", "get", "count", "get"]
 * values = [[], [1, 42, 100], [1], [], [1]]
 * timeDelays = [0, 0, 50, 50, 150]
 * Output: [null, false, 42, 1, -1]
 * Explanation:
 * At t=0, the cache is constructed.
 * At t=0, a key-value pair (1: 42) is added with a time limit of 100ms. The value doesn't exist so false is returned.
 * At t=50, key=1 is requested and the value of 42 is returned.
 * At t=50, count() is called and there is one active key in the cache.
 * At t=100, key=1 expires.
 * At t=150, get(1) is called but -1 is returned because the cache is empty.
 *
 * Example 2:
 *
 * Input: 
 * actions = ["TimeLimitedCache", "set", "set", "get", "get", "get", "count"]
 * values = [[], [1, 42, 50], [1, 50, 100], [1], [1], [1], []]
 * timeDelays = [0, 0, 40, 50, 120, 200, 250]
 * Output: [null, false, true, 50, 50, -1, 0]
 * Explanation:
 * At t=0, the cache is constructed.
 * At t=0, a key-value pair (1: 42) is added with a time limit of 50ms. The value doesn't exist so false is returned.
 * At t=40, a key-value pair (1: 50) is added with a time limit of 100ms. A non-expired value already existed so true is returned and the old value was overwritten.
 * At t=50, get(1) is called which returned 50.
 * At t=120, get(1) is called which returned 50.
 * At t=140, key=1 expires.
 * At t=200, get(1) is called but the cache is empty so -1 is returned.
 * At t=250, count() returns 0 because the cache is empty.
 *
 *
 *
 * Constraints:
 *
 *
 * 0 &lt;= key, value &lt;= 109
 *
 * 0 &lt;= duration &lt;= 1000
 *
 * 1 &lt;= actions.length &lt;= 100
 *
 * actions.length === values.length
 *
 * actions.length === timeDelays.length
 *
 * 0 &lt;= timeDelays[i] &lt;= 1450
 *
 * actions[i] is one of "TimeLimitedCache", "set", "get" and "count"
 *
 * First action is always "TimeLimitedCache" and must be executed immediately, with a 0-millisecond delay
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: You can delay execution of code with "ref = setTimeout(fn, delay)". You can abort the execution with "clearTimeout(ref)"
 * Hint 2: When storing the values in the cache, also store a reference to the timeout. The timeout should clear the key from the cache after the expiration has elapsed.
 * Hint 3: When you set a key that already exists, clear the existing timeout.
 *
 * <h2>Approach</h2>
 * Think about the category (General).
 *
 * @see <a href="https://leetcode.com/problems/cache-with-time-limit/">LeetCode #2622</a>
 */
public class CacheWithTimeLimit {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Cache With Time Limit");
    }

    public static void main(String[] args) {
        System.out.println("=== CacheWithTimeLimit ===");
        CacheWithTimeLimit sol = new CacheWithTimeLimit();
        System.out.println(sol.solve(null));
    }
}
