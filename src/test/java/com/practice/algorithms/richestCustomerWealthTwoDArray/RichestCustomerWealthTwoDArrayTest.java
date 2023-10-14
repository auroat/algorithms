package com.practice.algorithms.richestCustomerWealthTwoDArray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RichestCustomerWealthTwoDArrayTest {

    @Test
    public void richestCustomerWealthTwoDArray() {
        int[][] input = {{2, 1, 3}, {5, 1, 3}, {7, 4, 9}};
        int expected = 20;

        int output = RichestCustomerWealthTwoDArray.richestCustomerWealthTwoDArray(input);

        assertEquals(expected, output);
    }
}
