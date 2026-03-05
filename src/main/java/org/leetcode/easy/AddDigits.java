package org.leetcode.easy;

/**
 * <b>#258 - Add Digits</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Math, Simulation, Number Theory</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: num = 38
 * Output: 2
 * Explanation: The process is
 * 38 --&gt; 3 + 8 --&gt; 11
 * 11 --&gt; 1 + 1 --&gt; 2 
 * Since 2 has only one digit, return it.
 * 
 * Example 2:
 * 
 * Input: num = 0
 * Output: 0
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * 0 &lt;= num &lt;= 231 - 1
 * 
 *  
 * 
 * Follow up: Could you do it without any loop/recursion in O(1) runtime?
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: A naive implementation of the above process is trivial. Could you come up with other methods?
 * Hint 2: What are all the possible results?
 * Hint 3: How do they occur, periodically or randomly?
 * Hint 4: You may find this <a href="https://en.wikipedia.org/wiki/Digital_root" target="_blank">Wikipedia article</a> useful.
 *
 * <h2>Approach</h2>
 * Digital root formula: return 0 for 0, otherwise 1 + (num-1)%9.
 * This follows from the congruence property of digit sums modulo 9.
 *
 * <h2>Complexity</h2>
* Time: O(1)  |  Space: O(1)
 *
 * @see <a href="https://leetcode.com/problems/add-digits/">LeetCode #258</a>
  *
  * <p><b>Explanation:</b> Applies a direct mathematical formula, avoiding the need for iteration or extra space.</p>
  */
public class AddDigits {

    /**
     * Adds Add digits.
     *
     * @param num the num (int)
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Applies a direct mathematical formula, avoiding the need for iteration or extra space.</p>
      */
    public int addDigits(int num) {
        return num==0 ? 0 : 1+(num-1)%9;
    }

    // ─── Demo ────────────────────────────────────────────────────
    public static void main(String[] args) {
        AddDigits sol = new AddDigits();
        System.out.println(sol.addDigits(38)); // 2 (3+8=11→1+1=2)
        System.out.println(sol.addDigits(0));  // 0
    }
}
