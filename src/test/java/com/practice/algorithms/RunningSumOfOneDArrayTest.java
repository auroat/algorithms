package com.practice.algorithms;

import org.junit.jupiter.api.Test;
import com.practice.algorithms.runningSumOfOneDArray.RunningSumOfOneDArray;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class RunningSumOfOneDArrayTest {

    @Test
    public void runningSumOfOneDArray() {
        int[] input = {1, 2, 4, 8};
        int[] expected = {1, 3, 7, 15};

        int[] output = RunningSumOfOneDArray.runningSumOfOneDArray(input);

        assertArrayEquals(expected, output);
    }
}
