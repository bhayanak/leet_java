package org.leetcode.medium;

/**
 * <b>#38 - Count and Say</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> String</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * The count-and-say sequence is a sequence of digit strings defined by the recursive formula:
 * 
 * 	
 * countAndSay(1) = "1"
 * 	
 * countAndSay(n) is the run-length encoding of countAndSay(n - 1).
 * 
 * Run-length encoding (RLE) is a string compression method that works by replacing consecutive identical characters (repeated 2 or more times) with the concatenation of the character and the number marking the count of the characters (length of the run). For example, to compress the string "3322251" we replace "33" with "23", replace "222" with "32", replace "5" with "15" and replace "1" with "11". Thus the compressed string becomes "23321511".
 * 
 * 
 * Given a positive integer n, return the nth element of the count-and-say sequence.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: n = 4
 * 
 * 
 * Output: "1211"
 * 
 * 
 * Explanation:
 * 
 * countAndSay(1) = "1"
 * countAndSay(2) = RLE of "1" = "11"
 * countAndSay(3) = RLE of "11" = "21"
 * countAndSay(4) = RLE of "21" = "1211"
 * 
 * Example 2:
 * 
 * Input: n = 1
 * 
 * 
 * Output: "1"
 * 
 * 
 * Explanation:
 * 
 * 
 * This is the base case.
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * 1 &lt;= n &lt;= 30
 * 
 *  
 * Follow up: Could you solve it iteratively?
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * - Create a helper function that maps an integer to pairs of its digits and their frequencies. For example, if you call this function with "223314444411", then it maps it to an array of pairs [[2,2], [3,2], [1,1], [4,5], [1, 2]].
 * - Create another helper function that takes the array of pairs and creates a new integer. For example, if you call this function with [[2,2], [3,2], [1,1], [4,5], [1, 2]], it should create "22"+"23"+"11"+"54"+"21" = "2223115421".
 * - Now, with the two helper functions, you can start with "1" and call the two functions alternatively n-1 times. The answer is the last integer you will obtain.
 *
 * <h2>Approach</h2>
 * Start with "1". For each step, scan the current string and encode
 * runs of identical digits as (count)(digit) — hence "count and say".
 *
 * <h2>Complexity</h2>
* Time: O(n · 2ⁿ) worst case  |  Space: O(2ⁿ)
 *
 * @see <a href="https://leetcode.com/problems/count-and-say/">LeetCode #38</a>
 */
public class CountAndSay {

    /**
     * Returns the n-th term of the Count-and-Say sequence.
     *
     * @param n term index (1-indexed)
     * @return  the n-th RLE-encoded string
     */
    public String countAndSay(int n) {
        String s = "1";
        for (int i = 1; i < n; i++) {
            StringBuilder next = new StringBuilder();
            int j = 0;
            while (j < s.length()) {
                char ch = s.charAt(j);
                int count = 0;
                while (j < s.length() && s.charAt(j) == ch) { j++; count++; }
                next.append(count).append(ch);
            }
            s = next.toString();
        }
        return s;
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
                CountAndSay sol = new CountAndSay();
                System.out.println(sol.countAndSay(1)); // "1"
                System.out.println(sol.countAndSay(4)); // "1211"
                System.out.println(sol.countAndSay(6)); // "312211" 
    }
}
