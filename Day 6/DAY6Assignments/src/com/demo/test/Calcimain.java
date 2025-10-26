package com.demo.test;

import com.study.Calculator;
import com.study.WrongException;

public class Calcimain {

	public static void main(String[] args) {
        try {
            int result1 = Calculator.calculate(10, 5, "+");
            System.out.println("10 + 5 = " + result1);

            int result2 = Calculator.calculate(10, 5, "/");
            System.out.println("10 / 5 = " + result2);

            int result3 = Calculator.calculate(10, 5, "^"); // Invalid operator
            System.out.println("Result: " + result3);
        } catch (WrongException e) {
            System.err.println("Error: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.err.println("Math Error: " + e.getMessage());
        }
    }

}
