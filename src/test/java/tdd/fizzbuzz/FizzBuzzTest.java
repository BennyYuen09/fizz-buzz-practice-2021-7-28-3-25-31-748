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

    @Test
    void should_return_buzz_when_count_off_given_multiple_number_of_5() {
        //given
        int order = 5;
        FizzBuzz fizzBuzz = new FizzBuzz();
        String expected = "Buzz";

        //when
        String actual = fizzBuzz.countOff(order);

        //then
        assertEquals(expected, actual);
    }

    @Test
    void should_return_whizz_when_count_off_given_multiple_number_of_7() {
        //given
        int order = 7;
        FizzBuzz fizzBuzz = new FizzBuzz();
        String expected = "Whizz";

        //when
        String actual = fizzBuzz.countOff(order);

        //then
        assertEquals(expected, actual);
    }

    @Test
    void should_return_multiple_case_string_when_count_off_given_multiple_number_of_3_5_7(){
        //given
        int order = 105;
        FizzBuzz fizzBuzz = new FizzBuzz();
        String expected = "FizzBuzzWhizz";

        //when
        String actual = fizzBuzz.countOff(order);

        //then
        assertEquals(expected, actual);
    }
}
