package org.leetcode.medium;


/**
 * <b>#1233 - Remove Sub-Folders from the Filesystem</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, String, Depth-First Search, Trie</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given a list of folders folder, return the folders after removing all sub-folders in those folders. You may return the answer in any order.
 *
 *
 * If a folder[i] is located within another folder[j], it is called a sub-folder of it. A sub-folder of folder[j] must start with folder[j], followed by a "/". For example, "/a/b" is a sub-folder of "/a", but "/b" is not a sub-folder of "/a/b/c".
 *
 *
 * The format of a path is one or more concatenated strings of the form: '/' followed by one or more lowercase English letters.
 *
 *
 * For example, "/leetcode" and "/leetcode/problems" are valid paths while an empty string and "/" are not.
 *
 *
 *
 * Example 1:
 *
 * Input: folder = ["/a","/a/b","/c/d","/c/d/e","/c/f"]
 * Output: ["/a","/c/d","/c/f"]
 * Explanation: Folders "/a/b" is a subfolder of "/a" and "/c/d/e" is inside of folder "/c/d" in our filesystem.
 *
 * Example 2:
 *
 * Input: folder = ["/a","/a/b/c","/a/b/d"]
 * Output: ["/a"]
 * Explanation: Folders "/a/b/c" and "/a/b/d" will be removed because they are subfolders of "/a".
 *
 * Example 3:
 *
 * Input: folder = ["/a/b/c","/a/b/ca","/a/b/d"]
 * Output: ["/a/b/c","/a/b/ca","/a/b/d"]
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= folder.length &lt;= 4 * 104
 *
 * 2 &lt;= folder[i].length &lt;= 100
 *
 * folder[i] contains only lowercase letters and '/'.
 *
 * folder[i] always starts with the character '/'.
 *
 * Each folder name is unique.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Sort the folders lexicographically.
 * Hint 2: Insert the current element in an array and then loop until we get rid of all of their subfolders, repeat this until no element is left.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, String, Depth-First Search, Trie).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/remove-sub-folders-from-the-filesystem/">LeetCode #1233</a>
 */
public class RemoveSubFoldersFromTheFilesystem {

    public java.util.List<String> removeSubfolders(String[] folder) {
        java.util.Arrays.sort(folder);
        java.util.List<String> res = new java.util.ArrayList<>();
        String prev = "";
        for (String f : folder) {
            if (!prev.isEmpty() && f.startsWith(prev + "/")) continue;
            res.add(f); prev = f;
        }
        return res;
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        RemoveSubFoldersFromTheFilesystem sol = new RemoveSubFoldersFromTheFilesystem();
        System.out.println("No method available");
    }
}
