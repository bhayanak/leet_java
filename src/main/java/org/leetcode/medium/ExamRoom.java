package org.leetcode.medium;


/**
 * <b>#855 - Exam Room</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Design, Heap (Priority Queue), Ordered Set</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * There is an exam room with n seats in a single row labeled from 0 to n - 1.
 *
 *
 * When a student enters the room, they must sit in the seat that maximizes the distance to the closest person. If there are multiple such seats, they sit in the seat with the lowest number. If no one is in the room, then the student sits at seat number 0.
 *
 *
 * Design a class that simulates the mentioned exam room.
 *
 *
 * Implement the ExamRoom class:
 *
 *
 * ExamRoom(int n) Initializes the object of the exam room with the number of the seats n.
 *
 * int seat() Returns the label of the seat at which the next student will set.
 *
 * void leave(int p) Indicates that the student sitting at seat p will leave the room. It is guaranteed that there will be a student sitting at seat p.
 *
 *
 *
 * Example 1:
 *
 * Input
 * ["ExamRoom", "seat", "seat", "seat", "seat", "leave", "seat"]
 * [[10], [], [], [], [], [4], []]
 * Output
 * [null, 0, 9, 4, 2, null, 5]
 *
 * Explanation
 * ExamRoom examRoom = new ExamRoom(10);
 * examRoom.seat(); // return 0, no one is in the room, then the student sits at seat number 0.
 * examRoom.seat(); // return 9, the student sits at the last seat number 9.
 * examRoom.seat(); // return 4, the student sits at the last seat number 4.
 * examRoom.seat(); // return 2, the student sits at the last seat number 2.
 * examRoom.leave(4);
 * examRoom.seat(); // return 5, the student sits at the last seat number 5.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n &lt;= 109
 *
 * It is guaranteed that there is a student sitting at seat p.
 *
 * At most 104 calls will be made to seat and leave.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (Design, Heap (Priority Queue), Ordered Set).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/exam-room/">LeetCode #855</a>
 */
public class ExamRoom {

    /**
     * TODO: Implement "Exam Room".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Exam Room");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac ExamRoom.java &amp;&amp; java org.leetcode.medium.ExamRoom</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== ExamRoom ===");
        ExamRoom sol = new ExamRoom();
        System.out.println(sol.solve(null));
    }
}
