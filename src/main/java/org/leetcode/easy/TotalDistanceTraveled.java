package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;

/** TotalDistanceTraveled solution. */
public class TotalDistanceTraveled {

    /**
     * A truck has mainTank litres of fuel and additionalTank litres of reserve.
     * For every 5 litres consumed from the main tank, 1 litre is transferred from reserve to main.
     * Returns the total distance (km) travelled (1 litre = 10 km).
     * @param mainTank       main fuel tank
     * @param additionalTank additional reserve
     * @return total distance in km
     * <p><b>Explanation:</b> Simulate: consume 5 at a time from main; if additional available, add 1.</p>
     */
    public int solve(int mainTank, int additionalTank) {
        int distance = 0;
        while (mainTank >= 5) {
            mainTank -= 5;
            distance += 50;
            if (additionalTank > 0) { mainTank++; additionalTank--; }
        }
        return distance + mainTank * 10;
    }

    public static void main(String[] args) {
        TotalDistanceTraveled sol = new TotalDistanceTraveled();
        System.out.println(sol.solve(5, 10)); // 60
        System.out.println(sol.solve(1, 2));  // 10
    }

}
