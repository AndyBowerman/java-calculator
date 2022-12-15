package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.example.CalculatorUtils.*;

class CalculatorUtilsTest {



    @Test
    void add_validInput_ReturnsCorrectResult() {
        // Arrange
        double result;
        // Act
        result = add(1, 2);
        // Assert
        assertEquals(result, 3);
    }

    @Test
    void subtract_validInput_ReturnsCorrectResult() {
        assertEquals(subtract(2, 1), 1);
    }

    @Test
    void multiply_validInput_ReturnsCorrectResult() {
        assertEquals(multiply(6, 3), 18);
    }

    @Test
    void divide_validInput_ReturnsCorrectResult() {
        assertEquals(divide(6, 3), 2);
    }

    @Test
    void square_validInput_ReturnsCorrectResult() {
        assertEquals(square(1, 5), 25);
    }

    @Test
    void squareRoot_validInput_ReturnsCorrectResult() {
        assertEquals(squareRoot(1, 16), 4);
    }
}