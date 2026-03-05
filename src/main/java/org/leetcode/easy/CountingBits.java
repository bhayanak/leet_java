package org.leetcode.easy;

/**
 * <b>#338 - Counting Bits</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Dynamic Programming, Bit Manipulation</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an integer n, return an array ans of length n + 1 such that for each i (0 &lt;= i &lt;= n), ans[i] is the number of 1's in the binary representation of i.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: n = 2
 * Output: [0,1,1]
 * Explanation:
 * 0 --&gt; 0
 * 1 --&gt; 1
 * 2 --&gt; 10
 * 
 * Example 2:
 * 
 * Input: n = 5
 * Output: [0,1,1,2,1,2]
 * Explanation:
 * 0 --&gt; 0
 * 1 --&gt; 1
 * 2 --&gt; 10
 * 3 --&gt; 11
 * 4 --&gt; 100
 * 5 --&gt; 101
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * 0 &lt;= n &lt;= 105
 * 
 *  
 * 
 * Follow up:
 * 
 * 	
 * It is very easy to come up with a solution with a runtime of O(n log n). Can you do it in linear time O(n) and possibly in a single pass?
 * 	
 * Can you do it without using any built-in function (i.e., like __builtin_popcount in C++)?
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: You should make use of what you have produced already.
 * Hint 2: Divide the numbers in ranges like [2-3], [4-7], [8-15] and so on. And try to generate new range from previous.
 * Hint 3: Or does the odd/even status of the number help you in calculating the number of 1s?
 *
 * <h2>Approach</h2>
 * DP: bits[i] = bits[i&gt;&gt;1] + (i&amp;1). The last bit adds 1 if i is odd.
 *
 * <h2>Complexity</h2>
* Time: O(n)  |  Space: O(n)
 *
 * @see <a href="https://leetcode.com/problems/counting-bits/">LeetCode #338</a>
  *
  * <p><b>Explanation:</b> Iterates once, incrementing a counter each time the target condition is satisfied.</p>
  */
public class CountingBits {

    /**
     * Counts Count bits.
     *
     * @param n the n (int)
     * @return the computed int[] result
      *
      * <p><b>Explanation:</b> Iterates once, incrementing a counter each time the target condition is satisfied.</p>
      */
    public int[] countBits(int n) {
        int[] ans=new int[n+1];
        for(int i=1;i<=n;i++) ans[i]=ans[i>>1]+(i&1);
        return ans;
    }

    // ─── Demo ────────────────────────────────────────────────────
    public static void main(String[] args) {
        CountingBits sol = new CountingBits();
        System.out.println(java.util.Arrays.toString(sol.countBits(2))); // [0,1,1]
        System.out.println(java.util.Arrays.toString(sol.countBits(5))); // [0,1,1,2,1,2]
    }
}
