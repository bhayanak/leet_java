package org.leetcode.medium;


/**
 * <b>#1472 - Design Browser History</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Linked List, Stack, Design, Doubly-Linked List, Data Stream</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You have a browser of one tab where you start on the homepage and you can visit another url, get back in the history number of steps or move forward in the history number of steps.
 *
 *
 * Implement the BrowserHistory class:
 *
 *
 * BrowserHistory(string homepage) Initializes the object with the homepage of the browser.
 *
 * void visit(string url) Visits url from the current page. It clears up all the forward history.
 *
 * string back(int steps) Move steps back in history. If you can only return x steps in the history and steps &gt; x, you will return only x steps. Return the current url after moving back in history at most steps.
 *
 * string forward(int steps) Move steps forward in history. If you can only forward x steps in the history and steps &gt; x, you will forward only x steps. Return the current url after forwarding in history at most steps.
 *
 *
 *
 * Example:
 *
 * Input:
 * ["BrowserHistory","visit","visit","visit","back","back","forward","visit","forward","back","back"]
 * [["leetcode.com"],["google.com"],["facebook.com"],["youtube.com"],[1],[1],[1],["linkedin.com"],[2],[2],[7]]
 * Output:
 * [null,null,null,null,"facebook.com","google.com","facebook.com",null,"linkedin.com","google.com","leetcode.com"]
 *
 * Explanation:
 * BrowserHistory browserHistory = new BrowserHistory("leetcode.com");
 * browserHistory.visit("google.com");       // You are in "leetcode.com". Visit "google.com"
 * browserHistory.visit("facebook.com");     // You are in "google.com". Visit "facebook.com"
 * browserHistory.visit("youtube.com");      // You are in "facebook.com". Visit "youtube.com"
 * browserHistory.back(1);                   // You are in "youtube.com", move back to "facebook.com" return "facebook.com"
 * browserHistory.back(1);                   // You are in "facebook.com", move back to "google.com" return "google.com"
 * browserHistory.forward(1);                // You are in "google.com", move forward to "facebook.com" return "facebook.com"
 * browserHistory.visit("linkedin.com");     // You are in "facebook.com". Visit "linkedin.com"
 * browserHistory.forward(2);                // You are in "linkedin.com", you cannot move forward any steps.
 * browserHistory.back(2);                   // You are in "linkedin.com", move back two steps to "facebook.com" then to "google.com". return "google.com"
 * browserHistory.back(7);                   // You are in "google.com", you can move back only one step to "leetcode.com". return "leetcode.com"
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= homepage.length &lt;= 20
 *
 * 1 &lt;= url.length &lt;= 20
 *
 * 1 &lt;= steps &lt;= 100
 *
 * homepage and url consist of  '.' or lower case English letters.
 *
 * At most 5000 calls will be made to visit, back, and forward.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use two stacks: one for back history, and one for forward history. You can simulate the functions by popping an element from one stack and pushing it into the other.
 * Hint 2: Can you improve program runtime by using a different data structure?
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Linked List, Stack, Design, Doubly-Linked List, Data Stream).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/design-browser-history/">LeetCode #1472</a>
 */
public class DesignBrowserHistory {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Design Browser History");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== DesignBrowserHistory ===");
        DesignBrowserHistory sol = new DesignBrowserHistory();
        System.out.println(sol.solve(null));
    }
}
