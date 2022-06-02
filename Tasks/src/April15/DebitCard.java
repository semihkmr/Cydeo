package April15;

import java.util.Collections;

public class DebitCard {

    long cardNumber;
    String holderName;
    String cardType;
    int pin;
    double balance;

    public DebitCard(long cardNumber, String holderName, double balance){
        if(String.valueOf(cardNumber).length()!=16){
            System.out.println("Invalid Card Number");
        }
        else{
            this.cardNumber = cardNumber;
            this.holderName = holderName;
            this.balance = balance;
        }
    }
    public DebitCard(long cardNumber, String holderName, double balance,String cardType, int pin ){

        this(cardNumber,holderName,balance);

        if(!cardType.equalsIgnoreCase("Visa")||!cardType.equalsIgnoreCase("MasterCard")){
            System.out.println("Invalid Card Type");
        }
        else{
            this.cardType = cardType;
        }
        if(String.valueOf(pin).length()!=4){
            System.out.println("Invalid Pin");
        }
        else{
            this.pin = pin;
        }
    }

    @Override
    public String toString() {
        return "DebitCard{" +
                "cardNumber=" + cardNumber +
                ", holderName='" + holderName + '\'' +
                ( cardType== null?"" : cardType ) +
                ", balance=" + balance +
                '}';
    }
}
