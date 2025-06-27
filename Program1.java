package assignment;

import java.util.Scanner;

public class Program1 {

		    double a, b;
		    String operation;

		    public Program1(double a, double b, String operation) {
		        this.a = a;
		        this.b = b;
		        this.operation = operation;
		    }

		    public double calculate() {
		        switch (operation.toLowerCase()) {
		            case "add":
		            case "+":
		                return a + b;
		            case "subtract":
		            case "-":
		                return a - b;
		            case "multiply":
		            case "*":
		                return a * b;
		            case "divide":
		            case "/":
		                if (b != 0) {
		                    return a / b;
		                } else {
		                    throw new ArithmeticException("Cannot divide by zero.");
		                }
		            default:
		                throw new IllegalArgumentException("Invalid operation: " + operation);
		        }
		    }

		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter first number (a): ");
		        double a = scanner.nextDouble();

		        System.out.print("Enter second number (b): ");
		        double b = scanner.nextDouble();

		        System.out.print("Enter operation (add, subtract, multiply, divide): ");
		        String operation = scanner.next();

		        Program1 calc = new Program1(a, b, operation);

		        try {
		            double result = calc.calculate();
		            System.out.println("Result: " + result);
		        } catch (ArithmeticException | IllegalArgumentException e) {
		            System.out.println("Error: " + e.getMessage());
		        }

		        scanner.close();
		    }
		}


	

