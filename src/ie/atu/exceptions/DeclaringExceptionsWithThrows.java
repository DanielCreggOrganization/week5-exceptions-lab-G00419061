package ie.atu.exceptions;

public class DeclaringExceptionsWithThrows {
    public static void main(String[] args) {
        try{
            processDate();
        }catch(Exception e){
            System.out.println("Exception Handled: " + e.getMessage());
        }
        
    }
    public static void processDate() throws Exception{
        throw new Exception("An error occurred.");
    }


}
