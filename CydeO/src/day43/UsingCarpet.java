package day43;

public class UsingCarpet {
    public static void main(String[] args) {

        Carpet carpet1 = new Carpet(true,8.5,12,2.5);

        System.out.println(carpet1);

        carpet1.length = 14;
        carpet1.calculatePrice();
        System.out.println(carpet1);
    }
}
