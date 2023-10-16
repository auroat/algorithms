package com.practice.algorithms.fizzbuzz;

public class FizzBuzz {

    public static String[] fizzBuzz(int input) {
        String[] outcome = new String[input];

        for (int i = 1; i <= input; i++) {
            StringBuilder result = new StringBuilder();

            if (i % 3 == 0) {
                result.append("Fizz");
            }
            if (i % 5 == 0) {
                result.append("Buzz");
            }
            if (result.isEmpty())
                result.append(i);

            outcome[i - 1] = result.toString();
        }

        return outcome;

        // TC = O(n)
        // SC = O(1)
    }
}
