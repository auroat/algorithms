package com.practice.algorithms.richestCustomerWealthTwoDArray;

public class RichestCustomerWealthTwoDArray {
    public static int richestCustomerWealthTwoDArray(int[][] accounts) {
        int maxWealth = 0;

        for (int[] customer : accounts) {
            int customerWealth = 0;

            for (int bank : customer) {
                customerWealth += bank;
            }

            maxWealth = Math.max(maxWealth, customerWealth);
        }

        return maxWealth;

        // TC = O(n x m)
        // SC = O(1)
    }
}
