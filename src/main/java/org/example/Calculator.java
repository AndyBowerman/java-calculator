package org.example;

import java.util.Arrays;
import static org.example.CalculatorUtils.*;

public class Calculator {
    private String calculation;
    private final String [] validCalculations = {"+", "-", "*", "/", "<", ">", "="};

    public void setCalculation(String symbol) {
        this.calculation = symbol;
    }

    public String getCalculation() {
        return calculation;
    }

    public String[] getValidCalculations() {
        return validCalculations;
    }

    public double calculate(double num1, double num2) {
        double result = num2;
        switch(calculation) {
            case "+":
                result = add(num1, num2);
                break;
            case "-":
                result = subtract(num1, num2);
                break;
            case "*":
                result = multiply(num1, num2);
                break;
            case "/":
                result = divide(num1, num2);
                break;
            case ">":
                result = square(num1, num2);
                break;
            case "<":
                result = squareRoot(num1, num2);
                break;
            case "=":
                result = num2;
        }
        return result;
    }
}