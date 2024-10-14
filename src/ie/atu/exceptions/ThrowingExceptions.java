package ie.atu.exceptions;
import java.util.Scanner;

public class ThrowingExceptions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Grade: ");
        int grade = input.nextInt();

        try{
            validateGrade(grade);
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        input.close();
    }

    public static void validateGrade(int grade){
        if(grade < 0 || grade > 100){
            throw new IllegalArgumentException("Grade must be between 0 and 100");
        }
        System.out.println("Valid Grade Entered");
    }
    

}
