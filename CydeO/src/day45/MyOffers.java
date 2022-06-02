package day45;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {

    public static void main(String[] args) {

        Offer first = new Offer("Google","Texas",200_00,true,15);

        System.out.println(first);

        ArrayList<Offer> allOffers = new ArrayList<>();
        allOffers.add(first);

        allOffers.add( new Offer("Amazon","New York", 180_000, true, 15) );

        Offer [] moreOffers = {
                new Offer("Apple", "Chicago", 230_000, false, 10),
                new Offer("Tesla", "Texas", 250_000, false, 20),
                new Offer("Facebook", "Florida", 120_000, true, 10)
        };

        allOffers.addAll(Arrays.asList(moreOffers));
        System.out.println(allOffers);

        allOffers.addAll(Arrays.asList(
                new Offer("Discord", "Chicago", 150_000, false, 13)

        )) ;

        System.out.println();
        System.out.println(allOffers);

        System.out.println();

        ArrayList<Offer> salaries = new ArrayList<>(allOffers);

        salaries.removeIf( each -> each.salary < 170_000 );

        System.out.println("Salaries above 170_000 ");
        System.out.println(salaries);





    }

}
