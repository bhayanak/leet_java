package org.leetcode.easy;


/**
 * <b>#2138 - Divide a String Into Groups of Size k</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> String, Simulation</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * A string s can be partitioned into groups of size k using the following procedure:
 *
 *
 * The first group consists of the first k characters of the string, the second group consists of the next k characters of the string, and so on. Each element can be a part of exactly one group.
 *
 * For the last group, if the string does not have k characters remaining, a character fill is used to complete the group.
 *
 * Note that the partition is done so that after removing the fill character from the last group (if it exists) and concatenating all the groups in order, the resultant string should be s.
 *
 *
 * Given the string s, the size of each group k and the character fill, return a string array denoting the composition of every group s has been divided into, using the above procedure.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s = "abcdefghi", k = 3, fill = "x"
 * Output: ["abc","def","ghi"]
 * Explanation:
 * The first 3 characters "abc" form the first group.
 * The next 3 characters "def" form the second group.
 * The last 3 characters "ghi" form the third group.
 * Since all groups can be completely filled by characters from the string, we do not need to use fill.
 * Thus, the groups formed are "abc", "def", and "ghi".
 *
 * Example 2:
 *
 * Input: s = "abcdefghij", k = 3, fill = "x"
 * Output: ["abc","def","ghi","jxx"]
 * Explanation:
 * Similar to the previous example, we are forming the first three groups "abc", "def", and "ghi".
 * For the last group, we can only use the character 'j' from the string. To complete this group, we add 'x' twice.
 * Thus, the 4 groups formed are "abc", "def", "ghi", and "jxx".
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= s.length &lt;= 100
 *
 * s consists of lowercase English letters only.
 *
 * 1 &lt;= k &lt;= 100
 *
 * fill is a lowercase English letter.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Using the length of the string and k, can you count the number of groups the string can be divided into?
 * Hint 2: Try completing each group using characters from the string. If there aren’t enough characters for the last group, use the fill character to complete the group.
 *
 * <h2>Approach</h2>
 * Think about the category (String, Simulation).
 *
 * @see <a href="https://leetcode.com/problems/divide-a-string-into-groups-of-size-k/">LeetCode #2138</a>
  *
  * <p><b>Explanation:</b> Processes the string character by character, applying the transformation or predicate.</p>
  */
public class DivideAStringIntoGroupsOfSizeK {

    /**
     * Solves the problem: Divide string.
     *
     * @param s the s (String)
     * @param k the k (int)
     * @param fill the fill (char)
     * @return the computed String[] result
      *
      * <p><b>Explanation:</b> Processes the string character by character, applying the transformation or predicate.</p>
      */
    public String[] divideString(String s, int k, char fill) {
        int rem=s.length()%k;
        if (rem!=0) for (int i=0;i<k-rem;i++) s+=fill;
        String[] res=new String[s.length()/k];
        for (int i=0;i<res.length;i++) res[i]=s.substring(i*k,i*k+k);
        return res;
    }

    public static void main(String[] args) {
        DivideAStringIntoGroupsOfSizeK sol = new DivideAStringIntoGroupsOfSizeK();
                System.out.println(java.util.Arrays.toString(sol.divideString("abcdefghi",3,'x'))); // [abc,def,ghi]
                System.out.println(java.util.Arrays.toString(sol.divideString("abcdefghij",3,'x'))); // [abc,def,ghi,jxx]
    }
}
