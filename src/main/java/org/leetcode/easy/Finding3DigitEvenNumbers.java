package org.leetcode.easy;


/**
 * <b>#2094 - Finding 3-Digit Even Numbers</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Hash Table, Recursion, Sorting, Enumeration</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array digits, where each element is a digit. The array may contain duplicates.
 *
 *
 * You need to find all the unique integers that follow the given requirements:
 *
 *
 * The integer consists of the concatenation of three elements from digits in any arbitrary order.
 *
 * The integer does not have leading zeros.
 *
 * The integer is even.
 *
 * For example, if the given digits were [1, 2, 3], integers 132 and 312 follow the requirements.
 *
 *
 * Return a sorted array of the unique integers.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: digits = [2,1,3,0]
 * Output: [102,120,130,132,210,230,302,310,312,320]
 * Explanation: All the possible integers that follow the requirements are in the output array. 
 * Notice that there are no odd integers or integers with leading zeros.
 *
 * Example 2:
 *
 * Input: digits = [2,2,8,8,2]
 * Output: [222,228,282,288,822,828,882]
 * Explanation: The same digit can be used as many times as it appears in digits. 
 * In this example, the digit 8 is used twice each time in 288, 828, and 882. 
 *
 * Example 3:
 *
 * Input: digits = [3,7,5]
 * Output: []
 * Explanation: No even integers can be formed using the given digits.
 *
 *
 *
 * Constraints:
 *
 *
 * 3 &lt;= digits.length &lt;= 100
 *
 * 0 &lt;= digits[i] &lt;= 9
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: The range of possible answers includes all even numbers between 100 and 999 inclusive. Could you check each possible answer to see if it could be formed from the digits in the array?
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Recursion, Sorting, Enumeration).
 *
 * @see <a href="https://leetcode.com/problems/finding-3-digit-even-numbers/">LeetCode #2094</a>
  *
  * <p><b>Explanation:</b> Searches through the input, returning the first element or index satisfying the target condition.</p>
  */
public class Finding3DigitEvenNumbers {

    /**
     * Finds Find even numbers.
     *
     * @param digits the digits (int[])
     * @return the computed int[] result
      *
      * <p><b>Explanation:</b> Searches through the input, returning the first element or index satisfying the target condition.</p>
      */
    public int[] findEvenNumbers(int[] digits) {
        java.util.Set<Integer> res = new java.util.TreeSet<>();
        int n=digits.length;
        for (int i=0;i<n;i++) for (int j=0;j<n;j++) for (int k=0;k<n;k++) {
            if (i==j||j==k||i==k) continue;
            if (digits[i]==0) continue;
            int num=digits[i]*100+digits[j]*10+digits[k];
            if (num%2==0) res.add(num);
        }
        return res.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        Finding3DigitEvenNumbers sol = new Finding3DigitEvenNumbers();
        System.out.println(sol.findEvenNumbers(new int[]{1,2,3}));
    }
}
