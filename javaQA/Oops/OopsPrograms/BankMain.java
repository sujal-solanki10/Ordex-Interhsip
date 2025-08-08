
import java.util.ArrayList;

class Account {

    private String name;
    private String accountNumber;
    private int balance;

    public Account(String name, String accountNumber, int balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public int balance() {
        return balance;
    }

    public void deposite(double amount) {
        balance += amount;
    }

    public void withdraw(double withdraw) {
        balance -= balance;
    }

    public String getInfo() {
        return "Name: " + name + ", Account Number: " + accountNumber + ", Balance: " + balance;
    }

}

class Bank {

    private ArrayList<Account> accounts;

    public Bank() {
        accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void removeAccount(Account account) {
        accounts.remove(account);
    }

    public void depositeMoney(Account account, double amount) {
        account.deposite(amount);
    }

    public void withdrawMoney(Account account, double amount) {
        account.withdraw(amount);
    }

    public ArrayList<Account> getAccount() {
        return accounts;
    }

}

public class BankMain {

    public static void main(String[] args) {

        Bank bank = new Bank();

        Account account1 = new Account("Sujal Solanki", "C0011", 5000);
        Account account2 = new Account("Nabin Maity", "C0121", 4500);
        Account account3 = new Account("Sumit Solanki", "C0222", 20000);

        bank.addAccount(account1);
        bank.addAccount(account2);
        bank.addAccount(account3);

        ArrayList<Account> accounts = bank.getAccount();

        System.out.println();
        for (Account account : accounts) {
            System.out.println(account.getInfo());
            System.out.println();
        }

        System.out.println("\nAfter depositing 1000 into account1:");
        account1.deposite(1000);
        System.out.println();
        System.out.println(account1.getInfo());

        System.out.println("After withdrawing 5000 from account3:");
        bank.withdrawMoney(account3, 5000);
        System.out.println();
        System.out.println(account3.getInfo());

    }

}
