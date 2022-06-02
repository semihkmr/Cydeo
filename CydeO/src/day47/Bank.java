package day47;

public class Bank {
    public static void main(String[] args) {

        System.out.println(DebitCard.accountType);

        DebitCard obj1 = new DebitCard(1234567891112141L,"James",100000);
        System.out.println(obj1);

        System.out.println();

        DebitCard obj2 = new DebitCard(123456789111L,"Ben",120000);
        System.out.println(obj2);

    }
}
