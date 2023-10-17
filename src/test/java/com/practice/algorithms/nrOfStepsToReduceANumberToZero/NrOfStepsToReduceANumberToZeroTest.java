package com.practice.algorithms.nrOfStepsToReduceANumberToZero;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NrOfStepsToReduceANumberToZeroTest {

    @Test
    public void nrOfStepsToReduceANumberToZero(){
        int actualResult = NrOfStepsToReduceANumberToZero.nrOfStepsToReduceANumberToZero(15);
        int expectedResult = 7;

        assertEquals(expectedResult, actualResult);
    }
}
