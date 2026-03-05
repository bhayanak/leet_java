package org.leetcode.easy;

/**
 * <b>#202 - Happy Number</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Hash Table, Math, Two Pointers</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Write an algorithm to determine if a number n is happy.
 * 
 * 
 * A happy number is a number defined by the following process:
 * 
 * 	
 * Starting with any positive integer, replace the number by the sum of the squares of its digits.
 * 	
 * Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
 * 	
 * Those numbers for which this process ends in 1 are happy.
 * 
 * Return true if n is a happy number, and false if not.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: n = 19
 * Output: true
 * Explanation:
 * 12 + 92 = 82
 * 82 + 22 = 68
 * 62 + 82 = 100
 * 12 + 02 + 02 = 1
 * 
 * Example 2:
 * 
 * Input: n = 2
 * Output: false
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * 1 &lt;= n &lt;= 231 - 1
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — study the examples carefully.
 *
 * <h2>Approach</h2>
 * Use slow/fast pointers (or visited set) on the digit-square-sum sequence.
 * A number is happy if the sequence reaches 1; it's unhappy if it enters a cycle.
 *
 * <h2>Complexity</h2>
* Time: O(log n)  |  Space: O(1)
 *
 * @see <a href="https://leetcode.com/problems/happy-number/">LeetCode #202</a>
  *
  * <p><b>Explanation:</b> Validates the condition by scanning the input and returning false on the first violation.</p>
  */
public class HappyNumber {

    /**
     * Returns true if Is happy.
     *
     * @param n the n (int)
     * @return the computed boolean result
      *
      * <p><b>Explanation:</b> Validates the condition by scanning the input and returning false on the first violation.</p>
      */
    public boolean isHappy(int n) {
        int slow = n, fast = digitSqSum(n);
        while (fast != 1 && slow != fast) {
            slow = digitSqSum(slow);
            fast = digitSqSum(digitSqSum(fast));
        }
        return fast == 1;
    }
    private int digitSqSum(int n) {
        int s = 0;
        while (n > 0) { int d = n % 10; s += d*d; n /= 10; }
        return s;
    }

    // ─── Demo ────────────────────────────────────────────────────
    public static void main(String[] args) {
        HappyNumber sol = new HappyNumber();
        System.out.println(sol.isHappy(19)); // true  (1²+9²=82→68→100→1)
        System.out.println(sol.isHappy(2));  // false (cycle)
    }
}
