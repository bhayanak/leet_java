package org.leetcode.medium;

/**
 * <b>#71 - Simplify Path</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> String, Stack</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an absolute path for a Unix-style file system, which always begins with a slash '/'. Your task is to transform this absolute path into its simplified canonical path.
 * 
 * 
 * The rules of a Unix-style file system are as follows:
 * 
 * 	
 * A single period '.' represents the current directory.
 * 	
 * A double period '..' represents the previous/parent directory.
 * 	
 * Multiple consecutive slashes such as '//' and '///' are treated as a single slash '/'.
 * 	
 * Any sequence of periods that does not match the rules above should be treated as a valid directory or file name. For example, '...' and '....' are valid directory or file names.
 * 
 * The simplified canonical path should follow these rules:
 * 
 * 	
 * The path must start with a single slash '/'.
 * 	
 * Directories within the path must be separated by exactly one slash '/'.
 * 	
 * The path must not end with a slash '/', unless it is the root directory.
 * 	
 * The path must not have any single or double periods ('.' and '..') used to denote current or parent directories.
 * 
 * Return the simplified canonical path.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: path = "/home/"
 * 
 * 
 * Output: "/home"
 * 
 * 
 * Explanation:
 * 
 * 
 * The trailing slash should be removed.
 * 
 * Example 2:
 * 
 * Input: path = "/home//foo/"
 * 
 * 
 * Output: "/home/foo"
 * 
 * 
 * Explanation:
 * 
 * 
 * Multiple consecutive slashes are replaced by a single one.
 * 
 * Example 3:
 * 
 * Input: path = "/home/user/Documents/../Pictures"
 * 
 * 
 * Output: "/home/user/Pictures"
 * 
 * 
 * Explanation:
 * 
 * 
 * A double period ".." refers to the directory up a level (the parent directory).
 * 
 * Example 4:
 * 
 * Input: path = "/../"
 * 
 * 
 * Output: "/"
 * 
 * 
 * Explanation:
 * 
 * 
 * Going one level up from the root directory is not possible.
 * 
 * Example 5:
 * 
 * Input: path = "/.../a/../b/c/../d/./"
 * 
 * 
 * Output: "/.../b/d"
 * 
 * 
 * Explanation:
 * 
 * 
 * "..." is a valid name for a directory in this problem.
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * 1 &lt;= path.length &lt;= 3000
 * 	
 * path consists of English letters, digits, period '.', slash '/' or '_'.
 * 	
 * path is a valid absolute Unix path.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints available — try to figure out the category and approach first!
 *
 * <h2>Approach</h2>
 * Split the path by '/'. Use a Deque as a stack: push valid components,
 * ignore '.' and empty strings, pop on '..'. Join remaining parts with '/'.
 *
 * <h2>Complexity</h2>
* Time: O(n)  |  Space: O(n)
 *
 * @see <a href="https://leetcode.com/problems/simplify-path/">LeetCode #71</a>
 */
public class SimplifyPath {

    /**
     * Returns the simplified canonical Unix file path.
     *
     * @param path absolute Unix path string
     * @return     simplified canonical path
     */
    public String simplifyPath(String path) {
        java.util.Deque<String> stack = new java.util.ArrayDeque<>();
        for (String part : path.split("/")) {
            if (part.equals("..")) { if (!stack.isEmpty()) stack.pop(); }
            else if (!part.isEmpty() && !part.equals(".")) stack.push(part);
        }
        StringBuilder sb = new StringBuilder();
        for (String s : stack) sb.insert(0, "/" + s); // reconstruct path
        return sb.length() == 0 ? "/" : sb.toString();
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
                SimplifyPath sol = new SimplifyPath();
                System.out.println(sol.simplifyPath("/home/"));        // "/home"
                System.out.println(sol.simplifyPath("/../"));          // "/"
                System.out.println(sol.simplifyPath("/home//foo/"));   // "/home/foo" 
    }
}
