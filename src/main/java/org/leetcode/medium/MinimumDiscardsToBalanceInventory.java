package org.leetcode.medium;


/**
 * <b>#3679 -  Minimum Discards to Balance Inventory</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Hash Table, Sliding Window, Simulation, Counting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given two integers w and m, and an integer array arrivals, where arrivals[i] is the type of item arriving on day i (days are 1-indexed).
 *
 *
 * Items are managed according to the following rules:
 *
 *
 * Each arrival may be kept or discarded; an item may only be discarded on its arrival day.
 *
 * For each day i, consider the window of days [max(1, i - w + 1), i] (the w most recent days up to day i):
 *
 *
 *
 * For any such window, each item type may appear at most m times among kept arrivals whose arrival day lies in that window.
 *
 * If keeping the arrival on day i would cause its type to appear more than m times in the window, that arrival must be discarded.
 *
 *
 *
 * Return the minimum number of arrivals to be discarded so that every w-day window contains at most m occurrences of each type.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: arrivals = [1,2,1,3,1], w = 4, m = 2
 *
 *
 * Output: 0
 *
 *
 * Explanation:
 *
 *
 * On day 1, Item 1 arrives; the window contains no more than m occurrences of this type, so we keep it.
 *
 * On day 2, Item 2 arrives; the window of days 1 - 2 is fine.
 *
 * On day 3, Item 1 arrives, window [1, 2, 1] has item 1 twice, within limit.
 *
 * On day 4, Item 3 arrives, window [1, 2, 1, 3] has item 1 twice, allowed.
 *
 * On day 5, Item 1 arrives, window [2, 1, 3, 1] has item 1 twice, still valid.
 *
 * There are no discarded items, so return 0.
 *
 * Example 2:
 *
 * Input: arrivals = [1,2,3,3,3,4], w = 3, m = 2
 *
 *
 * Output: 1
 *
 *
 * Explanation:
 *
 *
 * On day 1, Item 1 arrives. We keep it.
 *
 * On day 2, Item 2 arrives, window [1, 2] is fine.
 *
 * On day 3, Item 3 arrives, window [1, 2, 3] has item 3 once.
 *
 * On day 4, Item 3 arrives, window [2, 3, 3] has item 3 twice, allowed.
 *
 * On day 5, Item 3 arrives, window [3, 3, 3] has item 3 three times, exceeds limit, so the arrival must be discarded.
 *
 * On day 6, Item 4 arrives, window [3, 4] is fine.
 *
 * Item 3 on day 5 is discarded, and this is the minimum number of arrivals to discard, so return 1.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= arrivals.length &lt;= 105
 *
 * 1 &lt;= arrivals[i] &lt;= 105
 *
 * 1 &lt;= w &lt;= arrivals.length
 *
 * 1 &lt;= m &lt;= w
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use a sliding window of up to <code>w</code> days with two pointers <code>left</code> and <code>right</code> to represent the current interval.
 * Hint 2: Maintain a hash map <code>cnt</code> from item type to its current count in the window. When you advance <code>right</code> to day <code>i</code>, do <code>cnt[arrivals[i]]++</code>.
 * Hint 3: If the window size exceeds <code>w</code> (i.e. <code>right - left + 1 &gt; w</code>), shrink it by doing <code>cnt[arrivals[left]]--</code> and then <code>left++</code>.
 * Hint 4: After each increment, check if <code>cnt[arrivals[right]] &gt; m</code>. If so, we must discard the current arrival.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Sliding Window, Simulation, Counting).
 *
 * @see <a href="https://leetcode.com/problems/minimum-discards-to-balance-inventory/">LeetCode #3679</a>
 */
public class MinimumDiscardsToBalanceInventory {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented:  Minimum Discards to Balance Inventory");
    }

    public static void main(String[] args) {
        System.out.println("=== MinimumDiscardsToBalanceInventory ===");
        MinimumDiscardsToBalanceInventory sol = new MinimumDiscardsToBalanceInventory();
        System.out.println(sol.solve(null));
    }
}
