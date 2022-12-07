package org.example;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class RunCalculator {
    Calculator calculator = new Calculator();
    Numbers numbers = new Numbers();
    Scanner scanner = new Scanner(System.in);

    public void handleClear() {
        
    }

    public void runCalculator() {
        boolean runGame = true;
        System.out.println("This calculator can add (+), subtract(-), multiply(*), divide(/), square(>) and square root(<).");
        System.out.println("Type EXIT at any time to exit");
        System.out.println("Type CLEAR to restart");
        System.out.println("Enter a number to begin");
        System.out.println(0.0);
        numbers.addNumber(scanner.nextDouble());
        while(runGame) {
            String input = scanner.next();
            if(Arrays.asList(calculator.getValidCalculations()).contains(input)) {
                calculator.setCalculation(input);
                if(Objects.equals(input, "<") || Objects.equals(input, ">")) {
                    numbers.addNumber(calculator.calculate(0, numbers.getNumbers().get(numbers.getNumbers().size()-1)));
                    System.out.println(numbers.getNumbers().get(numbers.getNumbers().size()-1));
                } else {
                    numbers.addNumber(scanner.nextDouble());
                    numbers.addNumber(calculator.calculate(numbers.getNumbers().get(numbers.getNumbers().size()-2), numbers.getNumbers().get(numbers.getNumbers().size()-1)));
                    System.out.println(numbers.getNumbers().get(numbers.getNumbers().size()-1));
                }
            } else if(input.toLowerCase().equals("clear")) {
                runGame = false;
                runCalculator();
            } else if(input.toLowerCase().equals("exit")) {
                runGame = false;
            }
        }
    }
}
