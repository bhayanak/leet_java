package org.leetcode.easy;


/**
 * <b>#2303 - Calculate Amount Paid in Taxes</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Simulation</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a 0-indexed 2D integer array brackets where brackets[i] = [upperi, percenti] means that the ith tax bracket has an upper bound of upperi and is taxed at a rate of percenti. The brackets are sorted by upper bound (i.e. upperi-1 &lt; upperi for 0 &lt; i &lt; brackets.length).
 *
 *
 * Tax is calculated as follows:
 *
 *
 * The first upper0 dollars earned are taxed at a rate of percent0.
 *
 * The next upper1 - upper0 dollars earned are taxed at a rate of percent1.
 *
 * The next upper2 - upper1 dollars earned are taxed at a rate of percent2.
 *
 * And so on.
 *
 * You are given an integer income representing the amount of money you earned. Return the amount of money that you have to pay in taxes. Answers within 10-5 of the actual answer will be accepted.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: brackets = [[3,50],[7,10],[12,25]], income = 10
 * Output: 2.65000
 * Explanation:
 * Based on your income, you have 3 dollars in the 1st tax bracket, 4 dollars in the 2nd tax bracket, and 3 dollars in the 3rd tax bracket.
 * The tax rate for the three tax brackets is 50%, 10%, and 25%, respectively.
 * In total, you pay $3 * 50% + $4 * 10% + $3 * 25% = $2.65 in taxes.
 *
 * Example 2:
 *
 * Input: brackets = [[1,0],[4,25],[5,50]], income = 2
 * Output: 0.25000
 * Explanation:
 * Based on your income, you have 1 dollar in the 1st tax bracket and 1 dollar in the 2nd tax bracket.
 * The tax rate for the two tax brackets is 0% and 25%, respectively.
 * In total, you pay $1 * 0% + $1 * 25% = $0.25 in taxes.
 *
 * Example 3:
 *
 * Input: brackets = [[2,50]], income = 0
 * Output: 0.00000
 * Explanation:
 * You have no income to tax, so you have to pay a total of $0 in taxes.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= brackets.length &lt;= 100
 *
 * 1 &lt;= upperi &lt;= 1000
 *
 * 0 &lt;= percenti &lt;= 100
 *
 * 0 &lt;= income &lt;= 1000
 *
 * upperi is sorted in ascending order.
 *
 * All the values of upperi are unique.
 *
 * The upper bound of the last tax bracket is greater than or equal to income.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: As you iterate through the tax brackets, keep track of the previous tax bracket’s upper bound in a variable called prev. If there is no previous tax bracket, use 0 instead.
 * Hint 2: The amount of money in the ith tax bracket is min(income, upperi) - prev.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Simulation).
 *
 * @see <a href="https://leetcode.com/problems/calculate-amount-paid-in-taxes/">LeetCode #2303</a>
  *
  * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
  */
public class CalculateAmountPaidInTaxes {

    /**
     * Calculates Calculate tax.
     *
     * @param brackets the brackets (int[][])
     * @param income the income (int)
     * @return the computed double result
      *
      * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
      */
    public double calculateTax(int[][] brackets, int income) {
        double tax=0; int prev=0;
        for (int[] b:brackets) {
            if (income<=0) break;
            int taxable=Math.min(b[0]-prev,income);
            tax+=taxable*(b[1]/100.0);
            income-=taxable; prev=b[0];
        }
        return tax;
    }

    public static void main(String[] args) {
        CalculateAmountPaidInTaxes sol = new CalculateAmountPaidInTaxes();
                System.out.printf("%.5f%n", sol.calculateTax(new int[][]{{3,50},{7,10},{12,25}},10)); // 2.65000
                System.out.printf("%.5f%n", sol.calculateTax(new int[][]{{1,0},{4,25},{5,50}},2));   // 0.25000
    }
}
