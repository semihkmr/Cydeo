package May4;

public class Runner {

    public static void main(String[] args) {

        Target target = new Target();

        target.price = 10;
        target.buyItem();
        target.returnItem();

      //  target.payForShipping(true); Target class does not implement
        // the Shipping class

        System.out.println();


        Amazon amazon = new Amazon();
        amazon.price = 1000;
        amazon.buyItem();
        amazon.returnItem();
        amazon.payForShipping(true);
        amazon.viewCart();
    }
}
