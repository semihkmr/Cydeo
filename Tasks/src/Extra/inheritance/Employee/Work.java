package Extra.inheritance.Employee;

public class Work {

    public static void main(String[] args) throws InterruptedException {

        Developer dev1 = new Developer("Semih");

        Developer dev2 = new Developer("James",true,999);

        System.out.println("dev1 = " + dev1);

        System.out.println("dev2 = " + dev2);
    }
}
