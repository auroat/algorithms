package com.practice.algorithms.runningSumOfOneDArray;

public class RunningSumOfOneDArray {
    public static int[] runningSumOfOneDArray(int[] input) {
        for (int i = 1; i < input.length; i++) {
            input[i] += input[i - 1];
        }

        return input;
    }
}
