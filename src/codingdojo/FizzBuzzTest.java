package codingdojo;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    final FizzBuzz toTest = new FizzBuzz();

    @Test
    void fizzBuzz1() {
        final List<String> result = toTest.fizzBuzz(3);
        assertTrue(Arrays.equals(result.toArray(), new String[]{"1", "2", "Fizz"}));
    }

    @Test
    void fizzBuzz2() {
        final List<String> result = toTest.fizzBuzz(15);
        assertTrue(Arrays.equals(result.toArray(), new String[]{"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz"}));
    }

    @Test
    void fizzBuzz3() {
        final List<String> result = toTest.fizzBuzz(5);
        assertTrue(Arrays.equals(result.toArray(), new String[]{"1","2","Fizz","4","Buzz"}));
    }
}