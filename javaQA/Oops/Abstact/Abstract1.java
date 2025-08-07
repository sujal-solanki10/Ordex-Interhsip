

abstract class BankAccount{

    private String accoutNumber;
    private double balance;

    public BankAccount(String accoutNumber, double balance){
        this.accoutNumber = accoutNumber;
        this.balance = balance;
    }

    public String getAccountNumber(){
        return accoutNumber;
    }

    public double getBalance(){
        return balance;
    }
    protected void setBalance(double Balance){
        this.balance = balance;
    }
    public abstract  void deposite(double amount);

    public abstract void withdraw(double amount);
}

class SavingAccount extends BankAccount{

    public SavingAccount(String accountNumber, double balance ){
        super(accountNumber, balance);
    }

    @Override
    public void deposite(double amount) {
        setBalance(getBalance() + amount);
        System.out.println("Deposit of $" + amount + " successful. Current balance: $" + getBalance());

    }

    @Override
    public void withdraw(double amount){
        if (getBalance() >= amount) {
            setBalance(getBalance() - amount);
            System.out.println("Withdrawal of $" + amount + " successful. Current balance: $" + getBalance());

        }else{

            System.out.println("Insufficient funds. Withdrawal failed.");
        }


    }
   
}

class CurrentAccount extends BankAccount{
    public CurrentAccount(String accoutNumber, double balance){
        super(accoutNumber, balance);
    }

    public void deposite(double amount){
        setBalance(getBalance() + amount);

    }
    public void withdraw(double amount){
        if(getBalance() >= amount){
            setBalance(getBalance() - amount);
            System.out.println("Withdrawal of $" + amount + " successful. Current balance: $" + getBalance());
            
        }else{
            System.out.println("Insufficient funds. Withdrawal failed.");


        }

    }

}


public class Abstract1 {
    public static void main(String[] args) {
        double ibal ,  dmat,wamt;

        ibal = 1000;

        SavingAccount  savingAccount =  new SavingAccount("SA123",ibal);

        System.out.println("Savings Account : Initial Balace: $" + ibal);

        dmat = 5000;

        savingAccount.deposite(dmat);

        wamt = 250.55;
        savingAccount.withdraw(wamt);
        wamt = 2001;
        savingAccount.withdraw(wamt);

        System.out.println("\nTry to withdraw: $" + wamt);


    }
    
}
