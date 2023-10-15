package fizzbuzz;

import com.practice.algorithms.fizzbuzz.FizzBuzz;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class FizzBuzzTest {

    @Test
    public void fizzBuzz(){
        int input = 5;
        String[] expectedOutput = {"1", "2", "Fizz", "4", "Buzz"};

        String[] result = FizzBuzz.fizzBuzz(5);

        assertArrayEquals(expectedOutput, result);
    }
}
