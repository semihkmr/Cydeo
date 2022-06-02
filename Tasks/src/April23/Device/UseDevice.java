package April23.Device;

public class UseDevice {

    public static void main(String[] args) {


        Phone obj1 = new Phone("Iphone","Iphone X", 499.99,true);
        System.out.println(obj1);
        System.out.println(obj1.useDevice());

        System.out.println();

        Tv obj2 = new Tv("Samsung","sx223",899.99,false);
        System.out.println(obj2);
        System.out.println(obj2.useDevice());

        System.out.println();

        Device obj3  = new Device("JBL","Flip231", 99.99, true);
        System.out.println(obj3);
        System.out.println(obj3.useDevice());
    }
}
