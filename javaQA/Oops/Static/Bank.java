class Bank{

    private  String accountNumbar;
    private double balance;
    public static String bankName;
    public static double interestRate;

    public Bank(String accountNumber , double balance) {
        this.accountNumbar = accountNumber;
        this.balance = balance;
    }
    
    public static void setBankName(String name){
        bankName = name;
    }
    public static String setBankName(){
        return bankName;
    }

    public static void setRate(double rate){
        interestRate = rate;
    }
    public static Double setRate(){
        return interestRate ;
    }

    public void printDetails() {
        System.out.println("Account Number: " + accountNumbar);
        System.out.println("Balance: " + balance);
        System.out.println("Bank Name: " + bankName);
        System.out.println("Interest Rate: " + interestRate + "%");
    }


    public static void main(String[] args) {

        Bank.setBankName("Sujal Netional bank");
        Bank.setRate(14.4);

        Bank ac1 = new Bank("123456",2000);
        Bank ac2 = new Bank("454546",2000);

        ac1.printDetails();
        System.out.println();
        ac2.printDetails();
        
    }
}