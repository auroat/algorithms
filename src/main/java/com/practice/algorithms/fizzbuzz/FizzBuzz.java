package com.practice.algorithms.fizzbuzz;

public class FizzBuzz {

    public static String[] fizzBuzz(int input) {
        String[] result = new String[input];

        for (int i = 1; i <= input; i++) {
            if (i % 3 == 0) {
                result[i - 1] = "Fizz";
            } else if (i % 5 == 0) {
                result[i - 1] = "Buzz";
            } else if (i % 3 == 0 && i % 5 == 0) {
                result[i - 1] = "FizzBuzz";
            } else
                result[i - 1] = String.valueOf(i);
        }

        return result;

        // TC = O(n)
        // SC = O(1)
    }
}
