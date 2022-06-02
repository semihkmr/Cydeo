package April19;

public class Work {

    public static void main(String[] args) {

        Developer dev = new Developer();
        dev.name = "Semih";
        dev.develop();


        Tester test = new Tester();
        test.name = "Semih";
        test.bugFounds = 5;
        test.test();
    }



}
