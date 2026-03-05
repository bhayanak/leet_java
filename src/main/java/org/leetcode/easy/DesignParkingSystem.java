package org.leetcode.easy;

/** DesignParkingSystem solution. */
public class DesignParkingSystem {
    /**
     * Simulates a parking system with big, medium, and small spaces.
     *
     * @param big    number of big parking spaces
     * @param medium number of medium parking spaces
     * @param small  number of small parking spaces
     *
     * <p><b>Explanation:</b> Stores counts for each type; addCar() decrements the appropriate counter</p>
     *   and returns false if that type is full. Time O(1) per operation, Space O(1).
     */
    private int[] spaces;
    public DesignParkingSystem initParkingSystem(int big, int medium, int small) {
        this.spaces = new int[]{big, medium, small};
        return this;
    }
    public boolean addCar(int carType) {
        return spaces[carType - 1]-- > 0;
    }

    /**
     * Runs sample test cases.
      *
      * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
      */
    public static void main(String[] args) {
        System.out.println("=== DesignParkingSystem ===");
        DesignParkingSystem sol = new DesignParkingSystem();
        sol.initParkingSystem(2, 3, 4);
        System.out.println(sol.addCar(1)); // big space
        System.out.println(sol.addCar(2)); // medium space
    }
}
