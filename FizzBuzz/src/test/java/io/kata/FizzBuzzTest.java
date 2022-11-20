package io.kata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

// main reference: https://www.codurance.com/katalyst/fizzbuzz#Frequently-Asked-Questions
class FizzBuzzTest {

    @Test
    void givenNumeral1ShouldJustConvertToString() {
        // pick the simplest and minimal functionality
        assertEquals("1", new FizzBuzz().convert(1));
    }
}