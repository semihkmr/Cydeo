package day43;

public class UsePhone {
    public static void main(String[] args) {

        Phone phone1 = new Phone("Iphone X");
        System.out.println(phone1);

        Phone phone2 = new Phone("Iphone 12","Apple");
        System.out.println(phone2);

        Phone phone3 = new Phone("Iphone 13","Apple",512,12.2);
        System.out.println(phone3);
    }
}
