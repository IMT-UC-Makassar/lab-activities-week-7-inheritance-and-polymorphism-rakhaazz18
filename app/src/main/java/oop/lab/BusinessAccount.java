package oop.lab;

public class BusinessAccount extends BankAccount implements LoanService {
    private String loanStatus;

    public BusinessAccount(String accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
        this.loanStatus = "No Loan";
    }

    @Override
    public void calculateInterest() {
        System.out.println("Calculating interest for BusinessAccount.");
    }

    @Override
    public void applyForLoan(double amount) {
        loanStatus = "Loan Applied for amount: " + amount;
        System.out.println(loanStatus);
    }

    @Override
    public String checkLoanStatus() {
        return loanStatus;
    }
}
