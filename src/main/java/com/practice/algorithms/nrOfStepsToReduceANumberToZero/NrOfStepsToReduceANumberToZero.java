package com.practice.algorithms.nrOfStepsToReduceANumberToZero;

public class NrOfStepsToReduceANumberToZero {
    public static int nrOfStepsToReduceANumberToZero(int i) {
        int result = 0;

        while (i > 0) {
            if (i % 2 == 0)
                i /= 2;
            else i--;

            result++;
        }

        return result;

        // TC = O(logn)
        // SC = O(1)
    }
}
