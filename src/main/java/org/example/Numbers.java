package org.example;

import java.util.ArrayList;
import java.util.List;

public class Numbers {
    private List<Double> numbers = new ArrayList<>();
    public void addNumber(double num) {
        numbers.add(num);
    }

    public List<Double> getNumbers() {
        return numbers;
    }
}