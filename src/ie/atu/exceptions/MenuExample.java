package ie.atu.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuExample {

    public static void main(String[] args) {
        try (Scanner userInput = new Scanner(System.in)) {
            boolean validInput = false;

            while (!validInput) {
                try {

                    System.out.print("Enter first number: ");
                    int num1 = userInput.nextInt();

                    System.out.print("Enter second number: ");
                    int num2 = userInput.nextInt();

                    double result = (double) num1 / num2;

                    System.out.println("Result: " + result);
                    validInput = true; // Exit th loop if no exception occurs
                } catch (ArithmeticException e) {
                    System.out.println("Error: " + e.getMessage());
                } catch (InputMismatchException e) {
                    System.out.println("Error: " + e.getMessage());
                    userInput.nextLine(); // Clear the buffer
                }

            }
            System.out.println("Scanner Closed");
        }

    }
}
