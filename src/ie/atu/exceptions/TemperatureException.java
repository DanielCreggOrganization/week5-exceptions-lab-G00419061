package ie.atu.exceptions;
import java.util.Scanner;

public class TemperatureException {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] temp = {10, 11, 11, 9, 13, 10, 12};
        System.out.print("Enter a day number (1-7): ");
        int DOW = input.nextInt();

        try{
            System.out.println("Temperature for day " + DOW +": " + temp[DOW-1]);
        }catch(ArrayIndexOutOfBoundsException t){
            System.out.println("INVALID DAY NUMBER ENTERED. ENTER NUMBER BETWEEN 1 AND 7");
        }
        input.close();
    
    } 
}
