package day47;

public class DebitCard {

    // instance variable
    long cardNumber;
    String holderName;
    String cardType;
    int pin;
    double balance;

    // static variable

    static String accountType;

    static {

        accountType = "Checking";
    }

    public DebitCard(long cardNumber, String holderName, double balance) {
        this.holderName = holderName;
        this.balance = balance;
        if (String.valueOf(cardNumber).length() == 16) {
            this.cardNumber = cardNumber;
        } else {
            System.out.println("Invalid card number"); // err makes output red !
        }
    }

    public DebitCard(long cardNumber, String holderName, double balance, String cardType, int pin) {
        this(cardNumber, holderName, balance);

        if (cardType.equalsIgnoreCase("visa") || cardType.equalsIgnoreCase("mastercard")) {
            this.cardType = cardType;
        } else {
            System.out.println("Invalid card type");
        }
        if (String.valueOf(pin).length() == 4) {
            this.pin = pin;
        } else {
            System.out.println("Invalid pin");
        }

    }

    public String toString() {

        String info = "Holder Name: " + holderName;

        if (cardNumber != 0) {
            info += "\n Card Number: " + cardNumber;
        }

        if (cardType != null) {
            info += "\n Card Type: " + cardType;
        }

        info += "\n Balance: " + balance;

        return info;
    }
}