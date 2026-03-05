package org.leetcode.easy;


/**
 * <b>#2037 - Minimum Number of Moves to Seat Everyone</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Greedy, Sorting, Counting Sort</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * There are n availabe seats and n students standing in a room. You are given an array seats of length n, where seats[i] is the position of the ith seat. You are also given the array students of length n, where students[j] is the position of the jth student.
 *
 *
 * You may perform the following move any number of times:
 *
 *
 * Increase or decrease the position of the ith student by 1 (i.e., moving the ith student from position x to x + 1 or x - 1)
 *
 * Return the minimum number of moves required to move each student to a seat such that no two students are in the same seat.
 *
 *
 * Note that there may be multiple seats or students in the same position at the beginning.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: seats = [3,1,5], students = [2,7,4]
 * Output: 4
 * Explanation: The students are moved as follows:
 * - The first student is moved from position 2 to position 1 using 1 move.
 * - The second student is moved from position 7 to position 5 using 2 moves.
 * - The third student is moved from position 4 to position 3 using 1 move.
 * In total, 1 + 2 + 1 = 4 moves were used.
 *
 * Example 2:
 *
 * Input: seats = [4,1,5,9], students = [1,3,2,6]
 * Output: 7
 * Explanation: The students are moved as follows:
 * - The first student is not moved.
 * - The second student is moved from position 3 to position 4 using 1 move.
 * - The third student is moved from position 2 to position 5 using 3 moves.
 * - The fourth student is moved from position 6 to position 9 using 3 moves.
 * In total, 0 + 1 + 3 + 3 = 7 moves were used.
 *
 * Example 3:
 *
 * Input: seats = [2,2,6,6], students = [1,3,2,6]
 * Output: 4
 * Explanation: Note that there are two seats at position 2 and two seats at position 6.
 * The students are moved as follows:
 * - The first student is moved from position 1 to position 2 using 1 move.
 * - The second student is moved from position 3 to position 6 using 3 moves.
 * - The third student is not moved.
 * - The fourth student is not moved.
 * In total, 1 + 3 + 0 + 0 = 4 moves were used.
 *
 *
 *
 * Constraints:
 *
 *
 * n == seats.length == students.length
 *
 * 1 &lt;= n &lt;= 100
 *
 * 1 &lt;= seats[i], students[j] &lt;= 100
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Can we sort the arrays to help solve the problem?
 * Hint 2: Can we greedily match each student to a seat?
 * Hint 3: The smallest positioned student will go to the smallest positioned chair, and then the next smallest positioned student will go to the next smallest positioned chair, and so on.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Greedy, Sorting, Counting Sort).
 *
 * @see <a href="https://leetcode.com/problems/minimum-number-of-moves-to-seat-everyone/">LeetCode #2037</a>
  *
  * <p><b>Explanation:</b> Sorts the input first to simplify subsequent search or comparison steps.</p>
  */
public class MinimumNumberOfMovesToSeatEveryone {

    /**
     * Computes the minimum Min moves to seat.
     * Sorts the input first to enable efficient processing.
     *
     * @param seats the seats (int[])
     * @param students the students (int[])
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Sorts the input first to simplify subsequent search or comparison steps.</p>
      */
    public int minMovesToSeat(int[] seats, int[] students) {
        java.util.Arrays.sort(seats); java.util.Arrays.sort(students);
        int moves=0;
        for (int i=0;i<seats.length;i++) moves+=Math.abs(seats[i]-students[i]);
        return moves;
    }

    public static void main(String[] args) {
        MinimumNumberOfMovesToSeatEveryone sol = new MinimumNumberOfMovesToSeatEveryone();
                System.out.println(sol.minMovesToSeat(new int[]{3,1,5},new int[]{2,7,4})); // 4
                System.out.println(sol.minMovesToSeat(new int[]{4,1,5,9},new int[]{1,3,2,6})); // 7
                System.out.println(sol.minMovesToSeat(new int[]{2,2,6,6},new int[]{1,3,2,6})); // 4
    }
}
