package calci.calci;

import java.util.Scanner;

public class Calculator {  // Fix the class name here
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        Calculator calculator = new Calculator();
        System.out.println("Sum: " + calculator.add(num1, num2));
        System.out.println("Difference: " + calculator.subtract(num1, num2));
        System.out.println("Product: " + calculator.multiply(num1, num2));

        try {
            System.out.println("Quotient: " + calculator.divide(num1, num2));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
    }
}
