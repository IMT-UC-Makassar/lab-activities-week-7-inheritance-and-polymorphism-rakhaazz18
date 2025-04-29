package oop.lab;

public class SavingAccount extends BankAccount {
    public SavingAccount(String accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    @Override
    public void calculateInterest() {
        System.out.println("Calculating interest for SavingsAccount.");
    }
}
