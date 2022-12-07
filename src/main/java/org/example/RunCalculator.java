package org.example;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

import static java.lang.Double.parseDouble;

public class RunCalculator {
    private boolean runGame = true;
    Calculator calculator = new Calculator();
    Numbers numbers = new Numbers();
    Scanner scanner = new Scanner(System.in);

    public void handleClear() {
        runGame = false;
        runCalculator();
    }
    public void handleExit() {
        runGame = false;
    }

    public void processCalculation(String input) {
        if(Objects.equals(input, "<") || Objects.equals(input, ">") || Objects.equals(input, "=")) {
            numbers.addNumber(calculator.calculate(0, numbers.getNumbers().get(numbers.getNumbers().size()-1)));
            System.out.println(numbers.getNumbers().get(numbers.getNumbers().size()-1));
        } else {
            numbers.addNumber(scanner.nextDouble());
            numbers.addNumber(calculator.calculate(numbers.getNumbers().get(numbers.getNumbers().size()-2), numbers.getNumbers().get(numbers.getNumbers().size()-1)));
            System.out.println(numbers.getNumbers().get(numbers.getNumbers().size()-1));
        }
    }

    public void validateInput(String input) {
        try {
            numbers.addNumber(parseDouble(input));
        } catch (NumberFormatException e) {
            if(input.toLowerCase().equals("c")) {
                handleClear();
            } else if(input.toLowerCase().equals("e")) {
                handleExit();
            } else {
                System.out.println("Invalid Input");
            }
        }
    }

    public void runCalculator() {
        runGame = true;
        System.out.println("This calculator can add (+), subtract(-), multiply(*), divide(/), square(>) and square root(<). Type C to clear or E to exit");
        System.out.println("Enter a number to begin");
        System.out.println(0.0);
        validateInput(scanner.next());
        while(runGame) {
            String input = scanner.next();
            if(Arrays.asList(calculator.getValidCalculations()).contains(input)) {
                calculator.setCalculation(input);
                processCalculation(input);
            } else {
                validateInput(input);
            }
        }
    }
}
