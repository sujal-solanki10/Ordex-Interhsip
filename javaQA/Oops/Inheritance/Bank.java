
class BankManager{
    private String AcccountNuber;
    private double balanace;

    public BankManager(String AccountNumber , double balance){
        this.AcccountNuber = AccountNumber;
        this.balanace = balance;
    }

    public void deposite(double amount){
        balanace += amount;
    }

    public void widthdraw(double amount){
        if(balanace >= amount){
            balanace -= amount;
        }else{
            System.out.println("Insufficient balance");
        }
    }

    public double getBalance(){
        // System.out.println("Your Balance is : "+balanace);
        return balanace;
    }
}

class SavingAccount extends BankManager{

    public SavingAccount(String AcccountNuber, double balance) {
        super(AcccountNuber, balance);
    }

    public void withdraw(double amount){
        if( getBalance() -amount < 100){
            System.out.println("Minimum 100 require !!");    
        }else{
            super.widthdraw(amount);
        }
    }
    
}
class Bank{
    public static void main(String[] args) {
        
        BankManager BA123 = new BankManager("BA123",4000);

        BA123.deposite(5000);
        System.out.println("Bank balance : "+BA123.getBalance());

        BA123.widthdraw(3000);
        System.out.println("Bank Balance : "+BA123.getBalance());

        System.out.println("\nCreate a SavingsAccount object (A/c No. SA1234) with initial balance of 5000:");

        SavingAccount SA123 = new SavingAccount("SA123", 5000);



        SA123.deposite(5000);
        System.out.println("Bank balance : " + BA123.getBalance());

        SA123.widthdraw(3000);
        System.out.println("Bank Balance : " + BA123.getBalance());
        
    }
    
}