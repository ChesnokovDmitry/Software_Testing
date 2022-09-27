package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TriangleTest {

    @ParameterizedTest
    @CsvSource({"3, 5, 6", "0, 5, 6"})
    public void nullCheckTest(int a, int b, int c) {
        Assertions.assertTrue(Triangle.isNull(a, b, c));
    }

    @ParameterizedTest
    @CsvSource({"3, 5, 6", "-1, 5, 6"})
    public void negativeNumberTest(int a, int b, int c) {
        Assertions.assertTrue(Triangle.isNegativeNumber(a, b, c));
    }

    @ParameterizedTest
    @CsvSource({"3, 5, 6", "4, 5, 6"})
    public void areaCalculationCheckTest(int a, int b, int c) {
        double s = 7.483314773547883;
        Assertions.assertEquals(s, Triangle.areaOfATriangle(a, b, c));
    }

    @ParameterizedTest
    @CsvSource({"3, 5, 6", "100, 5, 6"})
    public void incorrectValueTest(int a, int b, int c) {
        Assertions.assertTrue(Triangle.isSumOfSides(a, b, c));
    }

    @ParameterizedTest
    @CsvSource({"3, 5, 6", "0, 5, 6", "-1, 5, 6", "100, 5, 6"})
    public void exceptionTest(int a, int b, int c) {
        Assertions.assertThrows(RuntimeException.class, () -> Triangle.areaOfATriangle(a, b, c));
    }
}
