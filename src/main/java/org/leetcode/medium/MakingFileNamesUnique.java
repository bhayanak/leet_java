package org.leetcode.medium;


/**
 * <b>#1487 - Making File Names Unique</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Hash Table, String</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an array of strings names of size n. You will create n folders in your file system such that, at the ith minute, you will create a folder with the name names[i].
 *
 *
 * Since two files cannot have the same name, if you enter a folder name that was previously used, the system will have a suffix addition to its name in the form of (k), where, k is the smallest positive integer such that the obtained name remains unique.
 *
 *
 * Return an array of strings of length n where ans[i] is the actual name the system will assign to the ith folder when you create it.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: names = ["pes","fifa","gta","pes(2019)"]
 * Output: ["pes","fifa","gta","pes(2019)"]
 * Explanation: Let's see how the file system creates folder names:
 * "pes" --&gt; not assigned before, remains "pes"
 * "fifa" --&gt; not assigned before, remains "fifa"
 * "gta" --&gt; not assigned before, remains "gta"
 * "pes(2019)" --&gt; not assigned before, remains "pes(2019)"
 *
 * Example 2:
 *
 * Input: names = ["gta","gta(1)","gta","avalon"]
 * Output: ["gta","gta(1)","gta(2)","avalon"]
 * Explanation: Let's see how the file system creates folder names:
 * "gta" --&gt; not assigned before, remains "gta"
 * "gta(1)" --&gt; not assigned before, remains "gta(1)"
 * "gta" --&gt; the name is reserved, system adds (k), since "gta(1)" is also reserved, systems put k = 2. it becomes "gta(2)"
 * "avalon" --&gt; not assigned before, remains "avalon"
 *
 * Example 3:
 *
 * Input: names = ["onepiece","onepiece(1)","onepiece(2)","onepiece(3)","onepiece"]
 * Output: ["onepiece","onepiece(1)","onepiece(2)","onepiece(3)","onepiece(4)"]
 * Explanation: When the last folder is created, the smallest positive valid k is 4, and it becomes "onepiece(4)".
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= names.length &lt;= 5 * 104
 *
 * 1 &lt;= names[i].length &lt;= 20
 *
 * names[i] consists of lowercase English letters, digits, and/or round brackets.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Keep a map of each name and the smallest valid integer that can be appended as a suffix to it.
 * Hint 2: If the name is not present in the map, you can use it without adding any suffixes.
 * Hint 3: If the name is present in the map, append the smallest proper suffix, and add the new name to the map.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, String).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/making-file-names-unique/">LeetCode #1487</a>
 */
public class MakingFileNamesUnique {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Making File Names Unique");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== MakingFileNamesUnique ===");
        MakingFileNamesUnique sol = new MakingFileNamesUnique();
        System.out.println(sol.solve(null));
    }
}
