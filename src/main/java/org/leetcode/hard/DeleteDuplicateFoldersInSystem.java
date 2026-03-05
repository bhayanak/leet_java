package org.leetcode.hard;


/**
 * <b>#1948 - Delete Duplicate Folders in System</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Hash Table, String, Trie, Hash Function</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Due to a bug, there are many duplicate folders in a file system. You are given a 2D array paths, where paths[i] is an array representing an absolute path to the ith folder in the file system.
 *
 *
 * For example, ["one", "two", "three"] represents the path "/one/two/three".
 *
 * Two folders (not necessarily on the same level) are identical if they contain the same non-empty set of identical subfolders and underlying subfolder structure. The folders do not need to be at the root level to be identical. If two or more folders are identical, then mark the folders as well as all their subfolders.
 *
 *
 * For example, folders "/a" and "/b" in the file structure below are identical. They (as well as their subfolders) should all be marked:
 *
 *
 *
 *
 * /a
 *
 * /a/x
 *
 * /a/x/y
 *
 * /a/z
 *
 * /b
 *
 * /b/x
 *
 * /b/x/y
 *
 * /b/z
 *
 *
 *
 * However, if the file structure also included the path "/b/w", then the folders "/a" and "/b" would not be identical. Note that "/a/x" and "/b/x" would still be considered identical even with the added folder.
 *
 * Once all the identical folders and their subfolders have been marked, the file system will delete all of them. The file system only runs the deletion once, so any folders that become identical after the initial deletion are not deleted.
 *
 *
 * Return the 2D array ans containing the paths of the remaining folders after deleting all the marked folders. The paths may be returned in any order.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: paths = [["a"],["c"],["d"],["a","b"],["c","b"],["d","a"]]
 * Output: [["d"],["d","a"]]
 * Explanation: The file structure is as shown.
 * Folders "/a" and "/c" (and their subfolders) are marked for deletion because they both contain an empty
 * folder named "b".
 *
 * Example 2:
 *
 * Input: paths = [["a"],["c"],["a","b"],["c","b"],["a","b","x"],["a","b","x","y"],["w"],["w","y"]]
 * Output: [["c"],["c","b"],["a"],["a","b"]]
 * Explanation: The file structure is as shown. 
 * Folders "/a/b/x" and "/w" (and their subfolders) are marked for deletion because they both contain an empty folder named "y".
 * Note that folders "/a" and "/c" are identical after the deletion, but they are not deleted because they were not marked beforehand.
 *
 * Example 3:
 *
 * Input: paths = [["a","b"],["c","d"],["c"],["a"]]
 * Output: [["c"],["c","d"],["a"],["a","b"]]
 * Explanation: All folders are unique in the file system.
 * Note that the returned array can be in a different order as the order does not matter.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= paths.length &lt;= 2 * 104
 *
 * 1 &lt;= paths[i].length &lt;= 500
 *
 * 1 &lt;= paths[i][j].length &lt;= 10
 *
 * 1 &lt;= sum(paths[i][j].length) &lt;= 2 * 105
 *
 * path[i][j] consists of lowercase English letters.
 *
 * No two paths lead to the same folder.
 *
 * For any folder not at the root level, its parent folder will also be in the input.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Can we use a trie to build the folder structure?
 * Hint 2: Can we utilize hashing to hash the folder structures?
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, String, Trie, Hash Function).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/delete-duplicate-folders-in-system/">LeetCode #1948</a>
 */
public class DeleteDuplicateFoldersInSystem {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Delete Duplicate Folders in System");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== DeleteDuplicateFoldersInSystem ===");
        DeleteDuplicateFoldersInSystem sol = new DeleteDuplicateFoldersInSystem();
        System.out.println(sol.solve(null));
    }
}
