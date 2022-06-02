package StatikWork;

public class AppleStore {
    public static void main(String[] args) {

        IPhone phone = new IPhone("iphone X", 1000);
        System.out.println(phone);

        IPhone phone2 = new IPhone("Iphone 11", 1200);
        System.out.println(phone2);

        System.out.println(IPhone.company);
        System.out.println(IPhone.os);

        IPhone.company = "semih";
        System.out.println("IPhone.company = " + IPhone.company);


//        phone2.company = "semih";
//        System.out.println("phone2.company = " + phone2.company);
//        System.out.println("phone.company = " + phone.company);

    }}
