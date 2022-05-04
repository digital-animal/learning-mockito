package com.zahid.calculator;

public class Calculator {

    CalculatorService calculatorService; // null

    public Calculator(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    public int perform(int x, int y) {

        return calculatorService.add(x, y) + x*y;
    }
}
