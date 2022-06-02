package May4;

public final class Amazon extends OnlineShopping {


    @Override
    public void viewCart() {
        System.out.println("View Amazon cart");

    }

    @Override
    public void payForShipping(boolean b) {
        System.out.println(b ? "Pay for shipping" : "Free shipping");
    }

    @Override
    public void buyItem() {
        System.out.println("Buy item from Amazon");
    }

    @Override
    public void returnItem() {
        System.out.println("Return to the Amazon");

    }
}