package com.study;

public class Calculator {
	public static int calculate(int number1, int number2, String operator) throws WrongException {
        switch (operator) {
            case "+":
                return number1 + number2;
            case "-":
                return number1 - number2;
            case "*":
                return number1 * number2;
            case "/":
                if (number2 == 0) throw new ArithmeticException("Division by zero");
                return number1 / number2;
            case "%":
                if (number2 == 0) throw new ArithmeticException("Modulo by zero");
                return number1 % number2;
            default:
                throw new WrongException("Invalid operator: " + operator);
        }
	}

}
