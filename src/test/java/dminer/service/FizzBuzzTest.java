package dminer.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FizzBuzzTest {
    private int number;
    private String expected;
    private String message;
    private FizzBuzz fizzBuzz = new FizzBuzz();

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {1, "1", "countOneShouldSayOne"},
            {2, "2", "countTwoShouldSayTwo"},
            {3, "Fizz", "countThreeShouldSayFizz"},
            {4, "4", "countFourShouldSayFour"},
            {5, "Buzz", "countFiveShouldSayBuzz"},
            {8, "8", "countEightShouldSayEight"},
            {6, "Fizz", "countSixShouldSayFizz"},
            {15, "FizzBuzz", "countFifteenShouldSayFizzBuzz"}
        });
    }

    public FizzBuzzTest(int number, String expected, String message) {
        this.number = number;
        this.expected = expected;
        this.message = message;
    }

    @Test
    public void shouldSayWithFizzBuzzRule() {
        assertEquals(this.message, this.expected, fizzBuzz.say(this.number));
    }

}
