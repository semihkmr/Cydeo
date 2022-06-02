package day08_relational_operators;

public class task {
    public static void main(String[] args) {
      /*  Task
      declare and assign a gift card with 200
      buy 2 items
      but item 1 for x price and subtract from your gift card
      buy item 2 for x price and subtract from your gift card
      print and remaining balance of your gift card
       */

        double giftCard = 200;

        System.out.println("buy item1 for 100");

        giftCard -= 100; //

        System.out.println("buy item2 for 47");

        giftCard -= 47;

        double BalancegiftCard = giftCard;

        System.out.println("Balance of giftCard " + BalancegiftCard);


    }
}
