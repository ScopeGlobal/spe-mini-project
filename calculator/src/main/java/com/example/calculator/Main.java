package com.example.calculator;
import java.util.Scanner;

import com.example.calculator.Calculator;

public class Main {
    public static void main(String[] args) {
        int choice = 0;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("MENU");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Square Root");
            System.out.println("6. Natural Logarithm");
            System.out.println("7. Factorial");
            System.out.println("8. Power");
            System.out.println("9. Exit");

            System.out.println("Enter Your Choice- ");
            choice = scanner.nextInt();

            if(choice == 1) {
                double a, b;
                System.out.println("Enter the first number- ");
                a = scanner.nextDouble();
                System.out.println("Enter the second number- ");
                b = scanner.nextDouble();

                String result = Calculator.addition(a, b);
                System.out.println("The result is - " + result);
            } else if (choice == 2) {
                double a, b;
                System.out.println("Enter the first number- ");
                a = scanner.nextDouble();
                System.out.println("Enter the second number- ");
                b = scanner.nextDouble();

                String result = Calculator.subtraction(a, b);
                System.out.println("The result is - " + result);
            } else if (choice == 3) {
                double a, b;
                System.out.println("Enter the first number- ");
                a = scanner.nextDouble();
                System.out.println("Enter the second number- ");
                b = scanner.nextDouble();

                String result = Calculator.multiplication(a, b);
                System.out.println("The result is - " + result);
            } else if (choice == 4) {
                double a, b;
                System.out.println("Enter the first number- ");
                a = scanner.nextDouble();
                System.out.println("Enter the second number- ");
                b = scanner.nextDouble();

                String result = Calculator.division(a, b);
                System.out.println("The result is - " + result);
            } else if (choice == 5) {
                double a;
                System.out.println("Enter the number- ");
                a = scanner.nextDouble();

                String result = Calculator.squareRoot(a);
                System.out.println("The result is - " + result);
            } else if (choice == 6) {
                double a;
                System.out.println("Enter the number- ");
                a = scanner.nextDouble();

                String result = Calculator.naturalLog(a);
                System.out.println("The result is - " + result);
            } else if (choice == 7) {
                int a;
                System.out.println("Enter the number- ");
                a = scanner.nextInt();

                String result = Calculator.factorial(a);
                System.out.println("The result is - " + result);
            } else if (choice == 8) {
                double a, b;
                System.out.println("Enter the first number- ");
                a = scanner.nextDouble();
                System.out.println("Enter the second number- ");
                b = scanner.nextDouble();

                String result = Calculator.power(a, b);
                System.out.println("The result is - " + result);
            } else {
                choice = 9;
                System.out.println("Thank you for using!");
                break;
            }
            
        } while (choice < 9);
    }
}