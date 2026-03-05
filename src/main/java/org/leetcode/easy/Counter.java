package org.leetcode.easy;


/**
 * <b>#2620 - Counter</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> General</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an integer n, return a counter function. This counter function initially returns n and then returns 1 more than the previous value every subsequent time it is called (n, n + 1, n + 2, etc).
 *
 *
 *
 *
 * Example 1:
 *
 * Input: 
 * n = 10 
 * ["call","call","call"]
 * Output: [10,11,12]
 * Explanation: 
 * counter() = 10 // The first time counter() is called, it returns n.
 * counter() = 11 // Returns 1 more than the previous time.
 * counter() = 12 // Returns 1 more than the previous time.
 *
 * Example 2:
 *
 * Input: 
 * n = -2
 * ["call","call","call","call","call"]
 * Output: [-2,-1,0,1,2]
 * Explanation: counter() initially returns -2. Then increases after each sebsequent call.
 *
 *
 *
 * Constraints:
 *
 *
 * -1000 &lt;= n &lt;= 1000
 *
 * 0 &lt;= calls.length &lt;= 1000
 *
 * calls[i] === "call"
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: In JavaScript, a function can return a closure. A closure is defined as a function and the variables declared around it (it's lexical environment).
 * Hint 2: A count variable can be initialized in the outer function and mutated in the inner function.
 *
 * <h2>Approach</h2>
 * Think about the category (General).
 *
 * @see <a href="https://leetcode.com/problems/counter/">LeetCode #2620</a>
  *
  * <p><b>Explanation:</b> Iterates once, incrementing a counter each time the target condition is satisfied.</p>
  */
public class Counter {

    /**
     * Counts Count students.
     *
     * @param students the students (int[])
     * @param sandwiches the sandwiches (int[])
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Iterates once, incrementing a counter each time the target condition is satisfied.</p>
      */
    public int countStudents(int[] students, int[] sandwiches) {
        int[] cnt=new int[2];
        for (int s:students) cnt[s]++;
        for (int s:sandwiches) {
            if (cnt[s]==0) break;
            cnt[s]--;
        }
        return cnt[0]+cnt[1];
    }

    public static void main(String[] args) {
        Counter sol = new Counter();
        System.out.println(sol.countStudents(new int[]{1,2,3}, new int[]{1,2,3}));
    }
}
