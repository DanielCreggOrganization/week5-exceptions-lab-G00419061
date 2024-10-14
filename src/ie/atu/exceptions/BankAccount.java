package ie.atu.exceptions;

public class BankAccount {
    private double balance;

    public BankAccount (double balance){
        this.balance=balance;
    }

    public void withdraw(double amount) throws InsufficientFundsException{
        if(amount > balance){
            throw new InsufficientFundsException("Insufficent funds for withdrawal");
        }
       balance -= amount;
       System.out.println("Withdrawal Successful. Remaining Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount(1410.10);

        try{
            account.withdraw(1000);
        }catch(InsufficientFundsException e){
            System.out.println(e.getMessage());
        }
    }
}
