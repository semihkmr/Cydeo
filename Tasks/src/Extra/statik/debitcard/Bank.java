package Extra.statik.debitcard;

public class Bank {

    public static void main(String[] args) {

        DebitCard obj1 = new DebitCard(2311341, "Semih", 999.99);

        DebitCard obj2 = new DebitCard(14141412,"James", 899.99, "visa", 2547);

        DebitCard obj3 = new DebitCard(1412412,"Richard", 99.99,"American",24311);


        System.out.println("obj1 = " + obj1);
        System.out.println("obj2 = " + obj2);
        System.out.println("obj3 = " + obj3);

      //  DebitCard.accountType = "saving";

        System.out.println("DebitCard.accountType = " + DebitCard.accountType);


    }
}
