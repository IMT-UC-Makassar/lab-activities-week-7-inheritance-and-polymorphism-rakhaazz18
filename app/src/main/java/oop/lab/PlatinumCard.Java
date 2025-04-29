package oop.lab;


public class PlatinumCard extends CreditCard {
    public PlatinumCard(String cardNumber, String cardHolder) {
        super(cardNumber, cardHolder);
    }

    @Override
    public double getInterestRate() {
        return 12.0; // lower rate for premium customers
    }
}
