
import jdk.jfr.Timespan;

class Account{
    private  String accountNumber;
    private double  balance ;

    public Account(String accountNumber, double balance) {
        if(accountNumber == null || accountNumber.isEmpty()){
            System.err.println("Error: Account number cannot be null or empty.");
            return;
        }

        if(balance < 0){
            System.err.println("Error: Balance cannot be negative.");
            return;
        }

        this.accountNumber = accountNumber;
        this.balance = balance;
        
    }

    public void getInfo(){
        System.out.println("Account 1 Number: " + accountNumber);
        System.out.println("Account 1 Balance: " +balance);
    }

    
}

public class ConstructorQ3 {
    public static void main(String[] args) {

        Account ac1 = new Account("1234567",4000.00);

        ac1.getInfo();

        Account ac2 = new Account("",-1);
        Account ac3 = new Account("123",-1);
        
    }   
}
