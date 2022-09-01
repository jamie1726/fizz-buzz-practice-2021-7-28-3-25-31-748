package tdd.fizzbuzz;

import com.sun.org.apache.xpath.internal.operations.Gt;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    @Test
    void should_return_1_when_count_off_given_number_1() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        String expected = "1";
        //when
        String actual = fizzBuzz.countOff(1);
        //then
        assertEquals(expected, actual);
    }

    //multiple of 3
    @Test
    void should_return_Fizz_when_count_off_given_multiple_of_3() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        String expected = "Fizz";
        //when
        String actual = fizzBuzz.countOff(3);
        //then
        assertEquals(expected, actual);
    }

    
}
