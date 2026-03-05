package org.leetcode.easy;


/**
 * <b>#1700 - Number of Students Unable to Eat Lunch</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Stack, Queue, Simulation</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * The school cafeteria offers circular and square sandwiches at lunch break, referred to by numbers 0 and 1 respectively. All students stand in a queue. Each student either prefers square or circular sandwiches.
 *
 *
 * The number of sandwiches in the cafeteria is equal to the number of students. The sandwiches are placed in a stack. At each step:
 *
 *
 * If the student at the front of the queue prefers the sandwich on the top of the stack, they will take it and leave the queue.
 *
 * Otherwise, they will leave it and go to the queue's end.
 *
 * This continues until none of the queue students want to take the top sandwich and are thus unable to eat.
 *
 *
 * You are given two integer arrays students and sandwiches where sandwiches[i] is the type of the i​​​​​​th sandwich in the stack (i = 0 is the top of the stack) and students[j] is the preference of the j​​​​​​th student in the initial queue (j = 0 is the front of the queue). Return the number of students that are unable to eat.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: students = [1,1,0,0], sandwiches = [0,1,0,1]
 * Output: 0 
 * Explanation:
 * - Front student leaves the top sandwich and returns to the end of the line making students = [1,0,0,1].
 * - Front student leaves the top sandwich and returns to the end of the line making students = [0,0,1,1].
 * - Front student takes the top sandwich and leaves the line making students = [0,1,1] and sandwiches = [1,0,1].
 * - Front student leaves the top sandwich and returns to the end of the line making students = [1,1,0].
 * - Front student takes the top sandwich and leaves the line making students = [1,0] and sandwiches = [0,1].
 * - Front student leaves the top sandwich and returns to the end of the line making students = [0,1].
 * - Front student takes the top sandwich and leaves the line making students = [1] and sandwiches = [1].
 * - Front student takes the top sandwich and leaves the line making students = [] and sandwiches = [].
 * Hence all students are able to eat.
 *
 * Example 2:
 *
 * Input: students = [1,1,1,0,0,1], sandwiches = [1,0,0,0,1,1]
 * Output: 3
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= students.length, sandwiches.length &lt;= 100
 *
 * students.length == sandwiches.length
 *
 * sandwiches[i] is 0 or 1.
 *
 * students[i] is 0 or 1.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Simulate the given in the statement
 * Hint 2: Calculate those who will eat instead of those who will not.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Stack, Queue, Simulation).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/number-of-students-unable-to-eat-lunch/">LeetCode #1700</a>
  *
  * <p><b>Explanation:</b> Iterates once, incrementing a counter each time the target condition is satisfied.</p>
  */
public class NumberOfStudentsUnableToEatLunch {

    /**
     * Counts Count students.
     *
     * @param students the students (int[])
     * @param sandwiches the sandwiches (int[])
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Iterates once, incrementing a counter each time the target condition is satisfied.</p>
      */
    public int countStudents(int[] students, int[] sandwiches) {
        int[] cnt = new int[2];
        for (int s:students) cnt[s]++;
        for (int s:sandwiches) {
            if (cnt[s]==0) return cnt[1-s];
            cnt[s]--;
        }
        return 0;
    }

    /**
     * Runs sample test cases.
      *
      * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
      */
    public static void main(String[] args) {
        NumberOfStudentsUnableToEatLunch sol = new NumberOfStudentsUnableToEatLunch();
                System.out.println(sol.countStudents(new int[]{1,1,0,0},new int[]{0,1,0,1})); // 0
                System.out.println(sol.countStudents(new int[]{1,1,1,0,0,1},new int[]{1,0,0,0,1,1})); // 3
    }
}
