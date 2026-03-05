package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;

/** MinimumHoursOfTrainingToWinACompetition solution. */
public class MinimumHoursOfTrainingToWinACompetition {

    /**
     * Finds the minimum hours of training needed. You need energy &gt; opponent[i]
     * and experience &gt; opponent[i] to win each round.
     * @param initialEnergy    starting energy
     * @param initialExperience starting experience
     * @param energy    energy gained per round win AND opponent energy requirement
     * @param experience experience of each opponent
     * @return minimum training hours
     * <p><b>Explanation:</b> Simulate: if energy/experience insufficient, train (1 hr = +1). After each win,</p>
     *              drain energy[i] and gain experience[i].
     */
    public int solve(int initialEnergy, int initialExperience, int[] energy, int[] experience) {
        int hours = 0;
        int curEnergy = initialEnergy, curExp = initialExperience;
        for (int i = 0; i < energy.length; i++) {
            if (curEnergy <= energy[i]) {
                int need = energy[i] + 1 - curEnergy;
                hours += need; curEnergy += need;
            }
            if (curExp <= experience[i]) {
                int need = experience[i] + 1 - curExp;
                hours += need; curExp += need;
            }
            curEnergy -= energy[i];
            curExp += experience[i];
        }
        return hours;
    }

    public static void main(String[] args) {
        MinimumHoursOfTrainingToWinACompetition sol = new MinimumHoursOfTrainingToWinACompetition();
        System.out.println(sol.solve(5, 3, new int[]{1,4,3,2}, new int[]{2,6,3,1})); // 8
        System.out.println(sol.solve(2, 4, new int[]{1}, new int[]{3}));              // 0
    }

}
