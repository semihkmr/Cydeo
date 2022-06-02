package Task17April;

public class UsingPizza {
    public static void main(String[] args) {

        Pizza pizza1 = new Pizza("large",5);

        System.out.println(pizza1);
        pizza1.setSize("medium");

        System.out.println(pizza1);
    }

}
