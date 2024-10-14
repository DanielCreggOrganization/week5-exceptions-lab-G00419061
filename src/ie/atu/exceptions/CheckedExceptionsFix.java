package ie.atu.exceptions;
import java.io.FileReader;
import java.io.IOException;

public class CheckedExceptionsFix {
    public static void main(String[] args) {
        try{
            FileReader reader = new FileReader("example.txt"); // This line may throw IOException
        }catch(IOException e1){
            System.out.println("File failed to open");
        }
    }
}
