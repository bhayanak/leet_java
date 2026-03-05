package org.leetcode.easy;

/** FindTheChildWhoHasTheBallAfterKSeconds solution. */
public class FindTheChildWhoHasTheBallAfterKSeconds {
    /**
     * Returns which child holds the ball after being passed k times.
     *
     * @param n number of children in a circle
     * @param k number of passes
     * @return index of the child holding the ball (0-indexed)
     *
     * <p><b>Explanation:</b> The ball bounces back and forth;  effective position within a</p>
     *   period of 2*(n-1) passes determines the holder. Time O(1), Space O(1).
     */
    public int numberOfChild(int n, int k) {
        int period = 2 * (n - 1);
        k = k % period;
        return k < n ? k : period - k;
    }

    public static void main(String[] args) {
        System.out.println("=== FindTheChildWhoHasTheBallAfterKSeconds ===");
        FindTheChildWhoHasTheBallAfterKSeconds sol = new FindTheChildWhoHasTheBallAfterKSeconds();
        System.out.println(sol.numberOfChild(3, 3));
    }
}
