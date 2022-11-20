package io.kata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

// main reference: https://www.codurance.com/katalyst/fizzbuzz#Frequently-Asked-Questions
class FizzBuzzTest {

    @Test
    void givenNumeral1ShouldJustConvertToString1() {
        // pick the simplest and minimal functionality
        assertEquals("1", new FizzBuzz().convert(1));
    }

    @Test
    void givenNumeral2ShouldJustConvertToString2() {
        // Write a function that takes positive integers and outputs their string representation.
        assertEquals("2", new FizzBuzz().convert(2));
    }
}