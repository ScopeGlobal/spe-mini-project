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

                String result = addition(a, b);
                System.out.println("The result is - " + result);
            } else if (choice == 2) {
                double a, b;
                System.out.println("Enter the first number- ");
                a = scanner.nextDouble();
                System.out.println("Enter the second number- ");
                b = scanner.nextDouble();

                String result = subtraction(a, b);
                System.out.println("The result is - " + result);
            } else if (choice == 3) {
                double a, b;
                System.out.println("Enter the first number- ");
                a = scanner.nextDouble();
                System.out.println("Enter the second number- ");
                b = scanner.nextDouble();

                String result = multiplication(a, b);
                System.out.println("The result is - " + result);
            } else if (choice == 4) {
                double a, b;
                System.out.println("Enter the first number- ");
                a = scanner.nextDouble();
                System.out.println("Enter the second number- ");
                b = scanner.nextDouble();

                String result = division(a, b);
                System.out.println("The result is - " + result);
            } else if (choice == 5) {
                double a;
                System.out.println("Enter the number- ");
                a = scanner.nextDouble();

                String result = squareRoot(a);
                System.out.println("The result is - " + result);
            } else if (choice == 6) {
                double a;
                System.out.println("Enter the number- ");
                a = scanner.nextDouble();

                String result = naturalLog(a);
                System.out.println("The result is - " + result);
            } else if (choice == 7) {
                int a;
                System.out.println("Enter the number- ");
                a = scanner.nextInt();

                String result = factorial(a);
                System.out.println("The result is - " + result);
            } else if (choice == 8) {
                double a, b;
                System.out.println("Enter the first number- ");
                a = scanner.nextDouble();
                System.out.println("Enter the second number- ");
                b = scanner.nextDouble();

                String result = power(a, b);
                System.out.println("The result is - " + result);
            } else {
                choice = 9;
                System.out.println("Thank you for using! xox");
                break;
            }
            
        } while (choice < 9);
    }
}
