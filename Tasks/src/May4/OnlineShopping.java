package May4;

public abstract class OnlineShopping extends Shopping implements Shipping {


 // we have to make an abstract class , since we have abstract method. Normal class can not have any abstract methods.
 // and also when we made an abstract class, since we are extending from abstract class we do not have to implement anything
 // from abstract Parent class!! Because our this class also abstract
    public abstract void viewCart();


}
