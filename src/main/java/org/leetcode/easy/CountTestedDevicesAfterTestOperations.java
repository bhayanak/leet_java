package org.leetcode.easy;


/**
 * <b>#2960 - Count Tested Devices After Test Operations</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Simulation, Counting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a 0-indexed integer array batteryPercentages having length n, denoting the battery percentages of n 0-indexed devices.
 *
 *
 * Your task is to test each device i in order from 0 to n - 1, by performing the following test operations:
 *
 *
 * If batteryPercentages[i] is greater than 0:
 *
 *
 *
 *
 * Increment the count of tested devices.
 *
 * Decrease the battery percentage of all devices with indices j in the range [i + 1, n - 1] by 1, ensuring their battery percentage never goes below 0, i.e, batteryPercentages[j] = max(0, batteryPercentages[j] - 1).
 *
 * Move to the next device.
 *
 *
 *
 * Otherwise, move to the next device without performing any test.
 *
 * Return an integer denoting the number of devices that will be tested after performing the test operations in order.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: batteryPercentages = [1,1,2,1,3]
 * Output: 3
 * Explanation: Performing the test operations in order starting from device 0:
 * At device 0, batteryPercentages[0] &gt; 0, so there is now 1 tested device, and batteryPercentages becomes [1,0,1,0,2].
 * At device 1, batteryPercentages[1] == 0, so we move to the next device without testing.
 * At device 2, batteryPercentages[2] &gt; 0, so there are now 2 tested devices, and batteryPercentages becomes [1,0,1,0,1].
 * At device 3, batteryPercentages[3] == 0, so we move to the next device without testing.
 * At device 4, batteryPercentages[4] &gt; 0, so there are now 3 tested devices, and batteryPercentages stays the same.
 * So, the answer is 3.
 *
 * Example 2:
 *
 * Input: batteryPercentages = [0,1,2]
 * Output: 2
 * Explanation: Performing the test operations in order starting from device 0:
 * At device 0, batteryPercentages[0] == 0, so we move to the next device without testing.
 * At device 1, batteryPercentages[1] &gt; 0, so there is now 1 tested device, and batteryPercentages becomes [0,1,1].
 * At device 2, batteryPercentages[2] &gt; 0, so there are now 2 tested devices, and batteryPercentages stays the same.
 * So, the answer is 2.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n == batteryPercentages.length &lt;= 100 
 *
 * 0 &lt;= batteryPercentages[i] &lt;= 100
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: One solution is simulating the operations as explained in the problem statement, and it works in <code>O(n<sup>2</sup>)</code> time.
 * Hint 2: While going through the devices, you can maintain the number of previously tested devices, and the current device can be tested if <code>batteryPercentages[i]</code> is greater than the number of tested devices.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Simulation, Counting).
 *
 * @see <a href="https://leetcode.com/problems/count-tested-devices-after-test-operations/">LeetCode #2960</a>
  *
  * <p><b>Explanation:</b> Iterates once, incrementing a counter each time the target condition is satisfied.</p>
  */
public class CountTestedDevicesAfterTestOperations {

    /**
     * Counts Count tested devices.
     *
     * @param batteryPercentages the batteryPercentages (int[])
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Iterates once, incrementing a counter each time the target condition is satisfied.</p>
      */
    public int countTestedDevices(int[] batteryPercentages) {
        int cnt=0;
        for (int b:batteryPercentages) { if (b-cnt>0) cnt++; }
        return cnt;
    }

    public static void main(String[] args) {
        CountTestedDevicesAfterTestOperations sol = new CountTestedDevicesAfterTestOperations();
                System.out.println(sol.countTestedDevices(new int[]{1,1,2,1,3})); // 3
                System.out.println(sol.countTestedDevices(new int[]{0,1,2}));     // 2
    }
}
