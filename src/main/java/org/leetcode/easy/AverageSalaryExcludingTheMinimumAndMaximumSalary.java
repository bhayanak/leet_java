package org.leetcode.easy;


/**
 * <b>#1491 - Average Salary Excluding the Minimum and Maximum Salary</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Sorting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an array of unique integers salary where salary[i] is the salary of the ith employee.
 *
 *
 * Return the average salary of employees excluding the minimum and maximum salary. Answers within 10-5 of the actual answer will be accepted.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: salary = [4000,3000,1000,2000]
 * Output: 2500.00000
 * Explanation: Minimum salary and maximum salary are 1000 and 4000 respectively.
 * Average salary excluding minimum and maximum salary is (2000+3000) / 2 = 2500
 *
 * Example 2:
 *
 * Input: salary = [1000,2000,3000]
 * Output: 2000.00000
 * Explanation: Minimum salary and maximum salary are 1000 and 3000 respectively.
 * Average salary excluding minimum and maximum salary is (2000) / 1 = 2000
 *
 *
 *
 * Constraints:
 *
 *
 * 3 &lt;= salary.length &lt;= 100
 *
 * 1000 &lt;= salary[i] &lt;= 106
 *
 * All the integers of salary are unique.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Get the total sum and subtract the minimum and maximum value in the array.  Finally divide the result by n - 2.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Sorting).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/">LeetCode #1491</a>
  *
  * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
  */
public class AverageSalaryExcludingTheMinimumAndMaximumSalary {

    /**
     * Solves the problem: Average.
     *
     * @param salary the salary (int[])
     * @return the computed double result
      *
      * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
      */
    public double average(int[] salary) {
        int min=Integer.MAX_VALUE, max=Integer.MIN_VALUE, sum=0;
        for (int s:salary) { min=Math.min(min,s); max=Math.max(max,s); sum+=s; }
        return (double)(sum-min-max)/(salary.length-2);
    }

    /**
     * Runs sample test cases.
      *
      * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
      */
    public static void main(String[] args) {
        AverageSalaryExcludingTheMinimumAndMaximumSalary sol = new AverageSalaryExcludingTheMinimumAndMaximumSalary();
                System.out.printf("%.5f%n", sol.average(new int[]{4000,3000,1000,2000})); // 2500.00000
                System.out.printf("%.5f%n", sol.average(new int[]{1000,2000,3000}));      // 2000.00000
    }
}
