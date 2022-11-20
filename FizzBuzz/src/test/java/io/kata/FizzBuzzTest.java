package io.kata;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

// main reference: https://www.codurance.com/katalyst/fizzbuzz#Frequently-Asked-Questions
class FizzBuzzTest {

    @ParameterizedTest
    @CsvSource({ "1,1", "2,2", "4,4" })
    void convertNumeralToString(String expectedOutput, int actualInput) {
        assertEquals(expectedOutput, new FizzBuzz().convert(actualInput));
    }

}