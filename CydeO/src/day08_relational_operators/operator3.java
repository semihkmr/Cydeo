package day08_relational_operators;

public class operator3 {
    public static void main(String[] args) {
        int h = 5;
        int p = h; // p gets assigned the value of h, which is 5


        h++; // this does not affect the value of p, which is 5. the reason for that we assigned p to 5 above.

        System.out.println("h " + h);
        System.out.println("p " + p);

        int k = h++; // post increment, get the value first, which is 6 and assign it to the new variable k, so k has the value of 6. Then h adds 1

        System.out.println("h " + h);
        System.out.println("k " + k);

        int g = ++h; // pre increment, which means it increment 1 right away

        System.out.println("g " + g);
        System.out.println("h " + h);


    }
}
