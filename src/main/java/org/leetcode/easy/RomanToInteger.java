package org.leetcode.easy;

/**
 * <b>#13 - Roman to Integer</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Hash Table, Math, String</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
 * 
 * Symbol       Value
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 * 
 * For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.
 * 
 * 
 * Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:
 * 
 * 	
 * I can be placed before V (5) and X (10) to make 4 and 9. 
 * 	
 * X can be placed before L (50) and C (100) to make 40 and 90. 
 * 	
 * C can be placed before D (500) and M (1000) to make 400 and 900.
 * 
 * Given a roman numeral, convert it to an integer.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: s = "III"
 * Output: 3
 * Explanation: III = 3.
 * 
 * Example 2:
 * 
 * Input: s = "LVIII"
 * Output: 58
 * Explanation: L = 50, V= 5, III = 3.
 * 
 * Example 3:
 * 
 * Input: s = "MCMXCIV"
 * Output: 1994
 * Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * 1 &lt;= s.length &lt;= 15
 * 	
 * s contains only the characters ('I', 'V', 'X', 'L', 'C', 'D', 'M').
 * 	
 * It is guaranteed that s is a valid roman numeral in the range [1, 3999].
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * - Problem is simpler to solve by working the string from back to front and using a map.
 *
 * <h2>Approach</h2>
 * Map each Roman symbol to its value.
 * Walk left-to-right: if a symbol is less than the next, subtract it (subtractive rule),
 * otherwise add it.
 *
 * <h2>Complexity</h2>
* Time: O(n)  |  Space: O(1)
 *
 * @see <a href="https://leetcode.com/problems/roman-to-integer/">LeetCode #13</a>
  *
  * <p><b>Explanation:</b> Uses a HashMap for O(1) average-time lookups, mapping values to indices/counts.</p>
  */
public class RomanToInteger {

    /**
     * Converts a Roman numeral string to an integer.
     *
     * @param s Roman numeral (guaranteed valid, 1–3999)
     * @return  integer value
      *
      * <p><b>Explanation:</b> Uses a HashMap for O(1) average-time lookups, mapping values to indices/counts.</p>
      */
    public int romanToInt(String s) {
        java.util.Map<Character, Integer> map = new java.util.HashMap<>();
        map.put('I',1); map.put('V',5); map.put('X',10); map.put('L',50);
        map.put('C',100); map.put('D',500); map.put('M',1000);

        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            int val  = map.get(s.charAt(i));
            int next = (i + 1 < s.length()) ? map.get(s.charAt(i + 1)) : 0;
            result += (val < next) ? -val : val; // subtractive notation check
        }
        return result;
    }

    /**
     * Runs sample test cases.
      *
      * <p><b>Explanation:</b> Applies a direct mathematical formula, avoiding the need for iteration or extra space.</p>
      */
    public static void main(String[] args) {
                RomanToInteger sol = new RomanToInteger();
                System.out.println(sol.romanToInt("III"));    // 3
                System.out.println(sol.romanToInt("LVIII"));  // 58
                System.out.println(sol.romanToInt("MCMXCIV")); // 1994
    }
}
