package com.example.calculator;
import java.util.Scanner;

/**
 * Calculator
 */
public class Calculator {

    public static String addition(double a, double b) {
        return Double.toString(a + b);
    }

    public static String division(double a, double b) {
        try {
            double c = a / b;
            return Double.toString(c);
        } catch(Error e) {
            return "Divide by Zero Error";
        }
    }

    public static String multiplication(double a, double b) {
        return Double.toString(a * b);
    }

    public static String subtraction(double a, double b) {
        return Double.toString(a - b);
    }

    public static String squareRoot(double a) {
        if (a < 0) {
            return Double.toString(Math.sqrt(-a)) + "i";
        } else {
            return Double.toString(Math.sqrt(a));
        }
    }

    public static String factorial(int a) {
        if (a > 0) {
            int fact = 1;
            for (int i = 1; i <= a; i++) {
                fact = fact * i;
            }

            return Integer.toString(fact);
        } else if (a == 0) {
            return Integer.toString(1);
        } else {
            return "Factorial of Negative Number does not exist";
        }
    }

    public static String naturalLog(double a) {
        if (a > 0) {
            return Double.toString(Math.log(a));
        } else {
            return "Logarithm of this number does not exist";
        }
    }

    public static String power(double x, double a) {
        return Double.toString(Math.pow(x, a));
    }

}
