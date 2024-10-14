package ie.atu.exceptions;
import java.util.Scanner;

public class SimpleCalculatorException {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number:");
        int num1 = input.nextInt();
        System.out.print("Enter second number:");
        int num2 = input.nextInt();

        try{
            System.out.println(num1 + " / " + num2 + " = " + num1/num2);
        }catch(ArithmeticException e){
            System.out.println("Cannot divide by 0");
        }finally{
            System.out.println("Calculation Complete");
        }
        input.close();
        
    }
}
