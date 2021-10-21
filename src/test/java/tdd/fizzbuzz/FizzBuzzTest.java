package tdd.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    void should_return_order_number_when_count_off_given_normal_order_number_case() {
        //given
        int order = 1;
        FizzBuzz fizzBuzz = new FizzBuzz();
        String expected = "1";

        //when
        String actual = fizzBuzz.countOff(order);

        //then
        assertEquals(expected, actual);
    }

    @Test
    void should_return_fizz_when_count_off_given_multiple_number_of_3() {
        //given
        int order = 3;
        FizzBuzz fizzBuzz = new FizzBuzz();
        String expected = "Fizz";

        //when
        String actual = fizzBuzz.countOff(order);

        //then
        assertEquals(expected, actual);
    }
}
