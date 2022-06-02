package Extra.statik.debitcard;

import java.util.Collections;

public class DebitCard {


    public long cardNumber;
    public String holderName;
    public String cardType;
    public int pin;
    public double balance;

    public static String accountType;

    static{

        accountType = "checking";
    }

    public DebitCard(long cardNumber, String holderName, double balance){
         if( String.valueOf(cardNumber).length() > 6 ){
        this.cardNumber = cardNumber;}
         else{
             System.out.println("Invalid card Number");
         }
        this.holderName = holderName;
        this.balance = balance;
    }

    public DebitCard(long cardNumber, String holderName, double balance, String cardType, int pin){
        this(cardNumber,holderName,balance);

        if(cardType.equalsIgnoreCase("Visa") || cardType.equalsIgnoreCase("MasterCard")){
            this.cardType = cardType;
        }
        else{
            System.out.println("Invalid Card Type");
        }
        if(String.valueOf(pin).length() == 4){
            this.pin = pin;
        }
        else{
            System.out.println("Invalid pin length");
        }

    }

    @Override
    public String toString() {
        return "DebitCard{" +
                "cardNumber=" + cardNumber +
                ", holderName='" + holderName + '\'' +
                ", cardType='" + cardType + '\'' +
                ", pin=" + pin +
                ", balance=" + balance +
                '}';
    }
}
