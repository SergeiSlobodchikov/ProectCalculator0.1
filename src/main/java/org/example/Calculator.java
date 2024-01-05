package org.example;

import java.util.Scanner;
class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calculator = new Calculator();
        System.out.println("Welcome to the calculator!");
        System.out.println("Enter the first number: ");
        double num1 = sc.nextDouble();
        System.out.println("Enter the operation you want to perform (+, -, *, /): ");
        String oper = sc.next();
        System.out.println("Enter the second number: ");
        double num2 = sc.nextDouble();
        double result;
        if (oper.equals("+")) {
            result = calculator.plus(num1,num2);
        } else if (oper.equals("-")) {
            result = calculator.minus(num1,num2);
        } else if (oper.equals("*")) {
            result = calculator.multiplication(num1,num2);
        } else if (oper.equals("/")) {
            if (num2 == 0) {
                System.out.println("Division by zero");
                return;
            }
            result = calculator.division(num1,num2);
        } else {
            System.out.println("Invalid operator. Please try again.");
            return;
        }
        System.out.println("The result is: " + result);
        sc.close();
    }

    public double plus(double a, double b) {
        return a + b;
    }
    public double minus(double a, double b) {
        return a - b;
    }
    public double multiplication(double a, double b) {
        return a * b;
    }
    public double division(double a, double b) {
        return a / b;
    }

}