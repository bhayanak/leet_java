package org.leetcode.easy;

/** GuessNumberHigherOrLower solution. */
public class GuessNumberHigherOrLower {
    /**
     * Guesses the number between 1 and n using binary search.
     *
     * @param n upper bound of the guessing range
     * @return the guessed number
     *
     * <p><b>Explanation:</b> Binary search: maintains lo=1, hi=n; at each step calls the</p>
     *   pre-defined guess(mid) API and halves the range based on the result.
     *   Time O(log n), Space O(1).
     */
    public int guessNumber(int n) {
        int lo = 1, hi = n;
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            if (guess(mid) <= 0) hi = mid;
            else lo = mid + 1;
        }
        return lo;
    }
    // Stub for the guess API
    private int guess(int num) { return 0; }

    // ─── Demo ────────────────────────────────────────────────────
    public static void main(String[] args) {
        System.out.println("=== GuessNumberHigherOrLower ===");
        GuessNumberHigherOrLower sol = new GuessNumberHigherOrLower();
        System.out.println(sol.guessNumber(3));
    }
}
